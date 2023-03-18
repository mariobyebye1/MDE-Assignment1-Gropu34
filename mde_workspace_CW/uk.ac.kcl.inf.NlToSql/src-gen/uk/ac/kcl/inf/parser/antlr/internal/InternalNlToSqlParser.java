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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNlToSqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'can'", "'you'", "'show'", "'the'", "'columns:'", "'all'", "'columns'", "'from'", "'where'", "'group'", "'by'", "','", "'table'", "'a'", "'and'", "'or'", "'='", "'is'", "'equal'", "'to'", "'not'", "'less'", "'than'", "'greater'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalNlToSqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNlToSqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNlToSqlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNlToSql.g"; }



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




    // $ANTLR start "entryRuleAccountingSpeech"
    // InternalNlToSql.g:64:1: entryRuleAccountingSpeech returns [EObject current=null] : iv_ruleAccountingSpeech= ruleAccountingSpeech EOF ;
    public final EObject entryRuleAccountingSpeech() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccountingSpeech = null;


        try {
            // InternalNlToSql.g:64:57: (iv_ruleAccountingSpeech= ruleAccountingSpeech EOF )
            // InternalNlToSql.g:65:2: iv_ruleAccountingSpeech= ruleAccountingSpeech EOF
            {
             newCompositeNode(grammarAccess.getAccountingSpeechRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAccountingSpeech=ruleAccountingSpeech();

            state._fsp--;

             current =iv_ruleAccountingSpeech; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccountingSpeech"


    // $ANTLR start "ruleAccountingSpeech"
    // InternalNlToSql.g:71:1: ruleAccountingSpeech returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleAccountingSpeech() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:77:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalNlToSql.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalNlToSql.g:78:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNlToSql.g:79:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalNlToSql.g:79:3: (lv_statements_0_0= ruleStatement )
            	    // InternalNlToSql.g:80:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getAccountingSpeechAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getAccountingSpeechRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"uk.ac.kcl.inf.NlToSql.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccountingSpeech"


    // $ANTLR start "entryRuleStatement"
    // InternalNlToSql.g:100:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalNlToSql.g:100:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalNlToSql.g:101:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalNlToSql.g:107:1: ruleStatement returns [EObject current=null] : (this_SelectStatement_0= ruleSelectStatement otherlv_1= '.' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_SelectStatement_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:113:2: ( (this_SelectStatement_0= ruleSelectStatement otherlv_1= '.' ) )
            // InternalNlToSql.g:114:2: (this_SelectStatement_0= ruleSelectStatement otherlv_1= '.' )
            {
            // InternalNlToSql.g:114:2: (this_SelectStatement_0= ruleSelectStatement otherlv_1= '.' )
            // InternalNlToSql.g:115:3: this_SelectStatement_0= ruleSelectStatement otherlv_1= '.'
            {

            			newCompositeNode(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_SelectStatement_0=ruleSelectStatement();

            state._fsp--;


            			current = this_SelectStatement_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getFullStopKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalNlToSql.g:131:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalNlToSql.g:131:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalNlToSql.g:132:2: iv_ruleSelectStatement= ruleSelectStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectStatement=ruleSelectStatement();

            state._fsp--;

             current =iv_ruleSelectStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalNlToSql.g:138:1: ruleSelectStatement returns [EObject current=null] : ( (otherlv_0= 'can' otherlv_1= 'you' )? otherlv_2= 'show' ( ( (otherlv_3= 'the' otherlv_4= 'columns:' this_SelectList_5= ruleSelectList ) | (otherlv_6= 'all' otherlv_7= 'columns' ) ) otherlv_8= 'from' ) ( (lv_entity_9_0= ruleEntityName ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_groupByList_14_0= rulePropertyReference ) ) (otherlv_15= ',' ( (lv_groupByList_16_0= rulePropertyReference ) ) )* )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject this_SelectList_5 = null;

        EObject lv_entity_9_0 = null;

        EObject lv_condition_11_0 = null;

        EObject lv_groupByList_14_0 = null;

        EObject lv_groupByList_16_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:144:2: ( ( (otherlv_0= 'can' otherlv_1= 'you' )? otherlv_2= 'show' ( ( (otherlv_3= 'the' otherlv_4= 'columns:' this_SelectList_5= ruleSelectList ) | (otherlv_6= 'all' otherlv_7= 'columns' ) ) otherlv_8= 'from' ) ( (lv_entity_9_0= ruleEntityName ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_groupByList_14_0= rulePropertyReference ) ) (otherlv_15= ',' ( (lv_groupByList_16_0= rulePropertyReference ) ) )* )? ) )
            // InternalNlToSql.g:145:2: ( (otherlv_0= 'can' otherlv_1= 'you' )? otherlv_2= 'show' ( ( (otherlv_3= 'the' otherlv_4= 'columns:' this_SelectList_5= ruleSelectList ) | (otherlv_6= 'all' otherlv_7= 'columns' ) ) otherlv_8= 'from' ) ( (lv_entity_9_0= ruleEntityName ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_groupByList_14_0= rulePropertyReference ) ) (otherlv_15= ',' ( (lv_groupByList_16_0= rulePropertyReference ) ) )* )? )
            {
            // InternalNlToSql.g:145:2: ( (otherlv_0= 'can' otherlv_1= 'you' )? otherlv_2= 'show' ( ( (otherlv_3= 'the' otherlv_4= 'columns:' this_SelectList_5= ruleSelectList ) | (otherlv_6= 'all' otherlv_7= 'columns' ) ) otherlv_8= 'from' ) ( (lv_entity_9_0= ruleEntityName ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_groupByList_14_0= rulePropertyReference ) ) (otherlv_15= ',' ( (lv_groupByList_16_0= rulePropertyReference ) ) )* )? )
            // InternalNlToSql.g:146:3: (otherlv_0= 'can' otherlv_1= 'you' )? otherlv_2= 'show' ( ( (otherlv_3= 'the' otherlv_4= 'columns:' this_SelectList_5= ruleSelectList ) | (otherlv_6= 'all' otherlv_7= 'columns' ) ) otherlv_8= 'from' ) ( (lv_entity_9_0= ruleEntityName ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_groupByList_14_0= rulePropertyReference ) ) (otherlv_15= ',' ( (lv_groupByList_16_0= rulePropertyReference ) ) )* )?
            {
            // InternalNlToSql.g:146:3: (otherlv_0= 'can' otherlv_1= 'you' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalNlToSql.g:147:4: otherlv_0= 'can' otherlv_1= 'you'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getCanKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getYouKeyword_0_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getShowKeyword_1());
            		
            // InternalNlToSql.g:160:3: ( ( (otherlv_3= 'the' otherlv_4= 'columns:' this_SelectList_5= ruleSelectList ) | (otherlv_6= 'all' otherlv_7= 'columns' ) ) otherlv_8= 'from' )
            // InternalNlToSql.g:161:4: ( (otherlv_3= 'the' otherlv_4= 'columns:' this_SelectList_5= ruleSelectList ) | (otherlv_6= 'all' otherlv_7= 'columns' ) ) otherlv_8= 'from'
            {
            // InternalNlToSql.g:161:4: ( (otherlv_3= 'the' otherlv_4= 'columns:' this_SelectList_5= ruleSelectList ) | (otherlv_6= 'all' otherlv_7= 'columns' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalNlToSql.g:162:5: (otherlv_3= 'the' otherlv_4= 'columns:' this_SelectList_5= ruleSelectList )
                    {
                    // InternalNlToSql.g:162:5: (otherlv_3= 'the' otherlv_4= 'columns:' this_SelectList_5= ruleSelectList )
                    // InternalNlToSql.g:163:6: otherlv_3= 'the' otherlv_4= 'columns:' this_SelectList_5= ruleSelectList
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_8); 

                    						newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getTheKeyword_2_0_0_0());
                    					
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    						newLeafNode(otherlv_4, grammarAccess.getSelectStatementAccess().getColumnsKeyword_2_0_0_1());
                    					

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectListParserRuleCall_2_0_0_2());
                    					
                    pushFollow(FOLLOW_10);
                    this_SelectList_5=ruleSelectList();

                    state._fsp--;


                    						current = this_SelectList_5;
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:181:5: (otherlv_6= 'all' otherlv_7= 'columns' )
                    {
                    // InternalNlToSql.g:181:5: (otherlv_6= 'all' otherlv_7= 'columns' )
                    // InternalNlToSql.g:182:6: otherlv_6= 'all' otherlv_7= 'columns'
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_11); 

                    						newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getAllKeyword_2_0_1_0());
                    					
                    otherlv_7=(Token)match(input,18,FOLLOW_10); 

                    						newLeafNode(otherlv_7, grammarAccess.getSelectStatementAccess().getColumnsKeyword_2_0_1_1());
                    					

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_12); 

            				newLeafNode(otherlv_8, grammarAccess.getSelectStatementAccess().getFromKeyword_2_1());
            			

            }

            // InternalNlToSql.g:197:3: ( (lv_entity_9_0= ruleEntityName ) )
            // InternalNlToSql.g:198:4: (lv_entity_9_0= ruleEntityName )
            {
            // InternalNlToSql.g:198:4: (lv_entity_9_0= ruleEntityName )
            // InternalNlToSql.g:199:5: lv_entity_9_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getSelectStatementAccess().getEntityEntityNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_entity_9_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_9_0,
            						"uk.ac.kcl.inf.NlToSql.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:216:3: (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNlToSql.g:217:4: otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) )
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getSelectStatementAccess().getWhereKeyword_4_0());
                    			
                    // InternalNlToSql.g:221:4: ( (lv_condition_11_0= ruleCondition ) )
                    // InternalNlToSql.g:222:5: (lv_condition_11_0= ruleCondition )
                    {
                    // InternalNlToSql.g:222:5: (lv_condition_11_0= ruleCondition )
                    // InternalNlToSql.g:223:6: lv_condition_11_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getConditionConditionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_condition_11_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_11_0,
                    							"uk.ac.kcl.inf.NlToSql.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNlToSql.g:241:3: (otherlv_12= 'group' otherlv_13= 'by' ( (lv_groupByList_14_0= rulePropertyReference ) ) (otherlv_15= ',' ( (lv_groupByList_16_0= rulePropertyReference ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalNlToSql.g:242:4: otherlv_12= 'group' otherlv_13= 'by' ( (lv_groupByList_14_0= rulePropertyReference ) ) (otherlv_15= ',' ( (lv_groupByList_16_0= rulePropertyReference ) ) )*
                    {
                    otherlv_12=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_12, grammarAccess.getSelectStatementAccess().getGroupKeyword_5_0());
                    			
                    otherlv_13=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_13, grammarAccess.getSelectStatementAccess().getByKeyword_5_1());
                    			
                    // InternalNlToSql.g:250:4: ( (lv_groupByList_14_0= rulePropertyReference ) )
                    // InternalNlToSql.g:251:5: (lv_groupByList_14_0= rulePropertyReference )
                    {
                    // InternalNlToSql.g:251:5: (lv_groupByList_14_0= rulePropertyReference )
                    // InternalNlToSql.g:252:6: lv_groupByList_14_0= rulePropertyReference
                    {

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupByListPropertyReferenceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_groupByList_14_0=rulePropertyReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    						}
                    						add(
                    							current,
                    							"groupByList",
                    							lv_groupByList_14_0,
                    							"uk.ac.kcl.inf.NlToSql.PropertyReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalNlToSql.g:269:4: (otherlv_15= ',' ( (lv_groupByList_16_0= rulePropertyReference ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==23) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalNlToSql.g:270:5: otherlv_15= ',' ( (lv_groupByList_16_0= rulePropertyReference ) )
                    	    {
                    	    otherlv_15=(Token)match(input,23,FOLLOW_16); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getSelectStatementAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalNlToSql.g:274:5: ( (lv_groupByList_16_0= rulePropertyReference ) )
                    	    // InternalNlToSql.g:275:6: (lv_groupByList_16_0= rulePropertyReference )
                    	    {
                    	    // InternalNlToSql.g:275:6: (lv_groupByList_16_0= rulePropertyReference )
                    	    // InternalNlToSql.g:276:7: lv_groupByList_16_0= rulePropertyReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupByListPropertyReferenceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_groupByList_16_0=rulePropertyReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groupByList",
                    	    								lv_groupByList_16_0,
                    	    								"uk.ac.kcl.inf.NlToSql.PropertyReference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleEntityName"
    // InternalNlToSql.g:299:1: entryRuleEntityName returns [EObject current=null] : iv_ruleEntityName= ruleEntityName EOF ;
    public final EObject entryRuleEntityName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityName = null;


        try {
            // InternalNlToSql.g:299:51: (iv_ruleEntityName= ruleEntityName EOF )
            // InternalNlToSql.g:300:2: iv_ruleEntityName= ruleEntityName EOF
            {
             newCompositeNode(grammarAccess.getEntityNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityName=ruleEntityName();

            state._fsp--;

             current =iv_ruleEntityName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityName"


    // $ANTLR start "ruleEntityName"
    // InternalNlToSql.g:306:1: ruleEntityName returns [EObject current=null] : ( (otherlv_0= 'the' otherlv_1= 'table' )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEntityName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalNlToSql.g:312:2: ( ( (otherlv_0= 'the' otherlv_1= 'table' )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalNlToSql.g:313:2: ( (otherlv_0= 'the' otherlv_1= 'table' )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalNlToSql.g:313:2: ( (otherlv_0= 'the' otherlv_1= 'table' )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalNlToSql.g:314:3: (otherlv_0= 'the' otherlv_1= 'table' )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalNlToSql.g:314:3: (otherlv_0= 'the' otherlv_1= 'table' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNlToSql.g:315:4: otherlv_0= 'the' otherlv_1= 'table'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntityNameAccess().getTheKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityNameAccess().getTableKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:324:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalNlToSql.g:325:4: (lv_name_2_0= RULE_ID )
            {
            // InternalNlToSql.g:325:4: (lv_name_2_0= RULE_ID )
            // InternalNlToSql.g:326:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityName"


    // $ANTLR start "entryRuleSelectList"
    // InternalNlToSql.g:346:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // InternalNlToSql.g:346:51: (iv_ruleSelectList= ruleSelectList EOF )
            // InternalNlToSql.g:347:2: iv_ruleSelectList= ruleSelectList EOF
            {
             newCompositeNode(grammarAccess.getSelectListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectList=ruleSelectList();

            state._fsp--;

             current =iv_ruleSelectList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectList"


    // $ANTLR start "ruleSelectList"
    // InternalNlToSql.g:353:1: ruleSelectList returns [EObject current=null] : ( ( (lv_selectItem_0_0= ruleProperty ) ) (otherlv_1= ',' ( (lv_selectItem_2_0= ruleProperty ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_selectItem_0_0 = null;

        EObject lv_selectItem_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:359:2: ( ( ( (lv_selectItem_0_0= ruleProperty ) ) (otherlv_1= ',' ( (lv_selectItem_2_0= ruleProperty ) ) )* ) )
            // InternalNlToSql.g:360:2: ( ( (lv_selectItem_0_0= ruleProperty ) ) (otherlv_1= ',' ( (lv_selectItem_2_0= ruleProperty ) ) )* )
            {
            // InternalNlToSql.g:360:2: ( ( (lv_selectItem_0_0= ruleProperty ) ) (otherlv_1= ',' ( (lv_selectItem_2_0= ruleProperty ) ) )* )
            // InternalNlToSql.g:361:3: ( (lv_selectItem_0_0= ruleProperty ) ) (otherlv_1= ',' ( (lv_selectItem_2_0= ruleProperty ) ) )*
            {
            // InternalNlToSql.g:361:3: ( (lv_selectItem_0_0= ruleProperty ) )
            // InternalNlToSql.g:362:4: (lv_selectItem_0_0= ruleProperty )
            {
            // InternalNlToSql.g:362:4: (lv_selectItem_0_0= ruleProperty )
            // InternalNlToSql.g:363:5: lv_selectItem_0_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getSelectListAccess().getSelectItemPropertyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_selectItem_0_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectListRule());
            					}
            					add(
            						current,
            						"selectItem",
            						lv_selectItem_0_0,
            						"uk.ac.kcl.inf.NlToSql.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:380:3: (otherlv_1= ',' ( (lv_selectItem_2_0= ruleProperty ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalNlToSql.g:381:4: otherlv_1= ',' ( (lv_selectItem_2_0= ruleProperty ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:385:4: ( (lv_selectItem_2_0= ruleProperty ) )
            	    // InternalNlToSql.g:386:5: (lv_selectItem_2_0= ruleProperty )
            	    {
            	    // InternalNlToSql.g:386:5: (lv_selectItem_2_0= ruleProperty )
            	    // InternalNlToSql.g:387:6: lv_selectItem_2_0= ruleProperty
            	    {

            	    						newCompositeNode(grammarAccess.getSelectListAccess().getSelectItemPropertyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_selectItem_2_0=ruleProperty();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"selectItem",
            	    							lv_selectItem_2_0,
            	    							"uk.ac.kcl.inf.NlToSql.Property");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectList"


    // $ANTLR start "entryRulePropertyReference"
    // InternalNlToSql.g:409:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


        try {
            // InternalNlToSql.g:409:58: (iv_rulePropertyReference= rulePropertyReference EOF )
            // InternalNlToSql.g:410:2: iv_rulePropertyReference= rulePropertyReference EOF
            {
             newCompositeNode(grammarAccess.getPropertyReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyReference=rulePropertyReference();

            state._fsp--;

             current =iv_rulePropertyReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyReference"


    // $ANTLR start "rulePropertyReference"
    // InternalNlToSql.g:416:1: rulePropertyReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalNlToSql.g:422:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalNlToSql.g:423:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalNlToSql.g:423:2: ( (otherlv_0= RULE_ID ) )
            // InternalNlToSql.g:424:3: (otherlv_0= RULE_ID )
            {
            // InternalNlToSql.g:424:3: (otherlv_0= RULE_ID )
            // InternalNlToSql.g:425:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPropertyReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getPropertyPropertyCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyReference"


    // $ANTLR start "entryRuleProperty"
    // InternalNlToSql.g:439:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalNlToSql.g:439:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalNlToSql.g:440:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalNlToSql.g:446:1: ruleProperty returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalNlToSql.g:452:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalNlToSql.g:453:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalNlToSql.g:453:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalNlToSql.g:454:3: (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalNlToSql.g:454:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==15) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            switch (alt9) {
                case 1 :
                    // InternalNlToSql.g:455:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:460:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:465:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalNlToSql.g:466:4: (lv_name_2_0= RULE_ID )
            {
            // InternalNlToSql.g:466:4: (lv_name_2_0= RULE_ID )
            // InternalNlToSql.g:467:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleCondition"
    // InternalNlToSql.g:487:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalNlToSql.g:487:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalNlToSql.g:488:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalNlToSql.g:494:1: ruleCondition returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:500:2: ( (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalNlToSql.g:501:2: (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalNlToSql.g:501:2: (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalNlToSql.g:502:3: this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getConditionAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalNlToSql.g:510:3: ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalNlToSql.g:511:4: () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalNlToSql.g:511:4: ()
            	    // InternalNlToSql.g:512:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConditionAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getConditionAccess().getLogicOperatorParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_9);
            	    ruleLogicOperator();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalNlToSql.g:525:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalNlToSql.g:526:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalNlToSql.g:526:5: (lv_right_3_0= ruleComparison )
            	    // InternalNlToSql.g:527:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getConditionAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.inf.NlToSql.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleLogicOperator"
    // InternalNlToSql.g:549:1: entryRuleLogicOperator returns [String current=null] : iv_ruleLogicOperator= ruleLogicOperator EOF ;
    public final String entryRuleLogicOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicOperator = null;


        try {
            // InternalNlToSql.g:549:53: (iv_ruleLogicOperator= ruleLogicOperator EOF )
            // InternalNlToSql.g:550:2: iv_ruleLogicOperator= ruleLogicOperator EOF
            {
             newCompositeNode(grammarAccess.getLogicOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicOperator=ruleLogicOperator();

            state._fsp--;

             current =iv_ruleLogicOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicOperator"


    // $ANTLR start "ruleLogicOperator"
    // InternalNlToSql.g:556:1: ruleLogicOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleLogicOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:562:2: ( (kw= 'and' | kw= 'or' ) )
            // InternalNlToSql.g:563:2: (kw= 'and' | kw= 'or' )
            {
            // InternalNlToSql.g:563:2: (kw= 'and' | kw= 'or' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalNlToSql.g:564:3: kw= 'and'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogicOperatorAccess().getAndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:570:3: kw= 'or'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogicOperatorAccess().getOrKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "entryRuleComparison"
    // InternalNlToSql.g:579:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalNlToSql.g:579:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalNlToSql.g:580:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalNlToSql.g:586:1: ruleComparison returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv_rightHandSide_4_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:592:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) ) )
            // InternalNlToSql.g:593:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) )
            {
            // InternalNlToSql.g:593:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) )
            // InternalNlToSql.g:594:3: (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) )
            {
            // InternalNlToSql.g:594:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalNlToSql.g:595:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_16); 

                    				newLeafNode(otherlv_0, grammarAccess.getComparisonAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:600:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:605:3: ( (otherlv_2= RULE_ID ) )
            // InternalNlToSql.g:606:4: (otherlv_2= RULE_ID )
            {
            // InternalNlToSql.g:606:4: (otherlv_2= RULE_ID )
            // InternalNlToSql.g:607:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLeftHandSidePropertyCrossReference_1_0());
            				

            }


            }

            // InternalNlToSql.g:618:3: ( (lv_operator_3_0= ruleComparisonOperator ) )
            // InternalNlToSql.g:619:4: (lv_operator_3_0= ruleComparisonOperator )
            {
            // InternalNlToSql.g:619:4: (lv_operator_3_0= ruleComparisonOperator )
            // InternalNlToSql.g:620:5: lv_operator_3_0= ruleComparisonOperator
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_operator_3_0=ruleComparisonOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_3_0,
            						"uk.ac.kcl.inf.NlToSql.ComparisonOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:637:3: ( (lv_rightHandSide_4_0= ruleValue ) )
            // InternalNlToSql.g:638:4: (lv_rightHandSide_4_0= ruleValue )
            {
            // InternalNlToSql.g:638:4: (lv_rightHandSide_4_0= ruleValue )
            // InternalNlToSql.g:639:5: lv_rightHandSide_4_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getRightHandSideValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_rightHandSide_4_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonRule());
            					}
            					set(
            						current,
            						"rightHandSide",
            						lv_rightHandSide_4_0,
            						"uk.ac.kcl.inf.NlToSql.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalNlToSql.g:660:1: entryRuleComparisonOperator returns [String current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final String entryRuleComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperator = null;


        try {
            // InternalNlToSql.g:660:58: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalNlToSql.g:661:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperator=ruleComparisonOperator();

            state._fsp--;

             current =iv_ruleComparisonOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalNlToSql.g:667:1: ruleComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:673:2: ( (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) ) )
            // InternalNlToSql.g:674:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )
            {
            // InternalNlToSql.g:674:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )
            int alt13=7;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalNlToSql.g:675:3: kw= '='
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:681:3: (kw= 'is' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:681:3: (kw= 'is' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:682:4: kw= 'is' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,29,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getIsKeyword_1_0());
                    			
                    kw=(Token)match(input,30,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_1_1());
                    			
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:699:3: (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:699:3: (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:700:4: kw= 'is' kw= 'not' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,29,FOLLOW_24); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getIsKeyword_2_0());
                    			
                    kw=(Token)match(input,32,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getNotKeyword_2_1());
                    			
                    kw=(Token)match(input,30,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_2_2());
                    			
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalNlToSql.g:722:3: (kw= 'less' kw= 'than' )
                    {
                    // InternalNlToSql.g:722:3: (kw= 'less' kw= 'than' )
                    // InternalNlToSql.g:723:4: kw= 'less' kw= 'than'
                    {
                    kw=(Token)match(input,33,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessKeyword_3_0());
                    			
                    kw=(Token)match(input,34,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalNlToSql.g:735:3: (kw= 'greater' kw= 'than' )
                    {
                    // InternalNlToSql.g:735:3: (kw= 'greater' kw= 'than' )
                    // InternalNlToSql.g:736:4: kw= 'greater' kw= 'than'
                    {
                    kw=(Token)match(input,35,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_4_0());
                    			
                    kw=(Token)match(input,34,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalNlToSql.g:748:3: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:748:3: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:749:4: kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,33,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessKeyword_5_0());
                    			
                    kw=(Token)match(input,34,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_5_1());
                    			
                    kw=(Token)match(input,27,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getOrKeyword_5_2());
                    			
                    kw=(Token)match(input,30,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_5_3());
                    			
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_5_4());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalNlToSql.g:776:3: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:776:3: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:777:4: kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,35,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_6_0());
                    			
                    kw=(Token)match(input,34,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_6_1());
                    			
                    kw=(Token)match(input,27,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getOrKeyword_6_2());
                    			
                    kw=(Token)match(input,30,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_6_3());
                    			
                    kw=(Token)match(input,31,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_6_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleValue"
    // InternalNlToSql.g:807:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalNlToSql.g:807:45: (iv_ruleValue= ruleValue EOF )
            // InternalNlToSql.g:808:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalNlToSql.g:814:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalNlToSql.g:820:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalNlToSql.g:821:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalNlToSql.g:821:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalNlToSql.g:822:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:830:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"

    // Delegated rules


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\7\uffff\1\11\1\13\4\uffff";
    static final String dfa_3s = "\1\34\1\uffff\1\36\2\42\2\uffff\2\5\4\uffff";
    static final String dfa_4s = "\1\43\1\uffff\1\40\2\42\2\uffff\2\33\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\3\1\2\2\uffff\1\4\1\6\1\5\1\7";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\3\uffff\1\3\1\uffff\1\4",
            "",
            "\1\6\1\uffff\1\5",
            "\1\7",
            "\1\10",
            "",
            "",
            "\2\11\24\uffff\1\12",
            "\2\13\24\uffff\1\14",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "674:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000A30000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});

}