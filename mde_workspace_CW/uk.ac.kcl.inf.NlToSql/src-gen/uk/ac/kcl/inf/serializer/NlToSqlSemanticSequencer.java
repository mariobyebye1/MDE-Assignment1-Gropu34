/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.kcl.inf.nlToSql.AccountingSpeech;
import uk.ac.kcl.inf.nlToSql.Comparison;
import uk.ac.kcl.inf.nlToSql.EntityName;
import uk.ac.kcl.inf.nlToSql.LogicExpressions;
import uk.ac.kcl.inf.nlToSql.NlToSqlPackage;
import uk.ac.kcl.inf.nlToSql.Property;
import uk.ac.kcl.inf.nlToSql.PropertyReference;
import uk.ac.kcl.inf.nlToSql.SelectList;
import uk.ac.kcl.inf.nlToSql.SelectStatement;
import uk.ac.kcl.inf.services.NlToSqlGrammarAccess;

@SuppressWarnings("all")
public class NlToSqlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private NlToSqlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == NlToSqlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case NlToSqlPackage.ACCOUNTING_SPEECH:
				sequence_AccountingSpeech(context, (AccountingSpeech) semanticObject); 
				return; 
			case NlToSqlPackage.COMPARISON:
				sequence_Condition(context, (Comparison) semanticObject); 
				return; 
			case NlToSqlPackage.ENTITY_NAME:
				sequence_EntityName(context, (EntityName) semanticObject); 
				return; 
			case NlToSqlPackage.LOGIC_EXPRESSIONS:
				sequence_Comparison(context, (LogicExpressions) semanticObject); 
				return; 
			case NlToSqlPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case NlToSqlPackage.PROPERTY_REFERENCE:
				sequence_PropertyReference(context, (PropertyReference) semanticObject); 
				return; 
			case NlToSqlPackage.SELECT_LIST:
				if (rule == grammarAccess.getSelectListRule()) {
					sequence_SelectList(context, (SelectList) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getStatementRule()
						|| rule == grammarAccess.getSelectStatementRule()) {
					sequence_SelectList_SelectStatement(context, (SelectList) semanticObject); 
					return; 
				}
				else break;
			case NlToSqlPackage.SELECT_STATEMENT:
				sequence_SelectStatement(context, (SelectStatement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AccountingSpeech returns AccountingSpeech
	 *
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_AccountingSpeech(ISerializationContext context, AccountingSpeech semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns LogicExpressions
	 *     Condition.Comparison_1_0 returns LogicExpressions
	 *     Comparison returns LogicExpressions
	 *
	 * Constraint:
	 *     (leftHandSide=[Property|ID] operator=ComparisonOperator rightHandSide=Value)
	 */
	protected void sequence_Comparison(ISerializationContext context, LogicExpressions semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.LOGIC_EXPRESSIONS__LEFT_HAND_SIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.LOGIC_EXPRESSIONS__LEFT_HAND_SIDE));
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.LOGIC_EXPRESSIONS__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.LOGIC_EXPRESSIONS__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.LOGIC_EXPRESSIONS__RIGHT_HAND_SIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.LOGIC_EXPRESSIONS__RIGHT_HAND_SIDE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonAccess().getLeftHandSidePropertyIDTerminalRuleCall_1_0_1(), semanticObject.eGet(NlToSqlPackage.Literals.LOGIC_EXPRESSIONS__LEFT_HAND_SIDE, false));
		feeder.accept(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorParserRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getComparisonAccess().getRightHandSideValueParserRuleCall_3_0(), semanticObject.getRightHandSide());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Comparison
	 *     Condition.Comparison_1_0 returns Comparison
	 *
	 * Constraint:
	 *     (left=Condition_Comparison_1_0 right+=Comparison)
	 */
	protected void sequence_Condition(ISerializationContext context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityName returns EntityName
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EntityName(ISerializationContext context, EntityName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.ENTITY_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.ENTITY_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     PropertyReference returns PropertyReference
	 *
	 * Constraint:
	 *     property=[Property|ID]
	 */
	protected void sequence_PropertyReference(ISerializationContext context, PropertyReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.PROPERTY_REFERENCE__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.PROPERTY_REFERENCE__PROPERTY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyIDTerminalRuleCall_0_1(), semanticObject.eGet(NlToSqlPackage.Literals.PROPERTY_REFERENCE__PROPERTY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.PROPERTY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SelectList returns SelectList
	 *
	 * Constraint:
	 *     (selectItem+=Property selectItem+=Property*)
	 */
	protected void sequence_SelectList(ISerializationContext context, SelectList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns SelectList
	 *     SelectStatement returns SelectList
	 *
	 * Constraint:
	 *     (
	 *         selectItem+=Property 
	 *         selectItem+=Property* 
	 *         entity=EntityName 
	 *         condition=Condition? 
	 *         (groupByList+=PropertyReference groupByList+=PropertyReference*)?
	 *     )
	 */
	protected void sequence_SelectList_SelectStatement(ISerializationContext context, SelectList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns SelectStatement
	 *     SelectStatement returns SelectStatement
	 *
	 * Constraint:
	 *     (entity=EntityName condition=Condition? (groupByList+=PropertyReference groupByList+=PropertyReference*)?)
	 */
	protected void sequence_SelectStatement(ISerializationContext context, SelectStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
