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
import uk.ac.kcl.inf.nlToSql.Column;
import uk.ac.kcl.inf.nlToSql.ColumnList;
import uk.ac.kcl.inf.nlToSql.ColumnReference;
import uk.ac.kcl.inf.nlToSql.Comparison;
import uk.ac.kcl.inf.nlToSql.Condition;
import uk.ac.kcl.inf.nlToSql.CreateTableStatement;
import uk.ac.kcl.inf.nlToSql.DeleteStatement;
import uk.ac.kcl.inf.nlToSql.InserValues;
import uk.ac.kcl.inf.nlToSql.InsertStatement;
import uk.ac.kcl.inf.nlToSql.NlToSqlPackage;
import uk.ac.kcl.inf.nlToSql.SelectColumnsList;
import uk.ac.kcl.inf.nlToSql.SelectStatement;
import uk.ac.kcl.inf.nlToSql.SelectTable;
import uk.ac.kcl.inf.nlToSql.SelectTablesList;
import uk.ac.kcl.inf.nlToSql.SelectUpdateList;
import uk.ac.kcl.inf.nlToSql.Table;
import uk.ac.kcl.inf.nlToSql.UpdateItem;
import uk.ac.kcl.inf.nlToSql.UpdateStatement;
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
			case NlToSqlPackage.COLUMN:
				sequence_Column(context, (Column) semanticObject); 
				return; 
			case NlToSqlPackage.COLUMN_LIST:
				sequence_ColumnList(context, (ColumnList) semanticObject); 
				return; 
			case NlToSqlPackage.COLUMN_REFERENCE:
				sequence_ColumnReference(context, (ColumnReference) semanticObject); 
				return; 
			case NlToSqlPackage.COMPARISON:
				sequence_Comparison(context, (Comparison) semanticObject); 
				return; 
			case NlToSqlPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case NlToSqlPackage.CREATE_TABLE_STATEMENT:
				sequence_CreateTableStatement(context, (CreateTableStatement) semanticObject); 
				return; 
			case NlToSqlPackage.DELETE_STATEMENT:
				sequence_DeleteStatement(context, (DeleteStatement) semanticObject); 
				return; 
			case NlToSqlPackage.INSER_VALUES:
				sequence_InserValues(context, (InserValues) semanticObject); 
				return; 
			case NlToSqlPackage.INSERT_STATEMENT:
				sequence_InsertStatement(context, (InsertStatement) semanticObject); 
				return; 
			case NlToSqlPackage.SELECT_COLUMNS_LIST:
				sequence_SelectColumnsList(context, (SelectColumnsList) semanticObject); 
				return; 
			case NlToSqlPackage.SELECT_STATEMENT:
				sequence_SelectStatement(context, (SelectStatement) semanticObject); 
				return; 
			case NlToSqlPackage.SELECT_TABLE:
				if (rule == grammarAccess.getStatementRule()
						|| rule == grammarAccess.getDeleteStatementRule()) {
					sequence_DeleteStatement_SelectTable(context, (SelectTable) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getSelectTableRule()) {
					sequence_SelectTable(context, (SelectTable) semanticObject); 
					return; 
				}
				else break;
			case NlToSqlPackage.SELECT_TABLES_LIST:
				sequence_SelectTablesList(context, (SelectTablesList) semanticObject); 
				return; 
			case NlToSqlPackage.SELECT_UPDATE_LIST:
				sequence_SelectUpdateList(context, (SelectUpdateList) semanticObject); 
				return; 
			case NlToSqlPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			case NlToSqlPackage.UPDATE_ITEM:
				sequence_UpdateItem(context, (UpdateItem) semanticObject); 
				return; 
			case NlToSqlPackage.UPDATE_STATEMENT:
				sequence_UpdateStatement(context, (UpdateStatement) semanticObject); 
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
	 *     ColumnList returns ColumnList
	 *
	 * Constraint:
	 *     (columnItem+=Column columnItem+=Column*)
	 */
	protected void sequence_ColumnList(ISerializationContext context, ColumnList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ColumnReference returns ColumnReference
	 *
	 * Constraint:
	 *     (column=[Column|ID] table=[Table|ID]?)
	 */
	protected void sequence_ColumnReference(ISerializationContext context, ColumnReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Column returns Column
	 *
	 * Constraint:
	 *     (name=ID type=Datatype table=[Table|ID]?)
	 */
	protected void sequence_Column(ISerializationContext context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Comparison
	 *     Condition.Condition_1_0 returns Comparison
	 *     Comparison returns Comparison
	 *
	 * Constraint:
	 *     (leftHandSide=[Column|ID] operator=ComparisonOperatorString rightHandSide=Value)
	 */
	protected void sequence_Comparison(ISerializationContext context, Comparison semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.COMPARISON__LEFT_HAND_SIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.COMPARISON__LEFT_HAND_SIDE));
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.COMPARISON__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.COMPARISON__OPERATOR));
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.COMPARISON__RIGHT_HAND_SIDE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.COMPARISON__RIGHT_HAND_SIDE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonAccess().getLeftHandSideColumnIDTerminalRuleCall_1_0_1(), semanticObject.eGet(NlToSqlPackage.Literals.COMPARISON__LEFT_HAND_SIDE, false));
		feeder.accept(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorStringEnumRuleCall_2_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getComparisonAccess().getRightHandSideValueParserRuleCall_3_0(), semanticObject.getRightHandSide());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Condition
	 *     Condition.Condition_1_0 returns Condition
	 *
	 * Constraint:
	 *     (left=Condition_Condition_1_0 logicOperator+=LogicOperator right+=Comparison)
	 */
	protected void sequence_Condition(ISerializationContext context, Condition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns CreateTableStatement
	 *     CreateTableStatement returns CreateTableStatement
	 *
	 * Constraint:
	 *     (table=Table columns=ColumnList?)
	 */
	protected void sequence_CreateTableStatement(ISerializationContext context, CreateTableStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns DeleteStatement
	 *     DeleteStatement returns DeleteStatement
	 *
	 * Constraint:
	 *     tables=SelectTablesList
	 */
	protected void sequence_DeleteStatement(ISerializationContext context, DeleteStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.DELETE_STATEMENT__TABLES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.DELETE_STATEMENT__TABLES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeleteStatementAccess().getTablesSelectTablesListParserRuleCall_0_3_0(), semanticObject.getTables());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns SelectTable
	 *     DeleteStatement returns SelectTable
	 *
	 * Constraint:
	 *     (table=[Table|ID] condition=Condition?)
	 */
	protected void sequence_DeleteStatement_SelectTable(ISerializationContext context, SelectTable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InserValues returns InserValues
	 *
	 * Constraint:
	 *     (valueList+=Value valueList+=Value*)
	 */
	protected void sequence_InserValues(ISerializationContext context, InserValues semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns InsertStatement
	 *     InsertStatement returns InsertStatement
	 *
	 * Constraint:
	 *     (table=SelectTable columns=SelectColumnsList values=InserValues)
	 */
	protected void sequence_InsertStatement(ISerializationContext context, InsertStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.INSERT_STATEMENT__TABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.INSERT_STATEMENT__TABLE));
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.INSERT_STATEMENT__COLUMNS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.INSERT_STATEMENT__COLUMNS));
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.INSERT_STATEMENT__VALUES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.INSERT_STATEMENT__VALUES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInsertStatementAccess().getTableSelectTableParserRuleCall_4_0(), semanticObject.getTable());
		feeder.accept(grammarAccess.getInsertStatementAccess().getColumnsSelectColumnsListParserRuleCall_8_0(), semanticObject.getColumns());
		feeder.accept(grammarAccess.getInsertStatementAccess().getValuesInserValuesParserRuleCall_13_0(), semanticObject.getValues());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SelectColumnsList returns SelectColumnsList
	 *
	 * Constraint:
	 *     (selectColumn+=ColumnReference selectColumn+=ColumnReference*)
	 */
	protected void sequence_SelectColumnsList(ISerializationContext context, SelectColumnsList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns SelectStatement
	 *     SelectStatement returns SelectStatement
	 *
	 * Constraint:
	 *     (tables=SelectTablesList columns=SelectColumnsList? condition=Condition? group=SelectColumnsList?)
	 */
	protected void sequence_SelectStatement(ISerializationContext context, SelectStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SelectTable returns SelectTable
	 *
	 * Constraint:
	 *     table=[Table|ID]
	 */
	protected void sequence_SelectTable(ISerializationContext context, SelectTable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.SELECT_TABLE__TABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.SELECT_TABLE__TABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelectTableAccess().getTableTableIDTerminalRuleCall_0_1(), semanticObject.eGet(NlToSqlPackage.Literals.SELECT_TABLE__TABLE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SelectTablesList returns SelectTablesList
	 *
	 * Constraint:
	 *     (selectTable+=[Table|ID] selectTable+=[Table|ID]*)
	 */
	protected void sequence_SelectTablesList(ISerializationContext context, SelectTablesList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SelectUpdateList returns SelectUpdateList
	 *
	 * Constraint:
	 *     (updateItem+=UpdateItem updateItem+=UpdateItem*)
	 */
	protected void sequence_SelectUpdateList(ISerializationContext context, SelectUpdateList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Table returns Table
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.TABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.TABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UpdateItem returns UpdateItem
	 *
	 * Constraint:
	 *     (column=ColumnReference value=Value)
	 */
	protected void sequence_UpdateItem(ISerializationContext context, UpdateItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.UPDATE_ITEM__COLUMN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.UPDATE_ITEM__COLUMN));
			if (transientValues.isValueTransient(semanticObject, NlToSqlPackage.Literals.UPDATE_ITEM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, NlToSqlPackage.Literals.UPDATE_ITEM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUpdateItemAccess().getColumnColumnReferenceParserRuleCall_0_0(), semanticObject.getColumn());
		feeder.accept(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns UpdateStatement
	 *     UpdateStatement returns UpdateStatement
	 *
	 * Constraint:
	 *     (table=SelectTable updates=SelectUpdateList condition=Condition?)
	 */
	protected void sequence_UpdateStatement(ISerializationContext context, UpdateStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
