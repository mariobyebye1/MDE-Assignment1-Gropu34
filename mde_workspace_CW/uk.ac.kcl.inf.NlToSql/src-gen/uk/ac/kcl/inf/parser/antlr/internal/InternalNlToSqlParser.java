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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'Create'", "'table'", "'called'", "'with'", "'columns'", "','", "'of'", "'type'", "'integer'", "'string'", "'date'", "'From'", "'the'", "'show'", "'columns:'", "'all'", "'where'", "'group'", "'by'", "'Insert'", "'into'", "'for'", "'insert'", "'values'", "'('", "')'", "'Update'", "'to'", "'set'", "'='", "'in'", "'and'", "'or'", "'a'", "'is'", "'equal'", "'not'", "'less'", "'than'", "'greater'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
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

                if ( (LA1_0==12||LA1_0==23||LA1_0==31||LA1_0==38) ) {
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
    // InternalNlToSql.g:107:1: ruleStatement returns [EObject current=null] : ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement ) otherlv_4= '.' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_CreateTableStatement_0 = null;

        EObject this_SelectStatement_1 = null;

        EObject this_InsertStatement_2 = null;

        EObject this_UpdateStatement_3 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:113:2: ( ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement ) otherlv_4= '.' ) )
            // InternalNlToSql.g:114:2: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement ) otherlv_4= '.' )
            {
            // InternalNlToSql.g:114:2: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement ) otherlv_4= '.' )
            // InternalNlToSql.g:115:3: (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement ) otherlv_4= '.'
            {
            // InternalNlToSql.g:115:3: (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement | this_InsertStatement_2= ruleInsertStatement | this_UpdateStatement_3= ruleUpdateStatement )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 31:
                {
                alt2=3;
                }
                break;
            case 38:
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
                    // InternalNlToSql.g:116:4: this_CreateTableStatement_0= ruleCreateTableStatement
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
                    // InternalNlToSql.g:125:4: this_SelectStatement_1= ruleSelectStatement
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
                    // InternalNlToSql.g:134:4: this_InsertStatement_2= ruleInsertStatement
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
                    // InternalNlToSql.g:143:4: this_UpdateStatement_3= ruleUpdateStatement
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_4);
                    this_UpdateStatement_3=ruleUpdateStatement();

                    state._fsp--;


                    				current = this_UpdateStatement_3;
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


    // $ANTLR start "entryRuleCreateTableStatement"
    // InternalNlToSql.g:160:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // InternalNlToSql.g:160:61: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // InternalNlToSql.g:161:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
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
    // InternalNlToSql.g:167:1: ruleCreateTableStatement returns [EObject current=null] : (otherlv_0= 'Create' ruleTheA otherlv_2= 'table' otherlv_3= 'called' ( (lv_table_4_0= ruleTable ) ) (otherlv_5= 'with' otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumnList ) ) )? ) ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_table_4_0 = null;

        EObject lv_columns_7_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:173:2: ( (otherlv_0= 'Create' ruleTheA otherlv_2= 'table' otherlv_3= 'called' ( (lv_table_4_0= ruleTable ) ) (otherlv_5= 'with' otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumnList ) ) )? ) )
            // InternalNlToSql.g:174:2: (otherlv_0= 'Create' ruleTheA otherlv_2= 'table' otherlv_3= 'called' ( (lv_table_4_0= ruleTable ) ) (otherlv_5= 'with' otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumnList ) ) )? )
            {
            // InternalNlToSql.g:174:2: (otherlv_0= 'Create' ruleTheA otherlv_2= 'table' otherlv_3= 'called' ( (lv_table_4_0= ruleTable ) ) (otherlv_5= 'with' otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumnList ) ) )? )
            // InternalNlToSql.g:175:3: otherlv_0= 'Create' ruleTheA otherlv_2= 'table' otherlv_3= 'called' ( (lv_table_4_0= ruleTable ) ) (otherlv_5= 'with' otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumnList ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_0());
            		

            			newCompositeNode(grammarAccess.getCreateTableStatementAccess().getTheAParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            ruleTheA();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCreateTableStatementAccess().getTableKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getCalledKeyword_3());
            		
            // InternalNlToSql.g:194:3: ( (lv_table_4_0= ruleTable ) )
            // InternalNlToSql.g:195:4: (lv_table_4_0= ruleTable )
            {
            // InternalNlToSql.g:195:4: (lv_table_4_0= ruleTable )
            // InternalNlToSql.g:196:5: lv_table_4_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getCreateTableStatementAccess().getTableTableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_table_4_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_4_0,
            						"uk.ac.kcl.inf.NlToSql.Table");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:213:3: (otherlv_5= 'with' otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumnList ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalNlToSql.g:214:4: otherlv_5= 'with' otherlv_6= 'columns' ( (lv_columns_7_0= ruleColumnList ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getCreateTableStatementAccess().getWithKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getCreateTableStatementAccess().getColumnsKeyword_5_1());
                    			
                    // InternalNlToSql.g:222:4: ( (lv_columns_7_0= ruleColumnList ) )
                    // InternalNlToSql.g:223:5: (lv_columns_7_0= ruleColumnList )
                    {
                    // InternalNlToSql.g:223:5: (lv_columns_7_0= ruleColumnList )
                    // InternalNlToSql.g:224:6: lv_columns_7_0= ruleColumnList
                    {

                    						newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnsColumnListParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_columns_7_0=ruleColumnList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
                    						}
                    						set(
                    							current,
                    							"columns",
                    							lv_columns_7_0,
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
    // InternalNlToSql.g:246:1: entryRuleColumnList returns [EObject current=null] : iv_ruleColumnList= ruleColumnList EOF ;
    public final EObject entryRuleColumnList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnList = null;


        try {
            // InternalNlToSql.g:246:51: (iv_ruleColumnList= ruleColumnList EOF )
            // InternalNlToSql.g:247:2: iv_ruleColumnList= ruleColumnList EOF
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
    // InternalNlToSql.g:253:1: ruleColumnList returns [EObject current=null] : ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* ) ;
    public final EObject ruleColumnList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_columnItem_0_0 = null;

        EObject lv_columnItem_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:259:2: ( ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* ) )
            // InternalNlToSql.g:260:2: ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* )
            {
            // InternalNlToSql.g:260:2: ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* )
            // InternalNlToSql.g:261:3: ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )*
            {
            // InternalNlToSql.g:261:3: ( (lv_columnItem_0_0= ruleColumn ) )
            // InternalNlToSql.g:262:4: (lv_columnItem_0_0= ruleColumn )
            {
            // InternalNlToSql.g:262:4: (lv_columnItem_0_0= ruleColumn )
            // InternalNlToSql.g:263:5: lv_columnItem_0_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getColumnListAccess().getColumnItemColumnParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalNlToSql.g:280:3: (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNlToSql.g:281:4: otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getColumnListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:285:4: ( (lv_columnItem_2_0= ruleColumn ) )
            	    // InternalNlToSql.g:286:5: (lv_columnItem_2_0= ruleColumn )
            	    {
            	    // InternalNlToSql.g:286:5: (lv_columnItem_2_0= ruleColumn )
            	    // InternalNlToSql.g:287:6: lv_columnItem_2_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getColumnListAccess().getColumnItemColumnParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // InternalNlToSql.g:309:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalNlToSql.g:309:46: (iv_ruleTable= ruleTable EOF )
            // InternalNlToSql.g:310:2: iv_ruleTable= ruleTable EOF
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
    // InternalNlToSql.g:316:1: ruleTable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalNlToSql.g:322:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalNlToSql.g:323:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalNlToSql.g:323:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalNlToSql.g:324:3: (lv_name_0_0= RULE_ID )
            {
            // InternalNlToSql.g:324:3: (lv_name_0_0= RULE_ID )
            // InternalNlToSql.g:325:4: lv_name_0_0= RULE_ID
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
    // InternalNlToSql.g:344:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalNlToSql.g:344:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalNlToSql.g:345:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalNlToSql.g:351:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:357:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) ) )
            // InternalNlToSql.g:358:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) )
            {
            // InternalNlToSql.g:358:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) )
            // InternalNlToSql.g:359:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) )
            {
            // InternalNlToSql.g:359:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNlToSql.g:360:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNlToSql.g:360:4: (lv_name_0_0= RULE_ID )
            // InternalNlToSql.g:361:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getOfKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getTypeKeyword_2());
            		
            // InternalNlToSql.g:385:3: ( (lv_type_3_0= ruleDatatype ) )
            // InternalNlToSql.g:386:4: (lv_type_3_0= ruleDatatype )
            {
            // InternalNlToSql.g:386:4: (lv_type_3_0= ruleDatatype )
            // InternalNlToSql.g:387:5: lv_type_3_0= ruleDatatype
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getTypeDatatypeParserRuleCall_3_0());
            				
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


    // $ANTLR start "entryRuleDatatype"
    // InternalNlToSql.g:408:1: entryRuleDatatype returns [String current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final String entryRuleDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype = null;


        try {
            // InternalNlToSql.g:408:48: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalNlToSql.g:409:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype.getText(); 
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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalNlToSql.g:415:1: ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'integer' | kw= 'string' | kw= 'date' ) ;
    public final AntlrDatatypeRuleToken ruleDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:421:2: ( (kw= 'integer' | kw= 'string' | kw= 'date' ) )
            // InternalNlToSql.g:422:2: (kw= 'integer' | kw= 'string' | kw= 'date' )
            {
            // InternalNlToSql.g:422:2: (kw= 'integer' | kw= 'string' | kw= 'date' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalNlToSql.g:423:3: kw= 'integer'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getIntegerKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:429:3: kw= 'string'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:435:3: kw= 'date'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getDateKeyword_2());
                    		

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


    // $ANTLR start "entryRuleSelectStatement"
    // InternalNlToSql.g:444:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalNlToSql.g:444:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalNlToSql.g:445:2: iv_ruleSelectStatement= ruleSelectStatement EOF
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
    // InternalNlToSql.g:451:1: ruleSelectStatement returns [EObject current=null] : (otherlv_0= 'From' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList otherlv_4= 'show' ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )? ) ;
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
            // InternalNlToSql.g:457:2: ( (otherlv_0= 'From' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList otherlv_4= 'show' ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )? ) )
            // InternalNlToSql.g:458:2: (otherlv_0= 'From' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList otherlv_4= 'show' ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )? )
            {
            // InternalNlToSql.g:458:2: (otherlv_0= 'From' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList otherlv_4= 'show' ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )? )
            // InternalNlToSql.g:459:3: otherlv_0= 'From' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList otherlv_4= 'show' ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) ) (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )? (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getFromKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getTableKeyword_2());
            		

            			newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectTablesListParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SelectTablesList_3=ruleSelectTablesList();

            state._fsp--;


            			current = this_SelectTablesList_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectStatementAccess().getShowKeyword_4());
            		
            // InternalNlToSql.g:483:3: ( (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) ) | (otherlv_8= 'all' otherlv_9= 'columns' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalNlToSql.g:484:4: (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) )
                    {
                    // InternalNlToSql.g:484:4: (otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) ) )
                    // InternalNlToSql.g:485:5: otherlv_5= 'the' otherlv_6= 'columns:' ( (lv_columns_7_0= ruleSelectColumnsList ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_18); 

                    					newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getTheKeyword_5_0_0());
                    				
                    otherlv_6=(Token)match(input,26,FOLLOW_8); 

                    					newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getColumnsKeyword_5_0_1());
                    				
                    // InternalNlToSql.g:493:5: ( (lv_columns_7_0= ruleSelectColumnsList ) )
                    // InternalNlToSql.g:494:6: (lv_columns_7_0= ruleSelectColumnsList )
                    {
                    // InternalNlToSql.g:494:6: (lv_columns_7_0= ruleSelectColumnsList )
                    // InternalNlToSql.g:495:7: lv_columns_7_0= ruleSelectColumnsList
                    {

                    							newCompositeNode(grammarAccess.getSelectStatementAccess().getColumnsSelectColumnsListParserRuleCall_5_0_2_0());
                    						
                    pushFollow(FOLLOW_19);
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
                    // InternalNlToSql.g:514:4: (otherlv_8= 'all' otherlv_9= 'columns' )
                    {
                    // InternalNlToSql.g:514:4: (otherlv_8= 'all' otherlv_9= 'columns' )
                    // InternalNlToSql.g:515:5: otherlv_8= 'all' otherlv_9= 'columns'
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_10); 

                    					newLeafNode(otherlv_8, grammarAccess.getSelectStatementAccess().getAllKeyword_5_1_0());
                    				
                    otherlv_9=(Token)match(input,16,FOLLOW_19); 

                    					newLeafNode(otherlv_9, grammarAccess.getSelectStatementAccess().getColumnsKeyword_5_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalNlToSql.g:525:3: (otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNlToSql.g:526:4: otherlv_10= 'where' ( (lv_condition_11_0= ruleCondition ) )
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getSelectStatementAccess().getWhereKeyword_6_0());
                    			
                    // InternalNlToSql.g:530:4: ( (lv_condition_11_0= ruleCondition ) )
                    // InternalNlToSql.g:531:5: (lv_condition_11_0= ruleCondition )
                    {
                    // InternalNlToSql.g:531:5: (lv_condition_11_0= ruleCondition )
                    // InternalNlToSql.g:532:6: lv_condition_11_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getConditionConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

            // InternalNlToSql.g:550:3: (otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalNlToSql.g:551:4: otherlv_12= 'group' otherlv_13= 'by' ( (lv_group_14_0= ruleSelectColumnsList ) )
                    {
                    otherlv_12=(Token)match(input,29,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getSelectStatementAccess().getGroupKeyword_7_0());
                    			
                    otherlv_13=(Token)match(input,30,FOLLOW_8); 

                    				newLeafNode(otherlv_13, grammarAccess.getSelectStatementAccess().getByKeyword_7_1());
                    			
                    // InternalNlToSql.g:559:4: ( (lv_group_14_0= ruleSelectColumnsList ) )
                    // InternalNlToSql.g:560:5: (lv_group_14_0= ruleSelectColumnsList )
                    {
                    // InternalNlToSql.g:560:5: (lv_group_14_0= ruleSelectColumnsList )
                    // InternalNlToSql.g:561:6: lv_group_14_0= ruleSelectColumnsList
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
    // InternalNlToSql.g:583:1: entryRuleInsertStatement returns [EObject current=null] : iv_ruleInsertStatement= ruleInsertStatement EOF ;
    public final EObject entryRuleInsertStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertStatement = null;


        try {
            // InternalNlToSql.g:583:56: (iv_ruleInsertStatement= ruleInsertStatement EOF )
            // InternalNlToSql.g:584:2: iv_ruleInsertStatement= ruleInsertStatement EOF
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
    // InternalNlToSql.g:590:1: ruleInsertStatement returns [EObject current=null] : (otherlv_0= 'Insert' otherlv_1= 'into' ruleTheTable this_SelectTable_3= ruleSelectTable otherlv_4= 'for' otherlv_5= 'the' otherlv_6= 'columns' ( (lv_columns_7_0= ruleSelectColumnsList ) ) otherlv_8= 'insert' otherlv_9= 'the' otherlv_10= 'values' otherlv_11= '(' ( (lv_values_12_0= ruleInserValues ) ) otherlv_13= ')' ) ;
    public final EObject ruleInsertStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject this_SelectTable_3 = null;

        EObject lv_columns_7_0 = null;

        EObject lv_values_12_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:596:2: ( (otherlv_0= 'Insert' otherlv_1= 'into' ruleTheTable this_SelectTable_3= ruleSelectTable otherlv_4= 'for' otherlv_5= 'the' otherlv_6= 'columns' ( (lv_columns_7_0= ruleSelectColumnsList ) ) otherlv_8= 'insert' otherlv_9= 'the' otherlv_10= 'values' otherlv_11= '(' ( (lv_values_12_0= ruleInserValues ) ) otherlv_13= ')' ) )
            // InternalNlToSql.g:597:2: (otherlv_0= 'Insert' otherlv_1= 'into' ruleTheTable this_SelectTable_3= ruleSelectTable otherlv_4= 'for' otherlv_5= 'the' otherlv_6= 'columns' ( (lv_columns_7_0= ruleSelectColumnsList ) ) otherlv_8= 'insert' otherlv_9= 'the' otherlv_10= 'values' otherlv_11= '(' ( (lv_values_12_0= ruleInserValues ) ) otherlv_13= ')' )
            {
            // InternalNlToSql.g:597:2: (otherlv_0= 'Insert' otherlv_1= 'into' ruleTheTable this_SelectTable_3= ruleSelectTable otherlv_4= 'for' otherlv_5= 'the' otherlv_6= 'columns' ( (lv_columns_7_0= ruleSelectColumnsList ) ) otherlv_8= 'insert' otherlv_9= 'the' otherlv_10= 'values' otherlv_11= '(' ( (lv_values_12_0= ruleInserValues ) ) otherlv_13= ')' )
            // InternalNlToSql.g:598:3: otherlv_0= 'Insert' otherlv_1= 'into' ruleTheTable this_SelectTable_3= ruleSelectTable otherlv_4= 'for' otherlv_5= 'the' otherlv_6= 'columns' ( (lv_columns_7_0= ruleSelectColumnsList ) ) otherlv_8= 'insert' otherlv_9= 'the' otherlv_10= 'values' otherlv_11= '(' ( (lv_values_12_0= ruleInserValues ) ) otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertStatementAccess().getInsertKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertStatementAccess().getIntoKeyword_1());
            		

            			newCompositeNode(grammarAccess.getInsertStatementAccess().getTheTableParserRuleCall_2());
            		
            pushFollow(FOLLOW_24);
            ruleTheTable();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getInsertStatementAccess().getSelectTableParserRuleCall_3());
            		
            pushFollow(FOLLOW_25);
            this_SelectTable_3=ruleSelectTable();

            state._fsp--;


            			current = this_SelectTable_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,33,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getInsertStatementAccess().getForKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getInsertStatementAccess().getTheKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getInsertStatementAccess().getColumnsKeyword_6());
            		
            // InternalNlToSql.g:633:3: ( (lv_columns_7_0= ruleSelectColumnsList ) )
            // InternalNlToSql.g:634:4: (lv_columns_7_0= ruleSelectColumnsList )
            {
            // InternalNlToSql.g:634:4: (lv_columns_7_0= ruleSelectColumnsList )
            // InternalNlToSql.g:635:5: lv_columns_7_0= ruleSelectColumnsList
            {

            					newCompositeNode(grammarAccess.getInsertStatementAccess().getColumnsSelectColumnsListParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_26);
            lv_columns_7_0=ruleSelectColumnsList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            					}
            					set(
            						current,
            						"columns",
            						lv_columns_7_0,
            						"uk.ac.kcl.inf.NlToSql.SelectColumnsList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_8, grammarAccess.getInsertStatementAccess().getInsertKeyword_8());
            		
            otherlv_9=(Token)match(input,24,FOLLOW_27); 

            			newLeafNode(otherlv_9, grammarAccess.getInsertStatementAccess().getTheKeyword_9());
            		
            otherlv_10=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_10, grammarAccess.getInsertStatementAccess().getValuesKeyword_10());
            		
            otherlv_11=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_11, grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_11());
            		
            // InternalNlToSql.g:668:3: ( (lv_values_12_0= ruleInserValues ) )
            // InternalNlToSql.g:669:4: (lv_values_12_0= ruleInserValues )
            {
            // InternalNlToSql.g:669:4: (lv_values_12_0= ruleInserValues )
            // InternalNlToSql.g:670:5: lv_values_12_0= ruleInserValues
            {

            					newCompositeNode(grammarAccess.getInsertStatementAccess().getValuesInserValuesParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_30);
            lv_values_12_0=ruleInserValues();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertStatementRule());
            					}
            					set(
            						current,
            						"values",
            						lv_values_12_0,
            						"uk.ac.kcl.inf.NlToSql.InserValues");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_13());
            		

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
    // InternalNlToSql.g:695:1: entryRuleUpdateStatement returns [EObject current=null] : iv_ruleUpdateStatement= ruleUpdateStatement EOF ;
    public final EObject entryRuleUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateStatement = null;


        try {
            // InternalNlToSql.g:695:56: (iv_ruleUpdateStatement= ruleUpdateStatement EOF )
            // InternalNlToSql.g:696:2: iv_ruleUpdateStatement= ruleUpdateStatement EOF
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
    // InternalNlToSql.g:702:1: ruleUpdateStatement returns [EObject current=null] : (otherlv_0= 'Update' ruleTheTable this_SelectTable_2= ruleSelectTable otherlv_3= 'to' otherlv_4= 'set' ( (lv_updates_5_0= ruleSelectUpdateList ) ) (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )? ) ;
    public final EObject ruleUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_SelectTable_2 = null;

        EObject lv_updates_5_0 = null;

        EObject lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:708:2: ( (otherlv_0= 'Update' ruleTheTable this_SelectTable_2= ruleSelectTable otherlv_3= 'to' otherlv_4= 'set' ( (lv_updates_5_0= ruleSelectUpdateList ) ) (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )? ) )
            // InternalNlToSql.g:709:2: (otherlv_0= 'Update' ruleTheTable this_SelectTable_2= ruleSelectTable otherlv_3= 'to' otherlv_4= 'set' ( (lv_updates_5_0= ruleSelectUpdateList ) ) (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )? )
            {
            // InternalNlToSql.g:709:2: (otherlv_0= 'Update' ruleTheTable this_SelectTable_2= ruleSelectTable otherlv_3= 'to' otherlv_4= 'set' ( (lv_updates_5_0= ruleSelectUpdateList ) ) (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )? )
            // InternalNlToSql.g:710:3: otherlv_0= 'Update' ruleTheTable this_SelectTable_2= ruleSelectTable otherlv_3= 'to' otherlv_4= 'set' ( (lv_updates_5_0= ruleSelectUpdateList ) ) (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateStatementAccess().getUpdateKeyword_0());
            		

            			newCompositeNode(grammarAccess.getUpdateStatementAccess().getTheTableParserRuleCall_1());
            		
            pushFollow(FOLLOW_24);
            ruleTheTable();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

            			newCompositeNode(grammarAccess.getUpdateStatementAccess().getSelectTableParserRuleCall_2());
            		
            pushFollow(FOLLOW_31);
            this_SelectTable_2=ruleSelectTable();

            state._fsp--;


            			current = this_SelectTable_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getUpdateStatementAccess().getToKeyword_3());
            		
            otherlv_4=(Token)match(input,40,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateStatementAccess().getSetKeyword_4());
            		
            // InternalNlToSql.g:737:3: ( (lv_updates_5_0= ruleSelectUpdateList ) )
            // InternalNlToSql.g:738:4: (lv_updates_5_0= ruleSelectUpdateList )
            {
            // InternalNlToSql.g:738:4: (lv_updates_5_0= ruleSelectUpdateList )
            // InternalNlToSql.g:739:5: lv_updates_5_0= ruleSelectUpdateList
            {

            					newCompositeNode(grammarAccess.getUpdateStatementAccess().getUpdatesSelectUpdateListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_33);
            lv_updates_5_0=ruleSelectUpdateList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
            					}
            					set(
            						current,
            						"updates",
            						lv_updates_5_0,
            						"uk.ac.kcl.inf.NlToSql.SelectUpdateList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:756:3: (otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNlToSql.g:757:4: otherlv_6= 'where' ( (lv_condition_7_0= ruleCondition ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getUpdateStatementAccess().getWhereKeyword_6_0());
                    			
                    // InternalNlToSql.g:761:4: ( (lv_condition_7_0= ruleCondition ) )
                    // InternalNlToSql.g:762:5: (lv_condition_7_0= ruleCondition )
                    {
                    // InternalNlToSql.g:762:5: (lv_condition_7_0= ruleCondition )
                    // InternalNlToSql.g:763:6: lv_condition_7_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getUpdateStatementAccess().getConditionConditionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_condition_7_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUpdateStatementRule());
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
    // $ANTLR end "ruleUpdateStatement"


    // $ANTLR start "entryRuleSelectUpdateList"
    // InternalNlToSql.g:785:1: entryRuleSelectUpdateList returns [EObject current=null] : iv_ruleSelectUpdateList= ruleSelectUpdateList EOF ;
    public final EObject entryRuleSelectUpdateList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectUpdateList = null;


        try {
            // InternalNlToSql.g:785:57: (iv_ruleSelectUpdateList= ruleSelectUpdateList EOF )
            // InternalNlToSql.g:786:2: iv_ruleSelectUpdateList= ruleSelectUpdateList EOF
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
    // InternalNlToSql.g:792:1: ruleSelectUpdateList returns [EObject current=null] : ( ( (lv_updateItem_0_0= ruleUpdateItem ) ) (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )* ) ;
    public final EObject ruleSelectUpdateList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_updateItem_0_0 = null;

        EObject lv_updateItem_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:798:2: ( ( ( (lv_updateItem_0_0= ruleUpdateItem ) ) (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )* ) )
            // InternalNlToSql.g:799:2: ( ( (lv_updateItem_0_0= ruleUpdateItem ) ) (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )* )
            {
            // InternalNlToSql.g:799:2: ( ( (lv_updateItem_0_0= ruleUpdateItem ) ) (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )* )
            // InternalNlToSql.g:800:3: ( (lv_updateItem_0_0= ruleUpdateItem ) ) (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )*
            {
            // InternalNlToSql.g:800:3: ( (lv_updateItem_0_0= ruleUpdateItem ) )
            // InternalNlToSql.g:801:4: (lv_updateItem_0_0= ruleUpdateItem )
            {
            // InternalNlToSql.g:801:4: (lv_updateItem_0_0= ruleUpdateItem )
            // InternalNlToSql.g:802:5: lv_updateItem_0_0= ruleUpdateItem
            {

            					newCompositeNode(grammarAccess.getSelectUpdateListAccess().getUpdateItemUpdateItemParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalNlToSql.g:819:3: (otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalNlToSql.g:820:4: otherlv_1= ',' ( (lv_updateItem_2_0= ruleUpdateItem ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectUpdateListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:824:4: ( (lv_updateItem_2_0= ruleUpdateItem ) )
            	    // InternalNlToSql.g:825:5: (lv_updateItem_2_0= ruleUpdateItem )
            	    {
            	    // InternalNlToSql.g:825:5: (lv_updateItem_2_0= ruleUpdateItem )
            	    // InternalNlToSql.g:826:6: lv_updateItem_2_0= ruleUpdateItem
            	    {

            	    						newCompositeNode(grammarAccess.getSelectUpdateListAccess().getUpdateItemUpdateItemParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // InternalNlToSql.g:848:1: entryRuleUpdateItem returns [EObject current=null] : iv_ruleUpdateItem= ruleUpdateItem EOF ;
    public final EObject entryRuleUpdateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateItem = null;


        try {
            // InternalNlToSql.g:848:51: (iv_ruleUpdateItem= ruleUpdateItem EOF )
            // InternalNlToSql.g:849:2: iv_ruleUpdateItem= ruleUpdateItem EOF
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
    // InternalNlToSql.g:855:1: ruleUpdateItem returns [EObject current=null] : ( ruleTheA ( (lv_column_1_0= ruleColumnReference ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) ;
    public final EObject ruleUpdateItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_column_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:861:2: ( ( ruleTheA ( (lv_column_1_0= ruleColumnReference ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) ) )
            // InternalNlToSql.g:862:2: ( ruleTheA ( (lv_column_1_0= ruleColumnReference ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            {
            // InternalNlToSql.g:862:2: ( ruleTheA ( (lv_column_1_0= ruleColumnReference ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) ) )
            // InternalNlToSql.g:863:3: ruleTheA ( (lv_column_1_0= ruleColumnReference ) ) otherlv_2= '=' ( (lv_value_3_0= ruleValue ) )
            {

            			newCompositeNode(grammarAccess.getUpdateItemAccess().getTheAParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            ruleTheA();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalNlToSql.g:870:3: ( (lv_column_1_0= ruleColumnReference ) )
            // InternalNlToSql.g:871:4: (lv_column_1_0= ruleColumnReference )
            {
            // InternalNlToSql.g:871:4: (lv_column_1_0= ruleColumnReference )
            // InternalNlToSql.g:872:5: lv_column_1_0= ruleColumnReference
            {

            					newCompositeNode(grammarAccess.getUpdateItemAccess().getColumnColumnReferenceParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_column_1_0=ruleColumnReference();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateItemRule());
            					}
            					set(
            						current,
            						"column",
            						lv_column_1_0,
            						"uk.ac.kcl.inf.NlToSql.ColumnReference");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,41,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_2());
            		
            // InternalNlToSql.g:893:3: ( (lv_value_3_0= ruleValue ) )
            // InternalNlToSql.g:894:4: (lv_value_3_0= ruleValue )
            {
            // InternalNlToSql.g:894:4: (lv_value_3_0= ruleValue )
            // InternalNlToSql.g:895:5: lv_value_3_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateItemRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
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
    // InternalNlToSql.g:916:1: entryRuleInserValues returns [EObject current=null] : iv_ruleInserValues= ruleInserValues EOF ;
    public final EObject entryRuleInserValues() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInserValues = null;


        try {
            // InternalNlToSql.g:916:52: (iv_ruleInserValues= ruleInserValues EOF )
            // InternalNlToSql.g:917:2: iv_ruleInserValues= ruleInserValues EOF
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
    // InternalNlToSql.g:923:1: ruleInserValues returns [EObject current=null] : ( ( (lv_valueList_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )* ) ;
    public final EObject ruleInserValues() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valueList_0_0 = null;

        AntlrDatatypeRuleToken lv_valueList_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:929:2: ( ( ( (lv_valueList_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )* ) )
            // InternalNlToSql.g:930:2: ( ( (lv_valueList_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )* )
            {
            // InternalNlToSql.g:930:2: ( ( (lv_valueList_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )* )
            // InternalNlToSql.g:931:3: ( (lv_valueList_0_0= ruleValue ) ) (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )*
            {
            // InternalNlToSql.g:931:3: ( (lv_valueList_0_0= ruleValue ) )
            // InternalNlToSql.g:932:4: (lv_valueList_0_0= ruleValue )
            {
            // InternalNlToSql.g:932:4: (lv_valueList_0_0= ruleValue )
            // InternalNlToSql.g:933:5: lv_valueList_0_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getInserValuesAccess().getValueListValueParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalNlToSql.g:950:3: (otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalNlToSql.g:951:4: otherlv_1= ',' ( (lv_valueList_2_0= ruleValue ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_29); 

            	    				newLeafNode(otherlv_1, grammarAccess.getInserValuesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:955:4: ( (lv_valueList_2_0= ruleValue ) )
            	    // InternalNlToSql.g:956:5: (lv_valueList_2_0= ruleValue )
            	    {
            	    // InternalNlToSql.g:956:5: (lv_valueList_2_0= ruleValue )
            	    // InternalNlToSql.g:957:6: lv_valueList_2_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getInserValuesAccess().getValueListValueParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // InternalNlToSql.g:979:1: entryRuleSelectTablesList returns [EObject current=null] : iv_ruleSelectTablesList= ruleSelectTablesList EOF ;
    public final EObject entryRuleSelectTablesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectTablesList = null;


        try {
            // InternalNlToSql.g:979:57: (iv_ruleSelectTablesList= ruleSelectTablesList EOF )
            // InternalNlToSql.g:980:2: iv_ruleSelectTablesList= ruleSelectTablesList EOF
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
    // InternalNlToSql.g:986:1: ruleSelectTablesList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleSelectTablesList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalNlToSql.g:992:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalNlToSql.g:993:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalNlToSql.g:993:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalNlToSql.g:994:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalNlToSql.g:994:3: ( (otherlv_0= RULE_ID ) )
            // InternalNlToSql.g:995:4: (otherlv_0= RULE_ID )
            {
            // InternalNlToSql.g:995:4: (otherlv_0= RULE_ID )
            // InternalNlToSql.g:996:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectTablesListRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getSelectTablesListAccess().getSelectTableTableCrossReference_0_0());
            				

            }


            }

            // InternalNlToSql.g:1007:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalNlToSql.g:1008:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectTablesListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:1012:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalNlToSql.g:1013:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalNlToSql.g:1013:5: (otherlv_2= RULE_ID )
            	    // InternalNlToSql.g:1014:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSelectTablesListRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

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
    // InternalNlToSql.g:1030:1: entryRuleSelectTable returns [EObject current=null] : iv_ruleSelectTable= ruleSelectTable EOF ;
    public final EObject entryRuleSelectTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectTable = null;


        try {
            // InternalNlToSql.g:1030:52: (iv_ruleSelectTable= ruleSelectTable EOF )
            // InternalNlToSql.g:1031:2: iv_ruleSelectTable= ruleSelectTable EOF
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
    // InternalNlToSql.g:1037:1: ruleSelectTable returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleSelectTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1043:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalNlToSql.g:1044:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalNlToSql.g:1044:2: ( (otherlv_0= RULE_ID ) )
            // InternalNlToSql.g:1045:3: (otherlv_0= RULE_ID )
            {
            // InternalNlToSql.g:1045:3: (otherlv_0= RULE_ID )
            // InternalNlToSql.g:1046:4: otherlv_0= RULE_ID
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
    // InternalNlToSql.g:1060:1: entryRuleSelectColumnsList returns [EObject current=null] : iv_ruleSelectColumnsList= ruleSelectColumnsList EOF ;
    public final EObject entryRuleSelectColumnsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectColumnsList = null;


        try {
            // InternalNlToSql.g:1060:58: (iv_ruleSelectColumnsList= ruleSelectColumnsList EOF )
            // InternalNlToSql.g:1061:2: iv_ruleSelectColumnsList= ruleSelectColumnsList EOF
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
    // InternalNlToSql.g:1067:1: ruleSelectColumnsList returns [EObject current=null] : ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* ) ;
    public final EObject ruleSelectColumnsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_selectColumn_0_0 = null;

        EObject lv_selectColumn_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:1073:2: ( ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* ) )
            // InternalNlToSql.g:1074:2: ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* )
            {
            // InternalNlToSql.g:1074:2: ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* )
            // InternalNlToSql.g:1075:3: ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )*
            {
            // InternalNlToSql.g:1075:3: ( (lv_selectColumn_0_0= ruleColumnReference ) )
            // InternalNlToSql.g:1076:4: (lv_selectColumn_0_0= ruleColumnReference )
            {
            // InternalNlToSql.g:1076:4: (lv_selectColumn_0_0= ruleColumnReference )
            // InternalNlToSql.g:1077:5: lv_selectColumn_0_0= ruleColumnReference
            {

            					newCompositeNode(grammarAccess.getSelectColumnsListAccess().getSelectColumnColumnReferenceParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalNlToSql.g:1094:3: (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalNlToSql.g:1095:4: otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectColumnsListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:1099:4: ( (lv_selectColumn_2_0= ruleColumnReference ) )
            	    // InternalNlToSql.g:1100:5: (lv_selectColumn_2_0= ruleColumnReference )
            	    {
            	    // InternalNlToSql.g:1100:5: (lv_selectColumn_2_0= ruleColumnReference )
            	    // InternalNlToSql.g:1101:6: lv_selectColumn_2_0= ruleColumnReference
            	    {

            	    						newCompositeNode(grammarAccess.getSelectColumnsListAccess().getSelectColumnColumnReferenceParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
    // InternalNlToSql.g:1123:1: entryRuleColumnReference returns [EObject current=null] : iv_ruleColumnReference= ruleColumnReference EOF ;
    public final EObject entryRuleColumnReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnReference = null;


        try {
            // InternalNlToSql.g:1123:56: (iv_ruleColumnReference= ruleColumnReference EOF )
            // InternalNlToSql.g:1124:2: iv_ruleColumnReference= ruleColumnReference EOF
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
    // InternalNlToSql.g:1130:1: ruleColumnReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleColumnReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1136:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? ) )
            // InternalNlToSql.g:1137:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // InternalNlToSql.g:1137:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalNlToSql.g:1138:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalNlToSql.g:1138:3: ( (otherlv_0= RULE_ID ) )
            // InternalNlToSql.g:1139:4: (otherlv_0= RULE_ID )
            {
            // InternalNlToSql.g:1139:4: (otherlv_0= RULE_ID )
            // InternalNlToSql.g:1140:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_0, grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0_0());
            				

            }


            }

            // InternalNlToSql.g:1151:3: (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNlToSql.g:1152:4: otherlv_1= 'in' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnReferenceAccess().getInKeyword_1_0());
                    			
                    // InternalNlToSql.g:1156:4: ( (otherlv_2= RULE_ID ) )
                    // InternalNlToSql.g:1157:5: (otherlv_2= RULE_ID )
                    {
                    // InternalNlToSql.g:1157:5: (otherlv_2= RULE_ID )
                    // InternalNlToSql.g:1158:6: otherlv_2= RULE_ID
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
    // InternalNlToSql.g:1174:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalNlToSql.g:1174:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalNlToSql.g:1175:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalNlToSql.g:1181:1: ruleCondition returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:1187:2: ( (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalNlToSql.g:1188:2: (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalNlToSql.g:1188:2: (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalNlToSql.g:1189:3: this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getConditionAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalNlToSql.g:1197:3: ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=43 && LA15_0<=44)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalNlToSql.g:1198:4: () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalNlToSql.g:1198:4: ()
            	    // InternalNlToSql.g:1199:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConditionAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getConditionAccess().getLogicOperatorParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_20);
            	    ruleLogicOperator();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalNlToSql.g:1212:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalNlToSql.g:1213:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalNlToSql.g:1213:5: (lv_right_3_0= ruleComparison )
            	    // InternalNlToSql.g:1214:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getConditionAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_36);
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


    // $ANTLR start "entryRuleLogicOperator"
    // InternalNlToSql.g:1236:1: entryRuleLogicOperator returns [String current=null] : iv_ruleLogicOperator= ruleLogicOperator EOF ;
    public final String entryRuleLogicOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicOperator = null;


        try {
            // InternalNlToSql.g:1236:53: (iv_ruleLogicOperator= ruleLogicOperator EOF )
            // InternalNlToSql.g:1237:2: iv_ruleLogicOperator= ruleLogicOperator EOF
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
    // InternalNlToSql.g:1243:1: ruleLogicOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleLogicOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1249:2: ( (kw= 'and' | kw= 'or' ) )
            // InternalNlToSql.g:1250:2: (kw= 'and' | kw= 'or' )
            {
            // InternalNlToSql.g:1250:2: (kw= 'and' | kw= 'or' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            else if ( (LA16_0==44) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalNlToSql.g:1251:3: kw= 'and'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogicOperatorAccess().getAndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1257:3: kw= 'or'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

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
    // InternalNlToSql.g:1266:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalNlToSql.g:1266:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalNlToSql.g:1267:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalNlToSql.g:1273:1: ruleComparison returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv_rightHandSide_4_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:1279:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) ) )
            // InternalNlToSql.g:1280:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) )
            {
            // InternalNlToSql.g:1280:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) )
            // InternalNlToSql.g:1281:3: (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) )
            {
            // InternalNlToSql.g:1281:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            else if ( (LA17_0==45) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalNlToSql.g:1282:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getComparisonAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1287:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:1292:3: ( (otherlv_2= RULE_ID ) )
            // InternalNlToSql.g:1293:4: (otherlv_2= RULE_ID )
            {
            // InternalNlToSql.g:1293:4: (otherlv_2= RULE_ID )
            // InternalNlToSql.g:1294:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLeftHandSideColumnCrossReference_1_0());
            				

            }


            }

            // InternalNlToSql.g:1305:3: ( (lv_operator_3_0= ruleComparisonOperator ) )
            // InternalNlToSql.g:1306:4: (lv_operator_3_0= ruleComparisonOperator )
            {
            // InternalNlToSql.g:1306:4: (lv_operator_3_0= ruleComparisonOperator )
            // InternalNlToSql.g:1307:5: lv_operator_3_0= ruleComparisonOperator
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalNlToSql.g:1324:3: ( (lv_rightHandSide_4_0= ruleValue ) )
            // InternalNlToSql.g:1325:4: (lv_rightHandSide_4_0= ruleValue )
            {
            // InternalNlToSql.g:1325:4: (lv_rightHandSide_4_0= ruleValue )
            // InternalNlToSql.g:1326:5: lv_rightHandSide_4_0= ruleValue
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
    // InternalNlToSql.g:1347:1: entryRuleComparisonOperator returns [String current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final String entryRuleComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperator = null;


        try {
            // InternalNlToSql.g:1347:58: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalNlToSql.g:1348:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
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
    // InternalNlToSql.g:1354:1: ruleComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1360:2: ( (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) ) )
            // InternalNlToSql.g:1361:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )
            {
            // InternalNlToSql.g:1361:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )
            int alt18=7;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalNlToSql.g:1362:3: kw= '='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1368:3: (kw= 'is' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1368:3: (kw= 'is' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1369:4: kw= 'is' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,46,FOLLOW_38); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getIsKeyword_1_0());
                    			
                    kw=(Token)match(input,47,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_1_1());
                    			
                    kw=(Token)match(input,39,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:1386:3: (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1386:3: (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1387:4: kw= 'is' kw= 'not' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,46,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getIsKeyword_2_0());
                    			
                    kw=(Token)match(input,48,FOLLOW_38); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getNotKeyword_2_1());
                    			
                    kw=(Token)match(input,47,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_2_2());
                    			
                    kw=(Token)match(input,39,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalNlToSql.g:1409:3: (kw= 'less' kw= 'than' )
                    {
                    // InternalNlToSql.g:1409:3: (kw= 'less' kw= 'than' )
                    // InternalNlToSql.g:1410:4: kw= 'less' kw= 'than'
                    {
                    kw=(Token)match(input,49,FOLLOW_40); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessKeyword_3_0());
                    			
                    kw=(Token)match(input,50,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalNlToSql.g:1422:3: (kw= 'greater' kw= 'than' )
                    {
                    // InternalNlToSql.g:1422:3: (kw= 'greater' kw= 'than' )
                    // InternalNlToSql.g:1423:4: kw= 'greater' kw= 'than'
                    {
                    kw=(Token)match(input,51,FOLLOW_40); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_4_0());
                    			
                    kw=(Token)match(input,50,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalNlToSql.g:1435:3: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1435:3: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1436:4: kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,49,FOLLOW_40); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessKeyword_5_0());
                    			
                    kw=(Token)match(input,50,FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_5_1());
                    			
                    kw=(Token)match(input,44,FOLLOW_38); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getOrKeyword_5_2());
                    			
                    kw=(Token)match(input,47,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_5_3());
                    			
                    kw=(Token)match(input,39,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_5_4());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalNlToSql.g:1463:3: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1463:3: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1464:4: kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,51,FOLLOW_40); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_6_0());
                    			
                    kw=(Token)match(input,50,FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_6_1());
                    			
                    kw=(Token)match(input,44,FOLLOW_38); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getOrKeyword_6_2());
                    			
                    kw=(Token)match(input,47,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_6_3());
                    			
                    kw=(Token)match(input,39,FOLLOW_2); 

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
    // InternalNlToSql.g:1494:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalNlToSql.g:1494:45: (iv_ruleValue= ruleValue EOF )
            // InternalNlToSql.g:1495:2: iv_ruleValue= ruleValue EOF
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
    // InternalNlToSql.g:1501:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1507:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalNlToSql.g:1508:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalNlToSql.g:1508:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_STRING) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalNlToSql.g:1509:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1517:3: this_STRING_1= RULE_STRING
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


    // $ANTLR start "entryRuleTheTable"
    // InternalNlToSql.g:1528:1: entryRuleTheTable returns [String current=null] : iv_ruleTheTable= ruleTheTable EOF ;
    public final String entryRuleTheTable() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTheTable = null;


        try {
            // InternalNlToSql.g:1528:48: (iv_ruleTheTable= ruleTheTable EOF )
            // InternalNlToSql.g:1529:2: iv_ruleTheTable= ruleTheTable EOF
            {
             newCompositeNode(grammarAccess.getTheTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheTable=ruleTheTable();

            state._fsp--;

             current =iv_ruleTheTable.getText(); 
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
    // $ANTLR end "entryRuleTheTable"


    // $ANTLR start "ruleTheTable"
    // InternalNlToSql.g:1535:1: ruleTheTable returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'the' kw= 'table' )? ;
    public final AntlrDatatypeRuleToken ruleTheTable() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1541:2: ( (kw= 'the' kw= 'table' )? )
            // InternalNlToSql.g:1542:2: (kw= 'the' kw= 'table' )?
            {
            // InternalNlToSql.g:1542:2: (kw= 'the' kw= 'table' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalNlToSql.g:1543:3: kw= 'the' kw= 'table'
                    {
                    kw=(Token)match(input,24,FOLLOW_6); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTheTableAccess().getTheKeyword_0());
                    		
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTheTableAccess().getTableKeyword_1());
                    		

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
    // $ANTLR end "ruleTheTable"


    // $ANTLR start "entryRuleTheA"
    // InternalNlToSql.g:1557:1: entryRuleTheA returns [String current=null] : iv_ruleTheA= ruleTheA EOF ;
    public final String entryRuleTheA() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTheA = null;


        try {
            // InternalNlToSql.g:1557:44: (iv_ruleTheA= ruleTheA EOF )
            // InternalNlToSql.g:1558:2: iv_ruleTheA= ruleTheA EOF
            {
             newCompositeNode(grammarAccess.getTheARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTheA=ruleTheA();

            state._fsp--;

             current =iv_ruleTheA.getText(); 
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
    // $ANTLR end "entryRuleTheA"


    // $ANTLR start "ruleTheA"
    // InternalNlToSql.g:1564:1: ruleTheA returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'the' | kw= 'a' )? ;
    public final AntlrDatatypeRuleToken ruleTheA() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1570:2: ( (kw= 'the' | kw= 'a' )? )
            // InternalNlToSql.g:1571:2: (kw= 'the' | kw= 'a' )?
            {
            // InternalNlToSql.g:1571:2: (kw= 'the' | kw= 'a' )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            else if ( (LA21_0==45) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalNlToSql.g:1572:3: kw= 'the'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTheAAccess().getTheKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1578:3: kw= 'a'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTheAAccess().getAKeyword_1());
                    		

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
    // $ANTLR end "ruleTheA"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\7\uffff\1\11\1\13\4\uffff";
    static final String dfa_3s = "\1\51\1\uffff\1\57\2\62\2\uffff\2\5\4\uffff";
    static final String dfa_4s = "\1\63\1\uffff\1\60\2\62\2\uffff\2\54\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\3\1\2\2\uffff\1\4\1\6\1\5\1\7";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\4\uffff\1\2\2\uffff\1\3\1\uffff\1\4",
            "",
            "\1\6\1\5",
            "\1\7",
            "\1\10",
            "",
            "",
            "\2\11\45\uffff\1\12",
            "\2\13\45\uffff\1\14",
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
            return "1361:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000004080801002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000200001002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200001000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000A420000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});

}