/*
 * generated by Xtext
 */
package org.eclipse.qvto.examples.xtext.qvtoperational.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.xtext.basecs.BaseCSPackage;
import org.eclipse.ocl.xtext.basecs.DataTypeCS;
import org.eclipse.ocl.xtext.basecs.EnumerationCS;
import org.eclipse.ocl.xtext.basecs.EnumerationLiteralCS;
import org.eclipse.ocl.xtext.basecs.MultiplicityBoundsCS;
import org.eclipse.ocl.xtext.basecs.MultiplicityStringCS;
import org.eclipse.ocl.xtext.basecs.ParameterCS;
import org.eclipse.ocl.xtext.basecs.PathElementCS;
import org.eclipse.ocl.xtext.basecs.PathElementWithURICS;
import org.eclipse.ocl.xtext.basecs.PathNameCS;
import org.eclipse.ocl.xtext.basecs.PrimitiveTypeRefCS;
import org.eclipse.ocl.xtext.basecs.StructuredClassCS;
import org.eclipse.ocl.xtext.basecs.TemplateBindingCS;
import org.eclipse.ocl.xtext.basecs.TemplateParameterSubstitutionCS;
import org.eclipse.ocl.xtext.basecs.TemplateSignatureCS;
import org.eclipse.ocl.xtext.basecs.TuplePartCS;
import org.eclipse.ocl.xtext.basecs.TupleTypeCS;
import org.eclipse.ocl.xtext.basecs.TypeParameterCS;
import org.eclipse.ocl.xtext.basecs.TypedTypeRefCS;
import org.eclipse.ocl.xtext.basecs.WildcardTypeRefCS;
import org.eclipse.ocl.xtext.essentialoclcs.BooleanLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionLiteralPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionPatternCS;
import org.eclipse.ocl.xtext.essentialoclcs.CollectionTypeCS;
import org.eclipse.ocl.xtext.essentialoclcs.ContextCS;
import org.eclipse.ocl.xtext.essentialoclcs.CurlyBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.EssentialOCLCSPackage;
import org.eclipse.ocl.xtext.essentialoclcs.IfExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.IfThenExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.InfixExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.InvalidLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LambdaLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LetExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.LetVariableCS;
import org.eclipse.ocl.xtext.essentialoclcs.MapLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.MapLiteralPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.MapTypeCS;
import org.eclipse.ocl.xtext.essentialoclcs.NameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NavigatingArgCS;
import org.eclipse.ocl.xtext.essentialoclcs.NestedExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NullLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.NumberLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.PatternExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.PrefixExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.RoundBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.SelfExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.ShadowPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.SquareBracketedClauseCS;
import org.eclipse.ocl.xtext.essentialoclcs.StringLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.TupleLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.TupleLiteralPartCS;
import org.eclipse.ocl.xtext.essentialoclcs.TypeLiteralExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.TypeNameExpCS;
import org.eclipse.ocl.xtext.essentialoclcs.UnlimitedNaturalLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeocl.serializer.ImperativeOCLSemanticSequencer;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.BlockExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.DictLiteralPartCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.DictTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ImperativeOCLCSPackage;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ListLiteralExpCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ListTypeCS;
import org.eclipse.qvto.examples.xtext.imperativeoclcs.ReturnExpCS;
import org.eclipse.qvto.examples.xtext.qvtoperational.services.QVTOperationalGrammarAccess;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ClassifierPropertyCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.InitPartCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MappingOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.MetamodelCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModelTypeRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ModuleUsageCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PackageRefCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.ParameterDeclarationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathElement2CS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PathName2CS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.PrimitiveTypeCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVTOperationalCSPackage;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToClassCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToImportCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToLibraryCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.QVToOperationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.StereotypeQualifierCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TagCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TopLevelCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TransformationCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypeSpecCS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.TypedTypeRef2CS;
import org.eclipse.qvto.examples.xtext.qvtoperationalcs.UnitCS;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class QVTOperationalSemanticSequencer extends ImperativeOCLSemanticSequencer {

	@Inject
	private QVTOperationalGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == BaseCSPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case BaseCSPackage.DATA_TYPE_CS:
				sequence_DataTypeCS(context, (DataTypeCS) semanticObject); 
				return; 
			case BaseCSPackage.ENUMERATION_CS:
				sequence_EnumerationCS(context, (EnumerationCS) semanticObject); 
				return; 
			case BaseCSPackage.ENUMERATION_LITERAL_CS:
				sequence_EnumerationLiteralCS(context, (EnumerationLiteralCS) semanticObject); 
				return; 
			case BaseCSPackage.MULTIPLICITY_BOUNDS_CS:
				if(context == grammarAccess.getMultiplicityBoundsCSRule()) {
					sequence_MultiplicityBoundsCS(context, (MultiplicityBoundsCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMultiplicityCSRule()) {
					sequence_MultiplicityCS(context, (MultiplicityBoundsCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.MULTIPLICITY_STRING_CS:
				sequence_MultiplicityStringCS(context, (MultiplicityStringCS) semanticObject); 
				return; 
			case BaseCSPackage.PARAMETER_CS:
				sequence_ParameterCS(context, (ParameterCS) semanticObject); 
				return; 
			case BaseCSPackage.PATH_ELEMENT_CS:
				if(context == grammarAccess.getFirstPathElementCSRule()) {
					sequence_FirstPathElementCS(context, (PathElementCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNextPathElementCSRule()) {
					sequence_NextPathElementCS(context, (PathElementCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getURIFirstPathElementCSRule()) {
					sequence_URIFirstPathElementCS(context, (PathElementCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.PATH_ELEMENT_WITH_URICS:
				sequence_URIFirstPathElementCS(context, (PathElementWithURICS) semanticObject); 
				return; 
			case BaseCSPackage.PATH_NAME_CS:
				if(context == grammarAccess.getPathNameCSRule()) {
					sequence_PathNameCS(context, (PathNameCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getURIPathNameCSRule()) {
					sequence_URIPathNameCS(context, (PathNameCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.PRIMITIVE_TYPE_REF_CS:
				if(context == grammarAccess.getPrimitiveTypeCSRule() ||
				   context == grammarAccess.getTypeLiteralCSRule() ||
				   context == grammarAccess.getTypeRef2CSRule() ||
				   context == grammarAccess.getTypedRef2CSRule()) {
					sequence_PrimitiveTypeCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_PrimitiveTypeCS_TypeExpCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_PrimitiveTypeCS_TypeLiteralWithMultiplicityCS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypedMultiplicityRef2CSRule()) {
					sequence_PrimitiveTypeCS_TypedMultiplicityRef2CS(context, (PrimitiveTypeRefCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.STRUCTURED_CLASS_CS:
				sequence_ExceptionCS(context, (StructuredClassCS) semanticObject); 
				return; 
			case BaseCSPackage.TEMPLATE_BINDING_CS:
				sequence_TemplateBindingCS(context, (TemplateBindingCS) semanticObject); 
				return; 
			case BaseCSPackage.TEMPLATE_PARAMETER_SUBSTITUTION_CS:
				sequence_TemplateParameterSubstitutionCS(context, (TemplateParameterSubstitutionCS) semanticObject); 
				return; 
			case BaseCSPackage.TEMPLATE_SIGNATURE_CS:
				sequence_TemplateSignatureCS(context, (TemplateSignatureCS) semanticObject); 
				return; 
			case BaseCSPackage.TUPLE_PART_CS:
				sequence_TuplePartCS(context, (TuplePartCS) semanticObject); 
				return; 
			case BaseCSPackage.TUPLE_TYPE_CS:
				if(context == grammarAccess.getTupleTypeCSRule() ||
				   context == grammarAccess.getTypeLiteralCSRule() ||
				   context == grammarAccess.getTypeRef2CSRule() ||
				   context == grammarAccess.getTypedRef2CSRule()) {
					sequence_TupleTypeCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_TupleTypeCS_TypeExpCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_TupleTypeCS_TypeLiteralWithMultiplicityCS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypedMultiplicityRef2CSRule()) {
					sequence_TupleTypeCS_TypedMultiplicityRef2CS(context, (TupleTypeCS) semanticObject); 
					return; 
				}
				else break;
			case BaseCSPackage.TYPE_PARAMETER_CS:
				sequence_TypeParameterCS(context, (TypeParameterCS) semanticObject); 
				return; 
			case BaseCSPackage.TYPED_TYPE_REF_CS:
				sequence_TypedTypeRefCS(context, (TypedTypeRefCS) semanticObject); 
				return; 
			case BaseCSPackage.WILDCARD_TYPE_REF_CS:
				sequence_WildcardTypeRefCS(context, (WildcardTypeRefCS) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == EssentialOCLCSPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EssentialOCLCSPackage.BOOLEAN_LITERAL_EXP_CS:
				sequence_BooleanLiteralExpCS(context, (BooleanLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.COLLECTION_LITERAL_EXP_CS:
				sequence_CollectionLiteralExpCS(context, (CollectionLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.COLLECTION_LITERAL_PART_CS:
				sequence_CollectionLiteralPartCS(context, (CollectionLiteralPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.COLLECTION_PATTERN_CS:
				if(context == grammarAccess.getCollectionPatternCSRule()) {
					sequence_CollectionPatternCS(context, (CollectionPatternCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_CollectionPatternCS_TypeExpCS(context, (CollectionPatternCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.COLLECTION_TYPE_CS:
				if(context == grammarAccess.getCollectionTypeCSRule() ||
				   context == grammarAccess.getTypeLiteralCSRule() ||
				   context == grammarAccess.getTypeRef2CSRule() ||
				   context == grammarAccess.getTypedRef2CSRule()) {
					sequence_CollectionTypeCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_CollectionTypeCS_TypeExpCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_CollectionTypeCS_TypeLiteralWithMultiplicityCS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypedMultiplicityRef2CSRule()) {
					sequence_CollectionTypeCS_TypedMultiplicityRef2CS(context, (CollectionTypeCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.CONTEXT_CS:
				sequence_Model(context, (ContextCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.CURLY_BRACKETED_CLAUSE_CS:
				sequence_CurlyBracketedClauseCS(context, (CurlyBracketedClauseCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.IF_EXP_CS:
				sequence_IfExpCS(context, (IfExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.IF_THEN_EXP_CS:
				sequence_ElseIfThenExpCS(context, (IfThenExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.INFIX_EXP_CS:
				sequence_ExpCS(context, (InfixExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.INVALID_LITERAL_EXP_CS:
				sequence_InvalidLiteralExpCS(context, (InvalidLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.LAMBDA_LITERAL_EXP_CS:
				sequence_LambdaLiteralExpCS(context, (LambdaLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.LET_EXP_CS:
				sequence_LetExpCS(context, (LetExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.LET_VARIABLE_CS:
				sequence_LetVariableCS(context, (LetVariableCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.MAP_LITERAL_EXP_CS:
				sequence_MapLiteralExpCS(context, (MapLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.MAP_LITERAL_PART_CS:
				sequence_MapLiteralPartCS(context, (MapLiteralPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.MAP_TYPE_CS:
				if(context == grammarAccess.getMapTypeCSRule() ||
				   context == grammarAccess.getTypeLiteralCSRule() ||
				   context == grammarAccess.getTypeRef2CSRule() ||
				   context == grammarAccess.getTypedRef2CSRule()) {
					sequence_MapTypeCS(context, (MapTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_MapTypeCS_TypeExpCS(context, (MapTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_MapTypeCS_TypeLiteralWithMultiplicityCS(context, (MapTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypedMultiplicityRef2CSRule()) {
					sequence_MapTypeCS_TypedMultiplicityRef2CS(context, (MapTypeCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.NAME_EXP_CS:
				sequence_NameExpCS(context, (NameExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.NAVIGATING_ARG_CS:
				if(context == grammarAccess.getNavigatingArgCSRule()) {
					sequence_NavigatingArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNavigatingBarArgCSRule()) {
					sequence_NavigatingBarArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNavigatingCommaArgCSRule()) {
					sequence_NavigatingCommaArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNavigatingSemiArgCSRule()) {
					sequence_NavigatingSemiArgCS(context, (NavigatingArgCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.NESTED_EXP_CS:
				sequence_NestedExpCS(context, (NestedExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.NULL_LITERAL_EXP_CS:
				sequence_NullLiteralExpCS(context, (NullLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.NUMBER_LITERAL_EXP_CS:
				sequence_NumberLiteralExpCS(context, (NumberLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.PATTERN_EXP_CS:
				sequence_PatternExpCS(context, (PatternExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.PREFIX_EXP_CS:
				if(context == grammarAccess.getPrefixedLetExpCSRule()) {
					sequence_PrefixedLetExpCS(context, (PrefixExpCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpCSRule() ||
				   context == grammarAccess.getGrammmarCSRule() ||
				   context == grammarAccess.getImperativeOCLExpCSRule() ||
				   context == grammarAccess.getNavigatingArgExpCSRule()) {
					sequence_PrefixedLetExpCS_PrefixedPrimaryExpCS(context, (PrefixExpCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpCSAccess().getInfixExpCSOwnedLeftAction_0_1_0() ||
				   context == grammarAccess.getPrefixedPrimaryExpCSRule()) {
					sequence_PrefixedPrimaryExpCS(context, (PrefixExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.ROUND_BRACKETED_CLAUSE_CS:
				sequence_RoundBracketedClauseCS(context, (RoundBracketedClauseCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.SELF_EXP_CS:
				sequence_SelfExpCS(context, (SelfExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.SHADOW_PART_CS:
				sequence_ShadowPartCS(context, (ShadowPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.SQUARE_BRACKETED_CLAUSE_CS:
				sequence_SquareBracketedClauseCS(context, (SquareBracketedClauseCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.STRING_LITERAL_EXP_CS:
				sequence_StringLiteralExpCS(context, (StringLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TUPLE_LITERAL_EXP_CS:
				sequence_TupleLiteralExpCS(context, (TupleLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TUPLE_LITERAL_PART_CS:
				sequence_TupleLiteralPartCS(context, (TupleLiteralPartCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TYPE_LITERAL_EXP_CS:
				sequence_TypeLiteralExpCS(context, (TypeLiteralExpCS) semanticObject); 
				return; 
			case EssentialOCLCSPackage.TYPE_NAME_EXP_CS:
				if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_TypeExpCS_TypeNameExpCS(context, (TypeNameExpCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeNameExpCSRule()) {
					sequence_TypeNameExpCS(context, (TypeNameExpCS) semanticObject); 
					return; 
				}
				else break;
			case EssentialOCLCSPackage.UNLIMITED_NATURAL_LITERAL_EXP_CS:
				sequence_UnlimitedNaturalLiteralExpCS(context, (UnlimitedNaturalLiteralExpCS) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == ImperativeOCLCSPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ImperativeOCLCSPackage.BLOCK_EXP_CS:
				sequence_BlockExpCS(context, (BlockExpCS) semanticObject); 
				return; 
			case ImperativeOCLCSPackage.DICT_LITERAL_EXP_CS:
				sequence_DictLiteralExpCS(context, (DictLiteralExpCS) semanticObject); 
				return; 
			case ImperativeOCLCSPackage.DICT_LITERAL_PART_CS:
				sequence_DictLiteralPartCS(context, (DictLiteralPartCS) semanticObject); 
				return; 
			case ImperativeOCLCSPackage.DICT_TYPE_CS:
				if(context == grammarAccess.getDictTypeCSRule() ||
				   context == grammarAccess.getTypeLiteralCSRule() ||
				   context == grammarAccess.getTypeRef2CSRule() ||
				   context == grammarAccess.getTypedRef2CSRule()) {
					sequence_DictTypeCS(context, (DictTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_DictTypeCS_TypeExpCS(context, (DictTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_DictTypeCS_TypeLiteralWithMultiplicityCS(context, (DictTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypedMultiplicityRef2CSRule()) {
					sequence_DictTypeCS_TypedMultiplicityRef2CS(context, (DictTypeCS) semanticObject); 
					return; 
				}
				else break;
			case ImperativeOCLCSPackage.LIST_LITERAL_EXP_CS:
				sequence_ListLiteralExpCS(context, (ListLiteralExpCS) semanticObject); 
				return; 
			case ImperativeOCLCSPackage.LIST_TYPE_CS:
				if(context == grammarAccess.getListTypeCSRule() ||
				   context == grammarAccess.getTypeLiteralCSRule() ||
				   context == grammarAccess.getTypeRef2CSRule() ||
				   context == grammarAccess.getTypedRef2CSRule()) {
					sequence_ListTypeCS(context, (ListTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeExpCSRule()) {
					sequence_ListTypeCS_TypeExpCS(context, (ListTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeLiteralWithMultiplicityCSRule()) {
					sequence_ListTypeCS_TypeLiteralWithMultiplicityCS(context, (ListTypeCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypedMultiplicityRef2CSRule()) {
					sequence_ListTypeCS_TypedMultiplicityRef2CS(context, (ListTypeCS) semanticObject); 
					return; 
				}
				else break;
			case ImperativeOCLCSPackage.RETURN_EXP_CS:
				sequence_ReturnExpCS(context, (ReturnExpCS) semanticObject); 
				return; 
			}
		else if(semanticObject.eClass().getEPackage() == QVTOperationalCSPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QVTOperationalCSPackage.CLASSIFIER_PROPERTY_CS:
				sequence_ClassifierPropertyCS(context, (ClassifierPropertyCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.INIT_PART_CS:
				sequence_InitPartCS(context, (InitPartCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.MAPPING_OPERATION_CS:
				sequence_MappingOperationHeaderCS(context, (MappingOperationCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.METAMODEL_CS:
				sequence_MetamodelCS(context, (MetamodelCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.MODEL_TYPE_CS:
				sequence_ModelTypeCS(context, (ModelTypeCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.MODEL_TYPE_REF_CS:
				sequence_ModelTypeRefCS(context, (ModelTypeRefCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.MODULE_REF_CS:
				sequence_ModuleRefCS(context, (ModuleRefCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.MODULE_USAGE_CS:
				sequence_ModuleUsageCS(context, (ModuleUsageCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.PACKAGE_REF_CS:
				sequence_PackageRefCS(context, (PackageRefCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.PARAMETER_DECLARATION_CS:
				sequence_ParameterDeclarationCS(context, (ParameterDeclarationCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.PATH_ELEMENT2_CS:
				sequence_PathElement2CS(context, (PathElement2CS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.PATH_NAME2_CS:
				sequence_PathName2CS(context, (PathName2CS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.PRIMITIVE_TYPE_CS:
				sequence_DataTypeCS(context, (PrimitiveTypeCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.QV_TO_CLASS_CS:
				sequence_QVToClassCS(context, (QVToClassCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.QV_TO_IMPORT_CS:
				sequence_ImportCS(context, (QVToImportCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.QV_TO_LIBRARY_CS:
				if(context == grammarAccess.getLibraryDefCSRule()) {
					sequence_LibraryDefCS_LibraryHeaderCS(context, (QVToLibraryCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLibraryCSRule() ||
				   context == grammarAccess.getLibraryDeclCSRule() ||
				   context == grammarAccess.getLibraryHeaderCSRule() ||
				   context == grammarAccess.getUnitTypeCSRule()) {
					sequence_LibraryHeaderCS(context, (QVToLibraryCS) semanticObject); 
					return; 
				}
				else break;
			case QVTOperationalCSPackage.QV_TO_OPERATION_CS:
				sequence_ClassifierOperationCS(context, (QVToOperationCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.STEREOTYPE_QUALIFIER_CS:
				sequence_StereotypeQualifierCS(context, (StereotypeQualifierCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.TAG_CS:
				sequence_TagCS(context, (TagCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.TOP_LEVEL_CS:
				sequence_TopLevelCS(context, (TopLevelCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.TRANSFORMATION_CS:
				if(context == grammarAccess.getTransformationDefCSRule()) {
					sequence_TransformationDefCS_TransformationHeaderCS(context, (TransformationCS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTransformationCSRule() ||
				   context == grammarAccess.getTransformationDeclCSRule() ||
				   context == grammarAccess.getTransformationHeaderCSRule() ||
				   context == grammarAccess.getUnitTypeCSRule()) {
					sequence_TransformationHeaderCS(context, (TransformationCS) semanticObject); 
					return; 
				}
				else break;
			case QVTOperationalCSPackage.TYPE_SPEC_CS:
				sequence_TypeSpecCS(context, (TypeSpecCS) semanticObject); 
				return; 
			case QVTOperationalCSPackage.TYPED_TYPE_REF2_CS:
				if(context == grammarAccess.getTypedMultiplicityRef2CSRule()) {
					sequence_TypedMultiplicityRef2CS_TypedTypeRef2CS(context, (TypedTypeRef2CS) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeRef2CSRule() ||
				   context == grammarAccess.getTypedRef2CSRule() ||
				   context == grammarAccess.getTypedTypeRef2CSRule()) {
					sequence_TypedTypeRef2CS(context, (TypedTypeRef2CS) semanticObject); 
					return; 
				}
				else break;
			case QVTOperationalCSPackage.UNIT_CS:
				sequence_UnitCS(context, (UnitCS) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         stereotypes=StereotypeQualifierCS? 
	 *         qualifiers+=FeatureQualifier* 
	 *         name=UnrestrictedName 
	 *         (ownedParameters+=ParameterCS ownedParameters+=ParameterCS*)? 
	 *         ownedType=TypedMultiplicityRef2CS?
	 *     )
	 */
	protected void sequence_ClassifierOperationCS(EObject context, QVToOperationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         stereotypes=StereotypeQualifierCS? 
	 *         qualifiers+=FeatureQualifier* 
	 *         name=UnrestrictedName 
	 *         ownedType=TypedMultiplicityRef2CS 
	 *         default=SINGLE_QUOTED_STRING? 
	 *         opposite=Identifier?
	 *     )
	 */
	protected void sequence_ClassifierPropertyCS(EObject context, ClassifierPropertyCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CollectionTypeIdentifier ownedType=TypeExpCS? ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_CollectionTypeCS_TypedMultiplicityRef2CS(EObject context, CollectionTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=UnrestrictedName
	 */
	protected void sequence_DataTypeCS(EObject context, DataTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=UnrestrictedName
	 */
	protected void sequence_DataTypeCS(EObject context, PrimitiveTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyType=TypeExpCS valueType=TypeExpCS ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_DictTypeCS_TypedMultiplicityRef2CS(EObject context, DictTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier ownedLiterals+=EnumerationLiteralCS ownedLiterals+=EnumerationLiteralCS*)
	 */
	protected void sequence_EnumerationCS(EObject context, EnumerationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=UnrestrictedName
	 */
	protected void sequence_EnumerationLiteralCS(EObject context, EnumerationLiteralCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName (ownedSuperTypes+=TypedRefCS ownedSuperTypes+=TypedRefCS*)?)
	 */
	protected void sequence_ExceptionCS(EObject context, StructuredClassCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (unit=UnitCS | (unit=UnitCS ((importedUnitElement+=Identifier importedUnitElement+=Identifier*) | isAll?='*')))
	 */
	protected void sequence_ImportCS(EObject context, QVToImportCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (initOp=InitOp expression=ExpCS)
	 */
	protected void sequence_InitPartCS(EObject context, InitPartCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         qualifiers+=LibraryQualifier* 
	 *         name=UnrestrictedName 
	 *         parameters+=ModelTypeRefCS 
	 *         parameters+=ModelTypeRefCS* 
	 *         moduleUsages+=ModuleUsageCS* 
	 *         (ownedProperties+=ModulePropertyCS | ownedOperations+=ModuleOperationCS)*
	 *     )
	 */
	protected void sequence_LibraryDefCS_LibraryHeaderCS(EObject context, QVToLibraryCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualifiers+=LibraryQualifier* name=UnrestrictedName parameters+=ModelTypeRefCS parameters+=ModelTypeRefCS* moduleUsages+=ModuleUsageCS*)
	 */
	protected void sequence_LibraryHeaderCS(EObject context, QVToLibraryCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeExpCS ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_ListTypeCS_TypedMultiplicityRef2CS(EObject context, ListTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Map' (ownedKeyType=TypeExpCS ownedValueType=TypeExpCS)? ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_MapTypeCS_TypedMultiplicityRef2CS(EObject context, MapTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         qualifiers+=OperationQualifier* 
	 *         direction=DirectionKindCS? 
	 *         scopedName=PathName2CS 
	 *         (ownedParameters+=ParameterDeclarationCS ownedParameters+=ParameterDeclarationCS*)? 
	 *         (results+=ParameterDeclarationCS results+=ParameterDeclarationCS)? 
	 *         (inherits+=PathName2CS inherits+=PathName2CS*)? 
	 *         (merges+=PathName2CS merges+=PathName2CS*)? 
	 *         (disjuncts+=PathName2CS disjuncts+=PathName2CS*)? 
	 *         refines=PathName2CS? 
	 *         when=BlockExpCS? 
	 *         where=BlockExpCS?
	 *     )
	 */
	protected void sequence_MappingOperationHeaderCS(EObject context, MappingOperationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (metamodelKind=MetamodelKind name=UnrestrictedName (ownedClasses+=ClassCS | ownedClasses+=EnumerationCS | ownedAnnotations+=TagCS)*)
	 */
	protected void sequence_MetamodelCS(EObject context, MetamodelCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName complianceKind=StringLiteral? packageRefs+=PackageRefCS packageRefs+=PackageRefCS*)
	 */
	protected void sequence_ModelTypeCS(EObject context, ModelTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ownedType=TypedTypeRef2CS
	 */
	protected void sequence_ModelTypeRefCS(EObject context, ModelTypeRefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modulePath=PathName2CS (parameters+=ParameterDeclarationCS parameters+=ParameterDeclarationCS*)?)
	 */
	protected void sequence_ModuleRefCS(EObject context, ModuleRefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importKind=ImportKindEnum moduleKind=ModuleKindEnum? moduleRefs+=ModuleRefCS moduleRefs+=ModuleRefCS*)
	 */
	protected void sequence_ModuleUsageCS(EObject context, ModuleUsageCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lowerBound=LOWER? upperBound=UPPER)
	 */
	protected void sequence_MultiplicityCS(EObject context, MultiplicityBoundsCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (uri=StringLiteralExpCS | (packagePath=PathName2CS uri=StringLiteralExpCS))
	 */
	protected void sequence_PackageRefCS(EObject context, PackageRefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=UnrestrictedName ownedType=TypedMultiplicityRef2CS?)
	 */
	protected void sequence_ParameterCS(EObject context, ParameterCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (direction=DirectionKindCS? name=UnrestrictedName ownedType=TypedMultiplicityRef2CS? initPart=InitPartCS?)
	 */
	protected void sequence_ParameterDeclarationCS(EObject context, ParameterDeclarationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=UnrestrictedName
	 */
	protected void sequence_PathElement2CS(EObject context, PathElement2CS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedPathElements2+=PathElement2CS ownedPathElements2+=PathElement2CS*)
	 */
	protected void sequence_PathName2CS(EObject context, PathName2CS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=PrimitiveTypeIdentifier ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_PrimitiveTypeCS_TypedMultiplicityRef2CS(EObject context, PrimitiveTypeRefCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         intermediate?='intermediate'? 
	 *         name=UnrestrictedName 
	 *         (ownedSuperTypes+=TypedRefCS ownedSuperTypes+=TypedRefCS*)? 
	 *         (ownedProperties+=ClassifierPropertyCS | ownedOperations+=ClassifierOperationCS | ownedAnnotations+=TagCS)*
	 *     )
	 */
	protected void sequence_QVToClassCS(EObject context, QVToClassCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (stereotype+=Identifier stereotype+=Identifier*)
	 */
	protected void sequence_StereotypeQualifierCS(EObject context, StereotypeQualifierCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=UnrestrictedName | name=SINGLE_QUOTED_STRING)? elementPath=PathName2CS expression=ExpCS?)
	 */
	protected void sequence_TagCS(EObject context, TagCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedImports+=ImportCS* (ownedPackages+=UnitPackageCS | ownedTypes+=UnitTypeCS)*)
	 */
	protected void sequence_TopLevelCS(EObject context, TopLevelCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         qualifiers+=TransformationQualifier* 
	 *         name=UnrestrictedName 
	 *         parameters+=ParameterDeclarationCS 
	 *         parameters+=ParameterDeclarationCS* 
	 *         moduleUsages+=ModuleUsageCS* 
	 *         refines=ModuleRefCS? 
	 *         (ownedProperties+=ModulePropertyCS | ownedOperations+=ModuleOperationCS)*
	 *     )
	 */
	protected void sequence_TransformationDefCS_TransformationHeaderCS(EObject context, TransformationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         qualifiers+=TransformationQualifier* 
	 *         name=UnrestrictedName 
	 *         parameters+=ParameterDeclarationCS 
	 *         parameters+=ParameterDeclarationCS* 
	 *         moduleUsages+=ModuleUsageCS* 
	 *         refines=ModuleRefCS?
	 *     )
	 */
	protected void sequence_TransformationHeaderCS(EObject context, TransformationCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name='Tuple' (ownedParts+=TuplePartCS ownedParts+=TuplePartCS*)? ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_TupleTypeCS_TypedMultiplicityRef2CS(EObject context, TupleTypeCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedType=TypedRefCS extentLocation=UnrestrictedName?)
	 */
	protected void sequence_TypeSpecCS(EObject context, TypeSpecCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedPathName=PathName2CS ownedBinding=TemplateBindingCS? ownedMultiplicity=MultiplicityCS?)
	 */
	protected void sequence_TypedMultiplicityRef2CS_TypedTypeRef2CS(EObject context, TypedTypeRef2CS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ownedPathName=PathName2CS ownedBinding=TemplateBindingCS?)
	 */
	protected void sequence_TypedTypeRef2CS(EObject context, TypedTypeRef2CS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (segment+=Identifier segment+=Identifier*)
	 */
	protected void sequence_UnitCS(EObject context, UnitCS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
