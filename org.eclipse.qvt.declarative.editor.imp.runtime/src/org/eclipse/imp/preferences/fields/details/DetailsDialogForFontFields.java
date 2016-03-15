/*******************************************************************************
* Copyright (c) 2007 IBM Corporation.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
*    Robert Fuhrer (rfuhrer@watson.ibm.com) - initial API and implementation
*******************************************************************************/

package org.eclipse.imp.preferences.fields.details;

import org.eclipse.imp.preferences.IPreferencesService;
import org.eclipse.imp.preferences.PreferencesUtilities;
import org.eclipse.imp.preferences.fields.FontFieldEditor;
import org.eclipse.imp.preferences.fields.PreferenceDialogConstants;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.resource.JFaceColors;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class DetailsDialogForFontFields extends TrayDialog {

	Shell parent = null;
	FontFieldEditor field = null;
	Composite fieldHolder = null;
	IPreferencesService preferencesService = null;
	
	private PreferencesUtilities prefUtils = null;
		
	public DetailsDialogForFontFields (
			Shell parent,
			FontFieldEditor field,
			Composite fieldHolder,
			IPreferencesService preferencesService)
	{
        super(parent);
        
        this.parent = parent;
        this.field = field;
        this.fieldHolder = fieldHolder;
        this.preferencesService = preferencesService;
        this.prefUtils = new PreferencesUtilities(this.preferencesService);	
	}

    	private final static int COPY_ID = IDialogConstants.CLIENT_ID + 1;
	    private final static int REMOVE_ID = IDialogConstants.CLIENT_ID + 2;
    	private final static int SPECIAL_ID = IDialogConstants.CLIENT_ID + 3;
    	// No empty values for 	combo boxes
	    //private final static int EMPTY_ID = IDialogConstants.CLIENT_ID + 4;


	    
	    /*
	     * Method declared on Dialog.
	     * 
	     * The main result is to set the preference field in a particular way,
	     * according to the particular button pressed, but without updating the
	     * underlying preferences node.  Thus the effect of this method is to
	     * change the field in the display without making the new value visible
	     * to other fields.  For th	e new value to take effect it must be later
	     * stored into the preferences node by some oher action (typically the
	     * pressing of an Apply or OK button).
	     * 
	     */
	    protected void buttonPressed(int buttonId) {
	        switch (buttonId) {
	        case COPY_ID:
	        	if (!field.isInherited()) break;
	        	FontData[] fontData = field.getSelectedFont();
	        	prefUtils.setField(field, fieldHolder, fontData);
	            break;
	        case REMOVE_ID:
	        	// Can't clear a field that doesn't have a preference stored to start with;
	        	// the following is one way to check that.
	        	// Why would you do this if there weren't a preference stored?  May want to
	        	// clear a field that was edited (or otherwise set) locally but not yet stored.
	        	if (field.getPreferencesLevel().equals(field.getLevelFromWhichLoaded())) {
	        		preferencesService.clearPreferenceAtLevel(field.getPreferencesLevel(), field.getPreferenceName());
	        	}
	        	prefUtils.setField(field, fieldHolder);
	        	break;
//	        case SPECIAL_ID:
//	        	prefUtils.setField(field, fieldHolder, field.getSpecialStringValue());
//	            break;
//	        case EMPTY_ID:
//	        	prefUtils.setField(field, fieldHolder, field.getEmptyValue());
//	        	break;
	        default:
	            super.buttonPressed(buttonId);
	            break;
	        }
	        close();
	    }

	    public boolean close() {
	        return super.close();
	    }

	    /*
	     * (non-Javadoc) Method declared on Window.
	     */
	    protected void configureShell(Shell newShell) {
	        super.configureShell(newShell);
	        newShell.setText(NLS.bind("Details for ''" + field.getLabelText() + "''", null ));
	        //PlatformUI.getWorkbench().getHelpSystem().setHelp(newShell,
			//		IWorkbenchHelpContextIds.ABOUT_DIALOG);
	    }

	    protected Button copyButton = null;
	    protected Button specialButton = null;
	    protected Button emptyButton = null;
	    Button removeButton = null;
	    
	    /**
	     * Add buttons to the dialog's button bar.
	     * 
	     * Subclasses should override.
	     * 
	     * @param parent
	     *            the button bar composite
	     */
	    protected void createButtonsForButtonBar(Composite parent) {
	        parent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

	        if (!field.getPreferencesLevel().equals(IPreferencesService.DEFAULT_LEVEL)) {
	        	copyButton = createButton(parent, COPY_ID, PreferenceDialogConstants.COPY_LABEL, false);
	        	copyButton.setEnabled(field.getPreferencesLevel() != null &&
	        			field.isInherited() && field.getChangeControl().isEnabled());
	        }
	        
	        specialButton = createButton(parent, SPECIAL_ID, PreferenceDialogConstants.SPECIAL_LABEL, false);
	        specialButton.setEnabled(field.getPreferencesLevel() != null &&
	        	field.hasSpecialValue() && field.getSpecialValue() != null &&	
	        	field.getChangeControl().isEnabled());
	        
//	        emptyButton = createButton(parent, EMPTY_ID, PreferenceDialogConstants.EMPTY_LABEL, false);
//	        emptyButton.setEnabled(field.getPreferencesLevel() != null &&
//		        	field.isEmptyStringAllowed() && field.getComboBoxControl(parent).isEnabled());
	        
	        removeButton = createButton(parent, REMOVE_ID, PreferenceDialogConstants.REMOVE_LABEL, false);
	        removeButton.setEnabled(
	        		(field.getPreferencesLevel() != null) &&
	        		!field.isInherited() &&
	        		field.isRemovable()  && 
		        	field.getChangeControl().isEnabled());

	        Label l = new Label(parent, SWT.NONE);
	        l.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	        GridLayout layout = (GridLayout) parent.getLayout();
	        layout.numColumns++;
	        layout.makeColumnsEqualWidth = false;

	        Button b = createButton(parent, IDialogConstants.OK_ID,
	                IDialogConstants.OK_LABEL, true);
	        b.setFocus();
	    }

	    
	    protected Composite workArea = null;
	    protected Composite dialogAreaParent = null;
	    
	    /**
	     * Creates and returns the contents of the upper part 
	     * of the dialog (above the button bar).
	     *
	     * Subclasses should override.
	     *
	     * @param parent  the parent composite to contain the dialog area
	     * @return the dialog area control
	     */
	    protected Control createDialogArea(Composite parent) {
	    	
	    	dialogAreaParent = parent;
	    	
//	        final Cursor hand = new Cursor(parent.getDisplay(), SWT.CURSOR_HAND);
//	        final Cursor busy = new Cursor(parent.getDisplay(), SWT.CURSOR_WAIT);
//	        setHandCursor(hand);
//	        setBusyCursor(busy);
//	        getShell().addDisposeListener(new DisposeListener() {
//	            public void widgetDisposed(DisposeEvent e) {
//	                setHandCursor(null);
//	                hand.dispose();
//	                setBusyCursor(null);
//	                busy.dispose();
//	            }
//	        });
	        
	        // Create a composite which is the parent of the top area and the bottom
	        // button bar.  This allows there to be a second child of the parent with 
	        // a banner background on top but not on the bottom

	        Composite workArea = new Composite(parent, SWT.NONE);
	        workArea = fillInWorkArea(workArea);
	        return workArea;
	    }
	        	
	     
	    private Composite fillInWorkArea(Composite workArea) {
	    	if (workArea.isDisposed()) System.err.println("fillInWorkArea:  workArea is disposed!!!");	
	        GridLayout workLayout = new GridLayout();
	        workLayout.marginHeight = 0;
	        workLayout.marginWidth = 0;
	        workLayout.verticalSpacing = 0;
	        workLayout.horizontalSpacing = 0;
	        workArea.setLayout(workLayout);
	        workArea.setLayoutData(new GridData(GridData.FILL_BOTH));

	        // page group
	        Color background = JFaceColors.getBannerBackground(parent.getDisplay());
	        Color foreground = JFaceColors.getBannerForeground(parent.getDisplay());
	        Composite top = (Composite) super.createDialogArea(workArea);

	        // override any layout inherited from createDialogArea 
	        GridLayout layout = new GridLayout();
	        layout.marginHeight = 0;
	        layout.marginWidth = 0;
	        layout.verticalSpacing = 0;
	        layout.horizontalSpacing = 0;
	        top.setLayout(layout);
	        top.setLayoutData(new GridData(GridData.FILL_BOTH));
	        top.setBackground(background);
	        top.setForeground(foreground);

	        // the image & text	
	        Composite topContainer = new Composite(top, SWT.NONE);
	        topContainer.setBackground(background);
	        topContainer.setForeground(foreground);
	        
	        layout = new GridLayout();
	        layout.numColumns = (1);
	        layout.marginWidth = 0;
	        layout.marginHeight = 0;
	        layout.verticalSpacing = 0;
	        layout.horizontalSpacing = 0;
	        topContainer.setLayout(layout);
	        GridData data = new GridData();
	        data.horizontalAlignment = GridData.FILL;
	        data.grabExcessHorizontalSpace = true;
	        topContainer.setLayoutData(data);

	        String levelString = null;
	        if (field.getPreferencesLevel() == null) {	
	        	levelString = "Details as currently applicable";
	        	if (preferencesService.getProject() != null) {
	        		levelString += " (including project preferences):  ";
	        	} else {
	        		levelString += " (not including any project preferences):  ";
	        	}
	        }
	        else if (field.getPreferencesLevel().equals(IPreferencesService.INSTANCE_LEVEL))
	        	levelString = PreferenceDialogConstants.INSTANCE_LEVEL_STRING;
	        else if (field.getPreferencesLevel().equals(IPreferencesService.CONFIGURATION_LEVEL))
	        	levelString = PreferenceDialogConstants.CONFIGURATION_LEVEL_STRING;
	        else if (field.getPreferencesLevel().equals(IPreferencesService.DEFAULT_LEVEL))
	        	levelString = PreferenceDialogConstants.DEFAULT_LEVEL_STRING;
	        else if (field.getPreferencesLevel().equals(IPreferencesService.PROJECT_LEVEL))
	        	levelString = PreferenceDialogConstants.PROJECT_LEVEL_STRING;
	        else
	        	levelString = PreferenceDialogConstants.UNKNOWN_LEVEL_STRING + field.getPreferencesLevel();
	        
	        Label label = null;
	        
	        label = new Label(topContainer, SWT.LEAD);
	        label.setText(levelString);
	        label.setBackground(PreferencesUtilities.colorWhite);
	        
	        label = new Label(topContainer, SWT.LEAD);
	        label.setText("\tCurrent value:  '" + field.getFieldEditorFontName() + "'");
	        label.setBackground(PreferencesUtilities.colorWhite);
	        
	        label = new Label(topContainer, SWT.LEAD);
	        String level = PreferenceDialogConstants.getLevelName(field.getLevelFromWhichLoaded()); 
	        label.setText("\tLevel at which set:  " + level);
	        label.setBackground(PreferencesUtilities.colorWhite);
	        
	            
	        label = new Label(topContainer, SWT.LEAD);
//	        if (field.isEmptyStringAllowed()) {
//		        label.setText(PreferenceDialogConstants.EMPTY_OK	);
//	        } else {
//		        label.setText(PreferenceDialogConstants.EMPTY_NOT_OK);
//	        }
	        label.setBackground(PreferencesUtilities.colorWhite);
	        
        	label = new Label(topContainer, SWT.LEAD);
	        if (field.hasSpecialValue()) {
	        	label.setText(PreferenceDialogConstants.HAS_SPECIAL + field.getSpecialValue());
	        } else {
	        	label.setText(PreferenceDialogConstants.NO_SPECIAL);
	        }
	        label.setBackground(PreferencesUtilities.colorWhite);
	        
	        if ((field.getPreferencesLevel() != null) && field.getPreferencesLevel().equals(field.getLevelFromWhichLoaded())) {
	        	label = new Label(topContainer, SWT.LEAD);
		        if (field.isRemovable()) {
		        	label.setText(PreferenceDialogConstants.IS_REMOVABLE);
		        } else {
		        	label.setText(PreferenceDialogConstants.NOT_REMOVABLE); 
		        }
	        }
	        label.setBackground(PreferencesUtilities.colorWhite);
	        
	        label = new Label(top, SWT.LEAD);
	        label.setText("~~~");
	        label.setVisible(false);
	        
	        
	        this.workArea = workArea;
	        return workArea;
	    }
	    
}
