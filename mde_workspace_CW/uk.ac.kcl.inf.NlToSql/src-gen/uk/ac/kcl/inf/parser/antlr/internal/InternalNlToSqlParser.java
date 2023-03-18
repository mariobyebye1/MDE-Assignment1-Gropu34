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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'create'", "'the'", "'a'", "'table'", "'called'", "'with'", "'columns'", "','", "'of'", "'type'", "'int'", "'string'", "'date'", "'from'", "'can'", "'you'", "'show'", "'columns:'", "'all'", "'where'", "'group'", "'by'", "'in'", "'and'", "'or'", "'='", "'is'", "'equal'", "'to'", "'not'", "'less'", "'than'", "'greater'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__44=44;
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

                if ( (LA1_0==12||LA1_0==25) ) {
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
    // InternalNlToSql.g:107:1: ruleStatement returns [EObject current=null] : ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement ) otherlv_2= '.' ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_CreateTableStatement_0 = null;

        EObject this_SelectStatement_1 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:113:2: ( ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement ) otherlv_2= '.' ) )
            // InternalNlToSql.g:114:2: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement ) otherlv_2= '.' )
            {
            // InternalNlToSql.g:114:2: ( (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement ) otherlv_2= '.' )
            // InternalNlToSql.g:115:3: (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement ) otherlv_2= '.'
            {
            // InternalNlToSql.g:115:3: (this_CreateTableStatement_0= ruleCreateTableStatement | this_SelectStatement_1= ruleSelectStatement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
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

            }

            otherlv_2=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getFullStopKeyword_1());
            		

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
    // InternalNlToSql.g:142:1: entryRuleCreateTableStatement returns [EObject current=null] : iv_ruleCreateTableStatement= ruleCreateTableStatement EOF ;
    public final EObject entryRuleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateTableStatement = null;


        try {
            // InternalNlToSql.g:142:61: (iv_ruleCreateTableStatement= ruleCreateTableStatement EOF )
            // InternalNlToSql.g:143:2: iv_ruleCreateTableStatement= ruleCreateTableStatement EOF
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
    // InternalNlToSql.g:149:1: ruleCreateTableStatement returns [EObject current=null] : (otherlv_0= 'create' (otherlv_1= 'the' | otherlv_2= 'a' )? otherlv_3= 'table' otherlv_4= 'called' ( (lv_table_5_0= ruleTable ) ) (otherlv_6= 'with' otherlv_7= 'columns' ( (lv_columns_8_0= ruleColumnList ) ) )? ) ;
    public final EObject ruleCreateTableStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_table_5_0 = null;

        EObject lv_columns_8_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:155:2: ( (otherlv_0= 'create' (otherlv_1= 'the' | otherlv_2= 'a' )? otherlv_3= 'table' otherlv_4= 'called' ( (lv_table_5_0= ruleTable ) ) (otherlv_6= 'with' otherlv_7= 'columns' ( (lv_columns_8_0= ruleColumnList ) ) )? ) )
            // InternalNlToSql.g:156:2: (otherlv_0= 'create' (otherlv_1= 'the' | otherlv_2= 'a' )? otherlv_3= 'table' otherlv_4= 'called' ( (lv_table_5_0= ruleTable ) ) (otherlv_6= 'with' otherlv_7= 'columns' ( (lv_columns_8_0= ruleColumnList ) ) )? )
            {
            // InternalNlToSql.g:156:2: (otherlv_0= 'create' (otherlv_1= 'the' | otherlv_2= 'a' )? otherlv_3= 'table' otherlv_4= 'called' ( (lv_table_5_0= ruleTable ) ) (otherlv_6= 'with' otherlv_7= 'columns' ( (lv_columns_8_0= ruleColumnList ) ) )? )
            // InternalNlToSql.g:157:3: otherlv_0= 'create' (otherlv_1= 'the' | otherlv_2= 'a' )? otherlv_3= 'table' otherlv_4= 'called' ( (lv_table_5_0= ruleTable ) ) (otherlv_6= 'with' otherlv_7= 'columns' ( (lv_columns_8_0= ruleColumnList ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCreateTableStatementAccess().getCreateKeyword_0());
            		
            // InternalNlToSql.g:161:3: (otherlv_1= 'the' | otherlv_2= 'a' )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // InternalNlToSql.g:162:4: otherlv_1= 'the'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getCreateTableStatementAccess().getTheKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:167:4: otherlv_2= 'a'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getCreateTableStatementAccess().getAKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getCreateTableStatementAccess().getTableKeyword_2());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getCreateTableStatementAccess().getCalledKeyword_3());
            		
            // InternalNlToSql.g:180:3: ( (lv_table_5_0= ruleTable ) )
            // InternalNlToSql.g:181:4: (lv_table_5_0= ruleTable )
            {
            // InternalNlToSql.g:181:4: (lv_table_5_0= ruleTable )
            // InternalNlToSql.g:182:5: lv_table_5_0= ruleTable
            {

            					newCompositeNode(grammarAccess.getCreateTableStatementAccess().getTableTableParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_table_5_0=ruleTable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
            					}
            					set(
            						current,
            						"table",
            						lv_table_5_0,
            						"uk.ac.kcl.inf.NlToSql.Table");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalNlToSql.g:199:3: (otherlv_6= 'with' otherlv_7= 'columns' ( (lv_columns_8_0= ruleColumnList ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNlToSql.g:200:4: otherlv_6= 'with' otherlv_7= 'columns' ( (lv_columns_8_0= ruleColumnList ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getCreateTableStatementAccess().getWithKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getCreateTableStatementAccess().getColumnsKeyword_5_1());
                    			
                    // InternalNlToSql.g:208:4: ( (lv_columns_8_0= ruleColumnList ) )
                    // InternalNlToSql.g:209:5: (lv_columns_8_0= ruleColumnList )
                    {
                    // InternalNlToSql.g:209:5: (lv_columns_8_0= ruleColumnList )
                    // InternalNlToSql.g:210:6: lv_columns_8_0= ruleColumnList
                    {

                    						newCompositeNode(grammarAccess.getCreateTableStatementAccess().getColumnsColumnListParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_columns_8_0=ruleColumnList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCreateTableStatementRule());
                    						}
                    						set(
                    							current,
                    							"columns",
                    							lv_columns_8_0,
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
    // InternalNlToSql.g:232:1: entryRuleColumnList returns [EObject current=null] : iv_ruleColumnList= ruleColumnList EOF ;
    public final EObject entryRuleColumnList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnList = null;


        try {
            // InternalNlToSql.g:232:51: (iv_ruleColumnList= ruleColumnList EOF )
            // InternalNlToSql.g:233:2: iv_ruleColumnList= ruleColumnList EOF
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
    // InternalNlToSql.g:239:1: ruleColumnList returns [EObject current=null] : ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* ) ;
    public final EObject ruleColumnList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_columnItem_0_0 = null;

        EObject lv_columnItem_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:245:2: ( ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* ) )
            // InternalNlToSql.g:246:2: ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* )
            {
            // InternalNlToSql.g:246:2: ( ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )* )
            // InternalNlToSql.g:247:3: ( (lv_columnItem_0_0= ruleColumn ) ) (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )*
            {
            // InternalNlToSql.g:247:3: ( (lv_columnItem_0_0= ruleColumn ) )
            // InternalNlToSql.g:248:4: (lv_columnItem_0_0= ruleColumn )
            {
            // InternalNlToSql.g:248:4: (lv_columnItem_0_0= ruleColumn )
            // InternalNlToSql.g:249:5: lv_columnItem_0_0= ruleColumn
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

            // InternalNlToSql.g:266:3: (otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalNlToSql.g:267:4: otherlv_1= ',' ( (lv_columnItem_2_0= ruleColumn ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getColumnListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:271:4: ( (lv_columnItem_2_0= ruleColumn ) )
            	    // InternalNlToSql.g:272:5: (lv_columnItem_2_0= ruleColumn )
            	    {
            	    // InternalNlToSql.g:272:5: (lv_columnItem_2_0= ruleColumn )
            	    // InternalNlToSql.g:273:6: lv_columnItem_2_0= ruleColumn
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
            	    break loop5;
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
    // InternalNlToSql.g:295:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalNlToSql.g:295:46: (iv_ruleTable= ruleTable EOF )
            // InternalNlToSql.g:296:2: iv_ruleTable= ruleTable EOF
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
    // InternalNlToSql.g:302:1: ruleTable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalNlToSql.g:308:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalNlToSql.g:309:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalNlToSql.g:309:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalNlToSql.g:310:3: (lv_name_0_0= RULE_ID )
            {
            // InternalNlToSql.g:310:3: (lv_name_0_0= RULE_ID )
            // InternalNlToSql.g:311:4: lv_name_0_0= RULE_ID
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
    // InternalNlToSql.g:330:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalNlToSql.g:330:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalNlToSql.g:331:2: iv_ruleColumn= ruleColumn EOF
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
    // InternalNlToSql.g:337:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:343:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) ) )
            // InternalNlToSql.g:344:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) )
            {
            // InternalNlToSql.g:344:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) ) )
            // InternalNlToSql.g:345:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'of' otherlv_2= 'type' ( (lv_type_3_0= ruleDatatype ) )
            {
            // InternalNlToSql.g:345:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalNlToSql.g:346:4: (lv_name_0_0= RULE_ID )
            {
            // InternalNlToSql.g:346:4: (lv_name_0_0= RULE_ID )
            // InternalNlToSql.g:347:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getOfKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getTypeKeyword_2());
            		
            // InternalNlToSql.g:371:3: ( (lv_type_3_0= ruleDatatype ) )
            // InternalNlToSql.g:372:4: (lv_type_3_0= ruleDatatype )
            {
            // InternalNlToSql.g:372:4: (lv_type_3_0= ruleDatatype )
            // InternalNlToSql.g:373:5: lv_type_3_0= ruleDatatype
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
    // InternalNlToSql.g:394:1: entryRuleDatatype returns [String current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final String entryRuleDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype = null;


        try {
            // InternalNlToSql.g:394:48: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalNlToSql.g:395:2: iv_ruleDatatype= ruleDatatype EOF
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
    // InternalNlToSql.g:401:1: ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'string' | kw= 'date' ) ;
    public final AntlrDatatypeRuleToken ruleDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:407:2: ( (kw= 'int' | kw= 'string' | kw= 'date' ) )
            // InternalNlToSql.g:408:2: (kw= 'int' | kw= 'string' | kw= 'date' )
            {
            // InternalNlToSql.g:408:2: (kw= 'int' | kw= 'string' | kw= 'date' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalNlToSql.g:409:3: kw= 'int'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:415:3: kw= 'string'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:421:3: kw= 'date'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

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
    // InternalNlToSql.g:430:1: entryRuleSelectStatement returns [EObject current=null] : iv_ruleSelectStatement= ruleSelectStatement EOF ;
    public final EObject entryRuleSelectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectStatement = null;


        try {
            // InternalNlToSql.g:430:56: (iv_ruleSelectStatement= ruleSelectStatement EOF )
            // InternalNlToSql.g:431:2: iv_ruleSelectStatement= ruleSelectStatement EOF
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
    // InternalNlToSql.g:437:1: ruleSelectStatement returns [EObject current=null] : (otherlv_0= 'from' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList (otherlv_4= 'can' otherlv_5= 'you' )? otherlv_6= 'show' ( (otherlv_7= 'the' otherlv_8= 'columns:' ( (lv_columns_9_0= ruleSelectColumnsList ) ) ) | (otherlv_10= 'all' otherlv_11= 'columns' ) ) (otherlv_12= 'where' ( (lv_condition_13_0= ruleCondition ) ) )? (otherlv_14= 'group' otherlv_15= 'by' ( (lv_groupByList_16_0= ruleColumn ) ) (otherlv_17= ',' ( (lv_groupByList_18_0= ruleColumn ) ) )* )? ) ;
    public final EObject ruleSelectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        EObject this_SelectTablesList_3 = null;

        EObject lv_columns_9_0 = null;

        EObject lv_condition_13_0 = null;

        EObject lv_groupByList_16_0 = null;

        EObject lv_groupByList_18_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:443:2: ( (otherlv_0= 'from' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList (otherlv_4= 'can' otherlv_5= 'you' )? otherlv_6= 'show' ( (otherlv_7= 'the' otherlv_8= 'columns:' ( (lv_columns_9_0= ruleSelectColumnsList ) ) ) | (otherlv_10= 'all' otherlv_11= 'columns' ) ) (otherlv_12= 'where' ( (lv_condition_13_0= ruleCondition ) ) )? (otherlv_14= 'group' otherlv_15= 'by' ( (lv_groupByList_16_0= ruleColumn ) ) (otherlv_17= ',' ( (lv_groupByList_18_0= ruleColumn ) ) )* )? ) )
            // InternalNlToSql.g:444:2: (otherlv_0= 'from' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList (otherlv_4= 'can' otherlv_5= 'you' )? otherlv_6= 'show' ( (otherlv_7= 'the' otherlv_8= 'columns:' ( (lv_columns_9_0= ruleSelectColumnsList ) ) ) | (otherlv_10= 'all' otherlv_11= 'columns' ) ) (otherlv_12= 'where' ( (lv_condition_13_0= ruleCondition ) ) )? (otherlv_14= 'group' otherlv_15= 'by' ( (lv_groupByList_16_0= ruleColumn ) ) (otherlv_17= ',' ( (lv_groupByList_18_0= ruleColumn ) ) )* )? )
            {
            // InternalNlToSql.g:444:2: (otherlv_0= 'from' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList (otherlv_4= 'can' otherlv_5= 'you' )? otherlv_6= 'show' ( (otherlv_7= 'the' otherlv_8= 'columns:' ( (lv_columns_9_0= ruleSelectColumnsList ) ) ) | (otherlv_10= 'all' otherlv_11= 'columns' ) ) (otherlv_12= 'where' ( (lv_condition_13_0= ruleCondition ) ) )? (otherlv_14= 'group' otherlv_15= 'by' ( (lv_groupByList_16_0= ruleColumn ) ) (otherlv_17= ',' ( (lv_groupByList_18_0= ruleColumn ) ) )* )? )
            // InternalNlToSql.g:445:3: otherlv_0= 'from' otherlv_1= 'the' otherlv_2= 'table' this_SelectTablesList_3= ruleSelectTablesList (otherlv_4= 'can' otherlv_5= 'you' )? otherlv_6= 'show' ( (otherlv_7= 'the' otherlv_8= 'columns:' ( (lv_columns_9_0= ruleSelectColumnsList ) ) ) | (otherlv_10= 'all' otherlv_11= 'columns' ) ) (otherlv_12= 'where' ( (lv_condition_13_0= ruleCondition ) ) )? (otherlv_14= 'group' otherlv_15= 'by' ( (lv_groupByList_16_0= ruleColumn ) ) (otherlv_17= ',' ( (lv_groupByList_18_0= ruleColumn ) ) )* )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectStatementAccess().getFromKeyword_0());
            		
            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSelectStatementAccess().getTheKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSelectStatementAccess().getTableKeyword_2());
            		

            			newCompositeNode(grammarAccess.getSelectStatementAccess().getSelectTablesListParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_SelectTablesList_3=ruleSelectTablesList();

            state._fsp--;


            			current = this_SelectTablesList_3;
            			afterParserOrEnumRuleCall();
            		
            // InternalNlToSql.g:465:3: (otherlv_4= 'can' otherlv_5= 'you' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalNlToSql.g:466:4: otherlv_4= 'can' otherlv_5= 'you'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getSelectStatementAccess().getCanKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectStatementAccess().getYouKeyword_4_1());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getSelectStatementAccess().getShowKeyword_5());
            		
            // InternalNlToSql.g:479:3: ( (otherlv_7= 'the' otherlv_8= 'columns:' ( (lv_columns_9_0= ruleSelectColumnsList ) ) ) | (otherlv_10= 'all' otherlv_11= 'columns' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalNlToSql.g:480:4: (otherlv_7= 'the' otherlv_8= 'columns:' ( (lv_columns_9_0= ruleSelectColumnsList ) ) )
                    {
                    // InternalNlToSql.g:480:4: (otherlv_7= 'the' otherlv_8= 'columns:' ( (lv_columns_9_0= ruleSelectColumnsList ) ) )
                    // InternalNlToSql.g:481:5: otherlv_7= 'the' otherlv_8= 'columns:' ( (lv_columns_9_0= ruleSelectColumnsList ) )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_20); 

                    					newLeafNode(otherlv_7, grammarAccess.getSelectStatementAccess().getTheKeyword_6_0_0());
                    				
                    otherlv_8=(Token)match(input,29,FOLLOW_8); 

                    					newLeafNode(otherlv_8, grammarAccess.getSelectStatementAccess().getColumnsKeyword_6_0_1());
                    				
                    // InternalNlToSql.g:489:5: ( (lv_columns_9_0= ruleSelectColumnsList ) )
                    // InternalNlToSql.g:490:6: (lv_columns_9_0= ruleSelectColumnsList )
                    {
                    // InternalNlToSql.g:490:6: (lv_columns_9_0= ruleSelectColumnsList )
                    // InternalNlToSql.g:491:7: lv_columns_9_0= ruleSelectColumnsList
                    {

                    							newCompositeNode(grammarAccess.getSelectStatementAccess().getColumnsSelectColumnsListParserRuleCall_6_0_2_0());
                    						
                    pushFollow(FOLLOW_21);
                    lv_columns_9_0=ruleSelectColumnsList();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    							}
                    							set(
                    								current,
                    								"columns",
                    								lv_columns_9_0,
                    								"uk.ac.kcl.inf.NlToSql.SelectColumnsList");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:510:4: (otherlv_10= 'all' otherlv_11= 'columns' )
                    {
                    // InternalNlToSql.g:510:4: (otherlv_10= 'all' otherlv_11= 'columns' )
                    // InternalNlToSql.g:511:5: otherlv_10= 'all' otherlv_11= 'columns'
                    {
                    otherlv_10=(Token)match(input,30,FOLLOW_10); 

                    					newLeafNode(otherlv_10, grammarAccess.getSelectStatementAccess().getAllKeyword_6_1_0());
                    				
                    otherlv_11=(Token)match(input,18,FOLLOW_21); 

                    					newLeafNode(otherlv_11, grammarAccess.getSelectStatementAccess().getColumnsKeyword_6_1_1());
                    				

                    }


                    }
                    break;

            }

            // InternalNlToSql.g:521:3: (otherlv_12= 'where' ( (lv_condition_13_0= ruleCondition ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalNlToSql.g:522:4: otherlv_12= 'where' ( (lv_condition_13_0= ruleCondition ) )
                    {
                    otherlv_12=(Token)match(input,31,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getSelectStatementAccess().getWhereKeyword_7_0());
                    			
                    // InternalNlToSql.g:526:4: ( (lv_condition_13_0= ruleCondition ) )
                    // InternalNlToSql.g:527:5: (lv_condition_13_0= ruleCondition )
                    {
                    // InternalNlToSql.g:527:5: (lv_condition_13_0= ruleCondition )
                    // InternalNlToSql.g:528:6: lv_condition_13_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getConditionConditionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_condition_13_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_13_0,
                    							"uk.ac.kcl.inf.NlToSql.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalNlToSql.g:546:3: (otherlv_14= 'group' otherlv_15= 'by' ( (lv_groupByList_16_0= ruleColumn ) ) (otherlv_17= ',' ( (lv_groupByList_18_0= ruleColumn ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalNlToSql.g:547:4: otherlv_14= 'group' otherlv_15= 'by' ( (lv_groupByList_16_0= ruleColumn ) ) (otherlv_17= ',' ( (lv_groupByList_18_0= ruleColumn ) ) )*
                    {
                    otherlv_14=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_14, grammarAccess.getSelectStatementAccess().getGroupKeyword_8_0());
                    			
                    otherlv_15=(Token)match(input,33,FOLLOW_8); 

                    				newLeafNode(otherlv_15, grammarAccess.getSelectStatementAccess().getByKeyword_8_1());
                    			
                    // InternalNlToSql.g:555:4: ( (lv_groupByList_16_0= ruleColumn ) )
                    // InternalNlToSql.g:556:5: (lv_groupByList_16_0= ruleColumn )
                    {
                    // InternalNlToSql.g:556:5: (lv_groupByList_16_0= ruleColumn )
                    // InternalNlToSql.g:557:6: lv_groupByList_16_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupByListColumnParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_groupByList_16_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    						}
                    						add(
                    							current,
                    							"groupByList",
                    							lv_groupByList_16_0,
                    							"uk.ac.kcl.inf.NlToSql.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalNlToSql.g:574:4: (otherlv_17= ',' ( (lv_groupByList_18_0= ruleColumn ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalNlToSql.g:575:5: otherlv_17= ',' ( (lv_groupByList_18_0= ruleColumn ) )
                    	    {
                    	    otherlv_17=(Token)match(input,19,FOLLOW_8); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getSelectStatementAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalNlToSql.g:579:5: ( (lv_groupByList_18_0= ruleColumn ) )
                    	    // InternalNlToSql.g:580:6: (lv_groupByList_18_0= ruleColumn )
                    	    {
                    	    // InternalNlToSql.g:580:6: (lv_groupByList_18_0= ruleColumn )
                    	    // InternalNlToSql.g:581:7: lv_groupByList_18_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getSelectStatementAccess().getGroupByListColumnParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_groupByList_18_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSelectStatementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groupByList",
                    	    								lv_groupByList_18_0,
                    	    								"uk.ac.kcl.inf.NlToSql.Column");
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


    // $ANTLR start "entryRuleSelectTablesList"
    // InternalNlToSql.g:604:1: entryRuleSelectTablesList returns [EObject current=null] : iv_ruleSelectTablesList= ruleSelectTablesList EOF ;
    public final EObject entryRuleSelectTablesList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectTablesList = null;


        try {
            // InternalNlToSql.g:604:57: (iv_ruleSelectTablesList= ruleSelectTablesList EOF )
            // InternalNlToSql.g:605:2: iv_ruleSelectTablesList= ruleSelectTablesList EOF
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
    // InternalNlToSql.g:611:1: ruleSelectTablesList returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleSelectTablesList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalNlToSql.g:617:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalNlToSql.g:618:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalNlToSql.g:618:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalNlToSql.g:619:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalNlToSql.g:619:3: ( (otherlv_0= RULE_ID ) )
            // InternalNlToSql.g:620:4: (otherlv_0= RULE_ID )
            {
            // InternalNlToSql.g:620:4: (otherlv_0= RULE_ID )
            // InternalNlToSql.g:621:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectTablesListRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getSelectTablesListAccess().getSelectTableTableCrossReference_0_0());
            				

            }


            }

            // InternalNlToSql.g:632:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalNlToSql.g:633:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectTablesListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:637:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalNlToSql.g:638:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalNlToSql.g:638:5: (otherlv_2= RULE_ID )
            	    // InternalNlToSql.g:639:6: otherlv_2= RULE_ID
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


    // $ANTLR start "entryRuleSelectColumnsList"
    // InternalNlToSql.g:655:1: entryRuleSelectColumnsList returns [EObject current=null] : iv_ruleSelectColumnsList= ruleSelectColumnsList EOF ;
    public final EObject entryRuleSelectColumnsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectColumnsList = null;


        try {
            // InternalNlToSql.g:655:58: (iv_ruleSelectColumnsList= ruleSelectColumnsList EOF )
            // InternalNlToSql.g:656:2: iv_ruleSelectColumnsList= ruleSelectColumnsList EOF
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
    // InternalNlToSql.g:662:1: ruleSelectColumnsList returns [EObject current=null] : ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* ) ;
    public final EObject ruleSelectColumnsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_selectColumn_0_0 = null;

        EObject lv_selectColumn_2_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:668:2: ( ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* ) )
            // InternalNlToSql.g:669:2: ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* )
            {
            // InternalNlToSql.g:669:2: ( ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )* )
            // InternalNlToSql.g:670:3: ( (lv_selectColumn_0_0= ruleColumnReference ) ) (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )*
            {
            // InternalNlToSql.g:670:3: ( (lv_selectColumn_0_0= ruleColumnReference ) )
            // InternalNlToSql.g:671:4: (lv_selectColumn_0_0= ruleColumnReference )
            {
            // InternalNlToSql.g:671:4: (lv_selectColumn_0_0= ruleColumnReference )
            // InternalNlToSql.g:672:5: lv_selectColumn_0_0= ruleColumnReference
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

            // InternalNlToSql.g:689:3: (otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==19) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalNlToSql.g:690:4: otherlv_1= ',' ( (lv_selectColumn_2_0= ruleColumnReference ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectColumnsListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalNlToSql.g:694:4: ( (lv_selectColumn_2_0= ruleColumnReference ) )
            	    // InternalNlToSql.g:695:5: (lv_selectColumn_2_0= ruleColumnReference )
            	    {
            	    // InternalNlToSql.g:695:5: (lv_selectColumn_2_0= ruleColumnReference )
            	    // InternalNlToSql.g:696:6: lv_selectColumn_2_0= ruleColumnReference
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
    // InternalNlToSql.g:718:1: entryRuleColumnReference returns [EObject current=null] : iv_ruleColumnReference= ruleColumnReference EOF ;
    public final EObject entryRuleColumnReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnReference = null;


        try {
            // InternalNlToSql.g:718:56: (iv_ruleColumnReference= ruleColumnReference EOF )
            // InternalNlToSql.g:719:2: iv_ruleColumnReference= ruleColumnReference EOF
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
    // InternalNlToSql.g:725:1: ruleColumnReference returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? ) ;
    public final EObject ruleColumnReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalNlToSql.g:731:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? ) )
            // InternalNlToSql.g:732:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? )
            {
            // InternalNlToSql.g:732:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )? )
            // InternalNlToSql.g:733:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )?
            {
            // InternalNlToSql.g:733:3: ( (otherlv_0= RULE_ID ) )
            // InternalNlToSql.g:734:4: (otherlv_0= RULE_ID )
            {
            // InternalNlToSql.g:734:4: (otherlv_0= RULE_ID )
            // InternalNlToSql.g:735:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnReferenceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_0, grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0_0());
            				

            }


            }

            // InternalNlToSql.g:746:3: (otherlv_1= 'in' ( (otherlv_2= RULE_ID ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNlToSql.g:747:4: otherlv_1= 'in' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnReferenceAccess().getInKeyword_1_0());
                    			
                    // InternalNlToSql.g:751:4: ( (otherlv_2= RULE_ID ) )
                    // InternalNlToSql.g:752:5: (otherlv_2= RULE_ID )
                    {
                    // InternalNlToSql.g:752:5: (otherlv_2= RULE_ID )
                    // InternalNlToSql.g:753:6: otherlv_2= RULE_ID
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
    // InternalNlToSql.g:769:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalNlToSql.g:769:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalNlToSql.g:770:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalNlToSql.g:776:1: ruleCondition returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:782:2: ( (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalNlToSql.g:783:2: (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalNlToSql.g:783:2: (this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalNlToSql.g:784:3: this_Comparison_0= ruleComparison ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getConditionAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalNlToSql.g:792:3: ( () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=35 && LA15_0<=36)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalNlToSql.g:793:4: () ruleLogicOperator ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalNlToSql.g:793:4: ()
            	    // InternalNlToSql.g:794:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConditionAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getConditionAccess().getLogicOperatorParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_22);
            	    ruleLogicOperator();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalNlToSql.g:807:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalNlToSql.g:808:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalNlToSql.g:808:5: (lv_right_3_0= ruleComparison )
            	    // InternalNlToSql.g:809:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getConditionAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
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
    // InternalNlToSql.g:831:1: entryRuleLogicOperator returns [String current=null] : iv_ruleLogicOperator= ruleLogicOperator EOF ;
    public final String entryRuleLogicOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicOperator = null;


        try {
            // InternalNlToSql.g:831:53: (iv_ruleLogicOperator= ruleLogicOperator EOF )
            // InternalNlToSql.g:832:2: iv_ruleLogicOperator= ruleLogicOperator EOF
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
    // InternalNlToSql.g:838:1: ruleLogicOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleLogicOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:844:2: ( (kw= 'and' | kw= 'or' ) )
            // InternalNlToSql.g:845:2: (kw= 'and' | kw= 'or' )
            {
            // InternalNlToSql.g:845:2: (kw= 'and' | kw= 'or' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            else if ( (LA16_0==36) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalNlToSql.g:846:3: kw= 'and'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getLogicOperatorAccess().getAndKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:852:3: kw= 'or'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

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
    // InternalNlToSql.g:861:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalNlToSql.g:861:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalNlToSql.g:862:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalNlToSql.g:868:1: ruleComparison returns [EObject current=null] : ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv_rightHandSide_4_0 = null;



        	enterRule();

        try {
            // InternalNlToSql.g:874:2: ( ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) ) )
            // InternalNlToSql.g:875:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) )
            {
            // InternalNlToSql.g:875:2: ( (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) ) )
            // InternalNlToSql.g:876:3: (otherlv_0= 'the' | otherlv_1= 'a' )? ( (otherlv_2= RULE_ID ) ) ( (lv_operator_3_0= ruleComparisonOperator ) ) ( (lv_rightHandSide_4_0= ruleValue ) )
            {
            // InternalNlToSql.g:876:3: (otherlv_0= 'the' | otherlv_1= 'a' )?
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            else if ( (LA17_0==14) ) {
                alt17=2;
            }
            switch (alt17) {
                case 1 :
                    // InternalNlToSql.g:877:4: otherlv_0= 'the'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getComparisonAccess().getTheKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:882:4: otherlv_1= 'a'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getAKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalNlToSql.g:887:3: ( (otherlv_2= RULE_ID ) )
            // InternalNlToSql.g:888:4: (otherlv_2= RULE_ID )
            {
            // InternalNlToSql.g:888:4: (otherlv_2= RULE_ID )
            // InternalNlToSql.g:889:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComparisonRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLeftHandSideColumnCrossReference_1_0());
            				

            }


            }

            // InternalNlToSql.g:900:3: ( (lv_operator_3_0= ruleComparisonOperator ) )
            // InternalNlToSql.g:901:4: (lv_operator_3_0= ruleComparisonOperator )
            {
            // InternalNlToSql.g:901:4: (lv_operator_3_0= ruleComparisonOperator )
            // InternalNlToSql.g:902:5: lv_operator_3_0= ruleComparisonOperator
            {

            					newCompositeNode(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalNlToSql.g:919:3: ( (lv_rightHandSide_4_0= ruleValue ) )
            // InternalNlToSql.g:920:4: (lv_rightHandSide_4_0= ruleValue )
            {
            // InternalNlToSql.g:920:4: (lv_rightHandSide_4_0= ruleValue )
            // InternalNlToSql.g:921:5: lv_rightHandSide_4_0= ruleValue
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
    // InternalNlToSql.g:942:1: entryRuleComparisonOperator returns [String current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final String entryRuleComparisonOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparisonOperator = null;


        try {
            // InternalNlToSql.g:942:58: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalNlToSql.g:943:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
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
    // InternalNlToSql.g:949:1: ruleComparisonOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) ) ;
    public final AntlrDatatypeRuleToken ruleComparisonOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalNlToSql.g:955:2: ( (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) ) )
            // InternalNlToSql.g:956:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )
            {
            // InternalNlToSql.g:956:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )
            int alt18=7;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalNlToSql.g:957:3: kw= '='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:963:3: (kw= 'is' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:963:3: (kw= 'is' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:964:4: kw= 'is' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,38,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getIsKeyword_1_0());
                    			
                    kw=(Token)match(input,39,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_1_1());
                    			
                    kw=(Token)match(input,40,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:981:3: (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:981:3: (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:982:4: kw= 'is' kw= 'not' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,38,FOLLOW_31); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getIsKeyword_2_0());
                    			
                    kw=(Token)match(input,41,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getNotKeyword_2_1());
                    			
                    kw=(Token)match(input,39,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_2_2());
                    			
                    kw=(Token)match(input,40,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_2_3());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalNlToSql.g:1004:3: (kw= 'less' kw= 'than' )
                    {
                    // InternalNlToSql.g:1004:3: (kw= 'less' kw= 'than' )
                    // InternalNlToSql.g:1005:4: kw= 'less' kw= 'than'
                    {
                    kw=(Token)match(input,42,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessKeyword_3_0());
                    			
                    kw=(Token)match(input,43,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalNlToSql.g:1017:3: (kw= 'greater' kw= 'than' )
                    {
                    // InternalNlToSql.g:1017:3: (kw= 'greater' kw= 'than' )
                    // InternalNlToSql.g:1018:4: kw= 'greater' kw= 'than'
                    {
                    kw=(Token)match(input,44,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_4_0());
                    			
                    kw=(Token)match(input,43,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalNlToSql.g:1030:3: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1030:3: (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1031:4: kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,42,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getLessKeyword_5_0());
                    			
                    kw=(Token)match(input,43,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_5_1());
                    			
                    kw=(Token)match(input,36,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getOrKeyword_5_2());
                    			
                    kw=(Token)match(input,39,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_5_3());
                    			
                    kw=(Token)match(input,40,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getToKeyword_5_4());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalNlToSql.g:1058:3: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    {
                    // InternalNlToSql.g:1058:3: (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' )
                    // InternalNlToSql.g:1059:4: kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to'
                    {
                    kw=(Token)match(input,44,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_6_0());
                    			
                    kw=(Token)match(input,43,FOLLOW_33); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getThanKeyword_6_1());
                    			
                    kw=(Token)match(input,36,FOLLOW_29); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getOrKeyword_6_2());
                    			
                    kw=(Token)match(input,39,FOLLOW_30); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComparisonOperatorAccess().getEqualKeyword_6_3());
                    			
                    kw=(Token)match(input,40,FOLLOW_2); 

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
    // InternalNlToSql.g:1089:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalNlToSql.g:1089:45: (iv_ruleValue= ruleValue EOF )
            // InternalNlToSql.g:1090:2: iv_ruleValue= ruleValue EOF
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
    // InternalNlToSql.g:1096:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalNlToSql.g:1102:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalNlToSql.g:1103:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalNlToSql.g:1103:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
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
                    // InternalNlToSql.g:1104:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:1112:3: this_STRING_1= RULE_STRING
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


    protected DFA18 dfa18 = new DFA18(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\7\uffff\1\11\1\13\4\uffff";
    static final String dfa_3s = "\1\45\1\uffff\1\47\2\53\2\uffff\2\5\4\uffff";
    static final String dfa_4s = "\1\54\1\uffff\1\51\2\53\2\uffff\2\44\4\uffff";
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
            "\2\11\35\uffff\1\12",
            "\2\13\35\uffff\1\14",
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
            return "956:2: (kw= '=' | (kw= 'is' kw= 'equal' kw= 'to' ) | (kw= 'is' kw= 'not' kw= 'equal' kw= 'to' ) | (kw= 'less' kw= 'than' ) | (kw= 'greater' kw= 'than' ) | (kw= 'less' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) | (kw= 'greater' kw= 'than' kw= 'or' kw= 'equal' kw= 'to' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000146000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});

}