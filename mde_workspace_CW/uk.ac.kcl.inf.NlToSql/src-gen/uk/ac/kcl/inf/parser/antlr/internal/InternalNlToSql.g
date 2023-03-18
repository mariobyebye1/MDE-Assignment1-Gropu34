/*
 * generated by Xtext 2.25.0
 */
grammar InternalNlToSql;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uk.ac.kcl.inf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package uk.ac.kcl.inf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.services.NlToSqlGrammarAccess;

}

@parser::members {

 	private NlToSqlGrammarAccess grammarAccess;

    public InternalNlToSqlParser(TokenStream input, NlToSqlGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "AccountingSpeech";
   	}

   	@Override
   	protected NlToSqlGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleAccountingSpeech
entryRuleAccountingSpeech returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAccountingSpeechRule()); }
	iv_ruleAccountingSpeech=ruleAccountingSpeech
	{ $current=$iv_ruleAccountingSpeech.current; }
	EOF;

// Rule AccountingSpeech
ruleAccountingSpeech returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getAccountingSpeechAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getAccountingSpeechRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"uk.ac.kcl.inf.NlToSql.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getStatementAccess().getCreateTableStatementParserRuleCall_0_0());
			}
			this_CreateTableStatement_0=ruleCreateTableStatement
			{
				$current = $this_CreateTableStatement_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_0_1());
			}
			this_SelectStatement_1=ruleSelectStatement
			{
				$current = $this_SelectStatement_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getFullStopKeyword_1());
		}
	)
;

// Entry rule entryRuleCreateTableStatement
entryRuleCreateTableStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCreateTableStatementRule()); }
	iv_ruleCreateTableStatement=ruleCreateTableStatement
	{ $current=$iv_ruleCreateTableStatement.current; }
	EOF;

// Rule CreateTableStatement
ruleCreateTableStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='create'
		{
			newLeafNode(otherlv_0, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_0());
		}
		(
			otherlv_1='the'
			{
				newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getTheKeyword_1_0());
			}
			    |
			otherlv_2='a'
			{
				newLeafNode(otherlv_2, grammarAccess.getCreateTableStatementAccess().getAKeyword_1_1());
			}
		)?
		otherlv_3='table'
		{
			newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getTableKeyword_2());
		}
		otherlv_4='called'
		{
			newLeafNode(otherlv_4, grammarAccess.getCreateTableStatementAccess().getCalledKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCreateTableStatementAccess().getTableTableParserRuleCall_4_0());
				}
				lv_table_5_0=ruleTable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
					}
					set(
						$current,
						"table",
						lv_table_5_0,
						"uk.ac.kcl.inf.NlToSql.Table");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6='with'
			{
				newLeafNode(otherlv_6, grammarAccess.getCreateTableStatementAccess().getWithKeyword_5_0());
			}
			otherlv_7='columns'
			{
				newLeafNode(otherlv_7, grammarAccess.getCreateTableStatementAccess().getColumnsKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnsColumnListParserRuleCall_5_2_0());
					}
					lv_columns_8_0=ruleColumnList
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
						}
						set(
							$current,
							"columns",
							lv_columns_8_0,
							"uk.ac.kcl.inf.NlToSql.ColumnList");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleColumnList
entryRuleColumnList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnListRule()); }
	iv_ruleColumnList=ruleColumnList
	{ $current=$iv_ruleColumnList.current; }
	EOF;

// Rule ColumnList
ruleColumnList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getColumnListAccess().getColumnItemColumnParserRuleCall_0_0());
				}
				lv_columnItem_0_0=ruleColumn
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColumnListRule());
					}
					add(
						$current,
						"columnItem",
						lv_columnItem_0_0,
						"uk.ac.kcl.inf.NlToSql.Column");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getColumnListAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getColumnListAccess().getColumnItemColumnParserRuleCall_1_1_0());
					}
					lv_columnItem_2_0=ruleColumn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getColumnListRule());
						}
						add(
							$current,
							"columnItem",
							lv_columnItem_2_0,
							"uk.ac.kcl.inf.NlToSql.Column");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTable
entryRuleTable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTableRule()); }
	iv_ruleTable=ruleTable
	{ $current=$iv_ruleTable.current; }
	EOF;

// Rule Table
ruleTable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTableRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	iv_ruleColumn=ruleColumn
	{ $current=$iv_ruleColumn.current; }
	EOF;

// Rule Column
ruleColumn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColumnRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='of'
		{
			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getOfKeyword_1());
		}
		otherlv_2='type'
		{
			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getTypeKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getColumnAccess().getTypeDatatypeParserRuleCall_3_0());
				}
				lv_type_3_0=ruleDatatype
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColumnRule());
					}
					set(
						$current,
						"type",
						lv_type_3_0,
						"uk.ac.kcl.inf.NlToSql.Datatype");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDatatype
entryRuleDatatype returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDatatypeRule()); }
	iv_ruleDatatype=ruleDatatype
	{ $current=$iv_ruleDatatype.current.getText(); }
	EOF;

