package uk.ac.kcl.inf.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'Create'", "'table'", "'called'", "'with'", "'columns'", "','", "'of'", "'type'", "'From'", "'the'", "'show'", "'columns:'", "'all'", "'where'", "'group'", "'by'", "'Insert'", "'into'", "'for'", "'insert'", "'values'", "'('", "')'", "'Update'", "'to'", "'set'", "'Delete'", "'Empty'", "'records'", "'from'", "'='", "'in'", "'a'", "'is'", "'equal'", "'not'", "'less'", "'than'", "'greater'", "'or'", "'<='", "'>='", "'>'", "'<'", "'integer'", "'string'", "'date'", "'and'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalNlToSql.g:65:1: entryRuleAccountingSpeech returns [EObject current=null] : iv_ruleAccountingSpeech= ruleAccountingSpeech EOF ;
    public final EObject entryRuleAccountingSpeech() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccountingSpeech = null;


        try {
            // InternalNlToSql.g:65:57: (iv_ruleAccountingSpeech= ruleAccountingSpeech EOF )
            // InternalNlToSql.g:66:2: iv_ruleAccountingSpeech= ruleAccountingSpeech EOF
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
    // InternalNlToSql.g:72:1: ruleAccountingSpeech returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleAccountingSpeech() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalNlToSql.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalNlToSql.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==20||LA1_0==28||LA1_0==35||(LA1_0>=38 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNlToSql.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalNlToSql.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalNlToSql.g:81:4: lv_statements_0_0= ruleStatement
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
    // InternalNlToSql.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalNlToSql.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalNlToSql.g:102:2: iv_ruleStatement= ruleStatement EOF
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
    // InternalNlToSql.g:108:1: ruleStatement returns [EObject current=null] : ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement | this_DeleteStatement_4= ruleDeleteStatement ) otherlv_5= '.' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject this_CreateTableStatement_0 = null;

        EObject this_SelectStatement_1 = null;

        EObject this_InsertStatement_2 = null;

        EObject this_UpdateStatement_3 = null;

        EObject this_DeleteStatement_4 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:114:2: ( ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement | this_DeleteStatement_4= ruleDeleteStatement ) otherlv_5= '.' ) )
            // InternalNlToSql.g:115:2: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement | this_DeleteStatement_4= ruleDeleteStatement ) otherlv_5= '.' )
            {
            // InternalNlToSql.g:115:2: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement | this_DeleteStatement_4= ruleDeleteStatement ) otherlv_5= '.' )
            // InternalNlToSql.g:116:3: (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement | this_DeleteStatement_4= ruleDeleteStatement ) otherlv_5= '.'
            {
            // InternalNlToSql.g:116:3: (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement | this_DeleteStatement_4= ruleDeleteStatement )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            case 38:
            case 39:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalNlToSql.g:117:4: this_CreateTableStatement_0= ruleCreateTableStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getCreateTableStatementParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_CreateTableStatement_0=ruleCreateTableStatement();

                    state._fsp--;


                    				current = this_CreateTableStatement_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:126:4: this_SelectStatement_1= ruleSelectStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_SelectStatement_1=ruleSelectStatement();

                    state._fsp--;


                    				current = this_SelectStatement_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:135:4: this_InsertStatement_2= ruleInsertStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getInsertStatementParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_4);
                    this_InsertStatement_2=ruleInsertStatement();

                    state._fsp--;


                    				current = this_InsertStatement_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalNlToSql.g:144:4: this_UpdateStatement_3= ruleUpdateStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_4);
                    this_UpdateStatement_3=ruleUpdateStatement();

                    state._fsp--;


                    				current = this_UpdateStatement_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalNlToSql.g:153:4: this_DeleteStatement_4= ruleDeleteStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getDeleteStatementParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_4);
                    this_DeleteStatement_4=ruleDeleteStatement();

                    state._fsp--;


                    				current = this_DeleteStatement_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStatementAccess().getFullStopKeyword_1());
            		

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


    // $ANTLR start "entryRuleCreateTableStatement"
    // InternalNlToSql.g:170:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // InternalNlToSql.g:170:61: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // InternalNlToSql.g:171:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
            {
             newCompositeNode(grammarAccess.getCreateTableStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateTableStatement=ruleCreateTableStatement();

            state._fsp--;

             current =iv_ruleCreateTableStatement; 
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
    // $ANTLR end "entryRuleCreateTableStatement"


    // $ANTLR start "ruleCreateTableStatement"
    // InternalNlToSql.g:177:1: ruleCreateTableStatement returns [EObject current=null] : (otherlv_0= 'Create' otherlv_1= 'table' otherlv_2= 'called' ( (lv_table_3_0= ruleTable ) ) (otherlv_4= 'with' otherlv_5= 'columns' ( (lv_columns_6_0= ruleColumnList ) ) )? ) ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_table_3_0 = null;

        EObject lv_columns_6_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:183:2: ( (otherlv_0= 'Create' otherlv_1= 'table' otherlv_2= 'called' ( (lv_table_3_0= ruleTable ) ) (otherlv_4= 'with' otherlv_5= 'columns' ( (lv_columns_6_0= ruleColumnList ) ) )? ) )
            // InternalNlToSql.g:184:2: (otherlv_0= 'Create' otherlv_1= 'table' otherlv_2= 'called' ( (lv_table_3_0= ruleTable ) ) (otherlv_4= 'with' otherlv_5= 'columns' ( (lv_columns_6_0= ruleColumnList ) ) )? )
            {
            // InternalNlToSql.g:184:2: (otherlv_0= 'Create' otherlv_1= 'table' otherlv_2= 'called' ( (lv_table_3_0= ruleTable ) ) (otherlv_4= 'with' otherlv_5= 'columns' ( (lv_columns_6_0= ruleColumnList ) ) )? )
            // InternalNlToSql.g:185:3: otherlv_0= 'Create' otherlv_1= 'table' otherlv_2= 'called' ( (lv_table_3_0= ruleTable ) ) (otherlv_4= 'with' otherlv_5= 'columns' ( (lv_columns_6_0= ruleColumnList ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getTableKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateTableStatementAccess().getCalledKeyword_2());
            		
            // InternalNlToSql.g:197:3: ( (lv_table_3_0= ruleTable ) )
            // InternalNlToSql.g:198:4: (lv_table_3_0= ruleTable )
            {
            // InternalNlToSql.g:198:4: (lv_table_3_0= ruleTable )
            // InternalNlToSql.g:199:5: lv_table_3_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getCreateTableStatementAccess().getTableTableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_table_3_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_3_0,
            						"uk.ac.kcl.inf.NlToSql.Table");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:216:3: (otherlv_4= 'with' otherlv_5= 'columns' ( (lv_columns_6_0= ruleColumnList ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalNlToSql.g:217:4: otherlv_4= 'with' otherlv_5= 'columns' ( (lv_columns_6_0= ruleColumnList ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getCreateTableStatementAccess().getWithKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,16,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getCreateTableStatementAccess().getColumnsKeyword_4_1());
                    			
                    // InternalNlToSql.g:225:4: ( (lv_columns_6_0= ruleColumnList ) )
                    // InternalNlToSql.g:226:5: (lv_columns_6_0= ruleColumnList )
                    {
                    // InternalNlToSql.g:226:5: (lv_columns_6_0= ruleColumnList )
                    // InternalNlToSql.g:227:6: lv_columns_6_0= ruleColumnList
                    {

                    						newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnsColumnListParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_columns_6_0=ruleColumnList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
                    						}
                    						set(
                    							current,
                    							"columns",
                    							lv_columns_6_0,
                    							"uk.ac.kcl.inf.NlToSql.ColumnList");
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
    // $ANTLR end "ruleCreateTableStatement"


    // $ANTLR start "entryRuleColumnList"
    // InternalNlToSql.g:249:1: entryRuleColumnList returns [EObject current=null] : iv_ruleColumnList= ruleColumnList EOF ;
    public final EObject entryRuleColumnList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnList = null;


        try {
            // InternalNlToSql.g:249:51: (iv_ruleColumnList= ruleColumnList EOF )
            // InternalNlToSql.g:250:2: iv_ruleColumnList= ruleColumnList EOF
            {
             newCompositeNode(grammarAccess.getColumnListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnList=ruleColumnList();

            state._fsp--;

             current =iv_ruleColumnList; 
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
    // $ANTLR end "entryRuleColumnList"


    // $ANTLR start "ruleColumnList"
    // InternalNlToSql.g:256:1: ruleColumnList returns [EObject current=null] : ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* ) ;
    public final EObject ruleColumnList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_columnItem_0_0 = null;

        EObject lv_columnItem_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:262:2: ( ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* ) )
            // InternalNlToSql.g:263:2: ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* )
            {
            // InternalNlToSql.g:263:2: ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* )
            // InternalNlToSql.g:264:3: ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )*
            {
            // InternalNlToSql.g:264:3: ( (lv_columnItem_0_0= ruleColumn ) )
            // InternalNlToSql.g:265:4: (lv_columnItem_0_0= ruleColumn )
            {
            // InternalNlToSql.g:265:4: (lv_columnItem_0_0= ruleColumn )
            // InternalNlToSql.g:266:5: lv_columnItem_0_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getColumnListAccess().getColumnItemColumnParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_columnItem_0_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnListRule());
            					}
            					add(
            						current,
            						"columnItem",
            						lv_columnItem_0_0,
            						"uk.ac.kcl.inf.NlToSql.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:283:3: (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNlToSql.g:284:4: otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getColumnListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:288:4: ( (lv_columnItem_2_0= ruleColumn ) )
            	    // InternalNlToSql.g:289:5: (lv_columnItem_2_0= ruleColumn )
            	    {
            	    // InternalNlToSql.g:289:5: (lv_columnItem_2_0= ruleColumn )
            	    // InternalNlToSql.g:290:6: lv_columnItem_2_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getColumnListAccess().getColumnItemColumnParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_columnItem_2_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getColumnListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columnItem",
            	    							lv_columnItem_2_0,
            	    							"uk.ac.kcl.inf.NlToSql.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleColumnList"


    // $ANTLR start "entryRuleTable"
    // InternalNlToSql.g:312:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalNlToSql.g:312:46: (iv_ruleTable= ruleTable EOF )
            // InternalNlToSql.g:313:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalNlToSql.g:319:1: ruleTable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalNlToSql.g:325:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalNlToSql.g:326:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalNlToSql.g:326:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalNlToSql.g:327:3: (lv_name_0_0= RULE_ID )
            {
            // InternalNlToSql.g:327:3: (lv_name_0_0= RULE_ID )
            // InternalNlToSql.g:328:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalNlToSql.g:347:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalNlToSql.g:347:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalNlToSql.g:348:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalNlToSql.g:354:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:360:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) ) )
            // InternalNlToSql.g:361:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) )
            {
            // InternalNlToSql.g:361:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) )
            // InternalNlToSql.g:362:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) )
            {
            // InternalNlToSql.g:362:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNlToSql.g:363:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNlToSql.g:363:4: (lv_name_0_0= RULE_ID )
            // InternalNlToSql.g:364:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getOfKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getTypeKeyword_2());
            		
            // InternalNlToSql.g:388:3: ( (lv_type_3_0= ruleDatatype ) )
            // InternalNlToSql.g:389:4: (lv_type_3_0= ruleDatatype )
            {
            // InternalNlToSql.g:389:4: (lv_type_3_0= ruleDatatype )
            // InternalNlToSql.g:390:5: lv_type_3_0= ruleDatatype
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getTypeDatatypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleDatatype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"uk.ac.kcl.inf.NlToSql.Datatype");
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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalNlToSql.g:411:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalNlToSql.g:411:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalNlToSql.g:412:2: iv_ruleSelectStatement= ruleSelectStatement EOF
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
    // InternalNlToSql.g:418:1: ruleSelectStatement returns [EObject current=null] : (otherlv_0= 'From' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList otherlv_4= 'show' ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject this_SelectTablesList_3 = null;

        EObject lv_columns_7_0 = null;

        EObject lv_condition_11_0 = null;

        EObject lv_group_14_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:424:2: ( (otherlv_0= 'From' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList otherlv_4= 'show' ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )? ) )
            // InternalNlToSql.g:425:2: (otherlv_0= 'From' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList otherlv_4= 'show' ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )? )
            {
            // InternalNlToSql.g:425:2: (otherlv_0= 'From' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList otherlv_4= 'show' ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )? )
            // InternalNlToSql.g:426:3: otherlv_0= 'From' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList otherlv_4= 'show' ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getFromKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getTableKeyword_2());
            		

            			newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectTablesListParserRuleCall_3());
            		
            pushFollow(FOLLOW_15);
            this_SelectTablesList_3=ruleSelectTablesList();

            state._fsp--;


            			current = this_SelectTablesList_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectStatementAccess().getShowKeyword_4());
            		
            // InternalNlToSql.g:450:3: ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalNlToSql.g:451:4: (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) )
                    {
                    // InternalNlToSql.g:451:4: (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) )
                    // InternalNlToSql.g:452:5: otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_17); 

                    					newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getTheKeyword_5_0_0());
                    				
                    otherlv_6=(Token)match(input,23,FOLLOW_7); 

                    					newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getColumnsKeyword_5_0_1());
                    				
                    // InternalNlToSql.g:460:5: ( (lv_columns_7_0= ruleSelectColumnsList ) )
                    // InternalNlToSql.g:461:6: (lv_columns_7_0= ruleSelectColumnsList )
                    {
                    // InternalNlToSql.g:461:6: (lv_columns_7_0= ruleSelectColumnsList )
                    // InternalNlToSql.g:462:7: lv_columns_7_0= ruleSelectColumnsList
                    {

                    							newCompositeNode(grammarAccess.getSelectStatementAccess().getColumnsSelectColumnsListParserRuleCall_5_0_2_0());
                    						
                    pushFollow(FOLLOW_18);
                    lv_columns_7_0=ruleSelectColumnsList();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    							}
                    							set(
                    								current,
                    								"columns",
                    								lv_columns_7_0,
                    								"uk.ac.kcl.inf.NlToSql.SelectColumnsList");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:481:4: (otherlv_8= 'all' otherlv_9= 'columns' )
                    {
                    // InternalNlToSql.g:481:4: (otherlv_8= 'all' otherlv_9= 'columns' )
                    // InternalNlToSql.g:482:5: otherlv_8= 'all' otherlv_9= 'columns'
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_9); 

                    					newLeafNode(otherlv_8, grammarAccess.getSelectStatementAccess().getAllKeyword_5_1_0());
                    				
                    otherlv_9=(Token)match(input,16,FOLLOW_18); 

                    					newLeafNode(otherlv_9, grammarAccess.getSelectStatementAccess().getColumnsKeyword_5_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalNlToSql.g:492:3: (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalNlToSql.g:493:4: otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) )
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getSelectStatementAccess().getWhereKeyword_6_0());
                    			
                    // InternalNlToSql.g:497:4: ( (lv_condition_11_0= ruleCondition ) )
                    // InternalNlToSql.g:498:5: (lv_condition_11_0= ruleCondition )
                    {
                    // InternalNlToSql.g:498:5: (lv_condition_11_0= ruleCondition )
                    // InternalNlToSql.g:499:6: lv_condition_11_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getConditionConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

            // InternalNlToSql.g:517:3: (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNlToSql.g:518:4: otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) )
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getSelectStatementAccess().getGroupKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_7); 

                    				newLeafNode(otherlv_13, grammarAccess.getSelectStatementAccess().getByKeyword_7_1());
                    			
                    // InternalNlToSql.g:526:4: ( (lv_group_14_0= ruleSelectColumnsList ) )
                    // InternalNlToSql.g:527:5: (lv_group_14_0= ruleSelectColumnsList )
                    {
                    // InternalNlToSql.g:527:5: (lv_group_14_0= ruleSelectColumnsList )
                    // InternalNlToSql.g:528:6: lv_group_14_0= ruleSelectColumnsList
                    {

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupSelectColumnsListParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_group_14_0=ruleSelectColumnsList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    						}
                    						set(
                    							current,
                    							"group",
                    							lv_group_14_0,
                    							"uk.ac.kcl.inf.NlToSql.SelectColumnsList");
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
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleInsertStatement"
    // InternalNlToSql.g:550:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // InternalNlToSql.g:550:56: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // InternalNlToSql.g:551:2: iv_ruleInsertStatement= ruleInsertStatement EOF
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
    // InternalNlToSql.g:557:1: ruleInsertStatement returns [EObject current=null] : (otherlv_0= 'Insert' otherlv_1= 'into' otherlv_2= 'the' otherlv_3= 'table' this_SelectTable_4= ruleSelectTable otherlv_5= 'for' otherlv_6= 'the' otherlv_7= 'columns' ( (lv_columns_8_0= ruleSelectColumnsList ) ) otherlv_9= 'insert' otherlv_10= 'the' otherlv_11= 'values' otherlv_12= '(' ( (lv_values_13_0= ruleInserValues ) ) otherlv_14= ')' ) ;
    public final EObject ruleInsertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_SelectTable_4 = null;

        EObject lv_columns_8_0 = null;

        EObject lv_values_13_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:563:2: ( (otherlv_0= 'Insert' otherlv_1= 'into' otherlv_2= 'the' otherlv_3= 'table' this_SelectTable_4= ruleSelectTable otherlv_5= 'for' otherlv_6= 'the' otherlv_7= 'columns' ( (lv_columns_8_0= ruleSelectColumnsList ) ) otherlv_9= 'insert' otherlv_10= 'the' otherlv_11= 'values' otherlv_12= '(' ( (lv_values_13_0= ruleInserValues ) ) otherlv_14= ')' ) )
            // InternalNlToSql.g:564:2: (otherlv_0= 'Insert' otherlv_1= 'into' otherlv_2= 'the' otherlv_3= 'table' this_SelectTable_4= ruleSelectTable otherlv_5= 'for' otherlv_6= 'the' otherlv_7= 'columns' ( (lv_columns_8_0= ruleSelectColumnsList ) ) otherlv_9= 'insert' otherlv_10= 'the' otherlv_11= 'values' otherlv_12= '(' ( (lv_values_13_0= ruleInserValues ) ) otherlv_14= ')' )
            {
            // InternalNlToSql.g:564:2: (otherlv_0= 'Insert' otherlv_1= 'into' otherlv_2= 'the' otherlv_3= 'table' this_SelectTable_4= ruleSelectTable otherlv_5= 'for' otherlv_6= 'the' otherlv_7= 'columns' ( (lv_columns_8_0= ruleSelectColumnsList ) ) otherlv_9= 'insert' otherlv_10= 'the' otherlv_11= 'values' otherlv_12= '(' ( (lv_values_13_0= ruleInserValues ) ) otherlv_14= ')' )
            // InternalNlToSql.g:565:3: otherlv_0= 'Insert' otherlv_1= 'into' otherlv_2= 'the' otherlv_3= 'table' this_SelectTable_4= ruleSelectTable otherlv_5= 'for' otherlv_6= 'the' otherlv_7= 'columns' ( (lv_columns_8_0= ruleSelectColumnsList ) ) otherlv_9= 'insert' otherlv_10= 'the' otherlv_11= 'values' otherlv_12= '(' ( (lv_values_13_0= ruleInserValues ) ) otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInsertStatementAccess().getTheKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertStatementAccess().getTableKeyword_3());
            		

            			newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectTableParserRuleCall_4());
            		
            pushFollow(FOLLOW_23);
            this_SelectTable_4=ruleSelectTable();

            state._fsp--;


            			current = this_SelectTable_4;
            			afterParserOrEnumRuleCall();
            		
            otherlv_5=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getForKeyword_5());
            		
            otherlv_6=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getTheKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getInsertStatementAccess().getColumnsKeyword_7());
            		
            // InternalNlToSql.g:601:3: ( (lv_columns_8_0= ruleSelectColumnsList ) )
            // InternalNlToSql.g:602:4: (lv_columns_8_0= ruleSelectColumnsList )
            {
            // InternalNlToSql.g:602:4: (lv_columns_8_0= ruleSelectColumnsList )
            // InternalNlToSql.g:603:5: lv_columns_8_0= ruleSelectColumnsList
            {

            					newCompositeNode(grammarAccess.getInsertStatementAccess().getColumnsSelectColumnsListParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_24);
            lv_columns_8_0=ruleSelectColumnsList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            					}
            					set(
            						current,
            						"columns",
            						lv_columns_8_0,
            						"uk.ac.kcl.inf.NlToSql.SelectColumnsList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getInsertKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getTheKeyword_10());
            		
            otherlv_11=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getValuesKeyword_11());
            		
            otherlv_12=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_12, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_12());
            		
            // InternalNlToSql.g:636:3: ( (lv_values_13_0= ruleInserValues ) )
            // InternalNlToSql.g:637:4: (lv_values_13_0= ruleInserValues )
            {
            // InternalNlToSql.g:637:4: (lv_values_13_0= ruleInserValues )
            // InternalNlToSql.g:638:5: lv_values_13_0= ruleInserValues
            {

            					newCompositeNode(grammarAccess.getInsertStatementAccess().getValuesInserValuesParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_28);
            lv_values_13_0=ruleInserValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            					}
            					set(
            						current,
            						"values",
            						lv_values_13_0,
            						"uk.ac.kcl.inf.NlToSql.InserValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_14());
            		

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
    // InternalNlToSql.g:663:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // InternalNlToSql.g:663:56: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // InternalNlToSql.g:664:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
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
    // InternalNlToSql.g:670:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'Update' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable otherlv_4= 'to' otherlv_5= 'set' ( (lv_updates_6_0= ruleSelectUpdateList ) ) (otherlv_7= 'where' ( (lv_condition_8_0= ruleCondition ) ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_SelectTable_3 = null;

        EObject lv_updates_6_0 = null;

        EObject lv_condition_8_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:676:2: ( (otherlv_0= 'Update' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable otherlv_4= 'to' otherlv_5= 'set' ( (lv_updates_6_0= ruleSelectUpdateList ) ) (otherlv_7= 'where' ( (lv_condition_8_0= ruleCondition ) ) )? ) )
            // InternalNlToSql.g:677:2: (otherlv_0= 'Update' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable otherlv_4= 'to' otherlv_5= 'set' ( (lv_updates_6_0= ruleSelectUpdateList ) ) (otherlv_7= 'where' ( (lv_condition_8_0= ruleCondition ) ) )? )
            {
            // InternalNlToSql.g:677:2: (otherlv_0= 'Update' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable otherlv_4= 'to' otherlv_5= 'set' ( (lv_updates_6_0= ruleSelectUpdateList ) ) (otherlv_7= 'where' ( (lv_condition_8_0= ruleCondition ) ) )? )
            // InternalNlToSql.g:678:3: otherlv_0= 'Update' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable otherlv_4= 'to' otherlv_5= 'set' ( (lv_updates_6_0= ruleSelectUpdateList ) ) (otherlv_7= 'where' ( (lv_condition_8_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateStatementAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateStatementAccess().getTableKeyword_2());
            		

            			newCompositeNode(grammarAccess.getUpdateStatementAccess().getSelectTableParserRuleCall_3());
            		
            pushFollow(FOLLOW_29);
            this_SelectTable_3=ruleSelectTable();

            state._fsp--;


            			current = this_SelectTable_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,36,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getToKeyword_4());
            		
            otherlv_5=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getUpdateStatementAccess().getSetKeyword_5());
            		
            // InternalNlToSql.g:706:3: ( (lv_updates_6_0= ruleSelectUpdateList ) )
            // InternalNlToSql.g:707:4: (lv_updates_6_0= ruleSelectUpdateList )
            {
            // InternalNlToSql.g:707:4: (lv_updates_6_0= ruleSelectUpdateList )
            // InternalNlToSql.g:708:5: lv_updates_6_0= ruleSelectUpdateList
            {

            					newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdatesSelectUpdateListParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_31);
            lv_updates_6_0=ruleSelectUpdateList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            					}
            					set(
            						current,
            						"updates",
            						lv_updates_6_0,
            						"uk.ac.kcl.inf.NlToSql.SelectUpdateList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:725:3: (otherlv_7= 'where' ( (lv_condition_8_0= ruleCondition ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNlToSql.g:726:4: otherlv_7= 'where' ( (lv_condition_8_0= ruleCondition ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getUpdateStatementAccess().getWhereKeyword_7_0());
                    			
                    // InternalNlToSql.g:730:4: ( (lv_condition_8_0= ruleCondition ) )
                    // InternalNlToSql.g:731:5: (lv_condition_8_0= ruleCondition )
                    {
                    // InternalNlToSql.g:731:5: (lv_condition_8_0= ruleCondition )
                    // InternalNlToSql.g:732:6: lv_condition_8_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getUpdateStatementAccess().getConditionConditionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_8_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_8_0,
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
    // InternalNlToSql.g:754:1: entryRuleDeleteStatement returns [EObject current=null] : iv_ruleDeleteStatement= ruleDeleteStatement EOF ;
    public final EObject entryRuleDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteStatement = null;


        try {
            // InternalNlToSql.g:754:56: (iv_ruleDeleteStatement= ruleDeleteStatement EOF )
            // InternalNlToSql.g:755:2: iv_ruleDeleteStatement= ruleDeleteStatement EOF
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
    // InternalNlToSql.g:761:1: ruleDeleteStatement returns [EObject current=null] : ( (otherlv_0= 'Delete' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable ) | (otherlv_4= 'Empty' otherlv_5= 'the' otherlv_6= 'table' this_SelectTable_7= ruleSelectTable ) | (otherlv_8= 'Delete' otherlv_9= 'records' otherlv_10= 'from' otherlv_11= 'the' otherlv_12= 'table' this_SelectTable_13= ruleSelectTable otherlv_14= 'where' ( (lv_condition_15_0= ruleCondition ) ) ) ) ;
    public final EObject ruleDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_SelectTable_3 = null;

        EObject this_SelectTable_7 = null;

        EObject this_SelectTable_13 = null;

        EObject lv_condition_15_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:767:2: ( ( (otherlv_0= 'Delete' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable ) | (otherlv_4= 'Empty' otherlv_5= 'the' otherlv_6= 'table' this_SelectTable_7= ruleSelectTable ) | (otherlv_8= 'Delete' otherlv_9= 'records' otherlv_10= 'from' otherlv_11= 'the' otherlv_12= 'table' this_SelectTable_13= ruleSelectTable otherlv_14= 'where' ( (lv_condition_15_0= ruleCondition ) ) ) ) )
            // InternalNlToSql.g:768:2: ( (otherlv_0= 'Delete' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable ) | (otherlv_4= 'Empty' otherlv_5= 'the' otherlv_6= 'table' this_SelectTable_7= ruleSelectTable ) | (otherlv_8= 'Delete' otherlv_9= 'records' otherlv_10= 'from' otherlv_11= 'the' otherlv_12= 'table' this_SelectTable_13= ruleSelectTable otherlv_14= 'where' ( (lv_condition_15_0= ruleCondition ) ) ) )
            {
            // InternalNlToSql.g:768:2: ( (otherlv_0= 'Delete' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable ) | (otherlv_4= 'Empty' otherlv_5= 'the' otherlv_6= 'table' this_SelectTable_7= ruleSelectTable ) | (otherlv_8= 'Delete' otherlv_9= 'records' otherlv_10= 'from' otherlv_11= 'the' otherlv_12= 'table' this_SelectTable_13= ruleSelectTable otherlv_14= 'where' ( (lv_condition_15_0= ruleCondition ) ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==40) ) {
                    alt9=3;
                }
                else if ( (LA9_1==21) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==39) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalNlToSql.g:769:3: (otherlv_0= 'Delete' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable )
                    {
                    // InternalNlToSql.g:769:3: (otherlv_0= 'Delete' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable )
                    // InternalNlToSql.g:770:4: otherlv_0= 'Delete' otherlv_1= 'the' otherlv_2= 'table' this_SelectTable_3= ruleSelectTable
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getDeleteStatementAccess().getTheKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeleteStatementAccess().getTableKeyword_0_2());
                    			

                    				newCompositeNode(grammarAccess.getDeleteStatementAccess().getSelectTableParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_SelectTable_3=ruleSelectTable();

                    state._fsp--;


                    				current = this_SelectTable_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:792:3: (otherlv_4= 'Empty' otherlv_5= 'the' otherlv_6= 'table' this_SelectTable_7= ruleSelectTable )
                    {
                    // InternalNlToSql.g:792:3: (otherlv_4= 'Empty' otherlv_5= 'the' otherlv_6= 'table' this_SelectTable_7= ruleSelectTable )
                    // InternalNlToSql.g:793:4: otherlv_4= 'Empty' otherlv_5= 'the' otherlv_6= 'table' this_SelectTable_7= ruleSelectTable
                    {
                    otherlv_4=(Token)match(input,39,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeleteStatementAccess().getEmptyKeyword_1_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeleteStatementAccess().getTheKeyword_1_1());
                    			
                    otherlv_6=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeleteStatementAccess().getTableKeyword_1_2());
                    			

                    				newCompositeNode(grammarAccess.getDeleteStatementAccess().getSelectTableParserRuleCall_1_3());
                    			
                    pushFollow(FOLLOW_2);
                    this_SelectTable_7=ruleSelectTable();

                    state._fsp--;


                    				current = this_SelectTable_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:815:3: (otherlv_8= 'Delete' otherlv_9= 'records' otherlv_10= 'from' otherlv_11= 'the' otherlv_12= 'table' this_SelectTable_13= ruleSelectTable otherlv_14= 'where' ( (lv_condition_15_0= ruleCondition ) ) )
                    {
                    // InternalNlToSql.g:815:3: (otherlv_8= 'Delete' otherlv_9= 'records' otherlv_10= 'from' otherlv_11= 'the' otherlv_12= 'table' this_SelectTable_13= ruleSelectTable otherlv_14= 'where' ( (lv_condition_15_0= ruleCondition ) ) )
                    // InternalNlToSql.g:816:4: otherlv_8= 'Delete' otherlv_9= 'records' otherlv_10= 'from' otherlv_11= 'the' otherlv_12= 'table' this_SelectTable_13= ruleSelectTable otherlv_14= 'where' ( (lv_condition_15_0= ruleCondition ) )
                    {
                    otherlv_8=(Token)match(input,38,FOLLOW_32); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeleteStatementAccess().getDeleteKeyword_2_0());
                    			
                    otherlv_9=(Token)match(input,40,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getDeleteStatementAccess().getRecordsKeyword_2_1());
                    			
                    otherlv_10=(Token)match(input,41,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getDeleteStatementAccess().getFromKeyword_2_2());
                    			
                    otherlv_11=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getDeleteStatementAccess().getTheKeyword_2_3());
                    			
                    otherlv_12=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getDeleteStatementAccess().getTableKeyword_2_4());
                    			

                    				newCompositeNode(grammarAccess.getDeleteStatementAccess().getSelectTableParserRuleCall_2_5());
                    			
                    pushFollow(FOLLOW_34);
                    this_SelectTable_13=ruleSelectTable();

                    state._fsp--;


                    				current = this_SelectTable_13;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_14=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getDeleteStatementAccess().getWhereKeyword_2_6());
                    			
                    // InternalNlToSql.g:848:4: ( (lv_condition_15_0= ruleCondition ) )
                    // InternalNlToSql.g:849:5: (lv_condition_15_0= ruleCondition )
                    {
                    // InternalNlToSql.g:849:5: (lv_condition_15_0= ruleCondition )
                    // InternalNlToSql.g:850:6: lv_condition_15_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getDeleteStatementAccess().getConditionConditionParserRuleCall_2_7_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_15_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeleteStatementRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_15_0,
                    							"uk.ac.kcl.inf.NlToSql.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleDeleteStatement"


    // $ANTLR start "entryRuleSelectUpdateList"
    // InternalNlToSql.g:872:1: entryRuleSelectUpdateList returns [EObject current=null] : iv_ruleSelectUpdateList= ruleSelectUpdateList EOF ;
    public final EObject entryRuleSelectUpdateList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectUpdateList = null;


        try {
            // InternalNlToSql.g:872:57: (iv_ruleSelectUpdateList= ruleSelectUpdateList EOF )
            // InternalNlToSql.g:873:2: iv_ruleSelectUpdateList= ruleSelectUpdateList EOF
            {
             newCompositeNode(grammarAccess.getSelectUpdateListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectUpdateList=ruleSelectUpdateList();

            state._fsp--;

             current =iv_ruleSelectUpdateList; 
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
    // $ANTLR end "entryRuleSelectUpdateList"


    // $ANTLR start "ruleSelectUpdateList"
    // InternalNlToSql.g:879:1: ruleSelectUpdateList returns [EObject current=null] : ( ( (lv_updateItem_0_0= ruleUpdateItem ) ) (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )* ) ;
    public final EObject ruleSelectUpdateList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_updateItem_0_0 = null;

        EObject lv_updateItem_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:885:2: ( ( ( (lv_updateItem_0_0= ruleUpdateItem ) ) (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )* ) )
            // InternalNlToSql.g:886:2: ( ( (lv_updateItem_0_0= ruleUpdateItem ) ) (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )* )
            {
            // InternalNlToSql.g:886:2: ( ( (lv_updateItem_0_0= ruleUpdateItem ) ) (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )* )
            // InternalNlToSql.g:887:3: ( (lv_updateItem_0_0= ruleUpdateItem ) ) (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )*
            {
            // InternalNlToSql.g:887:3: ( (lv_updateItem_0_0= ruleUpdateItem ) )
            // InternalNlToSql.g:888:4: (lv_updateItem_0_0= ruleUpdateItem )
            {
            // InternalNlToSql.g:888:4: (lv_updateItem_0_0= ruleUpdateItem )
            // InternalNlToSql.g:889:5: lv_updateItem_0_0= ruleUpdateItem
            {

            					newCompositeNode(grammarAccess.getSelectUpdateListAccess().getUpdateItemUpdateItemParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_updateItem_0_0=ruleUpdateItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectUpdateListRule());
            					}
            					add(
            						current,
            						"updateItem",
            						lv_updateItem_0_0,
            						"uk.ac.kcl.inf.NlToSql.UpdateItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:906:3: (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalNlToSql.g:907:4: otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectUpdateListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:911:4: ( (lv_updateItem_2_0= ruleUpdateItem ) )
            	    // InternalNlToSql.g:912:5: (lv_updateItem_2_0= ruleUpdateItem )
            	    {
            	    // InternalNlToSql.g:912:5: (lv_updateItem_2_0= ruleUpdateItem )
            	    // InternalNlToSql.g:913:6: lv_updateItem_2_0= ruleUpdateItem
            	    {

            	    						newCompositeNode(grammarAccess.getSelectUpdateListAccess().getUpdateItemUpdateItemParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_updateItem_2_0=ruleUpdateItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectUpdateListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"updateItem",
            	    							lv_updateItem_2_0,
            	    							"uk.ac.kcl.inf.NlToSql.UpdateItem");
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
    // $ANTLR end "ruleSelectUpdateList"


    // $ANTLR start "entryRuleUpdateItem"
    // InternalNlToSql.g:935:1: entryRuleUpdateItem returns [EObject current=null] : iv_ruleUpdateItem= ruleUpdateItem EOF ;
    public final EObject entryRuleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateItem = null;


        try {
            // InternalNlToSql.g:935:51: (iv_ruleUpdateItem= ruleUpdateItem EOF )
            // InternalNlToSql.g:936:2: iv_ruleUpdateItem= ruleUpdateItem EOF
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
    // InternalNlToSql.g:942:1: ruleUpdateItem returns [EObject current=null] : ( ( (lv_column_0_0= ruleColumnReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_column_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:948:2: ( ( ( (lv_column_0_0= ruleColumnReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalNlToSql.g:949:2: ( ( (lv_column_0_0= ruleColumnReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalNlToSql.g:949:2: ( ( (lv_column_0_0= ruleColumnReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // InternalNlToSql.g:950:3: ( (lv_column_0_0= ruleColumnReference ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalNlToSql.g:950:3: ( (lv_column_0_0= ruleColumnReference ) )
            // InternalNlToSql.g:951:4: (lv_column_0_0= ruleColumnReference )
            {
            // InternalNlToSql.g:951:4: (lv_column_0_0= ruleColumnReference )
            // InternalNlToSql.g:952:5: lv_column_0_0= ruleColumnReference
            {

            					newCompositeNode(grammarAccess.getUpdateItemAccess().getColumnColumnReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_35);
            lv_column_0_0=ruleColumnReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateItemRule());
            					}
            					set(
            						current,
            						"column",
            						lv_column_0_0,
            						"uk.ac.kcl.inf.NlToSql.ColumnReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_1());
            		
            // InternalNlToSql.g:973:3: ( (lv_value_2_0= ruleValue ) )
            // InternalNlToSql.g:974:4: (lv_value_2_0= ruleValue )
            {
            // InternalNlToSql.g:974:4: (lv_value_2_0= ruleValue )
            // InternalNlToSql.g:975:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateItemRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
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


    // $ANTLR start "entryRuleInserValues"
    // InternalNlToSql.g:996:1: entryRuleInserValues returns [EObject current=null] : iv_ruleInserValues= ruleInserValues EOF ;
    public final EObject entryRuleInserValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInserValues = null;


        try {
            // InternalNlToSql.g:996:52: (iv_ruleInserValues= ruleInserValues EOF )
            // InternalNlToSql.g:997:2: iv_ruleInserValues= ruleInserValues EOF
            {
             newCompositeNode(grammarAccess.getInserValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInserValues=ruleInserValues();

            state._fsp--;

             current =iv_ruleInserValues; 
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
    // $ANTLR end "entryRuleInserValues"


    // $ANTLR start "ruleInserValues"
    // InternalNlToSql.g:1003:1: ruleInserValues returns [EObject current=null] : ( ( (lv_valueList_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleInserValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valueList_0_0 = null;

        AntlrDatatypeRuleToken lv_valueList_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:1009:2: ( ( ( (lv_valueList_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )* ) )
            // InternalNlToSql.g:1010:2: ( ( (lv_valueList_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )* )
            {
            // InternalNlToSql.g:1010:2: ( ( (lv_valueList_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )* )
            // InternalNlToSql.g:1011:3: ( (lv_valueList_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )*
            {
            // InternalNlToSql.g:1011:3: ( (lv_valueList_0_0= ruleValue ) )
            // InternalNlToSql.g:1012:4: (lv_valueList_0_0= ruleValue )
            {
            // InternalNlToSql.g:1012:4: (lv_valueList_0_0= ruleValue )
            // InternalNlToSql.g:1013:5: lv_valueList_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getInserValuesAccess().getValueListValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_valueList_0_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInserValuesRule());
            					}
            					add(
            						current,
            						"valueList",
            						lv_valueList_0_0,
            						"uk.ac.kcl.inf.NlToSql.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:1030:3: (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNlToSql.g:1031:4: otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_27); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInserValuesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:1035:4: ( (lv_valueList_2_0= ruleValue ) )
            	    // InternalNlToSql.g:1036:5: (lv_valueList_2_0= ruleValue )
            	    {
            	    // InternalNlToSql.g:1036:5: (lv_valueList_2_0= ruleValue )
            	    // InternalNlToSql.g:1037:6: lv_valueList_2_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getInserValuesAccess().getValueListValueParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_valueList_2_0=ruleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInserValuesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"valueList",
            	    							lv_valueList_2_0,
            	    							"uk.ac.kcl.inf.NlToSql.Value");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleInserValues"


    // $ANTLR start "entryRuleSelectTablesList"
    // InternalNlToSql.g:1059:1: entryRuleSelectTablesList returns [EObject current=null] : iv_ruleSelectTablesList= ruleSelectTablesList EOF ;
    public final EObject entryRuleSelectTablesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectTablesList = null;


        try {
            // InternalNlToSql.g:1059:57: (iv_ruleSelectTablesList= ruleSelectTablesList EOF )
            // InternalNlToSql.g:1060:2: iv_ruleSelectTablesList= ruleSelectTablesList EOF
            {
             newCompositeNode(grammarAccess.getSelectTablesListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectTablesList=ruleSelectTablesList();

            state._fsp--;

             current =iv_ruleSelectTablesList; 
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
    // $ANTLR end "entryRuleSelectTablesList"


    // $ANTLR start "ruleSelectTablesList"
    // InternalNlToSql.g:1066:1: ruleSelectTablesList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleSelectTablesList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1072:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalNlToSql.g:1073:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalNlToSql.g:1073:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalNlToSql.g:1074:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalNlToSql.g:1074:3: ( (otherlv_0= RULE_ID ) )
            // InternalNlToSql.g:1075:4: (otherlv_0= RULE_ID )
            {
            // InternalNlToSql.g:1075:4: (otherlv_0= RULE_ID )
            // InternalNlToSql.g:1076:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectTablesListRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getSelectTablesListAccess().getSelectTableTableCrossReference_0_0());
            				

            }


            }

            // InternalNlToSql.g:1087:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalNlToSql.g:1088:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectTablesListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:1092:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalNlToSql.g:1093:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalNlToSql.g:1093:5: (otherlv_2= RULE_ID )
            	    // InternalNlToSql.g:1094:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSelectTablesListRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_2, grammarAccess.getSelectTablesListAccess().getSelectTableTableCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleSelectTablesList"


    // $ANTLR start "entryRuleSelectTable"
    // InternalNlToSql.g:1110:1: entryRuleSelectTable returns [EObject current=null] : iv_ruleSelectTable= ruleSelectTable EOF ;
    public final EObject entryRuleSelectTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectTable = null;


        try {
            // InternalNlToSql.g:1110:52: (iv_ruleSelectTable= ruleSelectTable EOF )
            // InternalNlToSql.g:1111:2: iv_ruleSelectTable= ruleSelectTable EOF
            {
             newCompositeNode(grammarAccess.getSelectTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectTable=ruleSelectTable();

            state._fsp--;

             current =iv_ruleSelectTable; 
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
    // $ANTLR end "entryRuleSelectTable"


    // $ANTLR start "ruleSelectTable"
    // InternalNlToSql.g:1117:1: ruleSelectTable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSelectTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1123:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalNlToSql.g:1124:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalNlToSql.g:1124:2: ( (otherlv_0= RULE_ID ) )
            // InternalNlToSql.g:1125:3: (otherlv_0= RULE_ID )
            {
            // InternalNlToSql.g:1125:3: (otherlv_0= RULE_ID )
            // InternalNlToSql.g:1126:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSelectTableRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getSelectTableAccess().getTableTableCrossReference_0());
            			

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
    // $ANTLR end "ruleSelectTable"


    // $ANTLR start "entryRuleSelectColumnsList"
    // InternalNlToSql.g:1140:1: entryRuleSelectColumnsList returns [EObject current=null] : iv_ruleSelectColumnsList= ruleSelectColumnsList EOF ;
    public final EObject entryRuleSelectColumnsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectColumnsList = null;


        try {
            // InternalNlToSql.g:1140:58: (iv_ruleSelectColumnsList= ruleSelectColumnsList EOF )
            // InternalNlToSql.g:1141:2: iv_ruleSelectColumnsList= ruleSelectColumnsList EOF
            {
             newCompositeNode(grammarAccess.getSelectColumnsListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectColumnsList=ruleSelectColumnsList();

            state._fsp--;

             current =iv_ruleSelectColumnsList; 
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
    // $ANTLR end "entryRuleSelectColumnsList"


    // $ANTLR start "ruleSelectColumnsList"
    // InternalNlToSql.g:1147:1: ruleSelectColumnsList returns [EObject current=null] : ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* ) ;
    public final EObject ruleSelectColumnsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_selectColumn_0_0 = null;

        EObject lv_selectColumn_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:1153:2: ( ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* ) )
            // InternalNlToSql.g:1154:2: ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* )
            {
            // InternalNlToSql.g:1154:2: ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* )
            // InternalNlToSql.g:1155:3: ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )*
            {
            // InternalNlToSql.g:1155:3: ( (lv_selectColumn_0_0= ruleColumnReference ) )
            // InternalNlToSql.g:1156:4: (lv_selectColumn_0_0= ruleColumnReference )
            {
            // InternalNlToSql.g:1156:4: (lv_selectColumn_0_0= ruleColumnReference )
            // InternalNlToSql.g:1157:5: lv_selectColumn_0_0= ruleColumnReference
            {

            					newCompositeNode(grammarAccess.getSelectColumnsListAccess().getSelectColumnColumnReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_selectColumn_0_0=ruleColumnReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectColumnsListRule());
            					}
            					add(
            						current,
            						"selectColumn",
            						lv_selectColumn_0_0,
            						"uk.ac.kcl.inf.NlToSql.ColumnReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:1174:3: (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalNlToSql.g:1175:4: otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectColumnsListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:1179:4: ( (lv_selectColumn_2_0= ruleColumnReference ) )
            	    // InternalNlToSql.g:1180:5: (lv_selectColumn_2_0= ruleColumnReference )
            	    {
            	    // InternalNlToSql.g:1180:5: (lv_selectColumn_2_0= ruleColumnReference )
            	    // InternalNlToSql.g:1181:6: lv_selectColumn_2_0= ruleColumnReference
            	    {

            	    						newCompositeNode(grammarAccess.getSelectColumnsListAccess().getSelectColumnColumnReferenceParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_selectColumn_2_0=ruleColumnReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectColumnsListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"selectColumn",
            	    							lv_selectColumn_2_0,
            	    							"uk.ac.kcl.inf.NlToSql.ColumnReference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleSelectColumnsList"


    // $ANTLR start "entryRuleColumnReference"
    // InternalNlToSql.g:1203:1: entryRuleColumnReference returns [EObject current=null] : iv_ruleColumnReference= ruleColumnReference EOF ;
    public final EObject entryRuleColumnReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnReference = null;


        try {
            // InternalNlToSql.g:1203:56: (iv_ruleColumnReference= ruleColumnReference EOF )
            // InternalNlToSql.g:1204:2: iv_ruleColumnReference= ruleColumnReference EOF
            {
             newCompositeNode(grammarAccess.getColumnReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnReference=ruleColumnReference();

            state._fsp--;

             current =iv_ruleColumnReference; 
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
    // $ANTLR end "entryRuleColumnReference"


    // $ANTLR start "ruleColumnReference"
    // InternalNlToSql.g:1210:1: ruleColumnReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleColumnReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1216:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? ) )
            // InternalNlToSql.g:1217:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // InternalNlToSql.g:1217:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalNlToSql.g:1218:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalNlToSql.g:1218:3: ( (otherlv_0= RULE_ID ) )
            // InternalNlToSql.g:1219:4: (otherlv_0= RULE_ID )
            {
            // InternalNlToSql.g:1219:4: (otherlv_0= RULE_ID )
            // InternalNlToSql.g:1220:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_0, grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0_0());
            				

            }


            }

            // InternalNlToSql.g:1231:3: (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNlToSql.g:1232:4: otherlv_1= 'in' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnReferenceAccess().getInKeyword_1_0());
                    			
                    // InternalNlToSql.g:1236:4: ( (otherlv_2= RULE_ID ) )
                    // InternalNlToSql.g:1237:5: (otherlv_2= RULE_ID )
                    {
                    // InternalNlToSql.g:1237:5: (otherlv_2= RULE_ID )
                    // InternalNlToSql.g:1238:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnReferenceRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getColumnReferenceAccess().getTableTableCrossReference_1_1_0());
                    					

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
    // $ANTLR end "ruleColumnReference"


    // $ANTLR start "entryRuleCondition"
    // InternalNlToSql.g:1254:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalNlToSql.g:1254:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalNlToSql.g:1255:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalNlToSql.g:1261:1: ruleCondition returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        Enumerator lv_logicOperator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:1267:2: ( (this_Comparison_0= ruleComparison ( () ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalNlToSql.g:1268:2: (this_Comparison_0= ruleComparison ( () ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalNlToSql.g:1268:2: (this_Comparison_0= ruleComparison ( () ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalNlToSql.g:1269:3: this_Comparison_0= ruleComparison ( () ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getConditionAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalNlToSql.g:1277:3: ( () ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==51||LA15_0==59) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalNlToSql.g:1278:4: () ( (lv_logicOperator_2_0= ruleLogicOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalNlToSql.g:1278:4: ()
            	    // InternalNlToSql.g:1279:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConditionAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalNlToSql.g:1285:4: ( (lv_logicOperator_2_0= ruleLogicOperator ) )
            	    // InternalNlToSql.g:1286:5: (lv_logicOperator_2_0= ruleLogicOperator )
            	    {
            	    // InternalNlToSql.g:1286:5: (lv_logicOperator_2_0= ruleLogicOperator )
            	    // InternalNlToSql.g:1287:6: lv_logicOperator_2_0= ruleLogicOperator
            	    {

            	    						newCompositeNode(grammarAccess.getConditionAccess().getLogicOperatorLogicOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_logicOperator_2_0=ruleLogicOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"logicOperator",
            	    							lv_logicOperator_2_0,
            	    							"uk.ac.kcl.inf.NlToSql.LogicOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalNlToSql.g:1304:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalNlToSql.g:1305:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalNlToSql.g:1305:5: (lv_right_3_0= ruleComparison )
            	    // InternalNlToSql.g:1306:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getConditionAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_37);
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
            	    break loop15;
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
    // InternalNlToSql.g:1328:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalNlToSql.g:1328:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalNlToSql.g:1329:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalNlToSql.g:1335:1: ruleComparison returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv_rightHandSide_4_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:1341:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) ) )
            // InternalNlToSql.g:1342:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) )
            {
            // InternalNlToSql.g:1342:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) )
            // InternalNlToSql.g:1343:3: (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) )
            {
            // InternalNlToSql.g:1343:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==44) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalNlToSql.g:1344:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getComparisonAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1349:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:1354:3: ( (otherlv_2= RULE_ID ) )
            // InternalNlToSql.g:1355:4: (otherlv_2= RULE_ID )
            {
            // InternalNlToSql.g:1355:4: (otherlv_2= RULE_ID )
            // InternalNlToSql.g:1356:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLeftHandSideColumnCrossReference_1_0());
            				

            }


            }

            // InternalNlToSql.g:1367:3: ( (lv_operator_3_0= ruleComparisonOperator ) )
            // InternalNlToSql.g:1368:4: (lv_operator_3_0= ruleComparisonOperator )
            {
            // InternalNlToSql.g:1368:4: (lv_operator_3_0= ruleComparisonOperator )
            // InternalNlToSql.g:1369:5: lv_operator_3_0= ruleComparisonOperator
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalNlToSql.g:1386:3: ( (lv_rightHandSide_4_0= ruleValue ) )
            // InternalNlToSql.g:1387:4: (lv_rightHandSide_4_0= ruleValue )
            {
            // InternalNlToSql.g:1387:4: (lv_rightHandSide_4_0= ruleValue )
            // InternalNlToSql.g:1388:5: lv_rightHandSide_4_0= ruleValue
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
    // InternalNlToSql.g:1409:1: entryRuleComparisonOperator returns [String current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final String entryRuleComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperator = null;


        try {
            // InternalNlToSql.g:1409:58: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalNlToSql.g:1410:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
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
    // InternalNlToSql.g:1416:1: ruleComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ComparisonOperatorSigns_0= ruleComparisonOperatorSigns | this_ComparisonOperatorString_1= ruleComparisonOperatorString ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ComparisonOperatorSigns_0 = null;

        AntlrDatatypeRuleToken this_ComparisonOperatorString_1 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:1422:2: ( (this_ComparisonOperatorSigns_0= ruleComparisonOperatorSigns | this_ComparisonOperatorString_1= ruleComparisonOperatorString ) )
            // InternalNlToSql.g:1423:2: (this_ComparisonOperatorSigns_0= ruleComparisonOperatorSigns | this_ComparisonOperatorString_1= ruleComparisonOperatorString )
            {
            // InternalNlToSql.g:1423:2: (this_ComparisonOperatorSigns_0= ruleComparisonOperatorSigns | this_ComparisonOperatorString_1= ruleComparisonOperatorString )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42||(LA17_0>=52 && LA17_0<=55)) ) {
                alt17=1;
            }
            else if ( (LA17_0==45||LA17_0==48||LA17_0==50) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalNlToSql.g:1424:3: this_ComparisonOperatorSigns_0= ruleComparisonOperatorSigns
                    {

                    			newCompositeNode(grammarAccess.getComparisonOperatorAccess().getComparisonOperatorSignsParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComparisonOperatorSigns_0=ruleComparisonOperatorSigns();

                    state._fsp--;


                    			current.merge(this_ComparisonOperatorSigns_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1435:3: this_ComparisonOperatorString_1= ruleComparisonOperatorString
                    {

                    			newCompositeNode(grammarAccess.getComparisonOperatorAccess().getComparisonOperatorStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComparisonOperatorString_1=ruleComparisonOperatorString();

                    state._fsp--;


                    			current.merge(this_ComparisonOperatorString_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

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


    // $ANTLR start "entryRuleComparisonOperatorString"
    // InternalNlToSql.g:1449:1: entryRuleComparisonOperatorString returns [String current=null] : iv_ruleComparisonOperatorString= ruleComparisonOperatorString EOF ;
    public final String entryRuleComparisonOperatorString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperatorString = null;


        try {
            // InternalNlToSql.g:1449:64: (iv_ruleComparisonOperatorString= ruleComparisonOperatorString EOF )
            // InternalNlToSql.g:1450:2: iv_ruleComparisonOperatorString= ruleComparisonOperatorString EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperatorString=ruleComparisonOperatorString();

            state._fsp--;

             current =iv_ruleComparisonOperatorString.getText(); 
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
    // $ANTLR end "entryRuleComparisonOperatorString"


    // $ANTLR start "ruleComparisonOperatorString"
    // InternalNlToSql.g:1456:1: ruleComparisonOperatorString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperatorString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1462:2: ( ( (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) ) )
            // InternalNlToSql.g:1463:2: ( (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )
            {
            // InternalNlToSql.g:1463:2: ( (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )
            int alt18=6;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalNlToSql.g:1464:3: (kw= 'is' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1464:3: (kw= 'is' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1465:4: kw= 'is' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,45,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getIsKeyword_0_0());
                    			
                    kw=(Token)match(input,46,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getEqualKeyword_0_1());
                    			
                    kw=(Token)match(input,36,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getToKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1482:3: (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1482:3: (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1483:4: kw= 'is' kw= 'not' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,45,FOLLOW_40); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getIsKeyword_1_0());
                    			
                    kw=(Token)match(input,47,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getNotKeyword_1_1());
                    			
                    kw=(Token)match(input,46,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getEqualKeyword_1_2());
                    			
                    kw=(Token)match(input,36,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getToKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:1505:3: (kw= 'less' kw= 'than' )
                    {
                    // InternalNlToSql.g:1505:3: (kw= 'less' kw= 'than' )
                    // InternalNlToSql.g:1506:4: kw= 'less' kw= 'than'
                    {
                    kw=(Token)match(input,48,FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getLessKeyword_2_0());
                    			
                    kw=(Token)match(input,49,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getThanKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalNlToSql.g:1518:3: (kw= 'greater' kw= 'than' )
                    {
                    // InternalNlToSql.g:1518:3: (kw= 'greater' kw= 'than' )
                    // InternalNlToSql.g:1519:4: kw= 'greater' kw= 'than'
                    {
                    kw=(Token)match(input,50,FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getGreaterKeyword_3_0());
                    			
                    kw=(Token)match(input,49,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getThanKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalNlToSql.g:1531:3: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1531:3: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1532:4: kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,48,FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getLessKeyword_4_0());
                    			
                    kw=(Token)match(input,49,FOLLOW_42); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getThanKeyword_4_1());
                    			
                    kw=(Token)match(input,51,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getOrKeyword_4_2());
                    			
                    kw=(Token)match(input,46,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getEqualKeyword_4_3());
                    			
                    kw=(Token)match(input,36,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getToKeyword_4_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalNlToSql.g:1559:3: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1559:3: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1560:4: kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,50,FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getGreaterKeyword_5_0());
                    			
                    kw=(Token)match(input,49,FOLLOW_42); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getThanKeyword_5_1());
                    			
                    kw=(Token)match(input,51,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getOrKeyword_5_2());
                    			
                    kw=(Token)match(input,46,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getEqualKeyword_5_3());
                    			
                    kw=(Token)match(input,36,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorStringAccess().getToKeyword_5_4());
                    			

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
    // $ANTLR end "ruleComparisonOperatorString"


    // $ANTLR start "entryRuleComparisonOperatorSigns"
    // InternalNlToSql.g:1590:1: entryRuleComparisonOperatorSigns returns [String current=null] : iv_ruleComparisonOperatorSigns= ruleComparisonOperatorSigns EOF ;
    public final String entryRuleComparisonOperatorSigns() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperatorSigns = null;


        try {
            // InternalNlToSql.g:1590:63: (iv_ruleComparisonOperatorSigns= ruleComparisonOperatorSigns EOF )
            // InternalNlToSql.g:1591:2: iv_ruleComparisonOperatorSigns= ruleComparisonOperatorSigns EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorSignsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperatorSigns=ruleComparisonOperatorSigns();

            state._fsp--;

             current =iv_ruleComparisonOperatorSigns.getText(); 
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
    // $ANTLR end "entryRuleComparisonOperatorSigns"


    // $ANTLR start "ruleComparisonOperatorSigns"
    // InternalNlToSql.g:1597:1: ruleComparisonOperatorSigns returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '<=' | kw= '>=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperatorSigns() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1603:2: ( (kw= '=' | kw= '<=' | kw= '>=' | kw= '>' | kw= '<' ) )
            // InternalNlToSql.g:1604:2: (kw= '=' | kw= '<=' | kw= '>=' | kw= '>' | kw= '<' )
            {
            // InternalNlToSql.g:1604:2: (kw= '=' | kw= '<=' | kw= '>=' | kw= '>' | kw= '<' )
            int alt19=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt19=1;
                }
                break;
            case 52:
                {
                alt19=2;
                }
                break;
            case 53:
                {
                alt19=3;
                }
                break;
            case 54:
                {
                alt19=4;
                }
                break;
            case 55:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalNlToSql.g:1605:3: kw= '='
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorSignsAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1611:3: kw= '<='
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorSignsAccess().getLessThanSignEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:1617:3: kw= '>='
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorSignsAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalNlToSql.g:1623:3: kw= '>'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorSignsAccess().getGreaterThanSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalNlToSql.g:1629:3: kw= '<'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorSignsAccess().getLessThanSignKeyword_4());
                    		

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
    // $ANTLR end "ruleComparisonOperatorSigns"


    // $ANTLR start "entryRuleValue"
    // InternalNlToSql.g:1638:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalNlToSql.g:1638:45: (iv_ruleValue= ruleValue EOF )
            // InternalNlToSql.g:1639:2: iv_ruleValue= ruleValue EOF
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
    // InternalNlToSql.g:1645:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1651:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalNlToSql.g:1652:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalNlToSql.g:1652:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_INT) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalNlToSql.g:1653:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1661:3: this_STRING_1= RULE_STRING
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


    // $ANTLR start "ruleDatatype"
    // InternalNlToSql.g:1672:1: ruleDatatype returns [Enumerator current=null] : ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) ) ;
    public final Enumerator ruleDatatype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1678:2: ( ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) ) )
            // InternalNlToSql.g:1679:2: ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) )
            {
            // InternalNlToSql.g:1679:2: ( (enumLiteral_0= 'integer' ) | (enumLiteral_1= 'string' ) | (enumLiteral_2= 'date' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt21=1;
                }
                break;
            case 57:
                {
                alt21=2;
                }
                break;
            case 58:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalNlToSql.g:1680:3: (enumLiteral_0= 'integer' )
                    {
                    // InternalNlToSql.g:1680:3: (enumLiteral_0= 'integer' )
                    // InternalNlToSql.g:1681:4: enumLiteral_0= 'integer'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getIntegerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatatypeAccess().getIntegerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1688:3: (enumLiteral_1= 'string' )
                    {
                    // InternalNlToSql.g:1688:3: (enumLiteral_1= 'string' )
                    // InternalNlToSql.g:1689:4: enumLiteral_1= 'string'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getStringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatatypeAccess().getStringEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:1696:3: (enumLiteral_2= 'date' )
                    {
                    // InternalNlToSql.g:1696:3: (enumLiteral_2= 'date' )
                    // InternalNlToSql.g:1697:4: enumLiteral_2= 'date'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getDateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatatypeAccess().getDateEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "ruleLogicOperator"
    // InternalNlToSql.g:1707:1: ruleLogicOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleLogicOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1713:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalNlToSql.g:1714:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalNlToSql.g:1714:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==59) ) {
                alt22=1;
            }
            else if ( (LA22_0==51) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalNlToSql.g:1715:3: (enumLiteral_0= 'and' )
                    {
                    // InternalNlToSql.g:1715:3: (enumLiteral_0= 'and' )
                    // InternalNlToSql.g:1716:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getLogicOperatorAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogicOperatorAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1723:3: (enumLiteral_1= 'or' )
                    {
                    // InternalNlToSql.g:1723:3: (enumLiteral_1= 'or' )
                    // InternalNlToSql.g:1724:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getLogicOperatorAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogicOperatorAccess().getOrEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleLogicOperator"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\6\uffff\1\10\1\12\4\uffff";
    static final String dfa_3s = "\1\55\1\56\2\61\2\uffff\2\5\4\uffff";
    static final String dfa_4s = "\1\62\1\57\2\61\2\uffff\2\63\4\uffff";
    static final String dfa_5s = "\4\uffff\1\2\1\1\2\uffff\1\3\1\5\1\4\1\6";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\1\2\1\uffff\1\3",
            "\1\5\1\4",
            "\1\6",
            "\1\7",
            "",
            "",
            "\2\10\54\uffff\1\11",
            "\2\12\54\uffff\1\13",
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

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1463:2: ( (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000C810101002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000200010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0808000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00F5240000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});

}