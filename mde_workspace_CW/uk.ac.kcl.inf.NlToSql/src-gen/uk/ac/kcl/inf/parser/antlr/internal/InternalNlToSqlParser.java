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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'can'", "'you'", "'please'", "'show'", "'all'", "'from'", "'where'", "'group'", "'by'", "','", "'insert'", "'into'", "'('", "')'", "'values'", "'update'", "'set'", "'delete'", "'the'", "'a'", "'='", "'and'", "'or'", "'is'", "'equal'", "'to'", "'not'", "'less'", "'than'", "'greater'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int T__40=40;
    public static final int T__41=41;
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

                if ( (LA1_0==12||LA1_0==15||LA1_0==22||LA1_0==27||LA1_0==29) ) {
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
    // InternalNlToSql.g:107:1: ruleStatement returns [EObject current=null] : ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) otherlv_4= '.' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_SelectStatement_0 = null;

        EObject this_InsertStatement_1 = null;

        EObject this_UpdateStatement_2 = null;

        EObject this_DeleteStatement_3 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:113:2: ( ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) otherlv_4= '.' ) )
            // InternalNlToSql.g:114:2: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) otherlv_4= '.' )
            {
            // InternalNlToSql.g:114:2: ( (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) otherlv_4= '.' )
            // InternalNlToSql.g:115:3: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement ) otherlv_4= '.'
            {
            // InternalNlToSql.g:115:3: (this_SelectStatement_0= ruleSelectStatement | this_InsertStatement_1= ruleInsertStatement | this_UpdateStatement_2= ruleUpdateStatement | this_DeleteStatement_3= ruleDeleteStatement )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==13) ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==14) ) {
                        switch ( input.LA(4) ) {
                        case 27:
                            {
                            alt2=3;
                            }
                            break;
                        case 15:
                            {
                            alt2=1;
                            }
                            break;
                        case 22:
                            {
                            alt2=2;
                            }
                            break;
                        case 29:
                            {
                            alt2=4;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 7, input);

                            throw nvae;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalNlToSql.g:116:4: this_SelectStatement_0= ruleSelectStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_SelectStatement_0=ruleSelectStatement();

                    state._fsp--;


                    				current = this_SelectStatement_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:125:4: this_InsertStatement_1= ruleInsertStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getInsertStatementParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_InsertStatement_1=ruleInsertStatement();

                    state._fsp--;


                    				current = this_InsertStatement_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:134:4: this_UpdateStatement_2= ruleUpdateStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_4);
                    this_UpdateStatement_2=ruleUpdateStatement();

                    state._fsp--;


                    				current = this_UpdateStatement_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalNlToSql.g:143:4: this_DeleteStatement_3= ruleDeleteStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getDeleteStatementParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_4);
                    this_DeleteStatement_3=ruleDeleteStatement();

                    state._fsp--;


                    				current = this_DeleteStatement_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStatementAccess().getFullStopKeyword_1());
            		

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
    // InternalNlToSql.g:160:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalNlToSql.g:160:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalNlToSql.g:161:2: iv_ruleSelectStatement= ruleSelectStatement EOF
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
    // InternalNlToSql.g:167:1: ruleSelectStatement returns [EObject current=null] : ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'show' ( (this_SelectList_4= ruleSelectList | otherlv_5= 'all' ) otherlv_6= 'from' ) ( (lv_entity_7_0= ruleEntityName ) ) (otherlv_8= 'where' ( (lv_condition_9_0= ruleCondition ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByList_12_0= rulePropertyReference ) ) (otherlv_13= ',' ( (lv_groupByList_14_0= rulePropertyReference ) ) )* )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_SelectList_4 = null;

        EObject lv_entity_7_0 = null;

        EObject lv_condition_9_0 = null;

        EObject lv_groupByList_12_0 = null;

        EObject lv_groupByList_14_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:173:2: ( ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'show' ( (this_SelectList_4= ruleSelectList | otherlv_5= 'all' ) otherlv_6= 'from' ) ( (lv_entity_7_0= ruleEntityName ) ) (otherlv_8= 'where' ( (lv_condition_9_0= ruleCondition ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByList_12_0= rulePropertyReference ) ) (otherlv_13= ',' ( (lv_groupByList_14_0= rulePropertyReference ) ) )* )? ) )
            // InternalNlToSql.g:174:2: ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'show' ( (this_SelectList_4= ruleSelectList | otherlv_5= 'all' ) otherlv_6= 'from' ) ( (lv_entity_7_0= ruleEntityName ) ) (otherlv_8= 'where' ( (lv_condition_9_0= ruleCondition ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByList_12_0= rulePropertyReference ) ) (otherlv_13= ',' ( (lv_groupByList_14_0= rulePropertyReference ) ) )* )? )
            {
            // InternalNlToSql.g:174:2: ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'show' ( (this_SelectList_4= ruleSelectList | otherlv_5= 'all' ) otherlv_6= 'from' ) ( (lv_entity_7_0= ruleEntityName ) ) (otherlv_8= 'where' ( (lv_condition_9_0= ruleCondition ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByList_12_0= rulePropertyReference ) ) (otherlv_13= ',' ( (lv_groupByList_14_0= rulePropertyReference ) ) )* )? )
            // InternalNlToSql.g:175:3: (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'show' ( (this_SelectList_4= ruleSelectList | otherlv_5= 'all' ) otherlv_6= 'from' ) ( (lv_entity_7_0= ruleEntityName ) ) (otherlv_8= 'where' ( (lv_condition_9_0= ruleCondition ) ) )? (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByList_12_0= rulePropertyReference ) ) (otherlv_13= ',' ( (lv_groupByList_14_0= rulePropertyReference ) ) )* )?
            {
            // InternalNlToSql.g:175:3: (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalNlToSql.g:176:4: otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getCanKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getYouKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getPleaseKeyword_0_2());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectStatementAccess().getShowKeyword_1());
            		
            // InternalNlToSql.g:193:3: ( (this_SelectList_4= ruleSelectList | otherlv_5= 'all' ) otherlv_6= 'from' )
            // InternalNlToSql.g:194:4: (this_SelectList_4= ruleSelectList | otherlv_5= 'all' ) otherlv_6= 'from'
            {
            // InternalNlToSql.g:194:4: (this_SelectList_4= ruleSelectList | otherlv_5= 'all' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=30 && LA4_0<=31)) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalNlToSql.g:195:5: this_SelectList_4= ruleSelectList
                    {

                    					newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectListParserRuleCall_2_0_0());
                    				
                    pushFollow(FOLLOW_9);
                    this_SelectList_4=ruleSelectList();

                    state._fsp--;


                    					current = this_SelectList_4;
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:204:5: otherlv_5= 'all'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    					newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getAllKeyword_2_0_1());
                    				

                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_10); 

            				newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getFromKeyword_2_1());
            			

            }

            // InternalNlToSql.g:214:3: ( (lv_entity_7_0= ruleEntityName ) )
            // InternalNlToSql.g:215:4: (lv_entity_7_0= ruleEntityName )
            {
            // InternalNlToSql.g:215:4: (lv_entity_7_0= ruleEntityName )
            // InternalNlToSql.g:216:5: lv_entity_7_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getSelectStatementAccess().getEntityEntityNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_entity_7_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectStatementRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_7_0,
            						"uk.ac.kcl.inf.NlToSql.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:233:3: (otherlv_8= 'where' ( (lv_condition_9_0= ruleCondition ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalNlToSql.g:234:4: otherlv_8= 'where' ( (lv_condition_9_0= ruleCondition ) )
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getSelectStatementAccess().getWhereKeyword_4_0());
                    			
                    // InternalNlToSql.g:238:4: ( (lv_condition_9_0= ruleCondition ) )
                    // InternalNlToSql.g:239:5: (lv_condition_9_0= ruleCondition )
                    {
                    // InternalNlToSql.g:239:5: (lv_condition_9_0= ruleCondition )
                    // InternalNlToSql.g:240:6: lv_condition_9_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getConditionConditionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_condition_9_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_9_0,
                    							"uk.ac.kcl.inf.NlToSql.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNlToSql.g:258:3: (otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByList_12_0= rulePropertyReference ) ) (otherlv_13= ',' ( (lv_groupByList_14_0= rulePropertyReference ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNlToSql.g:259:4: otherlv_10= 'group' otherlv_11= 'by' ( (lv_groupByList_12_0= rulePropertyReference ) ) (otherlv_13= ',' ( (lv_groupByList_14_0= rulePropertyReference ) ) )*
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_10, grammarAccess.getSelectStatementAccess().getGroupKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getSelectStatementAccess().getByKeyword_5_1());
                    			
                    // InternalNlToSql.g:267:4: ( (lv_groupByList_12_0= rulePropertyReference ) )
                    // InternalNlToSql.g:268:5: (lv_groupByList_12_0= rulePropertyReference )
                    {
                    // InternalNlToSql.g:268:5: (lv_groupByList_12_0= rulePropertyReference )
                    // InternalNlToSql.g:269:6: lv_groupByList_12_0= rulePropertyReference
                    {

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupByListPropertyReferenceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_groupByList_12_0=rulePropertyReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    						}
                    						add(
                    							current,
                    							"groupByList",
                    							lv_groupByList_12_0,
                    							"uk.ac.kcl.inf.NlToSql.PropertyReference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalNlToSql.g:286:4: (otherlv_13= ',' ( (lv_groupByList_14_0= rulePropertyReference ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalNlToSql.g:287:5: otherlv_13= ',' ( (lv_groupByList_14_0= rulePropertyReference ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_10); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getSelectStatementAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalNlToSql.g:291:5: ( (lv_groupByList_14_0= rulePropertyReference ) )
                    	    // InternalNlToSql.g:292:6: (lv_groupByList_14_0= rulePropertyReference )
                    	    {
                    	    // InternalNlToSql.g:292:6: (lv_groupByList_14_0= rulePropertyReference )
                    	    // InternalNlToSql.g:293:7: lv_groupByList_14_0= rulePropertyReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupByListPropertyReferenceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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


    // $ANTLR start "entryRuleInsertStatement"
    // InternalNlToSql.g:316:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // InternalNlToSql.g:316:56: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // InternalNlToSql.g:317:2: iv_ruleInsertStatement= ruleInsertStatement EOF
            {
             newCompositeNode(grammarAccess.getInsertStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertStatement=ruleInsertStatement();

            state._fsp--;

             current =iv_ruleInsertStatement; 
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
    // $ANTLR end "entryRuleInsertStatement"


    // $ANTLR start "ruleInsertStatement"
    // InternalNlToSql.g:323:1: ruleInsertStatement returns [EObject current=null] : ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'insert' otherlv_4= 'into' ( (lv_entity_5_0= ruleEntityName ) ) otherlv_6= '(' ( (lv_propertyList_7_0= rulePropertyName ) ) (otherlv_8= ',' ( (lv_propertyList_9_0= rulePropertyName ) ) )* otherlv_10= ')' otherlv_11= 'values' otherlv_12= '(' ( (lv_valueList_13_0= ruleValue ) ) (otherlv_14= ',' ( (lv_valueList_15_0= ruleValue ) ) )* otherlv_16= ')' ) ;
    public final EObject ruleInsertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_entity_5_0 = null;

        EObject lv_propertyList_7_0 = null;

        EObject lv_propertyList_9_0 = null;

        AntlrDatatypeRuleToken lv_valueList_13_0 = null;

        AntlrDatatypeRuleToken lv_valueList_15_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:329:2: ( ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'insert' otherlv_4= 'into' ( (lv_entity_5_0= ruleEntityName ) ) otherlv_6= '(' ( (lv_propertyList_7_0= rulePropertyName ) ) (otherlv_8= ',' ( (lv_propertyList_9_0= rulePropertyName ) ) )* otherlv_10= ')' otherlv_11= 'values' otherlv_12= '(' ( (lv_valueList_13_0= ruleValue ) ) (otherlv_14= ',' ( (lv_valueList_15_0= ruleValue ) ) )* otherlv_16= ')' ) )
            // InternalNlToSql.g:330:2: ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'insert' otherlv_4= 'into' ( (lv_entity_5_0= ruleEntityName ) ) otherlv_6= '(' ( (lv_propertyList_7_0= rulePropertyName ) ) (otherlv_8= ',' ( (lv_propertyList_9_0= rulePropertyName ) ) )* otherlv_10= ')' otherlv_11= 'values' otherlv_12= '(' ( (lv_valueList_13_0= ruleValue ) ) (otherlv_14= ',' ( (lv_valueList_15_0= ruleValue ) ) )* otherlv_16= ')' )
            {
            // InternalNlToSql.g:330:2: ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'insert' otherlv_4= 'into' ( (lv_entity_5_0= ruleEntityName ) ) otherlv_6= '(' ( (lv_propertyList_7_0= rulePropertyName ) ) (otherlv_8= ',' ( (lv_propertyList_9_0= rulePropertyName ) ) )* otherlv_10= ')' otherlv_11= 'values' otherlv_12= '(' ( (lv_valueList_13_0= ruleValue ) ) (otherlv_14= ',' ( (lv_valueList_15_0= ruleValue ) ) )* otherlv_16= ')' )
            // InternalNlToSql.g:331:3: (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'insert' otherlv_4= 'into' ( (lv_entity_5_0= ruleEntityName ) ) otherlv_6= '(' ( (lv_propertyList_7_0= rulePropertyName ) ) (otherlv_8= ',' ( (lv_propertyList_9_0= rulePropertyName ) ) )* otherlv_10= ')' otherlv_11= 'values' otherlv_12= '(' ( (lv_valueList_13_0= ruleValue ) ) (otherlv_14= ',' ( (lv_valueList_15_0= ruleValue ) ) )* otherlv_16= ')'
            {
            // InternalNlToSql.g:331:3: (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNlToSql.g:332:4: otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getCanKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getYouKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getInsertStatementAccess().getPleaseKeyword_0_2());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getInsertKeyword_1());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getIntoKeyword_2());
            		
            // InternalNlToSql.g:353:3: ( (lv_entity_5_0= ruleEntityName ) )
            // InternalNlToSql.g:354:4: (lv_entity_5_0= ruleEntityName )
            {
            // InternalNlToSql.g:354:4: (lv_entity_5_0= ruleEntityName )
            // InternalNlToSql.g:355:5: lv_entity_5_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getInsertStatementAccess().getEntityEntityNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_entity_5_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_5_0,
            						"uk.ac.kcl.inf.NlToSql.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4());
            		
            // InternalNlToSql.g:376:3: ( (lv_propertyList_7_0= rulePropertyName ) )
            // InternalNlToSql.g:377:4: (lv_propertyList_7_0= rulePropertyName )
            {
            // InternalNlToSql.g:377:4: (lv_propertyList_7_0= rulePropertyName )
            // InternalNlToSql.g:378:5: lv_propertyList_7_0= rulePropertyName
            {

            					newCompositeNode(grammarAccess.getInsertStatementAccess().getPropertyListPropertyNameParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_propertyList_7_0=rulePropertyName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            					}
            					add(
            						current,
            						"propertyList",
            						lv_propertyList_7_0,
            						"uk.ac.kcl.inf.NlToSql.PropertyName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:395:3: (otherlv_8= ',' ( (lv_propertyList_9_0= rulePropertyName ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalNlToSql.g:396:4: otherlv_8= ',' ( (lv_propertyList_9_0= rulePropertyName ) )
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_10); 

            	    				newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalNlToSql.g:400:4: ( (lv_propertyList_9_0= rulePropertyName ) )
            	    // InternalNlToSql.g:401:5: (lv_propertyList_9_0= rulePropertyName )
            	    {
            	    // InternalNlToSql.g:401:5: (lv_propertyList_9_0= rulePropertyName )
            	    // InternalNlToSql.g:402:6: lv_propertyList_9_0= rulePropertyName
            	    {

            	    						newCompositeNode(grammarAccess.getInsertStatementAccess().getPropertyListPropertyNameParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_propertyList_9_0=rulePropertyName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"propertyList",
            	    							lv_propertyList_9_0,
            	    							"uk.ac.kcl.inf.NlToSql.PropertyName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_10=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_7());
            		
            otherlv_11=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_8());
            		
            otherlv_12=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_9());
            		
            // InternalNlToSql.g:432:3: ( (lv_valueList_13_0= ruleValue ) )
            // InternalNlToSql.g:433:4: (lv_valueList_13_0= ruleValue )
            {
            // InternalNlToSql.g:433:4: (lv_valueList_13_0= ruleValue )
            // InternalNlToSql.g:434:5: lv_valueList_13_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getInsertStatementAccess().getValueListValueParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_18);
            lv_valueList_13_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            					}
            					add(
            						current,
            						"valueList",
            						lv_valueList_13_0,
            						"uk.ac.kcl.inf.NlToSql.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:451:3: (otherlv_14= ',' ( (lv_valueList_15_0= ruleValue ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalNlToSql.g:452:4: otherlv_14= ',' ( (lv_valueList_15_0= ruleValue ) )
            	    {
            	    otherlv_14=(Token)match(input,21,FOLLOW_20); 

            	    				newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalNlToSql.g:456:4: ( (lv_valueList_15_0= ruleValue ) )
            	    // InternalNlToSql.g:457:5: (lv_valueList_15_0= ruleValue )
            	    {
            	    // InternalNlToSql.g:457:5: (lv_valueList_15_0= ruleValue )
            	    // InternalNlToSql.g:458:6: lv_valueList_15_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getInsertStatementAccess().getValueListValueParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_valueList_15_0=ruleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"valueList",
            	    							lv_valueList_15_0,
            	    							"uk.ac.kcl.inf.NlToSql.Value");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_16=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_12());
            		

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
    // $ANTLR end "ruleInsertStatement"


    // $ANTLR start "entryRuleUpdateStatement"
    // InternalNlToSql.g:484:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // InternalNlToSql.g:484:56: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // InternalNlToSql.g:485:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
            {
             newCompositeNode(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateStatement=ruleUpdateStatement();

            state._fsp--;

             current =iv_ruleUpdateStatement; 
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
    // $ANTLR end "entryRuleUpdateStatement"


    // $ANTLR start "ruleUpdateStatement"
    // InternalNlToSql.g:491:1: ruleUpdateStatement returns [EObject current=null] : ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'update' ( (lv_entity_4_0= ruleEntityName ) ) otherlv_5= 'set' ( ( (lv_updateItem_6_0= ruleUpdateItem ) ) (otherlv_7= ',' ( (lv_updateItem_8_0= ruleUpdateItem ) ) )* ) (otherlv_9= 'where' ( (lv_condition_10_0= ruleCondition ) ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_entity_4_0 = null;

        EObject lv_updateItem_6_0 = null;

        EObject lv_updateItem_8_0 = null;

        EObject lv_condition_10_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:497:2: ( ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'update' ( (lv_entity_4_0= ruleEntityName ) ) otherlv_5= 'set' ( ( (lv_updateItem_6_0= ruleUpdateItem ) ) (otherlv_7= ',' ( (lv_updateItem_8_0= ruleUpdateItem ) ) )* ) (otherlv_9= 'where' ( (lv_condition_10_0= ruleCondition ) ) )? ) )
            // InternalNlToSql.g:498:2: ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'update' ( (lv_entity_4_0= ruleEntityName ) ) otherlv_5= 'set' ( ( (lv_updateItem_6_0= ruleUpdateItem ) ) (otherlv_7= ',' ( (lv_updateItem_8_0= ruleUpdateItem ) ) )* ) (otherlv_9= 'where' ( (lv_condition_10_0= ruleCondition ) ) )? )
            {
            // InternalNlToSql.g:498:2: ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'update' ( (lv_entity_4_0= ruleEntityName ) ) otherlv_5= 'set' ( ( (lv_updateItem_6_0= ruleUpdateItem ) ) (otherlv_7= ',' ( (lv_updateItem_8_0= ruleUpdateItem ) ) )* ) (otherlv_9= 'where' ( (lv_condition_10_0= ruleCondition ) ) )? )
            // InternalNlToSql.g:499:3: (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'update' ( (lv_entity_4_0= ruleEntityName ) ) otherlv_5= 'set' ( ( (lv_updateItem_6_0= ruleUpdateItem ) ) (otherlv_7= ',' ( (lv_updateItem_8_0= ruleUpdateItem ) ) )* ) (otherlv_9= 'where' ( (lv_condition_10_0= ruleCondition ) ) )?
            {
            // InternalNlToSql.g:499:3: (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalNlToSql.g:500:4: otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getCanKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getYouKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getUpdateStatementAccess().getPleaseKeyword_0_2());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_1());
            		
            // InternalNlToSql.g:517:3: ( (lv_entity_4_0= ruleEntityName ) )
            // InternalNlToSql.g:518:4: (lv_entity_4_0= ruleEntityName )
            {
            // InternalNlToSql.g:518:4: (lv_entity_4_0= ruleEntityName )
            // InternalNlToSql.g:519:5: lv_entity_4_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getUpdateStatementAccess().getEntityEntityNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_entity_4_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_4_0,
            						"uk.ac.kcl.inf.NlToSql.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdateStatementAccess().getSetKeyword_3());
            		
            // InternalNlToSql.g:540:3: ( ( (lv_updateItem_6_0= ruleUpdateItem ) ) (otherlv_7= ',' ( (lv_updateItem_8_0= ruleUpdateItem ) ) )* )
            // InternalNlToSql.g:541:4: ( (lv_updateItem_6_0= ruleUpdateItem ) ) (otherlv_7= ',' ( (lv_updateItem_8_0= ruleUpdateItem ) ) )*
            {
            // InternalNlToSql.g:541:4: ( (lv_updateItem_6_0= ruleUpdateItem ) )
            // InternalNlToSql.g:542:5: (lv_updateItem_6_0= ruleUpdateItem )
            {
            // InternalNlToSql.g:542:5: (lv_updateItem_6_0= ruleUpdateItem )
            // InternalNlToSql.g:543:6: lv_updateItem_6_0= ruleUpdateItem
            {

            						newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateItemUpdateItemParserRuleCall_4_0_0());
            					
            pushFollow(FOLLOW_23);
            lv_updateItem_6_0=ruleUpdateItem();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            						}
            						add(
            							current,
            							"updateItem",
            							lv_updateItem_6_0,
            							"uk.ac.kcl.inf.NlToSql.UpdateItem");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalNlToSql.g:560:4: (otherlv_7= ',' ( (lv_updateItem_8_0= ruleUpdateItem ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalNlToSql.g:561:5: otherlv_7= ',' ( (lv_updateItem_8_0= ruleUpdateItem ) )
            	    {
            	    otherlv_7=(Token)match(input,21,FOLLOW_10); 

            	    					newLeafNode(otherlv_7, grammarAccess.getUpdateStatementAccess().getCommaKeyword_4_1_0());
            	    				
            	    // InternalNlToSql.g:565:5: ( (lv_updateItem_8_0= ruleUpdateItem ) )
            	    // InternalNlToSql.g:566:6: (lv_updateItem_8_0= ruleUpdateItem )
            	    {
            	    // InternalNlToSql.g:566:6: (lv_updateItem_8_0= ruleUpdateItem )
            	    // InternalNlToSql.g:567:7: lv_updateItem_8_0= ruleUpdateItem
            	    {

            	    							newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdateItemUpdateItemParserRuleCall_4_1_1_0());
            	    						
            	    pushFollow(FOLLOW_23);
            	    lv_updateItem_8_0=ruleUpdateItem();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            	    							}
            	    							add(
            	    								current,
            	    								"updateItem",
            	    								lv_updateItem_8_0,
            	    								"uk.ac.kcl.inf.NlToSql.UpdateItem");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            // InternalNlToSql.g:586:3: (otherlv_9= 'where' ( (lv_condition_10_0= ruleCondition ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNlToSql.g:587:4: otherlv_9= 'where' ( (lv_condition_10_0= ruleCondition ) )
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getUpdateStatementAccess().getWhereKeyword_5_0());
                    			
                    // InternalNlToSql.g:591:4: ( (lv_condition_10_0= ruleCondition ) )
                    // InternalNlToSql.g:592:5: (lv_condition_10_0= ruleCondition )
                    {
                    // InternalNlToSql.g:592:5: (lv_condition_10_0= ruleCondition )
                    // InternalNlToSql.g:593:6: lv_condition_10_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getUpdateStatementAccess().getConditionConditionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_10_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_10_0,
                    							"uk.ac.kcl.inf.NlToSql.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleUpdateStatement"


    // $ANTLR start "entryRuleDeleteStatement"
    // InternalNlToSql.g:615:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // InternalNlToSql.g:615:56: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // InternalNlToSql.g:616:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
            {
             newCompositeNode(grammarAccess.getDeleteStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteStatement=ruleDeleteStatement();

            state._fsp--;

             current =iv_ruleDeleteStatement; 
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
    // $ANTLR end "entryRuleDeleteStatement"


    // $ANTLR start "ruleDeleteStatement"
    // InternalNlToSql.g:622:1: ruleDeleteStatement returns [EObject current=null] : ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'delete' otherlv_4= 'from' ( (lv_entity_5_0= ruleEntityName ) ) (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )? ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_entity_5_0 = null;

        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:628:2: ( ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'delete' otherlv_4= 'from' ( (lv_entity_5_0= ruleEntityName ) ) (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )? ) )
            // InternalNlToSql.g:629:2: ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'delete' otherlv_4= 'from' ( (lv_entity_5_0= ruleEntityName ) ) (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )? )
            {
            // InternalNlToSql.g:629:2: ( (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'delete' otherlv_4= 'from' ( (lv_entity_5_0= ruleEntityName ) ) (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )? )
            // InternalNlToSql.g:630:3: (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )? otherlv_3= 'delete' otherlv_4= 'from' ( (lv_entity_5_0= ruleEntityName ) ) (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )?
            {
            // InternalNlToSql.g:630:3: (otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNlToSql.g:631:4: otherlv_0= 'can' otherlv_1= 'you' otherlv_2= 'please'
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getCanKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getYouKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getPleaseKeyword_0_2());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_1());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getDeleteStatementAccess().getFromKeyword_2());
            		
            // InternalNlToSql.g:652:3: ( (lv_entity_5_0= ruleEntityName ) )
            // InternalNlToSql.g:653:4: (lv_entity_5_0= ruleEntityName )
            {
            // InternalNlToSql.g:653:4: (lv_entity_5_0= ruleEntityName )
            // InternalNlToSql.g:654:5: lv_entity_5_0= ruleEntityName
            {

            					newCompositeNode(grammarAccess.getDeleteStatementAccess().getEntityEntityNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_entity_5_0=ruleEntityName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteStatementRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_5_0,
            						"uk.ac.kcl.inf.NlToSql.EntityName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:671:3: (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNlToSql.g:672:4: otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) )
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeleteStatementAccess().getWhereKeyword_4_0());
                    			
                    // InternalNlToSql.g:676:4: ( (lv_condition_7_0= ruleCondition ) )
                    // InternalNlToSql.g:677:5: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalNlToSql.g:677:5: (lv_condition_7_0= ruleCondition )
                    // InternalNlToSql.g:678:6: lv_condition_7_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getDeleteStatementAccess().getConditionConditionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_7_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeleteStatementRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_7_0,
                    							"uk.ac.kcl.inf.NlToSql.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleDeleteStatement"


    // $ANTLR start "entryRuleSelectList"
    // InternalNlToSql.g:700:1: entryRuleSelectList returns [EObject current=null] : iv_ruleSelectList= ruleSelectList EOF ;
    public final EObject entryRuleSelectList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectList = null;


        try {
            // InternalNlToSql.g:700:51: (iv_ruleSelectList= ruleSelectList EOF )
            // InternalNlToSql.g:701:2: iv_ruleSelectList= ruleSelectList EOF
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
    // InternalNlToSql.g:707:1: ruleSelectList returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_selectItem_2_0= rulePropertyReference ) ) (otherlv_3= ',' ( (lv_selectItem_4_0= rulePropertyReference ) ) )* ) ;
    public final EObject ruleSelectList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_selectItem_2_0 = null;

        EObject lv_selectItem_4_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:713:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_selectItem_2_0= rulePropertyReference ) ) (otherlv_3= ',' ( (lv_selectItem_4_0= rulePropertyReference ) ) )* ) )
            // InternalNlToSql.g:714:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_selectItem_2_0= rulePropertyReference ) ) (otherlv_3= ',' ( (lv_selectItem_4_0= rulePropertyReference ) ) )* )
            {
            // InternalNlToSql.g:714:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_selectItem_2_0= rulePropertyReference ) ) (otherlv_3= ',' ( (lv_selectItem_4_0= rulePropertyReference ) ) )* )
            // InternalNlToSql.g:715:3: (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_selectItem_2_0= rulePropertyReference ) ) (otherlv_3= ',' ( (lv_selectItem_4_0= rulePropertyReference ) ) )*
            {
            // InternalNlToSql.g:715:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalNlToSql.g:716:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_0, grammarAccess.getSelectListAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:721:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getSelectListAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:726:3: ( (lv_selectItem_2_0= rulePropertyReference ) )
            // InternalNlToSql.g:727:4: (lv_selectItem_2_0= rulePropertyReference )
            {
            // InternalNlToSql.g:727:4: (lv_selectItem_2_0= rulePropertyReference )
            // InternalNlToSql.g:728:5: lv_selectItem_2_0= rulePropertyReference
            {

            					newCompositeNode(grammarAccess.getSelectListAccess().getSelectItemPropertyReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_selectItem_2_0=rulePropertyReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectListRule());
            					}
            					add(
            						current,
            						"selectItem",
            						lv_selectItem_2_0,
            						"uk.ac.kcl.inf.NlToSql.PropertyReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:745:3: (otherlv_3= ',' ( (lv_selectItem_4_0= rulePropertyReference ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalNlToSql.g:746:4: otherlv_3= ',' ( (lv_selectItem_4_0= rulePropertyReference ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSelectListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalNlToSql.g:750:4: ( (lv_selectItem_4_0= rulePropertyReference ) )
            	    // InternalNlToSql.g:751:5: (lv_selectItem_4_0= rulePropertyReference )
            	    {
            	    // InternalNlToSql.g:751:5: (lv_selectItem_4_0= rulePropertyReference )
            	    // InternalNlToSql.g:752:6: lv_selectItem_4_0= rulePropertyReference
            	    {

            	    						newCompositeNode(grammarAccess.getSelectListAccess().getSelectItemPropertyReferenceParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_selectItem_4_0=rulePropertyReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"selectItem",
            	    							lv_selectItem_4_0,
            	    							"uk.ac.kcl.inf.NlToSql.PropertyReference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalNlToSql.g:774:1: entryRulePropertyReference returns [EObject current=null] : iv_rulePropertyReference= rulePropertyReference EOF ;
    public final EObject entryRulePropertyReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyReference = null;


        try {
            // InternalNlToSql.g:774:58: (iv_rulePropertyReference= rulePropertyReference EOF )
            // InternalNlToSql.g:775:2: iv_rulePropertyReference= rulePropertyReference EOF
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
    // InternalNlToSql.g:781:1: rulePropertyReference returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePropertyReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalNlToSql.g:787:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalNlToSql.g:788:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalNlToSql.g:788:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) )
            // InternalNlToSql.g:789:3: (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalNlToSql.g:789:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( (LA18_0==31) ) {
                alt18=2;
            }
            switch (alt18) {
                case 1 :
                    // InternalNlToSql.g:790:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:795:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getPropertyReferenceAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:800:3: ( (otherlv_2= RULE_ID ) )
            // InternalNlToSql.g:801:4: (otherlv_2= RULE_ID )
            {
            // InternalNlToSql.g:801:4: (otherlv_2= RULE_ID )
            // InternalNlToSql.g:802:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyReferenceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getPropertyReferenceAccess().getPropertyPropertyCrossReference_1_0());
            				

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
    // $ANTLR end "rulePropertyReference"


    // $ANTLR start "entryRuleEntityName"
    // InternalNlToSql.g:817:1: entryRuleEntityName returns [EObject current=null] : iv_ruleEntityName= ruleEntityName EOF ;
    public final EObject entryRuleEntityName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityName = null;


        try {
            // InternalNlToSql.g:817:51: (iv_ruleEntityName= ruleEntityName EOF )
            // InternalNlToSql.g:818:2: iv_ruleEntityName= ruleEntityName EOF
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
    // InternalNlToSql.g:824:1: ruleEntityName returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleEntityName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalNlToSql.g:830:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalNlToSql.g:831:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalNlToSql.g:831:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalNlToSql.g:832:3: (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalNlToSql.g:832:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            else if ( (LA19_0==31) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalNlToSql.g:833:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntityNameAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:838:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityNameAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:843:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalNlToSql.g:844:4: (lv_name_2_0= RULE_ID )
            {
            // InternalNlToSql.g:844:4: (lv_name_2_0= RULE_ID )
            // InternalNlToSql.g:845:5: lv_name_2_0= RULE_ID
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


    // $ANTLR start "entryRulePropertyName"
    // InternalNlToSql.g:865:1: entryRulePropertyName returns [EObject current=null] : iv_rulePropertyName= rulePropertyName EOF ;
    public final EObject entryRulePropertyName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyName = null;


        try {
            // InternalNlToSql.g:865:53: (iv_rulePropertyName= rulePropertyName EOF )
            // InternalNlToSql.g:866:2: iv_rulePropertyName= rulePropertyName EOF
            {
             newCompositeNode(grammarAccess.getPropertyNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyName=rulePropertyName();

            state._fsp--;

             current =iv_rulePropertyName; 
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
    // $ANTLR end "entryRulePropertyName"


    // $ANTLR start "rulePropertyName"
    // InternalNlToSql.g:872:1: rulePropertyName returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulePropertyName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalNlToSql.g:878:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalNlToSql.g:879:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalNlToSql.g:879:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) ) )
            // InternalNlToSql.g:880:3: (otherlv_0= 'the' | otherlv_1= 'a' )? ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalNlToSql.g:880:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // InternalNlToSql.g:881:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getPropertyNameAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:886:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getPropertyNameAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:891:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalNlToSql.g:892:4: (lv_name_2_0= RULE_ID )
            {
            // InternalNlToSql.g:892:4: (lv_name_2_0= RULE_ID )
            // InternalNlToSql.g:893:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPropertyNameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyNameRule());
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
    // $ANTLR end "rulePropertyName"


    // $ANTLR start "entryRuleValue"
    // InternalNlToSql.g:913:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalNlToSql.g:913:45: (iv_ruleValue= ruleValue EOF )
            // InternalNlToSql.g:914:2: iv_ruleValue= ruleValue EOF
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
    // InternalNlToSql.g:920:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalNlToSql.g:926:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalNlToSql.g:927:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalNlToSql.g:927:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalNlToSql.g:928:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:936:3: this_STRING_1= RULE_STRING
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


    // $ANTLR start "entryRuleUpdateItem"
    // InternalNlToSql.g:947:1: entryRuleUpdateItem returns [EObject current=null] : iv_ruleUpdateItem= ruleUpdateItem EOF ;
    public final EObject entryRuleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateItem = null;


        try {
            // InternalNlToSql.g:947:51: (iv_ruleUpdateItem= ruleUpdateItem EOF )
            // InternalNlToSql.g:948:2: iv_ruleUpdateItem= ruleUpdateItem EOF
            {
             newCompositeNode(grammarAccess.getUpdateItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdateItem=ruleUpdateItem();

            state._fsp--;

             current =iv_ruleUpdateItem; 
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
    // $ANTLR end "entryRuleUpdateItem"


    // $ANTLR start "ruleUpdateItem"
    // InternalNlToSql.g:954:1: ruleUpdateItem returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:960:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) ) )
            // InternalNlToSql.g:961:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )
            {
            // InternalNlToSql.g:961:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) ) )
            // InternalNlToSql.g:962:3: (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleValue ) )
            {
            // InternalNlToSql.g:962:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            else if ( (LA22_0==31) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // InternalNlToSql.g:963:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getUpdateItemAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:968:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getUpdateItemAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:973:3: ( (otherlv_2= RULE_ID ) )
            // InternalNlToSql.g:974:4: (otherlv_2= RULE_ID )
            {
            // InternalNlToSql.g:974:4: (otherlv_2= RULE_ID )
            // InternalNlToSql.g:975:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdateItemRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_2, grammarAccess.getUpdateItemAccess().getPropertyPropertyCrossReference_1_0());
            				

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_2());
            		
            // InternalNlToSql.g:990:3: ( (lv_value_4_0= ruleValue ) )
            // InternalNlToSql.g:991:4: (lv_value_4_0= ruleValue )
            {
            // InternalNlToSql.g:991:4: (lv_value_4_0= ruleValue )
            // InternalNlToSql.g:992:5: lv_value_4_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateItemRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
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
    // $ANTLR end "ruleUpdateItem"


    // $ANTLR start "entryRuleCondition"
    // InternalNlToSql.g:1013:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalNlToSql.g:1013:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalNlToSql.g:1014:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalNlToSql.g:1020:1: ruleCondition returns [EObject current=null] : ( ( (lv_expression_0_0= ruleComparison ) ) ( ( (lv_logicOperator_1_0= ruleLogicOperator ) ) ( (lv_expression_2_0= ruleComparison ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        AntlrDatatypeRuleToken lv_logicOperator_1_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:1026:2: ( ( ( (lv_expression_0_0= ruleComparison ) ) ( ( (lv_logicOperator_1_0= ruleLogicOperator ) ) ( (lv_expression_2_0= ruleComparison ) ) )* ) )
            // InternalNlToSql.g:1027:2: ( ( (lv_expression_0_0= ruleComparison ) ) ( ( (lv_logicOperator_1_0= ruleLogicOperator ) ) ( (lv_expression_2_0= ruleComparison ) ) )* )
            {
            // InternalNlToSql.g:1027:2: ( ( (lv_expression_0_0= ruleComparison ) ) ( ( (lv_logicOperator_1_0= ruleLogicOperator ) ) ( (lv_expression_2_0= ruleComparison ) ) )* )
            // InternalNlToSql.g:1028:3: ( (lv_expression_0_0= ruleComparison ) ) ( ( (lv_logicOperator_1_0= ruleLogicOperator ) ) ( (lv_expression_2_0= ruleComparison ) ) )*
            {
            // InternalNlToSql.g:1028:3: ( (lv_expression_0_0= ruleComparison ) )
            // InternalNlToSql.g:1029:4: (lv_expression_0_0= ruleComparison )
            {
            // InternalNlToSql.g:1029:4: (lv_expression_0_0= ruleComparison )
            // InternalNlToSql.g:1030:5: lv_expression_0_0= ruleComparison
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getExpressionComparisonParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_expression_0_0=ruleComparison();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_0_0,
            						"uk.ac.kcl.inf.NlToSql.Comparison");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:1047:3: ( ( (lv_logicOperator_1_0= ruleLogicOperator ) ) ( (lv_expression_2_0= ruleComparison ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=33 && LA23_0<=34)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalNlToSql.g:1048:4: ( (lv_logicOperator_1_0= ruleLogicOperator ) ) ( (lv_expression_2_0= ruleComparison ) )
            	    {
            	    // InternalNlToSql.g:1048:4: ( (lv_logicOperator_1_0= ruleLogicOperator ) )
            	    // InternalNlToSql.g:1049:5: (lv_logicOperator_1_0= ruleLogicOperator )
            	    {
            	    // InternalNlToSql.g:1049:5: (lv_logicOperator_1_0= ruleLogicOperator )
            	    // InternalNlToSql.g:1050:6: lv_logicOperator_1_0= ruleLogicOperator
            	    {

            	    						newCompositeNode(grammarAccess.getConditionAccess().getLogicOperatorLogicOperatorParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_logicOperator_1_0=ruleLogicOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"logicOperator",
            	    							lv_logicOperator_1_0,
            	    							"uk.ac.kcl.inf.NlToSql.LogicOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalNlToSql.g:1067:4: ( (lv_expression_2_0= ruleComparison ) )
            	    // InternalNlToSql.g:1068:5: (lv_expression_2_0= ruleComparison )
            	    {
            	    // InternalNlToSql.g:1068:5: (lv_expression_2_0= ruleComparison )
            	    // InternalNlToSql.g:1069:6: lv_expression_2_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getConditionAccess().getExpressionComparisonParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_expression_2_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"expression",
            	    							lv_expression_2_0,
            	    							"uk.ac.kcl.inf.NlToSql.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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


    // $ANTLR start "entryRuleComparison"
    // InternalNlToSql.g:1091:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalNlToSql.g:1091:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalNlToSql.g:1092:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalNlToSql.g:1098:1: ruleComparison returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv_rightHandSide_4_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:1104:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) ) )
            // InternalNlToSql.g:1105:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) )
            {
            // InternalNlToSql.g:1105:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) )
            // InternalNlToSql.g:1106:3: (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) )
            {
            // InternalNlToSql.g:1106:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            else if ( (LA24_0==31) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // InternalNlToSql.g:1107:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getComparisonAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1112:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:1117:3: ( (otherlv_2= RULE_ID ) )
            // InternalNlToSql.g:1118:4: (otherlv_2= RULE_ID )
            {
            // InternalNlToSql.g:1118:4: (otherlv_2= RULE_ID )
            // InternalNlToSql.g:1119:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLeftHandSidePropertyCrossReference_1_0());
            				

            }


            }

            // InternalNlToSql.g:1130:3: ( (lv_operator_3_0= ruleComparisonOperator ) )
            // InternalNlToSql.g:1131:4: (lv_operator_3_0= ruleComparisonOperator )
            {
            // InternalNlToSql.g:1131:4: (lv_operator_3_0= ruleComparisonOperator )
            // InternalNlToSql.g:1132:5: lv_operator_3_0= ruleComparisonOperator
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalNlToSql.g:1149:3: ( (lv_rightHandSide_4_0= ruleValue ) )
            // InternalNlToSql.g:1150:4: (lv_rightHandSide_4_0= ruleValue )
            {
            // InternalNlToSql.g:1150:4: (lv_rightHandSide_4_0= ruleValue )
            // InternalNlToSql.g:1151:5: lv_rightHandSide_4_0= ruleValue
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


    // $ANTLR start "entryRuleLogicOperator"
    // InternalNlToSql.g:1172:1: entryRuleLogicOperator returns [String current=null] : iv_ruleLogicOperator= ruleLogicOperator EOF ;
    public final String entryRuleLogicOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicOperator = null;


        try {
            // InternalNlToSql.g:1172:53: (iv_ruleLogicOperator= ruleLogicOperator EOF )
            // InternalNlToSql.g:1173:2: iv_ruleLogicOperator= ruleLogicOperator EOF
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
    // InternalNlToSql.g:1179:1: ruleLogicOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleLogicOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1185:2: ( (kw= 'and' | kw= 'or' ) )
            // InternalNlToSql.g:1186:2: (kw= 'and' | kw= 'or' )
            {
            // InternalNlToSql.g:1186:2: (kw= 'and' | kw= 'or' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            else if ( (LA25_0==34) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalNlToSql.g:1187:3: kw= 'and'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogicOperatorAccess().getAndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1193:3: kw= 'or'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

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


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalNlToSql.g:1202:1: entryRuleComparisonOperator returns [String current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final String entryRuleComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperator = null;


        try {
            // InternalNlToSql.g:1202:58: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalNlToSql.g:1203:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
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
    // InternalNlToSql.g:1209:1: ruleComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1215:2: ( (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) ) )
            // InternalNlToSql.g:1216:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )
            {
            // InternalNlToSql.g:1216:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )
            int alt26=7;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalNlToSql.g:1217:3: kw= '='
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1223:3: (kw= 'is' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1223:3: (kw= 'is' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1224:4: kw= 'is' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,35,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getIsKeyword_1_0());
                    			
                    kw=(Token)match(input,36,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_1_1());
                    			
                    kw=(Token)match(input,37,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:1241:3: (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1241:3: (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1242:4: kw= 'is' kw= 'not' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,35,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getIsKeyword_2_0());
                    			
                    kw=(Token)match(input,38,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getNotKeyword_2_1());
                    			
                    kw=(Token)match(input,36,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_2_2());
                    			
                    kw=(Token)match(input,37,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalNlToSql.g:1264:3: (kw= 'less' kw= 'than' )
                    {
                    // InternalNlToSql.g:1264:3: (kw= 'less' kw= 'than' )
                    // InternalNlToSql.g:1265:4: kw= 'less' kw= 'than'
                    {
                    kw=(Token)match(input,39,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessKeyword_3_0());
                    			
                    kw=(Token)match(input,40,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalNlToSql.g:1277:3: (kw= 'greater' kw= 'than' )
                    {
                    // InternalNlToSql.g:1277:3: (kw= 'greater' kw= 'than' )
                    // InternalNlToSql.g:1278:4: kw= 'greater' kw= 'than'
                    {
                    kw=(Token)match(input,41,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_4_0());
                    			
                    kw=(Token)match(input,40,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalNlToSql.g:1290:3: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1290:3: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1291:4: kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,39,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessKeyword_5_0());
                    			
                    kw=(Token)match(input,40,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_5_1());
                    			
                    kw=(Token)match(input,34,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getOrKeyword_5_2());
                    			
                    kw=(Token)match(input,36,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_5_3());
                    			
                    kw=(Token)match(input,37,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_5_4());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalNlToSql.g:1318:3: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1318:3: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1319:4: kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,41,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_6_0());
                    			
                    kw=(Token)match(input,40,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_6_1());
                    			
                    kw=(Token)match(input,34,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getOrKeyword_6_2());
                    			
                    kw=(Token)match(input,36,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_6_3());
                    			
                    kw=(Token)match(input,37,FOLLOW_2); 

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

    // Delegated rules


    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\7\uffff\1\11\1\13\4\uffff";
    static final String dfa_3s = "\1\40\1\uffff\1\44\2\50\2\uffff\2\5\4\uffff";
    static final String dfa_4s = "\1\51\1\uffff\1\46\2\50\2\uffff\2\42\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\3\1\2\2\uffff\1\4\1\6\1\5\1\7";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\1\2\3\uffff\1\3\1\uffff\1\4",
            "",
            "\1\6\1\uffff\1\5",
            "\1\7",
            "\1\10",
            "",
            "",
            "\2\11\33\uffff\1\12",
            "\2\13\33\uffff\1\14",
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

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1216:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000028409002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000C0010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000028900000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});

}