// Rule Datatype
ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='int'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDatatypeAccess().getIntKeyword_0());
		}
		    |
		kw='string'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDatatypeAccess().getStringKeyword_1());
		}
		    |
		kw='date'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDatatypeAccess().getDateKeyword_2());
		}
	)
;

// Entry rule entryRuleSelectStatement
entryRuleSelectStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectStatementRule()); }
	iv_ruleSelectStatement=ruleSelectStatement
	{ $current=$iv_ruleSelectStatement.current; }
	EOF;

// Rule SelectStatement
ruleSelectStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='from'
		{
			newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getFromKeyword_0());
		}
		otherlv_1='the'
		{
			newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getTheKeyword_1());
		}
		otherlv_2='table'
		{
			newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getTableKeyword_2());
		}
		{
			newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectTablesListParserRuleCall_3());
		}
		this_SelectTablesList_3=ruleSelectTablesList
		{
			$current = $this_SelectTablesList_3.current;
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_4='can'
			{
				newLeafNode(otherlv_4, grammarAccess.getSelectStatementAccess().getCanKeyword_4_0());
			}
			otherlv_5='you'
			{
				newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getYouKeyword_4_1());
			}
		)?
		otherlv_6='show'
		{
			newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getShowKeyword_5());
		}
		(
			(
				otherlv_7='the'
				{
					newLeafNode(otherlv_7, grammarAccess.getSelectStatementAccess().getTheKeyword_6_0_0());
				}
				otherlv_8='columns:'
				{
					newLeafNode(otherlv_8, grammarAccess.getSelectStatementAccess().getColumnsKeyword_6_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSelectStatementAccess().getColumnsSelectColumnsListParserRuleCall_6_0_2_0());
						}
						lv_columns_9_0=ruleSelectColumnsList
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSelectStatementRule());
							}
							set(
								$current,
								"columns",
								lv_columns_9_0,
								"uk.ac.kcl.inf.NlToSql.SelectColumnsList");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_10='all'
				{
					newLeafNode(otherlv_10, grammarAccess.getSelectStatementAccess().getAllKeyword_6_1_0());
				}
				otherlv_11='columns'
				{
					newLeafNode(otherlv_11, grammarAccess.getSelectStatementAccess().getColumnsKeyword_6_1_1());
				}
			)
		)
		(
			otherlv_12='where'
			{
				newLeafNode(otherlv_12, grammarAccess.getSelectStatementAccess().getWhereKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectStatementAccess().getConditionConditionParserRuleCall_7_1_0());
					}
					lv_condition_13_0=ruleCondition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectStatementRule());
						}
						set(
							$current,
							"condition",
							lv_condition_13_0,
							"uk.ac.kcl.inf.NlToSql.Condition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_14='group'
			{
				newLeafNode(otherlv_14, grammarAccess.getSelectStatementAccess().getGroupKeyword_8_0());
			}
			otherlv_15='by'
			{
				newLeafNode(otherlv_15, grammarAccess.getSelectStatementAccess().getByKeyword_8_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupByListColumnParserRuleCall_8_2_0());
					}
					lv_groupByList_16_0=ruleColumn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectStatementRule());
						}
						add(
							$current,
							"groupByList",
							lv_groupByList_16_0,
							"uk.ac.kcl.inf.NlToSql.Column");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_17=','
				{
					newLeafNode(otherlv_17, grammarAccess.getSelectStatementAccess().getCommaKeyword_8_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupByListColumnParserRuleCall_8_3_1_0());
						}
						lv_groupByList_18_0=ruleColumn
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSelectStatementRule());
							}
							add(
								$current,
								"groupByList",
								lv_groupByList_18_0,
								"uk.ac.kcl.inf.NlToSql.Column");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleSelectTablesList
entryRuleSelectTablesList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectTablesListRule()); }
	iv_ruleSelectTablesList=ruleSelectTablesList
	{ $current=$iv_ruleSelectTablesList.current; }
	EOF;

// Rule SelectTablesList
ruleSelectTablesList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectTablesListRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getSelectTablesListAccess().getSelectTableTableCrossReference_0_0());
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getSelectTablesListAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSelectTablesListRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getSelectTablesListAccess().getSelectTableTableCrossReference_1_1_0());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSelectColumnsList
entryRuleSelectColumnsList returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectColumnsListRule()); }
	iv_ruleSelectColumnsList=ruleSelectColumnsList
	{ $current=$iv_ruleSelectColumnsList.current; }
	EOF;

