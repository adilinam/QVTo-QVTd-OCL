/**
 * <copyright>
 * 
 * Copyright (c) 2015 Willink Transformations and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 * 
 * </copyright>
 */
package codegen.company.impl;

import codegen.company.CodegencompanyPackage;
import codegen.company.CodegencompanyTables;
import codegen.company.Company;
import codegen.company.Employee;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionPrependOperation;

import org.eclipse.ocl.pivot.library.logical.BooleanAndOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanImpliesOperation;
import org.eclipse.ocl.pivot.library.logical.BooleanNotOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringSizeOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codegen.company.impl.EmployeeImpl#getName <em>Name</em>}</li>
 *   <li>{@link codegen.company.impl.EmployeeImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link codegen.company.impl.EmployeeImpl#getCompany <em>Company</em>}</li>
 *   <li>{@link codegen.company.impl.EmployeeImpl#getDirectReports <em>Direct Reports</em>}</li>
 *   <li>{@link codegen.company.impl.EmployeeImpl#getAllReports <em>All Reports</em>}</li>
 *   <li>{@link codegen.company.impl.EmployeeImpl#getReportingChain <em>Reporting Chain</em>}</li>
 *   <li>{@link codegen.company.impl.EmployeeImpl#isHasNameAsAttribute <em>Has Name As Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends EObjectImpl implements Employee {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected Employee manager;

	/**
	 * The default value of the '{@link #isHasNameAsAttribute() <em>Has Name As Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasNameAsAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_NAME_AS_ATTRIBUTE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegencompanyPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegencompanyPackage.EMPLOYEE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee getManager() {
		if (manager != null && manager.eIsProxy()) {
			InternalEObject oldManager = (InternalEObject)manager;
			manager = (Employee)eResolveProxy(oldManager);
			if (manager != oldManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegencompanyPackage.EMPLOYEE__MANAGER, oldManager, manager));
			}
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(Employee newManager) {
		Employee oldManager = manager;
		manager = newManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegencompanyPackage.EMPLOYEE__MANAGER, oldManager, manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company getCompany() {
		if (eContainerFeatureID() != CodegencompanyPackage.EMPLOYEE__COMPANY) return null;
		return (Company)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompany(Company newCompany, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCompany, CodegencompanyPackage.EMPLOYEE__COMPANY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompany(Company newCompany) {
		if (newCompany != eInternalContainer() || (eContainerFeatureID() != CodegencompanyPackage.EMPLOYEE__COMPANY && newCompany != null)) {
			if (EcoreUtil.isAncestor(this, newCompany))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCompany != null)
				msgs = ((InternalEObject)newCompany).eInverseAdd(this, CodegencompanyPackage.COMPANY__EMPLOYEES, Company.class, msgs);
			msgs = basicSetCompany(newCompany, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegencompanyPackage.EMPLOYEE__COMPANY, newCompany, newCompany));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getDirectReports() {
		/**
		 * company.employees?->select(manager = self)
		 */
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.evaluation.@NonNull Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@NonNull IdResolver idResolver = executor.getIdResolver();
		@SuppressWarnings("null")
		final /*@Thrown*/ codegen.company.@NonNull Company company = this.getCompany();
		@SuppressWarnings("null")
		final /*@Thrown*/ java.util.@NonNull List<Employee> employees = company.getEmployees();
		final /*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull OrderedSetValue BOXED_employees = idResolver.createOrderedSetOfAll(CodegencompanyTables.ORD_CLSSid_Employee, employees);
		final /*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull OrderedSetValue safe_null_sources = (OrderedSetValue)CollectionExcludingOperation.INSTANCE.evaluate(BOXED_employees, null);
		/*@Thrown*/ OrderedSetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(CodegencompanyTables.ORD_CLSSid_Employee);
		@NonNull Iterator<?> ITERATOR__1 = safe_null_sources.iterator();
		/*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull OrderedSetValue select;
		while (true) {
		    if (!ITERATOR__1.hasNext()) {
		        select = accumulator;
		        break;
		    }
		    @SuppressWarnings("null")
		    /*@NonInvalid*/ codegen.company.@NonNull Employee _1 = (Employee)ITERATOR__1.next();
		    /**
		     * manager = self
		     */
		    final /*@Thrown*/ codegen.company.@Nullable Employee manager_0 = _1.getManager();
		    final /*@Thrown*/ boolean eq = this.equals(manager_0);
		    //
		    if (eq == ValueUtil.TRUE_VALUE) {
		        accumulator.add(_1);
		    }
		}
		final /*@Thrown*/ java.util.@NonNull List<Employee> ECORE_select = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Employee.class, select);
		return (EList<Employee>)ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getAllReports() {
		/**
		 * Employee.allInstances()->select(reportsTo(self))
		 */
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.evaluation.@NonNull Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@NonNull IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.@NonNull Class TYP_company_c_c_Employee_0 = idResolver.getClass(CodegencompanyTables.CLSSid_Employee, null);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@NonNull SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, CodegencompanyTables.SET_CLSSid_Employee, TYP_company_c_c_Employee_0);
		/*@Thrown*/ SetValue.@org.eclipse.jdt.annotation.NonNull Accumulator accumulator = ValueUtil.createSetAccumulatorValue(CodegencompanyTables.SET_CLSSid_Employee);
		@NonNull Iterator<?> ITERATOR__1 = allInstances.iterator();
		/*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull SetValue select;
		while (true) {
		    if (!ITERATOR__1.hasNext()) {
		        select = accumulator;
		        break;
		    }
		    @SuppressWarnings("null")
		    /*@NonInvalid*/ codegen.company.@NonNull Employee _1 = (Employee)ITERATOR__1.next();
		    /**
		     * reportsTo(self)
		     */
		    final /*@Thrown*/ boolean reportsTo = _1.reportsTo(this);
		    //
		    if (reportsTo == ValueUtil.TRUE_VALUE) {
		        accumulator.add(_1);
		    }
		}
		final /*@Thrown*/ java.util.@NonNull List<Employee> ECORE_select = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Employee.class, select);
		return (EList<Employee>)ECORE_select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employee> getReportingChain() {
		/**
		 * 
		 * if manager.oclIsUndefined()
		 * then OrderedSet{}
		 * else manager?.reportingChain->prepend(manager)
		 * endif
		 */
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.evaluation.@NonNull Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@NonNull IdResolver idResolver = executor.getIdResolver();
		/*@Caught*/ @Nullable Object CAUGHT_manager_0;
		try {
		    final /*@Thrown*/ codegen.company.@Nullable Employee manager_0 = this.getManager();
		    CAUGHT_manager_0 = manager_0;
		}
		catch (Exception e) {
		    CAUGHT_manager_0 = ValueUtil.createInvalidValue(e);
		}
		final /*@NonInvalid*/ boolean symbol_6 = (CAUGHT_manager_0 == null) || (CAUGHT_manager_0 instanceof InvalidValueException);
		/*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull OrderedSetValue symbol_8;
		if (symbol_6) {
		    symbol_8 = CodegencompanyTables.OrderedSet;
		}
		else {
		    final /*@Thrown*/ codegen.company.@Nullable Employee manager_2 = this.getManager();
		    /*@Caught*/ @Nullable Object CAUGHT_manager_1;
		    try {
		        CAUGHT_manager_1 = manager_2;
		    }
		    catch (Exception e) {
		        CAUGHT_manager_1 = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ @NonNull Object symbol_7 = CAUGHT_manager_1 == null;
		    /*@Thrown*/ org.eclipse.ocl.pivot.values.@Nullable OrderedSetValue safe_reportingChain_source;
		    if (symbol_7 == Boolean.TRUE) {
		        safe_reportingChain_source = null;
		    }
		    else {
		        assert manager_2 != null;
		        @SuppressWarnings("null")
		        final /*@Thrown*/ java.util.@NonNull List<Employee> reportingChain = manager_2.getReportingChain();
		        final /*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull OrderedSetValue BOXED_reportingChain = idResolver.createOrderedSetOfAll(CodegencompanyTables.ORD_CLSSid_Employee, reportingChain);
		        safe_reportingChain_source = BOXED_reportingChain;
		    }
		    final /*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull OrderedSetValue prepend = (OrderedSetValue)OrderedCollectionPrependOperation.INSTANCE.evaluate(safe_reportingChain_source, manager_2);
		    symbol_8 = prepend;
		}
		final /*@Thrown*/ java.util.@NonNull List<Employee> ECORE_symbol_8 = ((IdResolver.IdResolverExtension)idResolver).ecoreValueOfAll(Employee.class, symbol_8);
		return (EList<Employee>)ECORE_symbol_8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasNameAsAttribute() {
		/**
		 * name <> null
		 */
		final /*@Thrown*/ java.lang.@Nullable String name = this.getName();
		final /*@Thrown*/ boolean ne = name != null;
		return ne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean reportsTo(final Employee manager) {
		/**
		 * self.reportingChain->includes(manager)
		 */
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.evaluation.@NonNull Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@NonNull IdResolver idResolver = executor.getIdResolver();
		@SuppressWarnings("null")
		final /*@Thrown*/ java.util.@NonNull List<Employee> reportingChain = this.getReportingChain();
		final /*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull OrderedSetValue BOXED_reportingChain = idResolver.createOrderedSetOfAll(CodegencompanyTables.ORD_CLSSid_Employee, reportingChain);
		final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_reportingChain, manager).booleanValue();
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasNameAsOperation() {
		/**
		 * name <> null
		 */
		final /*@Thrown*/ java.lang.@Nullable String name = this.getName();
		final /*@Thrown*/ boolean ne = name != null;
		return ne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noManagerImpliesDirectReports(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv noManagerImpliesDirectReports:
		 *   let
		 *     severity : Integer[1] = 'Employee::noManagerImpliesDirectReports'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[?] = manager.oclIsUndefined() implies
		 *         directReports->size() > 0
		 *       in
		 *         'Employee::noManagerImpliesDirectReports'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.evaluation.@NonNull Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.@NonNull IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@NonNull IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CodegencompanyTables.STR_Employee_c_c_noManagerImpliesDirectReports);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CodegencompanyTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@Caught*/ @Nullable Object CAUGHT_status;
		    try {
		        /*@Caught*/ @Nullable Object CAUGHT_manager;
		        try {
		            final /*@Thrown*/ codegen.company.@Nullable Employee manager = this.getManager();
		            CAUGHT_manager = manager;
		        }
		        catch (Exception e) {
		            CAUGHT_manager = ValueUtil.createInvalidValue(e);
		        }
		        final /*@NonInvalid*/ boolean symbol_0 = (CAUGHT_manager == null) || (CAUGHT_manager instanceof InvalidValueException);
		        /*@Caught*/ @NonNull Object CAUGHT_gt;
		        try {
		            @SuppressWarnings("null")
		            final /*@Thrown*/ java.util.@NonNull List<Employee> directReports = this.getDirectReports();
		            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull OrderedSetValue BOXED_directReports = idResolver.createOrderedSetOfAll(CodegencompanyTables.ORD_CLSSid_Employee, directReports);
		            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_directReports);
		            final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, CodegencompanyTables.INT_0).booleanValue();
		            CAUGHT_gt = gt;
		        }
		        catch (Exception e) {
		            CAUGHT_gt = ValueUtil.createInvalidValue(e);
		        }
		        final /*@Thrown*/ java.lang.@Nullable Boolean status = BooleanImpliesOperation.INSTANCE.evaluate(symbol_0, CAUGHT_gt);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CodegencompanyTables.STR_Employee_c_c_noManagerImpliesDirectReports, this, null, diagnostics, context, null, severity_0, CAUGHT_status, CodegencompanyTables.INT_0).booleanValue();
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mustHaveName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv mustHaveName:
		 *   let severity : Integer[1] = 'Employee::mustHaveName'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         status : OclAny[?] = not name.oclIsUndefined() and hasNameAsAttribute and
		 *         hasNameAsOperation()
		 *       in
		 *         let
		 *           message : String[?] = if status <> true
		 *           then 'Employee must have a name'
		 *           else null
		 *           endif
		 *         in
		 *           'Employee::mustHaveName'.logDiagnostic(self, null, diagnostics, context, message, severity, status, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.evaluation.@NonNull Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@NonNull IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CodegencompanyTables.STR_Employee_c_c_mustHaveName);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CodegencompanyTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_1;
		if (le) {
		    symbol_1 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@Caught*/ @Nullable Object CAUGHT_status;
		    try {
		        /*@Caught*/ @Nullable Object CAUGHT_and;
		        try {
		            /*@Caught*/ @Nullable Object CAUGHT_name;
		            try {
		                final /*@Thrown*/ java.lang.@Nullable String name = this.getName();
		                CAUGHT_name = name;
		            }
		            catch (Exception e) {
		                CAUGHT_name = ValueUtil.createInvalidValue(e);
		            }
		            final /*@NonInvalid*/ boolean symbol_0 = (CAUGHT_name == null) || (CAUGHT_name instanceof InvalidValueException);
		            final /*@NonInvalid*/ java.lang.@Nullable Boolean not = BooleanNotOperation.INSTANCE.evaluate(symbol_0);
		            /*@Caught*/ @Nullable Object CAUGHT_hasNameAsAttribute;
		            try {
		                final /*@Thrown*/ java.lang.@Nullable Boolean hasNameAsAttribute = this.isHasNameAsAttribute();
		                CAUGHT_hasNameAsAttribute = hasNameAsAttribute;
		            }
		            catch (Exception e) {
		                CAUGHT_hasNameAsAttribute = ValueUtil.createInvalidValue(e);
		            }
		            final /*@Thrown*/ java.lang.@Nullable Boolean and = BooleanAndOperation.INSTANCE.evaluate(not, CAUGHT_hasNameAsAttribute);
		            CAUGHT_and = and;
		        }
		        catch (Exception e) {
		            CAUGHT_and = ValueUtil.createInvalidValue(e);
		        }
		        /*@Caught*/ @NonNull Object CAUGHT_hasNameAsOperation;
		        try {
		            final /*@Thrown*/ boolean hasNameAsOperation = this.hasNameAsOperation();
		            CAUGHT_hasNameAsOperation = hasNameAsOperation;
		        }
		        catch (Exception e) {
		            CAUGHT_hasNameAsOperation = ValueUtil.createInvalidValue(e);
		        }
		        final /*@Thrown*/ java.lang.@Nullable Boolean status = BooleanAndOperation.INSTANCE.evaluate(CAUGHT_and, CAUGHT_hasNameAsOperation);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    if (CAUGHT_status instanceof InvalidValueException) {
		        throw (InvalidValueException)CAUGHT_status;
		    }
		    final /*@Thrown*/ boolean ne = CAUGHT_status == Boolean.FALSE;
		    /*@NonInvalid*/ java.lang.@Nullable String message_0;
		    if (ne) {
		        message_0 = CodegencompanyTables.STR_Employee_32_must_32_have_32_a_32_name;
		    }
		    else {
		        message_0 = null;
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CodegencompanyTables.STR_Employee_c_c_mustHaveName, this, null, diagnostics, context, message_0, severity_0, CAUGHT_status, CodegencompanyTables.INT_0).booleanValue();
		    symbol_1 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mustHaveNonEmptyName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 * 
		 * inv mustHaveNonEmptyName:
		 *   let severity : Integer[1] = 'Employee::mustHaveNonEmptyName'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let status : OclAny[?] = name->notEmpty() implies name.size() > 0
		 *       in
		 *         'Employee::mustHaveNonEmptyName'.logDiagnostic(self, null, diagnostics, context, null, severity, status, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.evaluation.@NonNull Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.@NonNull IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CodegencompanyTables.STR_Employee_c_c_mustHaveNonEmptyName);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CodegencompanyTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
		    symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
		    /*@Caught*/ @Nullable Object CAUGHT_status;
		    try {
		        /*@Caught*/ @NonNull Object CAUGHT_notEmpty;
		        try {
		            final /*@Thrown*/ java.lang.@Nullable String name = this.getName();
		            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, CodegencompanyTables.SET_PRIMid_String, name);
		            final /*@Thrown*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(oclAsSet).booleanValue();
		            CAUGHT_notEmpty = notEmpty;
		        }
		        catch (Exception e) {
		            CAUGHT_notEmpty = ValueUtil.createInvalidValue(e);
		        }
		        /*@Caught*/ @NonNull Object CAUGHT_gt;
		        try {
		            final /*@Thrown*/ java.lang.@Nullable String name_0 = this.getName();
		            final /*@Thrown*/ org.eclipse.ocl.pivot.values.@NonNull IntegerValue size = StringSizeOperation.INSTANCE.evaluate(name_0);
		            final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, CodegencompanyTables.INT_0).booleanValue();
		            CAUGHT_gt = gt;
		        }
		        catch (Exception e) {
		            CAUGHT_gt = ValueUtil.createInvalidValue(e);
		        }
		        final /*@Thrown*/ java.lang.@Nullable Boolean status = BooleanImpliesOperation.INSTANCE.evaluate(CAUGHT_notEmpty, CAUGHT_gt);
		        CAUGHT_status = status;
		    }
		    catch (Exception e) {
		        CAUGHT_status = ValueUtil.createInvalidValue(e);
		    }
		    final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CodegencompanyTables.STR_Employee_c_c_mustHaveNonEmptyName, this, null, diagnostics, context, null, severity_0, CAUGHT_status, CodegencompanyTables.INT_0).booleanValue();
		    symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegencompanyPackage.EMPLOYEE__COMPANY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCompany((Company)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegencompanyPackage.EMPLOYEE__COMPANY:
				return basicSetCompany(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CodegencompanyPackage.EMPLOYEE__COMPANY:
				return eInternalContainer().eInverseRemove(this, CodegencompanyPackage.COMPANY__EMPLOYEES, Company.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegencompanyPackage.EMPLOYEE__NAME:
				return getName();
			case CodegencompanyPackage.EMPLOYEE__MANAGER:
				if (resolve) return getManager();
				return basicGetManager();
			case CodegencompanyPackage.EMPLOYEE__COMPANY:
				return getCompany();
			case CodegencompanyPackage.EMPLOYEE__DIRECT_REPORTS:
				return getDirectReports();
			case CodegencompanyPackage.EMPLOYEE__ALL_REPORTS:
				return getAllReports();
			case CodegencompanyPackage.EMPLOYEE__REPORTING_CHAIN:
				return getReportingChain();
			case CodegencompanyPackage.EMPLOYEE__HAS_NAME_AS_ATTRIBUTE:
				return isHasNameAsAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegencompanyPackage.EMPLOYEE__NAME:
				setName((String)newValue);
				return;
			case CodegencompanyPackage.EMPLOYEE__MANAGER:
				setManager((Employee)newValue);
				return;
			case CodegencompanyPackage.EMPLOYEE__COMPANY:
				setCompany((Company)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodegencompanyPackage.EMPLOYEE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CodegencompanyPackage.EMPLOYEE__MANAGER:
				setManager((Employee)null);
				return;
			case CodegencompanyPackage.EMPLOYEE__COMPANY:
				setCompany((Company)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodegencompanyPackage.EMPLOYEE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CodegencompanyPackage.EMPLOYEE__MANAGER:
				return manager != null;
			case CodegencompanyPackage.EMPLOYEE__COMPANY:
				return getCompany() != null;
			case CodegencompanyPackage.EMPLOYEE__DIRECT_REPORTS:
				return !getDirectReports().isEmpty();
			case CodegencompanyPackage.EMPLOYEE__ALL_REPORTS:
				return !getAllReports().isEmpty();
			case CodegencompanyPackage.EMPLOYEE__REPORTING_CHAIN:
				return !getReportingChain().isEmpty();
			case CodegencompanyPackage.EMPLOYEE__HAS_NAME_AS_ATTRIBUTE:
				return isHasNameAsAttribute() != HAS_NAME_AS_ATTRIBUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CodegencompanyPackage.EMPLOYEE___REPORTS_TO__EMPLOYEE:
				return reportsTo((Employee)arguments.get(0));
			case CodegencompanyPackage.EMPLOYEE___HAS_NAME_AS_OPERATION:
				return hasNameAsOperation();
			case CodegencompanyPackage.EMPLOYEE___NO_MANAGER_IMPLIES_DIRECT_REPORTS__DIAGNOSTICCHAIN_MAP:
				return noManagerImpliesDirectReports((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CodegencompanyPackage.EMPLOYEE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP:
				return mustHaveName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CodegencompanyPackage.EMPLOYEE___MUST_HAVE_NON_EMPTY_NAME__DIAGNOSTICCHAIN_MAP:
				return mustHaveNonEmptyName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