// Rule SelectColumnsList
ruleSelectColumnsList returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectColumnsListAccess().getSelectColumnColumnReferenceParserRuleCall_0_0());
				}
				lv_selectColumn_0_0=ruleColumnReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectColumnsListRule());
					}
					add(
						$current,
						"selectColumn",
						lv_selectColumn_0_0,
						"uk.ac.kcl.inf.NlToSql.ColumnReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1=','
			{
				newLeafNode(otherlv_1, grammarAccess.getSelectColumnsListAccess().getCommaKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectColumnsListAccess().getSelectColumnColumnReferenceParserRuleCall_1_1_0());
					}
					lv_selectColumn_2_0=ruleColumnReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectColumnsListRule());
						}
						add(
							$current,
							"selectColumn",
							lv_selectColumn_2_0,
							"uk.ac.kcl.inf.NlToSql.ColumnReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleColumnReference
entryRuleColumnReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnReferenceRule()); }
	iv_ruleColumnReference=ruleColumnReference
	{ $current=$iv_ruleColumnReference.current; }
	EOF;

// Rule ColumnReference
ruleColumnReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getColumnReferenceRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0_0());
				}
			)
		)
		(
			otherlv_1='in'
			{
				newLeafNode(otherlv_1, grammarAccess.getColumnReferenceAccess().getInKeyword_1_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getColumnReferenceRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getColumnReferenceAccess().getTableTableCrossReference_1_1_0());
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConditionAccess().getComparisonParserRuleCall_0());
		}
		this_Comparison_0=ruleComparison
		{
			$current = $this_Comparison_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getConditionAccess().getComparisonLeftAction_1_0(),
						$current);
				}
			)
			{
				newCompositeNode(grammarAccess.getConditionAccess().getLogicOperatorParserRuleCall_1_1());
			}
			ruleLogicOperator
			{
				afterParserOrEnumRuleCall();
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionAccess().getRightComparisonParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleComparison
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionRule());
						}
						add(
							$current,
							"right",
							lv_right_3_0,
							"uk.ac.kcl.inf.NlToSql.Comparison");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleLogicOperator
entryRuleLogicOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLogicOperatorRule()); }
	iv_ruleLogicOperator=ruleLogicOperator
	{ $current=$iv_ruleLogicOperator.current.getText(); }
	EOF;

// Rule LogicOperator
ruleLogicOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='and'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLogicOperatorAccess().getAndKeyword_0());
		}
		    |
		kw='or'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLogicOperatorAccess().getOrKeyword_1());
		}
	)
;

// Entry rule entryRuleComparison
entryRuleComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparisonRule()); }
	iv_ruleComparison=ruleComparison
	{ $current=$iv_ruleComparison.current; }
	EOF;

// Rule Comparison
ruleComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='the'
			{
				newLeafNode(otherlv_0, grammarAccess.getComparisonAccess().getTheKeyword_0_0());
			}
			    |
			otherlv_1='a'
			{
				newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getAKeyword_0_1());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getComparisonRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLeftHandSideColumnCrossReference_1_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorParserRuleCall_2_0());
				}
				lv_operator_3_0=ruleComparisonOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComparisonRule());
					}
					set(
						$current,
						"operator",
						lv_operator_3_0,
						"uk.ac.kcl.inf.NlToSql.ComparisonOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComparisonAccess().getRightHandSideValueParserRuleCall_3_0());
				}
				lv_rightHandSide_4_0=ruleValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComparisonRule());
					}
					set(
						$current,
						"rightHandSide",
						lv_rightHandSide_4_0,
						"uk.ac.kcl.inf.NlToSql.Value");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleComparisonOperator
entryRuleComparisonOperator returns [String current=null]:
	{ newCompositeNode(grammarAccess.getComparisonOperatorRule()); }
	iv_ruleComparisonOperator=ruleComparisonOperator
	{ $current=$iv_ruleComparisonOperator.current.getText(); }
	EOF;

// Rule ComparisonOperator
ruleComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='='
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualsSignKeyword_0());
		}
		    |
		(
			kw='is'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getIsKeyword_1_0());
			}
			kw='equal'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_1_1());
			}
			kw='to'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_1_2());
			}
		)
		    |
		(
			kw='is'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getIsKeyword_2_0());
			}
			kw='not'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getNotKeyword_2_1());
			}
			kw='equal'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_2_2());
			}
			kw='to'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_2_3());
			}
		)
		    |
		(
			kw='less'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessKeyword_3_0());
			}
			kw='than'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_3_1());
			}
		)
		    |
		(
			kw='greater'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_4_0());
			}
			kw='than'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_4_1());
			}
		)
		    |
		(
			kw='less'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessKeyword_5_0());
			}
			kw='than'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_5_1());
			}
			kw='or'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getOrKeyword_5_2());
			}
			kw='equal'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_5_3());
			}
			kw='to'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_5_4());
			}
		)
		    |
		(
			kw='greater'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_6_0());
			}
			kw='than'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_6_1());
			}
			kw='or'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getOrKeyword_6_2());
			}
			kw='equal'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_6_3());
			}
			kw='to'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_6_4());
			}
		)
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current.getText(); }
	EOF;

// Rule Value
ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
		}
		    |
		this_STRING_1=RULE_STRING
		{
			$current.merge(this_STRING_1);
		}
		{
			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
