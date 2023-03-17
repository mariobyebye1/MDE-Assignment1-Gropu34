package uk.ac.kcl.inf.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import uk.ac.kcl.inf.services.NlToSqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNlToSqlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'all'", "'the'", "'a'", "'and'", "'or'", "'='", "'.'", "'show'", "'can'", "'you'", "'please'", "'from'", "'where'", "'group'", "'by'", "','", "'insert'", "'into'", "'('", "')'", "'values'", "'update'", "'set'", "'delete'", "'is'", "'equal'", "'to'", "'not'", "'less'", "'than'", "'greater'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(NlToSqlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleAccountingSpeech"
    // InternalNlToSql.g:53:1: entryRuleAccountingSpeech : ruleAccountingSpeech EOF ;
    public final void entryRuleAccountingSpeech() throws RecognitionException {
        try {
            // InternalNlToSql.g:54:1: ( ruleAccountingSpeech EOF )
            // InternalNlToSql.g:55:1: ruleAccountingSpeech EOF
            {
             before(grammarAccess.getAccountingSpeechRule()); 
            pushFollow(FOLLOW_1);
            ruleAccountingSpeech();

            state._fsp--;

             after(grammarAccess.getAccountingSpeechRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAccountingSpeech"


    // $ANTLR start "ruleAccountingSpeech"
    // InternalNlToSql.g:62:1: ruleAccountingSpeech : ( ( rule__AccountingSpeech__StatementsAssignment )* ) ;
    public final void ruleAccountingSpeech() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:66:2: ( ( ( rule__AccountingSpeech__StatementsAssignment )* ) )
            // InternalNlToSql.g:67:2: ( ( rule__AccountingSpeech__StatementsAssignment )* )
            {
            // InternalNlToSql.g:67:2: ( ( rule__AccountingSpeech__StatementsAssignment )* )
            // InternalNlToSql.g:68:3: ( rule__AccountingSpeech__StatementsAssignment )*
            {
             before(grammarAccess.getAccountingSpeechAccess().getStatementsAssignment()); 
            // InternalNlToSql.g:69:3: ( rule__AccountingSpeech__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=18 && LA1_0<=19)||LA1_0==27||LA1_0==32||LA1_0==34) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalNlToSql.g:69:4: rule__AccountingSpeech__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AccountingSpeech__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAccountingSpeechAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAccountingSpeech"


    // $ANTLR start "entryRuleStatement"
    // InternalNlToSql.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalNlToSql.g:79:1: ( ruleStatement EOF )
            // InternalNlToSql.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalNlToSql.g:87:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:91:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalNlToSql.g:92:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalNlToSql.g:92:2: ( ( rule__Statement__Group__0 ) )
            // InternalNlToSql.g:93:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalNlToSql.g:94:3: ( rule__Statement__Group__0 )
            // InternalNlToSql.g:94:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSelectStatement"
    // InternalNlToSql.g:103:1: entryRuleSelectStatement : ruleSelectStatement EOF ;
    public final void entryRuleSelectStatement() throws RecognitionException {
        try {
            // InternalNlToSql.g:104:1: ( ruleSelectStatement EOF )
            // InternalNlToSql.g:105:1: ruleSelectStatement EOF
            {
             before(grammarAccess.getSelectStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectStatement();

            state._fsp--;

             after(grammarAccess.getSelectStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectStatement"


    // $ANTLR start "ruleSelectStatement"
    // InternalNlToSql.g:112:1: ruleSelectStatement : ( ( rule__SelectStatement__Group__0 ) ) ;
    public final void ruleSelectStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:116:2: ( ( ( rule__SelectStatement__Group__0 ) ) )
            // InternalNlToSql.g:117:2: ( ( rule__SelectStatement__Group__0 ) )
            {
            // InternalNlToSql.g:117:2: ( ( rule__SelectStatement__Group__0 ) )
            // InternalNlToSql.g:118:3: ( rule__SelectStatement__Group__0 )
            {
             before(grammarAccess.getSelectStatementAccess().getGroup()); 
            // InternalNlToSql.g:119:3: ( rule__SelectStatement__Group__0 )
            // InternalNlToSql.g:119:4: rule__SelectStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectStatement"


    // $ANTLR start "entryRuleInsertStatement"
    // InternalNlToSql.g:128:1: entryRuleInsertStatement : ruleInsertStatement EOF ;
    public final void entryRuleInsertStatement() throws RecognitionException {
        try {
            // InternalNlToSql.g:129:1: ( ruleInsertStatement EOF )
            // InternalNlToSql.g:130:1: ruleInsertStatement EOF
            {
             before(grammarAccess.getInsertStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertStatement();

            state._fsp--;

             after(grammarAccess.getInsertStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInsertStatement"


    // $ANTLR start "ruleInsertStatement"
    // InternalNlToSql.g:137:1: ruleInsertStatement : ( ( rule__InsertStatement__Group__0 ) ) ;
    public final void ruleInsertStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:141:2: ( ( ( rule__InsertStatement__Group__0 ) ) )
            // InternalNlToSql.g:142:2: ( ( rule__InsertStatement__Group__0 ) )
            {
            // InternalNlToSql.g:142:2: ( ( rule__InsertStatement__Group__0 ) )
            // InternalNlToSql.g:143:3: ( rule__InsertStatement__Group__0 )
            {
             before(grammarAccess.getInsertStatementAccess().getGroup()); 
            // InternalNlToSql.g:144:3: ( rule__InsertStatement__Group__0 )
            // InternalNlToSql.g:144:4: rule__InsertStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInsertStatement"


    // $ANTLR start "entryRuleUpdateStatement"
    // InternalNlToSql.g:153:1: entryRuleUpdateStatement : ruleUpdateStatement EOF ;
    public final void entryRuleUpdateStatement() throws RecognitionException {
        try {
            // InternalNlToSql.g:154:1: ( ruleUpdateStatement EOF )
            // InternalNlToSql.g:155:1: ruleUpdateStatement EOF
            {
             before(grammarAccess.getUpdateStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateStatement();

            state._fsp--;

             after(grammarAccess.getUpdateStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpdateStatement"


    // $ANTLR start "ruleUpdateStatement"
    // InternalNlToSql.g:162:1: ruleUpdateStatement : ( ( rule__UpdateStatement__Group__0 ) ) ;
    public final void ruleUpdateStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:166:2: ( ( ( rule__UpdateStatement__Group__0 ) ) )
            // InternalNlToSql.g:167:2: ( ( rule__UpdateStatement__Group__0 ) )
            {
            // InternalNlToSql.g:167:2: ( ( rule__UpdateStatement__Group__0 ) )
            // InternalNlToSql.g:168:3: ( rule__UpdateStatement__Group__0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup()); 
            // InternalNlToSql.g:169:3: ( rule__UpdateStatement__Group__0 )
            // InternalNlToSql.g:169:4: rule__UpdateStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdateStatement"


    // $ANTLR start "entryRuleDeleteStatement"
    // InternalNlToSql.g:178:1: entryRuleDeleteStatement : ruleDeleteStatement EOF ;
    public final void entryRuleDeleteStatement() throws RecognitionException {
        try {
            // InternalNlToSql.g:179:1: ( ruleDeleteStatement EOF )
            // InternalNlToSql.g:180:1: ruleDeleteStatement EOF
            {
             before(grammarAccess.getDeleteStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteStatement();

            state._fsp--;

             after(grammarAccess.getDeleteStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeleteStatement"


    // $ANTLR start "ruleDeleteStatement"
    // InternalNlToSql.g:187:1: ruleDeleteStatement : ( ( rule__DeleteStatement__Group__0 ) ) ;
    public final void ruleDeleteStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:191:2: ( ( ( rule__DeleteStatement__Group__0 ) ) )
            // InternalNlToSql.g:192:2: ( ( rule__DeleteStatement__Group__0 ) )
            {
            // InternalNlToSql.g:192:2: ( ( rule__DeleteStatement__Group__0 ) )
            // InternalNlToSql.g:193:3: ( rule__DeleteStatement__Group__0 )
            {
             before(grammarAccess.getDeleteStatementAccess().getGroup()); 
            // InternalNlToSql.g:194:3: ( rule__DeleteStatement__Group__0 )
            // InternalNlToSql.g:194:4: rule__DeleteStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeleteStatement"


    // $ANTLR start "entryRuleSelectList"
    // InternalNlToSql.g:203:1: entryRuleSelectList : ruleSelectList EOF ;
    public final void entryRuleSelectList() throws RecognitionException {
        try {
            // InternalNlToSql.g:204:1: ( ruleSelectList EOF )
            // InternalNlToSql.g:205:1: ruleSelectList EOF
            {
             before(grammarAccess.getSelectListRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectList();

            state._fsp--;

             after(grammarAccess.getSelectListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectList"


    // $ANTLR start "ruleSelectList"
    // InternalNlToSql.g:212:1: ruleSelectList : ( ( rule__SelectList__Group__0 ) ) ;
    public final void ruleSelectList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:216:2: ( ( ( rule__SelectList__Group__0 ) ) )
            // InternalNlToSql.g:217:2: ( ( rule__SelectList__Group__0 ) )
            {
            // InternalNlToSql.g:217:2: ( ( rule__SelectList__Group__0 ) )
            // InternalNlToSql.g:218:3: ( rule__SelectList__Group__0 )
            {
             before(grammarAccess.getSelectListAccess().getGroup()); 
            // InternalNlToSql.g:219:3: ( rule__SelectList__Group__0 )
            // InternalNlToSql.g:219:4: rule__SelectList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectList"


    // $ANTLR start "entryRulePropertyReference"
    // InternalNlToSql.g:228:1: entryRulePropertyReference : rulePropertyReference EOF ;
    public final void entryRulePropertyReference() throws RecognitionException {
        try {
            // InternalNlToSql.g:229:1: ( rulePropertyReference EOF )
            // InternalNlToSql.g:230:1: rulePropertyReference EOF
            {
             before(grammarAccess.getPropertyReferenceRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getPropertyReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyReference"


    // $ANTLR start "rulePropertyReference"
    // InternalNlToSql.g:237:1: rulePropertyReference : ( ( rule__PropertyReference__Group__0 ) ) ;
    public final void rulePropertyReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:241:2: ( ( ( rule__PropertyReference__Group__0 ) ) )
            // InternalNlToSql.g:242:2: ( ( rule__PropertyReference__Group__0 ) )
            {
            // InternalNlToSql.g:242:2: ( ( rule__PropertyReference__Group__0 ) )
            // InternalNlToSql.g:243:3: ( rule__PropertyReference__Group__0 )
            {
             before(grammarAccess.getPropertyReferenceAccess().getGroup()); 
            // InternalNlToSql.g:244:3: ( rule__PropertyReference__Group__0 )
            // InternalNlToSql.g:244:4: rule__PropertyReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyReference"


    // $ANTLR start "entryRuleEntityName"
    // InternalNlToSql.g:253:1: entryRuleEntityName : ruleEntityName EOF ;
    public final void entryRuleEntityName() throws RecognitionException {
        try {
            // InternalNlToSql.g:254:1: ( ruleEntityName EOF )
            // InternalNlToSql.g:255:1: ruleEntityName EOF
            {
             before(grammarAccess.getEntityNameRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getEntityNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntityName"


    // $ANTLR start "ruleEntityName"
    // InternalNlToSql.g:262:1: ruleEntityName : ( ( rule__EntityName__Group__0 ) ) ;
    public final void ruleEntityName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:266:2: ( ( ( rule__EntityName__Group__0 ) ) )
            // InternalNlToSql.g:267:2: ( ( rule__EntityName__Group__0 ) )
            {
            // InternalNlToSql.g:267:2: ( ( rule__EntityName__Group__0 ) )
            // InternalNlToSql.g:268:3: ( rule__EntityName__Group__0 )
            {
             before(grammarAccess.getEntityNameAccess().getGroup()); 
            // InternalNlToSql.g:269:3: ( rule__EntityName__Group__0 )
            // InternalNlToSql.g:269:4: rule__EntityName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EntityName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityName"


    // $ANTLR start "entryRulePropertyName"
    // InternalNlToSql.g:278:1: entryRulePropertyName : rulePropertyName EOF ;
    public final void entryRulePropertyName() throws RecognitionException {
        try {
            // InternalNlToSql.g:279:1: ( rulePropertyName EOF )
            // InternalNlToSql.g:280:1: rulePropertyName EOF
            {
             before(grammarAccess.getPropertyNameRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyName();

            state._fsp--;

             after(grammarAccess.getPropertyNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyName"


    // $ANTLR start "rulePropertyName"
    // InternalNlToSql.g:287:1: rulePropertyName : ( ( rule__PropertyName__Group__0 ) ) ;
    public final void rulePropertyName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:291:2: ( ( ( rule__PropertyName__Group__0 ) ) )
            // InternalNlToSql.g:292:2: ( ( rule__PropertyName__Group__0 ) )
            {
            // InternalNlToSql.g:292:2: ( ( rule__PropertyName__Group__0 ) )
            // InternalNlToSql.g:293:3: ( rule__PropertyName__Group__0 )
            {
             before(grammarAccess.getPropertyNameAccess().getGroup()); 
            // InternalNlToSql.g:294:3: ( rule__PropertyName__Group__0 )
            // InternalNlToSql.g:294:4: rule__PropertyName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyName"


    // $ANTLR start "entryRuleValue"
    // InternalNlToSql.g:303:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalNlToSql.g:304:1: ( ruleValue EOF )
            // InternalNlToSql.g:305:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalNlToSql.g:312:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:316:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalNlToSql.g:317:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalNlToSql.g:317:2: ( ( rule__Value__Alternatives ) )
            // InternalNlToSql.g:318:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalNlToSql.g:319:3: ( rule__Value__Alternatives )
            // InternalNlToSql.g:319:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleUpdateItem"
    // InternalNlToSql.g:328:1: entryRuleUpdateItem : ruleUpdateItem EOF ;
    public final void entryRuleUpdateItem() throws RecognitionException {
        try {
            // InternalNlToSql.g:329:1: ( ruleUpdateItem EOF )
            // InternalNlToSql.g:330:1: ruleUpdateItem EOF
            {
             before(grammarAccess.getUpdateItemRule()); 
            pushFollow(FOLLOW_1);
            ruleUpdateItem();

            state._fsp--;

             after(grammarAccess.getUpdateItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpdateItem"


    // $ANTLR start "ruleUpdateItem"
    // InternalNlToSql.g:337:1: ruleUpdateItem : ( ( rule__UpdateItem__Group__0 ) ) ;
    public final void ruleUpdateItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:341:2: ( ( ( rule__UpdateItem__Group__0 ) ) )
            // InternalNlToSql.g:342:2: ( ( rule__UpdateItem__Group__0 ) )
            {
            // InternalNlToSql.g:342:2: ( ( rule__UpdateItem__Group__0 ) )
            // InternalNlToSql.g:343:3: ( rule__UpdateItem__Group__0 )
            {
             before(grammarAccess.getUpdateItemAccess().getGroup()); 
            // InternalNlToSql.g:344:3: ( rule__UpdateItem__Group__0 )
            // InternalNlToSql.g:344:4: rule__UpdateItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpdateItem"


    // $ANTLR start "entryRuleCondition"
    // InternalNlToSql.g:353:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalNlToSql.g:354:1: ( ruleCondition EOF )
            // InternalNlToSql.g:355:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalNlToSql.g:362:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:366:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalNlToSql.g:367:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalNlToSql.g:367:2: ( ( rule__Condition__Group__0 ) )
            // InternalNlToSql.g:368:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalNlToSql.g:369:3: ( rule__Condition__Group__0 )
            // InternalNlToSql.g:369:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleComparison"
    // InternalNlToSql.g:378:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalNlToSql.g:379:1: ( ruleComparison EOF )
            // InternalNlToSql.g:380:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalNlToSql.g:387:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:391:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalNlToSql.g:392:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalNlToSql.g:392:2: ( ( rule__Comparison__Group__0 ) )
            // InternalNlToSql.g:393:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalNlToSql.g:394:3: ( rule__Comparison__Group__0 )
            // InternalNlToSql.g:394:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleLogicOperator"
    // InternalNlToSql.g:403:1: entryRuleLogicOperator : ruleLogicOperator EOF ;
    public final void entryRuleLogicOperator() throws RecognitionException {
        try {
            // InternalNlToSql.g:404:1: ( ruleLogicOperator EOF )
            // InternalNlToSql.g:405:1: ruleLogicOperator EOF
            {
             before(grammarAccess.getLogicOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicOperator();

            state._fsp--;

             after(grammarAccess.getLogicOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicOperator"


    // $ANTLR start "ruleLogicOperator"
    // InternalNlToSql.g:412:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:416:2: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // InternalNlToSql.g:417:2: ( ( rule__LogicOperator__Alternatives ) )
            {
            // InternalNlToSql.g:417:2: ( ( rule__LogicOperator__Alternatives ) )
            // InternalNlToSql.g:418:3: ( rule__LogicOperator__Alternatives )
            {
             before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            // InternalNlToSql.g:419:3: ( rule__LogicOperator__Alternatives )
            // InternalNlToSql.g:419:4: rule__LogicOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalNlToSql.g:428:1: entryRuleComparisonOperator : ruleComparisonOperator EOF ;
    public final void entryRuleComparisonOperator() throws RecognitionException {
        try {
            // InternalNlToSql.g:429:1: ( ruleComparisonOperator EOF )
            // InternalNlToSql.g:430:1: ruleComparisonOperator EOF
            {
             before(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalNlToSql.g:437:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:441:2: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalNlToSql.g:442:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalNlToSql.g:442:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalNlToSql.g:443:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalNlToSql.g:444:3: ( rule__ComparisonOperator__Alternatives )
            // InternalNlToSql.g:444:4: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "rule__Statement__Alternatives_0"
    // InternalNlToSql.g:452:1: rule__Statement__Alternatives_0 : ( ( ruleSelectStatement ) | ( ruleInsertStatement ) | ( ruleUpdateStatement ) | ( ruleDeleteStatement ) );
    public final void rule__Statement__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:456:1: ( ( ruleSelectStatement ) | ( ruleInsertStatement ) | ( ruleUpdateStatement ) | ( ruleDeleteStatement ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==20) ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==21) ) {
                        switch ( input.LA(4) ) {
                        case 32:
                            {
                            alt2=3;
                            }
                            break;
                        case 27:
                            {
                            alt2=2;
                            }
                            break;
                        case 34:
                            {
                            alt2=4;
                            }
                            break;
                        case 18:
                            {
                            alt2=1;
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
            case 18:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 34:
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
                    // InternalNlToSql.g:457:2: ( ruleSelectStatement )
                    {
                    // InternalNlToSql.g:457:2: ( ruleSelectStatement )
                    // InternalNlToSql.g:458:3: ruleSelectStatement
                    {
                     before(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSelectStatementParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:463:2: ( ruleInsertStatement )
                    {
                    // InternalNlToSql.g:463:2: ( ruleInsertStatement )
                    // InternalNlToSql.g:464:3: ruleInsertStatement
                    {
                     before(grammarAccess.getStatementAccess().getInsertStatementParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getInsertStatementParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:469:2: ( ruleUpdateStatement )
                    {
                    // InternalNlToSql.g:469:2: ( ruleUpdateStatement )
                    // InternalNlToSql.g:470:3: ruleUpdateStatement
                    {
                     before(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUpdateStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getUpdateStatementParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalNlToSql.g:475:2: ( ruleDeleteStatement )
                    {
                    // InternalNlToSql.g:475:2: ( ruleDeleteStatement )
                    // InternalNlToSql.g:476:3: ruleDeleteStatement
                    {
                     before(grammarAccess.getStatementAccess().getDeleteStatementParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getDeleteStatementParserRuleCall_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives_0"


    // $ANTLR start "rule__SelectStatement__Alternatives_2_0"
    // InternalNlToSql.g:485:1: rule__SelectStatement__Alternatives_2_0 : ( ( ruleSelectList ) | ( 'all' ) );
    public final void rule__SelectStatement__Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:489:1: ( ( ruleSelectList ) | ( 'all' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=12 && LA3_0<=13)) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalNlToSql.g:490:2: ( ruleSelectList )
                    {
                    // InternalNlToSql.g:490:2: ( ruleSelectList )
                    // InternalNlToSql.g:491:3: ruleSelectList
                    {
                     before(grammarAccess.getSelectStatementAccess().getSelectListParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectList();

                    state._fsp--;

                     after(grammarAccess.getSelectStatementAccess().getSelectListParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:496:2: ( 'all' )
                    {
                    // InternalNlToSql.g:496:2: ( 'all' )
                    // InternalNlToSql.g:497:3: 'all'
                    {
                     before(grammarAccess.getSelectStatementAccess().getAllKeyword_2_0_1()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSelectStatementAccess().getAllKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Alternatives_2_0"


    // $ANTLR start "rule__SelectList__Alternatives_0"
    // InternalNlToSql.g:506:1: rule__SelectList__Alternatives_0 : ( ( 'the' ) | ( 'a' ) );
    public final void rule__SelectList__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:510:1: ( ( 'the' ) | ( 'a' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalNlToSql.g:511:2: ( 'the' )
                    {
                    // InternalNlToSql.g:511:2: ( 'the' )
                    // InternalNlToSql.g:512:3: 'the'
                    {
                     before(grammarAccess.getSelectListAccess().getTheKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSelectListAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:517:2: ( 'a' )
                    {
                    // InternalNlToSql.g:517:2: ( 'a' )
                    // InternalNlToSql.g:518:3: 'a'
                    {
                     before(grammarAccess.getSelectListAccess().getAKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getSelectListAccess().getAKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__Alternatives_0"


    // $ANTLR start "rule__PropertyReference__Alternatives_0"
    // InternalNlToSql.g:527:1: rule__PropertyReference__Alternatives_0 : ( ( 'the' ) | ( 'a' ) );
    public final void rule__PropertyReference__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:531:1: ( ( 'the' ) | ( 'a' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalNlToSql.g:532:2: ( 'the' )
                    {
                    // InternalNlToSql.g:532:2: ( 'the' )
                    // InternalNlToSql.g:533:3: 'the'
                    {
                     before(grammarAccess.getPropertyReferenceAccess().getTheKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPropertyReferenceAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:538:2: ( 'a' )
                    {
                    // InternalNlToSql.g:538:2: ( 'a' )
                    // InternalNlToSql.g:539:3: 'a'
                    {
                     before(grammarAccess.getPropertyReferenceAccess().getAKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPropertyReferenceAccess().getAKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Alternatives_0"


    // $ANTLR start "rule__EntityName__Alternatives_0"
    // InternalNlToSql.g:548:1: rule__EntityName__Alternatives_0 : ( ( 'the' ) | ( 'a' ) );
    public final void rule__EntityName__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:552:1: ( ( 'the' ) | ( 'a' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalNlToSql.g:553:2: ( 'the' )
                    {
                    // InternalNlToSql.g:553:2: ( 'the' )
                    // InternalNlToSql.g:554:3: 'the'
                    {
                     before(grammarAccess.getEntityNameAccess().getTheKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEntityNameAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:559:2: ( 'a' )
                    {
                    // InternalNlToSql.g:559:2: ( 'a' )
                    // InternalNlToSql.g:560:3: 'a'
                    {
                     before(grammarAccess.getEntityNameAccess().getAKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEntityNameAccess().getAKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityName__Alternatives_0"


    // $ANTLR start "rule__PropertyName__Alternatives_0"
    // InternalNlToSql.g:569:1: rule__PropertyName__Alternatives_0 : ( ( 'the' ) | ( 'a' ) );
    public final void rule__PropertyName__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:573:1: ( ( 'the' ) | ( 'a' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalNlToSql.g:574:2: ( 'the' )
                    {
                    // InternalNlToSql.g:574:2: ( 'the' )
                    // InternalNlToSql.g:575:3: 'the'
                    {
                     before(grammarAccess.getPropertyNameAccess().getTheKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPropertyNameAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:580:2: ( 'a' )
                    {
                    // InternalNlToSql.g:580:2: ( 'a' )
                    // InternalNlToSql.g:581:3: 'a'
                    {
                     before(grammarAccess.getPropertyNameAccess().getAKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPropertyNameAccess().getAKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyName__Alternatives_0"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalNlToSql.g:590:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( RULE_STRING ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:594:1: ( ( RULE_INT ) | ( RULE_STRING ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalNlToSql.g:595:2: ( RULE_INT )
                    {
                    // InternalNlToSql.g:595:2: ( RULE_INT )
                    // InternalNlToSql.g:596:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:601:2: ( RULE_STRING )
                    {
                    // InternalNlToSql.g:601:2: ( RULE_STRING )
                    // InternalNlToSql.g:602:3: RULE_STRING
                    {
                     before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__UpdateItem__Alternatives_0"
    // InternalNlToSql.g:611:1: rule__UpdateItem__Alternatives_0 : ( ( 'the' ) | ( 'a' ) );
    public final void rule__UpdateItem__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:615:1: ( ( 'the' ) | ( 'a' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            else if ( (LA9_0==13) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalNlToSql.g:616:2: ( 'the' )
                    {
                    // InternalNlToSql.g:616:2: ( 'the' )
                    // InternalNlToSql.g:617:3: 'the'
                    {
                     before(grammarAccess.getUpdateItemAccess().getTheKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getUpdateItemAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:622:2: ( 'a' )
                    {
                    // InternalNlToSql.g:622:2: ( 'a' )
                    // InternalNlToSql.g:623:3: 'a'
                    {
                     before(grammarAccess.getUpdateItemAccess().getAKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getUpdateItemAccess().getAKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateItem__Alternatives_0"


    // $ANTLR start "rule__Comparison__Alternatives_0"
    // InternalNlToSql.g:632:1: rule__Comparison__Alternatives_0 : ( ( 'the' ) | ( 'a' ) );
    public final void rule__Comparison__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:636:1: ( ( 'the' ) | ( 'a' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            else if ( (LA10_0==13) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalNlToSql.g:637:2: ( 'the' )
                    {
                    // InternalNlToSql.g:637:2: ( 'the' )
                    // InternalNlToSql.g:638:3: 'the'
                    {
                     before(grammarAccess.getComparisonAccess().getTheKeyword_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getTheKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:643:2: ( 'a' )
                    {
                    // InternalNlToSql.g:643:2: ( 'a' )
                    // InternalNlToSql.g:644:3: 'a'
                    {
                     before(grammarAccess.getComparisonAccess().getAKeyword_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getAKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives_0"


    // $ANTLR start "rule__LogicOperator__Alternatives"
    // InternalNlToSql.g:653:1: rule__LogicOperator__Alternatives : ( ( 'and' ) | ( 'or' ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:657:1: ( ( 'and' ) | ( 'or' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalNlToSql.g:658:2: ( 'and' )
                    {
                    // InternalNlToSql.g:658:2: ( 'and' )
                    // InternalNlToSql.g:659:3: 'and'
                    {
                     before(grammarAccess.getLogicOperatorAccess().getAndKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getLogicOperatorAccess().getAndKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:664:2: ( 'or' )
                    {
                    // InternalNlToSql.g:664:2: ( 'or' )
                    // InternalNlToSql.g:665:3: 'or'
                    {
                     before(grammarAccess.getLogicOperatorAccess().getOrKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLogicOperatorAccess().getOrKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOperator__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalNlToSql.g:674:1: rule__ComparisonOperator__Alternatives : ( ( '=' ) | ( ( rule__ComparisonOperator__Group_1__0 ) ) | ( ( rule__ComparisonOperator__Group_2__0 ) ) | ( ( rule__ComparisonOperator__Group_3__0 ) ) | ( ( rule__ComparisonOperator__Group_4__0 ) ) | ( ( rule__ComparisonOperator__Group_5__0 ) ) | ( ( rule__ComparisonOperator__Group_6__0 ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:678:1: ( ( '=' ) | ( ( rule__ComparisonOperator__Group_1__0 ) ) | ( ( rule__ComparisonOperator__Group_2__0 ) ) | ( ( rule__ComparisonOperator__Group_3__0 ) ) | ( ( rule__ComparisonOperator__Group_4__0 ) ) | ( ( rule__ComparisonOperator__Group_5__0 ) ) | ( ( rule__ComparisonOperator__Group_6__0 ) ) )
            int alt12=7;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalNlToSql.g:679:2: ( '=' )
                    {
                    // InternalNlToSql.g:679:2: ( '=' )
                    // InternalNlToSql.g:680:3: '='
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqualsSignKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonOperatorAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNlToSql.g:685:2: ( ( rule__ComparisonOperator__Group_1__0 ) )
                    {
                    // InternalNlToSql.g:685:2: ( ( rule__ComparisonOperator__Group_1__0 ) )
                    // InternalNlToSql.g:686:3: ( rule__ComparisonOperator__Group_1__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_1()); 
                    // InternalNlToSql.g:687:3: ( rule__ComparisonOperator__Group_1__0 )
                    // InternalNlToSql.g:687:4: rule__ComparisonOperator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalNlToSql.g:691:2: ( ( rule__ComparisonOperator__Group_2__0 ) )
                    {
                    // InternalNlToSql.g:691:2: ( ( rule__ComparisonOperator__Group_2__0 ) )
                    // InternalNlToSql.g:692:3: ( rule__ComparisonOperator__Group_2__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_2()); 
                    // InternalNlToSql.g:693:3: ( rule__ComparisonOperator__Group_2__0 )
                    // InternalNlToSql.g:693:4: rule__ComparisonOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalNlToSql.g:697:2: ( ( rule__ComparisonOperator__Group_3__0 ) )
                    {
                    // InternalNlToSql.g:697:2: ( ( rule__ComparisonOperator__Group_3__0 ) )
                    // InternalNlToSql.g:698:3: ( rule__ComparisonOperator__Group_3__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_3()); 
                    // InternalNlToSql.g:699:3: ( rule__ComparisonOperator__Group_3__0 )
                    // InternalNlToSql.g:699:4: rule__ComparisonOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalNlToSql.g:703:2: ( ( rule__ComparisonOperator__Group_4__0 ) )
                    {
                    // InternalNlToSql.g:703:2: ( ( rule__ComparisonOperator__Group_4__0 ) )
                    // InternalNlToSql.g:704:3: ( rule__ComparisonOperator__Group_4__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_4()); 
                    // InternalNlToSql.g:705:3: ( rule__ComparisonOperator__Group_4__0 )
                    // InternalNlToSql.g:705:4: rule__ComparisonOperator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalNlToSql.g:709:2: ( ( rule__ComparisonOperator__Group_5__0 ) )
                    {
                    // InternalNlToSql.g:709:2: ( ( rule__ComparisonOperator__Group_5__0 ) )
                    // InternalNlToSql.g:710:3: ( rule__ComparisonOperator__Group_5__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_5()); 
                    // InternalNlToSql.g:711:3: ( rule__ComparisonOperator__Group_5__0 )
                    // InternalNlToSql.g:711:4: rule__ComparisonOperator__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalNlToSql.g:715:2: ( ( rule__ComparisonOperator__Group_6__0 ) )
                    {
                    // InternalNlToSql.g:715:2: ( ( rule__ComparisonOperator__Group_6__0 ) )
                    // InternalNlToSql.g:716:3: ( rule__ComparisonOperator__Group_6__0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGroup_6()); 
                    // InternalNlToSql.g:717:3: ( rule__ComparisonOperator__Group_6__0 )
                    // InternalNlToSql.g:717:4: rule__ComparisonOperator__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGroup_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalNlToSql.g:725:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:729:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalNlToSql.g:730:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalNlToSql.g:737:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__Alternatives_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:741:1: ( ( ( rule__Statement__Alternatives_0 ) ) )
            // InternalNlToSql.g:742:1: ( ( rule__Statement__Alternatives_0 ) )
            {
            // InternalNlToSql.g:742:1: ( ( rule__Statement__Alternatives_0 ) )
            // InternalNlToSql.g:743:2: ( rule__Statement__Alternatives_0 )
            {
             before(grammarAccess.getStatementAccess().getAlternatives_0()); 
            // InternalNlToSql.g:744:2: ( rule__Statement__Alternatives_0 )
            // InternalNlToSql.g:744:3: rule__Statement__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalNlToSql.g:752:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:756:1: ( rule__Statement__Group__1__Impl )
            // InternalNlToSql.g:757:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalNlToSql.g:763:1: rule__Statement__Group__1__Impl : ( '.' ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:767:1: ( ( '.' ) )
            // InternalNlToSql.g:768:1: ( '.' )
            {
            // InternalNlToSql.g:768:1: ( '.' )
            // InternalNlToSql.g:769:2: '.'
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group__0"
    // InternalNlToSql.g:779:1: rule__SelectStatement__Group__0 : rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 ;
    public final void rule__SelectStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:783:1: ( rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1 )
            // InternalNlToSql.g:784:2: rule__SelectStatement__Group__0__Impl rule__SelectStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SelectStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__0"


    // $ANTLR start "rule__SelectStatement__Group__0__Impl"
    // InternalNlToSql.g:791:1: rule__SelectStatement__Group__0__Impl : ( ( rule__SelectStatement__Group_0__0 )? ) ;
    public final void rule__SelectStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:795:1: ( ( ( rule__SelectStatement__Group_0__0 )? ) )
            // InternalNlToSql.g:796:1: ( ( rule__SelectStatement__Group_0__0 )? )
            {
            // InternalNlToSql.g:796:1: ( ( rule__SelectStatement__Group_0__0 )? )
            // InternalNlToSql.g:797:2: ( rule__SelectStatement__Group_0__0 )?
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_0()); 
            // InternalNlToSql.g:798:2: ( rule__SelectStatement__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalNlToSql.g:798:3: rule__SelectStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectStatement__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group__1"
    // InternalNlToSql.g:806:1: rule__SelectStatement__Group__1 : rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 ;
    public final void rule__SelectStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:810:1: ( rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2 )
            // InternalNlToSql.g:811:2: rule__SelectStatement__Group__1__Impl rule__SelectStatement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SelectStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__1"


    // $ANTLR start "rule__SelectStatement__Group__1__Impl"
    // InternalNlToSql.g:818:1: rule__SelectStatement__Group__1__Impl : ( 'show' ) ;
    public final void rule__SelectStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:822:1: ( ( 'show' ) )
            // InternalNlToSql.g:823:1: ( 'show' )
            {
            // InternalNlToSql.g:823:1: ( 'show' )
            // InternalNlToSql.g:824:2: 'show'
            {
             before(grammarAccess.getSelectStatementAccess().getShowKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getShowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group__2"
    // InternalNlToSql.g:833:1: rule__SelectStatement__Group__2 : rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3 ;
    public final void rule__SelectStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:837:1: ( rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3 )
            // InternalNlToSql.g:838:2: rule__SelectStatement__Group__2__Impl rule__SelectStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SelectStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__2"


    // $ANTLR start "rule__SelectStatement__Group__2__Impl"
    // InternalNlToSql.g:845:1: rule__SelectStatement__Group__2__Impl : ( ( rule__SelectStatement__Group_2__0 ) ) ;
    public final void rule__SelectStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:849:1: ( ( ( rule__SelectStatement__Group_2__0 ) ) )
            // InternalNlToSql.g:850:1: ( ( rule__SelectStatement__Group_2__0 ) )
            {
            // InternalNlToSql.g:850:1: ( ( rule__SelectStatement__Group_2__0 ) )
            // InternalNlToSql.g:851:2: ( rule__SelectStatement__Group_2__0 )
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_2()); 
            // InternalNlToSql.g:852:2: ( rule__SelectStatement__Group_2__0 )
            // InternalNlToSql.g:852:3: rule__SelectStatement__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__2__Impl"


    // $ANTLR start "rule__SelectStatement__Group__3"
    // InternalNlToSql.g:860:1: rule__SelectStatement__Group__3 : rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4 ;
    public final void rule__SelectStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:864:1: ( rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4 )
            // InternalNlToSql.g:865:2: rule__SelectStatement__Group__3__Impl rule__SelectStatement__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SelectStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__3"


    // $ANTLR start "rule__SelectStatement__Group__3__Impl"
    // InternalNlToSql.g:872:1: rule__SelectStatement__Group__3__Impl : ( ( rule__SelectStatement__EntityAssignment_3 ) ) ;
    public final void rule__SelectStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:876:1: ( ( ( rule__SelectStatement__EntityAssignment_3 ) ) )
            // InternalNlToSql.g:877:1: ( ( rule__SelectStatement__EntityAssignment_3 ) )
            {
            // InternalNlToSql.g:877:1: ( ( rule__SelectStatement__EntityAssignment_3 ) )
            // InternalNlToSql.g:878:2: ( rule__SelectStatement__EntityAssignment_3 )
            {
             before(grammarAccess.getSelectStatementAccess().getEntityAssignment_3()); 
            // InternalNlToSql.g:879:2: ( rule__SelectStatement__EntityAssignment_3 )
            // InternalNlToSql.g:879:3: rule__SelectStatement__EntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getEntityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__3__Impl"


    // $ANTLR start "rule__SelectStatement__Group__4"
    // InternalNlToSql.g:887:1: rule__SelectStatement__Group__4 : rule__SelectStatement__Group__4__Impl rule__SelectStatement__Group__5 ;
    public final void rule__SelectStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:891:1: ( rule__SelectStatement__Group__4__Impl rule__SelectStatement__Group__5 )
            // InternalNlToSql.g:892:2: rule__SelectStatement__Group__4__Impl rule__SelectStatement__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SelectStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__4"


    // $ANTLR start "rule__SelectStatement__Group__4__Impl"
    // InternalNlToSql.g:899:1: rule__SelectStatement__Group__4__Impl : ( ( rule__SelectStatement__Group_4__0 )? ) ;
    public final void rule__SelectStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:903:1: ( ( ( rule__SelectStatement__Group_4__0 )? ) )
            // InternalNlToSql.g:904:1: ( ( rule__SelectStatement__Group_4__0 )? )
            {
            // InternalNlToSql.g:904:1: ( ( rule__SelectStatement__Group_4__0 )? )
            // InternalNlToSql.g:905:2: ( rule__SelectStatement__Group_4__0 )?
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_4()); 
            // InternalNlToSql.g:906:2: ( rule__SelectStatement__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalNlToSql.g:906:3: rule__SelectStatement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectStatement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__4__Impl"


    // $ANTLR start "rule__SelectStatement__Group__5"
    // InternalNlToSql.g:914:1: rule__SelectStatement__Group__5 : rule__SelectStatement__Group__5__Impl ;
    public final void rule__SelectStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:918:1: ( rule__SelectStatement__Group__5__Impl )
            // InternalNlToSql.g:919:2: rule__SelectStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__5"


    // $ANTLR start "rule__SelectStatement__Group__5__Impl"
    // InternalNlToSql.g:925:1: rule__SelectStatement__Group__5__Impl : ( ( rule__SelectStatement__Group_5__0 )? ) ;
    public final void rule__SelectStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:929:1: ( ( ( rule__SelectStatement__Group_5__0 )? ) )
            // InternalNlToSql.g:930:1: ( ( rule__SelectStatement__Group_5__0 )? )
            {
            // InternalNlToSql.g:930:1: ( ( rule__SelectStatement__Group_5__0 )? )
            // InternalNlToSql.g:931:2: ( rule__SelectStatement__Group_5__0 )?
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_5()); 
            // InternalNlToSql.g:932:2: ( rule__SelectStatement__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalNlToSql.g:932:3: rule__SelectStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectStatement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectStatementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group__5__Impl"


    // $ANTLR start "rule__SelectStatement__Group_0__0"
    // InternalNlToSql.g:941:1: rule__SelectStatement__Group_0__0 : rule__SelectStatement__Group_0__0__Impl rule__SelectStatement__Group_0__1 ;
    public final void rule__SelectStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:945:1: ( rule__SelectStatement__Group_0__0__Impl rule__SelectStatement__Group_0__1 )
            // InternalNlToSql.g:946:2: rule__SelectStatement__Group_0__0__Impl rule__SelectStatement__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__SelectStatement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_0__0"


    // $ANTLR start "rule__SelectStatement__Group_0__0__Impl"
    // InternalNlToSql.g:953:1: rule__SelectStatement__Group_0__0__Impl : ( 'can' ) ;
    public final void rule__SelectStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:957:1: ( ( 'can' ) )
            // InternalNlToSql.g:958:1: ( 'can' )
            {
            // InternalNlToSql.g:958:1: ( 'can' )
            // InternalNlToSql.g:959:2: 'can'
            {
             before(grammarAccess.getSelectStatementAccess().getCanKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getCanKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_0__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_0__1"
    // InternalNlToSql.g:968:1: rule__SelectStatement__Group_0__1 : rule__SelectStatement__Group_0__1__Impl rule__SelectStatement__Group_0__2 ;
    public final void rule__SelectStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:972:1: ( rule__SelectStatement__Group_0__1__Impl rule__SelectStatement__Group_0__2 )
            // InternalNlToSql.g:973:2: rule__SelectStatement__Group_0__1__Impl rule__SelectStatement__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__SelectStatement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_0__1"


    // $ANTLR start "rule__SelectStatement__Group_0__1__Impl"
    // InternalNlToSql.g:980:1: rule__SelectStatement__Group_0__1__Impl : ( 'you' ) ;
    public final void rule__SelectStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:984:1: ( ( 'you' ) )
            // InternalNlToSql.g:985:1: ( 'you' )
            {
            // InternalNlToSql.g:985:1: ( 'you' )
            // InternalNlToSql.g:986:2: 'you'
            {
             before(grammarAccess.getSelectStatementAccess().getYouKeyword_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getYouKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_0__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group_0__2"
    // InternalNlToSql.g:995:1: rule__SelectStatement__Group_0__2 : rule__SelectStatement__Group_0__2__Impl ;
    public final void rule__SelectStatement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:999:1: ( rule__SelectStatement__Group_0__2__Impl )
            // InternalNlToSql.g:1000:2: rule__SelectStatement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_0__2"


    // $ANTLR start "rule__SelectStatement__Group_0__2__Impl"
    // InternalNlToSql.g:1006:1: rule__SelectStatement__Group_0__2__Impl : ( 'please' ) ;
    public final void rule__SelectStatement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1010:1: ( ( 'please' ) )
            // InternalNlToSql.g:1011:1: ( 'please' )
            {
            // InternalNlToSql.g:1011:1: ( 'please' )
            // InternalNlToSql.g:1012:2: 'please'
            {
             before(grammarAccess.getSelectStatementAccess().getPleaseKeyword_0_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getPleaseKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_0__2__Impl"


    // $ANTLR start "rule__SelectStatement__Group_2__0"
    // InternalNlToSql.g:1022:1: rule__SelectStatement__Group_2__0 : rule__SelectStatement__Group_2__0__Impl rule__SelectStatement__Group_2__1 ;
    public final void rule__SelectStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1026:1: ( rule__SelectStatement__Group_2__0__Impl rule__SelectStatement__Group_2__1 )
            // InternalNlToSql.g:1027:2: rule__SelectStatement__Group_2__0__Impl rule__SelectStatement__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__SelectStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_2__0"


    // $ANTLR start "rule__SelectStatement__Group_2__0__Impl"
    // InternalNlToSql.g:1034:1: rule__SelectStatement__Group_2__0__Impl : ( ( rule__SelectStatement__Alternatives_2_0 ) ) ;
    public final void rule__SelectStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1038:1: ( ( ( rule__SelectStatement__Alternatives_2_0 ) ) )
            // InternalNlToSql.g:1039:1: ( ( rule__SelectStatement__Alternatives_2_0 ) )
            {
            // InternalNlToSql.g:1039:1: ( ( rule__SelectStatement__Alternatives_2_0 ) )
            // InternalNlToSql.g:1040:2: ( rule__SelectStatement__Alternatives_2_0 )
            {
             before(grammarAccess.getSelectStatementAccess().getAlternatives_2_0()); 
            // InternalNlToSql.g:1041:2: ( rule__SelectStatement__Alternatives_2_0 )
            // InternalNlToSql.g:1041:3: rule__SelectStatement__Alternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_2__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_2__1"
    // InternalNlToSql.g:1049:1: rule__SelectStatement__Group_2__1 : rule__SelectStatement__Group_2__1__Impl ;
    public final void rule__SelectStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1053:1: ( rule__SelectStatement__Group_2__1__Impl )
            // InternalNlToSql.g:1054:2: rule__SelectStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_2__1"


    // $ANTLR start "rule__SelectStatement__Group_2__1__Impl"
    // InternalNlToSql.g:1060:1: rule__SelectStatement__Group_2__1__Impl : ( 'from' ) ;
    public final void rule__SelectStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1064:1: ( ( 'from' ) )
            // InternalNlToSql.g:1065:1: ( 'from' )
            {
            // InternalNlToSql.g:1065:1: ( 'from' )
            // InternalNlToSql.g:1066:2: 'from'
            {
             before(grammarAccess.getSelectStatementAccess().getFromKeyword_2_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getFromKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_2__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group_4__0"
    // InternalNlToSql.g:1076:1: rule__SelectStatement__Group_4__0 : rule__SelectStatement__Group_4__0__Impl rule__SelectStatement__Group_4__1 ;
    public final void rule__SelectStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1080:1: ( rule__SelectStatement__Group_4__0__Impl rule__SelectStatement__Group_4__1 )
            // InternalNlToSql.g:1081:2: rule__SelectStatement__Group_4__0__Impl rule__SelectStatement__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__SelectStatement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_4__0"


    // $ANTLR start "rule__SelectStatement__Group_4__0__Impl"
    // InternalNlToSql.g:1088:1: rule__SelectStatement__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__SelectStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1092:1: ( ( 'where' ) )
            // InternalNlToSql.g:1093:1: ( 'where' )
            {
            // InternalNlToSql.g:1093:1: ( 'where' )
            // InternalNlToSql.g:1094:2: 'where'
            {
             before(grammarAccess.getSelectStatementAccess().getWhereKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getWhereKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_4__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_4__1"
    // InternalNlToSql.g:1103:1: rule__SelectStatement__Group_4__1 : rule__SelectStatement__Group_4__1__Impl ;
    public final void rule__SelectStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1107:1: ( rule__SelectStatement__Group_4__1__Impl )
            // InternalNlToSql.g:1108:2: rule__SelectStatement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_4__1"


    // $ANTLR start "rule__SelectStatement__Group_4__1__Impl"
    // InternalNlToSql.g:1114:1: rule__SelectStatement__Group_4__1__Impl : ( ( rule__SelectStatement__ConditionAssignment_4_1 ) ) ;
    public final void rule__SelectStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1118:1: ( ( ( rule__SelectStatement__ConditionAssignment_4_1 ) ) )
            // InternalNlToSql.g:1119:1: ( ( rule__SelectStatement__ConditionAssignment_4_1 ) )
            {
            // InternalNlToSql.g:1119:1: ( ( rule__SelectStatement__ConditionAssignment_4_1 ) )
            // InternalNlToSql.g:1120:2: ( rule__SelectStatement__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getConditionAssignment_4_1()); 
            // InternalNlToSql.g:1121:2: ( rule__SelectStatement__ConditionAssignment_4_1 )
            // InternalNlToSql.g:1121:3: rule__SelectStatement__ConditionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__ConditionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getConditionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_4__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group_5__0"
    // InternalNlToSql.g:1130:1: rule__SelectStatement__Group_5__0 : rule__SelectStatement__Group_5__0__Impl rule__SelectStatement__Group_5__1 ;
    public final void rule__SelectStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1134:1: ( rule__SelectStatement__Group_5__0__Impl rule__SelectStatement__Group_5__1 )
            // InternalNlToSql.g:1135:2: rule__SelectStatement__Group_5__0__Impl rule__SelectStatement__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__SelectStatement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5__0"


    // $ANTLR start "rule__SelectStatement__Group_5__0__Impl"
    // InternalNlToSql.g:1142:1: rule__SelectStatement__Group_5__0__Impl : ( 'group' ) ;
    public final void rule__SelectStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1146:1: ( ( 'group' ) )
            // InternalNlToSql.g:1147:1: ( 'group' )
            {
            // InternalNlToSql.g:1147:1: ( 'group' )
            // InternalNlToSql.g:1148:2: 'group'
            {
             before(grammarAccess.getSelectStatementAccess().getGroupKeyword_5_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getGroupKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_5__1"
    // InternalNlToSql.g:1157:1: rule__SelectStatement__Group_5__1 : rule__SelectStatement__Group_5__1__Impl rule__SelectStatement__Group_5__2 ;
    public final void rule__SelectStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1161:1: ( rule__SelectStatement__Group_5__1__Impl rule__SelectStatement__Group_5__2 )
            // InternalNlToSql.g:1162:2: rule__SelectStatement__Group_5__1__Impl rule__SelectStatement__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__SelectStatement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5__1"


    // $ANTLR start "rule__SelectStatement__Group_5__1__Impl"
    // InternalNlToSql.g:1169:1: rule__SelectStatement__Group_5__1__Impl : ( 'by' ) ;
    public final void rule__SelectStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1173:1: ( ( 'by' ) )
            // InternalNlToSql.g:1174:1: ( 'by' )
            {
            // InternalNlToSql.g:1174:1: ( 'by' )
            // InternalNlToSql.g:1175:2: 'by'
            {
             before(grammarAccess.getSelectStatementAccess().getByKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getByKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5__1__Impl"


    // $ANTLR start "rule__SelectStatement__Group_5__2"
    // InternalNlToSql.g:1184:1: rule__SelectStatement__Group_5__2 : rule__SelectStatement__Group_5__2__Impl rule__SelectStatement__Group_5__3 ;
    public final void rule__SelectStatement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1188:1: ( rule__SelectStatement__Group_5__2__Impl rule__SelectStatement__Group_5__3 )
            // InternalNlToSql.g:1189:2: rule__SelectStatement__Group_5__2__Impl rule__SelectStatement__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__SelectStatement__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5__2"


    // $ANTLR start "rule__SelectStatement__Group_5__2__Impl"
    // InternalNlToSql.g:1196:1: rule__SelectStatement__Group_5__2__Impl : ( ( rule__SelectStatement__GroupByListAssignment_5_2 ) ) ;
    public final void rule__SelectStatement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1200:1: ( ( ( rule__SelectStatement__GroupByListAssignment_5_2 ) ) )
            // InternalNlToSql.g:1201:1: ( ( rule__SelectStatement__GroupByListAssignment_5_2 ) )
            {
            // InternalNlToSql.g:1201:1: ( ( rule__SelectStatement__GroupByListAssignment_5_2 ) )
            // InternalNlToSql.g:1202:2: ( rule__SelectStatement__GroupByListAssignment_5_2 )
            {
             before(grammarAccess.getSelectStatementAccess().getGroupByListAssignment_5_2()); 
            // InternalNlToSql.g:1203:2: ( rule__SelectStatement__GroupByListAssignment_5_2 )
            // InternalNlToSql.g:1203:3: rule__SelectStatement__GroupByListAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__GroupByListAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getGroupByListAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5__2__Impl"


    // $ANTLR start "rule__SelectStatement__Group_5__3"
    // InternalNlToSql.g:1211:1: rule__SelectStatement__Group_5__3 : rule__SelectStatement__Group_5__3__Impl ;
    public final void rule__SelectStatement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1215:1: ( rule__SelectStatement__Group_5__3__Impl )
            // InternalNlToSql.g:1216:2: rule__SelectStatement__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5__3"


    // $ANTLR start "rule__SelectStatement__Group_5__3__Impl"
    // InternalNlToSql.g:1222:1: rule__SelectStatement__Group_5__3__Impl : ( ( rule__SelectStatement__Group_5_3__0 )* ) ;
    public final void rule__SelectStatement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1226:1: ( ( ( rule__SelectStatement__Group_5_3__0 )* ) )
            // InternalNlToSql.g:1227:1: ( ( rule__SelectStatement__Group_5_3__0 )* )
            {
            // InternalNlToSql.g:1227:1: ( ( rule__SelectStatement__Group_5_3__0 )* )
            // InternalNlToSql.g:1228:2: ( rule__SelectStatement__Group_5_3__0 )*
            {
             before(grammarAccess.getSelectStatementAccess().getGroup_5_3()); 
            // InternalNlToSql.g:1229:2: ( rule__SelectStatement__Group_5_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalNlToSql.g:1229:3: rule__SelectStatement__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__SelectStatement__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSelectStatementAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5__3__Impl"


    // $ANTLR start "rule__SelectStatement__Group_5_3__0"
    // InternalNlToSql.g:1238:1: rule__SelectStatement__Group_5_3__0 : rule__SelectStatement__Group_5_3__0__Impl rule__SelectStatement__Group_5_3__1 ;
    public final void rule__SelectStatement__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1242:1: ( rule__SelectStatement__Group_5_3__0__Impl rule__SelectStatement__Group_5_3__1 )
            // InternalNlToSql.g:1243:2: rule__SelectStatement__Group_5_3__0__Impl rule__SelectStatement__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__SelectStatement__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5_3__0"


    // $ANTLR start "rule__SelectStatement__Group_5_3__0__Impl"
    // InternalNlToSql.g:1250:1: rule__SelectStatement__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__SelectStatement__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1254:1: ( ( ',' ) )
            // InternalNlToSql.g:1255:1: ( ',' )
            {
            // InternalNlToSql.g:1255:1: ( ',' )
            // InternalNlToSql.g:1256:2: ','
            {
             before(grammarAccess.getSelectStatementAccess().getCommaKeyword_5_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSelectStatementAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5_3__0__Impl"


    // $ANTLR start "rule__SelectStatement__Group_5_3__1"
    // InternalNlToSql.g:1265:1: rule__SelectStatement__Group_5_3__1 : rule__SelectStatement__Group_5_3__1__Impl ;
    public final void rule__SelectStatement__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1269:1: ( rule__SelectStatement__Group_5_3__1__Impl )
            // InternalNlToSql.g:1270:2: rule__SelectStatement__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5_3__1"


    // $ANTLR start "rule__SelectStatement__Group_5_3__1__Impl"
    // InternalNlToSql.g:1276:1: rule__SelectStatement__Group_5_3__1__Impl : ( ( rule__SelectStatement__GroupByListAssignment_5_3_1 ) ) ;
    public final void rule__SelectStatement__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1280:1: ( ( ( rule__SelectStatement__GroupByListAssignment_5_3_1 ) ) )
            // InternalNlToSql.g:1281:1: ( ( rule__SelectStatement__GroupByListAssignment_5_3_1 ) )
            {
            // InternalNlToSql.g:1281:1: ( ( rule__SelectStatement__GroupByListAssignment_5_3_1 ) )
            // InternalNlToSql.g:1282:2: ( rule__SelectStatement__GroupByListAssignment_5_3_1 )
            {
             before(grammarAccess.getSelectStatementAccess().getGroupByListAssignment_5_3_1()); 
            // InternalNlToSql.g:1283:2: ( rule__SelectStatement__GroupByListAssignment_5_3_1 )
            // InternalNlToSql.g:1283:3: rule__SelectStatement__GroupByListAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectStatement__GroupByListAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectStatementAccess().getGroupByListAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__Group_5_3__1__Impl"


    // $ANTLR start "rule__InsertStatement__Group__0"
    // InternalNlToSql.g:1292:1: rule__InsertStatement__Group__0 : rule__InsertStatement__Group__0__Impl rule__InsertStatement__Group__1 ;
    public final void rule__InsertStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1296:1: ( rule__InsertStatement__Group__0__Impl rule__InsertStatement__Group__1 )
            // InternalNlToSql.g:1297:2: rule__InsertStatement__Group__0__Impl rule__InsertStatement__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__InsertStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__0"


    // $ANTLR start "rule__InsertStatement__Group__0__Impl"
    // InternalNlToSql.g:1304:1: rule__InsertStatement__Group__0__Impl : ( ( rule__InsertStatement__Group_0__0 )? ) ;
    public final void rule__InsertStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1308:1: ( ( ( rule__InsertStatement__Group_0__0 )? ) )
            // InternalNlToSql.g:1309:1: ( ( rule__InsertStatement__Group_0__0 )? )
            {
            // InternalNlToSql.g:1309:1: ( ( rule__InsertStatement__Group_0__0 )? )
            // InternalNlToSql.g:1310:2: ( rule__InsertStatement__Group_0__0 )?
            {
             before(grammarAccess.getInsertStatementAccess().getGroup_0()); 
            // InternalNlToSql.g:1311:2: ( rule__InsertStatement__Group_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalNlToSql.g:1311:3: rule__InsertStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InsertStatement__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInsertStatementAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__0__Impl"


    // $ANTLR start "rule__InsertStatement__Group__1"
    // InternalNlToSql.g:1319:1: rule__InsertStatement__Group__1 : rule__InsertStatement__Group__1__Impl rule__InsertStatement__Group__2 ;
    public final void rule__InsertStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1323:1: ( rule__InsertStatement__Group__1__Impl rule__InsertStatement__Group__2 )
            // InternalNlToSql.g:1324:2: rule__InsertStatement__Group__1__Impl rule__InsertStatement__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__InsertStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__1"


    // $ANTLR start "rule__InsertStatement__Group__1__Impl"
    // InternalNlToSql.g:1331:1: rule__InsertStatement__Group__1__Impl : ( 'insert' ) ;
    public final void rule__InsertStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1335:1: ( ( 'insert' ) )
            // InternalNlToSql.g:1336:1: ( 'insert' )
            {
            // InternalNlToSql.g:1336:1: ( 'insert' )
            // InternalNlToSql.g:1337:2: 'insert'
            {
             before(grammarAccess.getInsertStatementAccess().getInsertKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getInsertKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__1__Impl"


    // $ANTLR start "rule__InsertStatement__Group__2"
    // InternalNlToSql.g:1346:1: rule__InsertStatement__Group__2 : rule__InsertStatement__Group__2__Impl rule__InsertStatement__Group__3 ;
    public final void rule__InsertStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1350:1: ( rule__InsertStatement__Group__2__Impl rule__InsertStatement__Group__3 )
            // InternalNlToSql.g:1351:2: rule__InsertStatement__Group__2__Impl rule__InsertStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__InsertStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__2"


    // $ANTLR start "rule__InsertStatement__Group__2__Impl"
    // InternalNlToSql.g:1358:1: rule__InsertStatement__Group__2__Impl : ( 'into' ) ;
    public final void rule__InsertStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1362:1: ( ( 'into' ) )
            // InternalNlToSql.g:1363:1: ( 'into' )
            {
            // InternalNlToSql.g:1363:1: ( 'into' )
            // InternalNlToSql.g:1364:2: 'into'
            {
             before(grammarAccess.getInsertStatementAccess().getIntoKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getIntoKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__2__Impl"


    // $ANTLR start "rule__InsertStatement__Group__3"
    // InternalNlToSql.g:1373:1: rule__InsertStatement__Group__3 : rule__InsertStatement__Group__3__Impl rule__InsertStatement__Group__4 ;
    public final void rule__InsertStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1377:1: ( rule__InsertStatement__Group__3__Impl rule__InsertStatement__Group__4 )
            // InternalNlToSql.g:1378:2: rule__InsertStatement__Group__3__Impl rule__InsertStatement__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__InsertStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__3"


    // $ANTLR start "rule__InsertStatement__Group__3__Impl"
    // InternalNlToSql.g:1385:1: rule__InsertStatement__Group__3__Impl : ( ( rule__InsertStatement__EntityAssignment_3 ) ) ;
    public final void rule__InsertStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1389:1: ( ( ( rule__InsertStatement__EntityAssignment_3 ) ) )
            // InternalNlToSql.g:1390:1: ( ( rule__InsertStatement__EntityAssignment_3 ) )
            {
            // InternalNlToSql.g:1390:1: ( ( rule__InsertStatement__EntityAssignment_3 ) )
            // InternalNlToSql.g:1391:2: ( rule__InsertStatement__EntityAssignment_3 )
            {
             before(grammarAccess.getInsertStatementAccess().getEntityAssignment_3()); 
            // InternalNlToSql.g:1392:2: ( rule__InsertStatement__EntityAssignment_3 )
            // InternalNlToSql.g:1392:3: rule__InsertStatement__EntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInsertStatementAccess().getEntityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__3__Impl"


    // $ANTLR start "rule__InsertStatement__Group__4"
    // InternalNlToSql.g:1400:1: rule__InsertStatement__Group__4 : rule__InsertStatement__Group__4__Impl rule__InsertStatement__Group__5 ;
    public final void rule__InsertStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1404:1: ( rule__InsertStatement__Group__4__Impl rule__InsertStatement__Group__5 )
            // InternalNlToSql.g:1405:2: rule__InsertStatement__Group__4__Impl rule__InsertStatement__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__InsertStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__4"


    // $ANTLR start "rule__InsertStatement__Group__4__Impl"
    // InternalNlToSql.g:1412:1: rule__InsertStatement__Group__4__Impl : ( '(' ) ;
    public final void rule__InsertStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1416:1: ( ( '(' ) )
            // InternalNlToSql.g:1417:1: ( '(' )
            {
            // InternalNlToSql.g:1417:1: ( '(' )
            // InternalNlToSql.g:1418:2: '('
            {
             before(grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__4__Impl"


    // $ANTLR start "rule__InsertStatement__Group__5"
    // InternalNlToSql.g:1427:1: rule__InsertStatement__Group__5 : rule__InsertStatement__Group__5__Impl rule__InsertStatement__Group__6 ;
    public final void rule__InsertStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1431:1: ( rule__InsertStatement__Group__5__Impl rule__InsertStatement__Group__6 )
            // InternalNlToSql.g:1432:2: rule__InsertStatement__Group__5__Impl rule__InsertStatement__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__InsertStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__5"


    // $ANTLR start "rule__InsertStatement__Group__5__Impl"
    // InternalNlToSql.g:1439:1: rule__InsertStatement__Group__5__Impl : ( ( rule__InsertStatement__PropertyListAssignment_5 ) ) ;
    public final void rule__InsertStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1443:1: ( ( ( rule__InsertStatement__PropertyListAssignment_5 ) ) )
            // InternalNlToSql.g:1444:1: ( ( rule__InsertStatement__PropertyListAssignment_5 ) )
            {
            // InternalNlToSql.g:1444:1: ( ( rule__InsertStatement__PropertyListAssignment_5 ) )
            // InternalNlToSql.g:1445:2: ( rule__InsertStatement__PropertyListAssignment_5 )
            {
             before(grammarAccess.getInsertStatementAccess().getPropertyListAssignment_5()); 
            // InternalNlToSql.g:1446:2: ( rule__InsertStatement__PropertyListAssignment_5 )
            // InternalNlToSql.g:1446:3: rule__InsertStatement__PropertyListAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__PropertyListAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getInsertStatementAccess().getPropertyListAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__5__Impl"


    // $ANTLR start "rule__InsertStatement__Group__6"
    // InternalNlToSql.g:1454:1: rule__InsertStatement__Group__6 : rule__InsertStatement__Group__6__Impl rule__InsertStatement__Group__7 ;
    public final void rule__InsertStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1458:1: ( rule__InsertStatement__Group__6__Impl rule__InsertStatement__Group__7 )
            // InternalNlToSql.g:1459:2: rule__InsertStatement__Group__6__Impl rule__InsertStatement__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__InsertStatement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__6"


    // $ANTLR start "rule__InsertStatement__Group__6__Impl"
    // InternalNlToSql.g:1466:1: rule__InsertStatement__Group__6__Impl : ( ( rule__InsertStatement__Group_6__0 )* ) ;
    public final void rule__InsertStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1470:1: ( ( ( rule__InsertStatement__Group_6__0 )* ) )
            // InternalNlToSql.g:1471:1: ( ( rule__InsertStatement__Group_6__0 )* )
            {
            // InternalNlToSql.g:1471:1: ( ( rule__InsertStatement__Group_6__0 )* )
            // InternalNlToSql.g:1472:2: ( rule__InsertStatement__Group_6__0 )*
            {
             before(grammarAccess.getInsertStatementAccess().getGroup_6()); 
            // InternalNlToSql.g:1473:2: ( rule__InsertStatement__Group_6__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalNlToSql.g:1473:3: rule__InsertStatement__Group_6__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__InsertStatement__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getInsertStatementAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__6__Impl"


    // $ANTLR start "rule__InsertStatement__Group__7"
    // InternalNlToSql.g:1481:1: rule__InsertStatement__Group__7 : rule__InsertStatement__Group__7__Impl rule__InsertStatement__Group__8 ;
    public final void rule__InsertStatement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1485:1: ( rule__InsertStatement__Group__7__Impl rule__InsertStatement__Group__8 )
            // InternalNlToSql.g:1486:2: rule__InsertStatement__Group__7__Impl rule__InsertStatement__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__InsertStatement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__7"


    // $ANTLR start "rule__InsertStatement__Group__7__Impl"
    // InternalNlToSql.g:1493:1: rule__InsertStatement__Group__7__Impl : ( ')' ) ;
    public final void rule__InsertStatement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1497:1: ( ( ')' ) )
            // InternalNlToSql.g:1498:1: ( ')' )
            {
            // InternalNlToSql.g:1498:1: ( ')' )
            // InternalNlToSql.g:1499:2: ')'
            {
             before(grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__7__Impl"


    // $ANTLR start "rule__InsertStatement__Group__8"
    // InternalNlToSql.g:1508:1: rule__InsertStatement__Group__8 : rule__InsertStatement__Group__8__Impl rule__InsertStatement__Group__9 ;
    public final void rule__InsertStatement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1512:1: ( rule__InsertStatement__Group__8__Impl rule__InsertStatement__Group__9 )
            // InternalNlToSql.g:1513:2: rule__InsertStatement__Group__8__Impl rule__InsertStatement__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__InsertStatement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__8"


    // $ANTLR start "rule__InsertStatement__Group__8__Impl"
    // InternalNlToSql.g:1520:1: rule__InsertStatement__Group__8__Impl : ( 'values' ) ;
    public final void rule__InsertStatement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1524:1: ( ( 'values' ) )
            // InternalNlToSql.g:1525:1: ( 'values' )
            {
            // InternalNlToSql.g:1525:1: ( 'values' )
            // InternalNlToSql.g:1526:2: 'values'
            {
             before(grammarAccess.getInsertStatementAccess().getValuesKeyword_8()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getValuesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__8__Impl"


    // $ANTLR start "rule__InsertStatement__Group__9"
    // InternalNlToSql.g:1535:1: rule__InsertStatement__Group__9 : rule__InsertStatement__Group__9__Impl rule__InsertStatement__Group__10 ;
    public final void rule__InsertStatement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1539:1: ( rule__InsertStatement__Group__9__Impl rule__InsertStatement__Group__10 )
            // InternalNlToSql.g:1540:2: rule__InsertStatement__Group__9__Impl rule__InsertStatement__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__InsertStatement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__9"


    // $ANTLR start "rule__InsertStatement__Group__9__Impl"
    // InternalNlToSql.g:1547:1: rule__InsertStatement__Group__9__Impl : ( '(' ) ;
    public final void rule__InsertStatement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1551:1: ( ( '(' ) )
            // InternalNlToSql.g:1552:1: ( '(' )
            {
            // InternalNlToSql.g:1552:1: ( '(' )
            // InternalNlToSql.g:1553:2: '('
            {
             before(grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_9()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getLeftParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__9__Impl"


    // $ANTLR start "rule__InsertStatement__Group__10"
    // InternalNlToSql.g:1562:1: rule__InsertStatement__Group__10 : rule__InsertStatement__Group__10__Impl rule__InsertStatement__Group__11 ;
    public final void rule__InsertStatement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1566:1: ( rule__InsertStatement__Group__10__Impl rule__InsertStatement__Group__11 )
            // InternalNlToSql.g:1567:2: rule__InsertStatement__Group__10__Impl rule__InsertStatement__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__InsertStatement__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__10"


    // $ANTLR start "rule__InsertStatement__Group__10__Impl"
    // InternalNlToSql.g:1574:1: rule__InsertStatement__Group__10__Impl : ( ( rule__InsertStatement__ValueListAssignment_10 ) ) ;
    public final void rule__InsertStatement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1578:1: ( ( ( rule__InsertStatement__ValueListAssignment_10 ) ) )
            // InternalNlToSql.g:1579:1: ( ( rule__InsertStatement__ValueListAssignment_10 ) )
            {
            // InternalNlToSql.g:1579:1: ( ( rule__InsertStatement__ValueListAssignment_10 ) )
            // InternalNlToSql.g:1580:2: ( rule__InsertStatement__ValueListAssignment_10 )
            {
             before(grammarAccess.getInsertStatementAccess().getValueListAssignment_10()); 
            // InternalNlToSql.g:1581:2: ( rule__InsertStatement__ValueListAssignment_10 )
            // InternalNlToSql.g:1581:3: rule__InsertStatement__ValueListAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__ValueListAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getInsertStatementAccess().getValueListAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__10__Impl"


    // $ANTLR start "rule__InsertStatement__Group__11"
    // InternalNlToSql.g:1589:1: rule__InsertStatement__Group__11 : rule__InsertStatement__Group__11__Impl rule__InsertStatement__Group__12 ;
    public final void rule__InsertStatement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1593:1: ( rule__InsertStatement__Group__11__Impl rule__InsertStatement__Group__12 )
            // InternalNlToSql.g:1594:2: rule__InsertStatement__Group__11__Impl rule__InsertStatement__Group__12
            {
            pushFollow(FOLLOW_18);
            rule__InsertStatement__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__11"


    // $ANTLR start "rule__InsertStatement__Group__11__Impl"
    // InternalNlToSql.g:1601:1: rule__InsertStatement__Group__11__Impl : ( ( rule__InsertStatement__Group_11__0 )* ) ;
    public final void rule__InsertStatement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1605:1: ( ( ( rule__InsertStatement__Group_11__0 )* ) )
            // InternalNlToSql.g:1606:1: ( ( rule__InsertStatement__Group_11__0 )* )
            {
            // InternalNlToSql.g:1606:1: ( ( rule__InsertStatement__Group_11__0 )* )
            // InternalNlToSql.g:1607:2: ( rule__InsertStatement__Group_11__0 )*
            {
             before(grammarAccess.getInsertStatementAccess().getGroup_11()); 
            // InternalNlToSql.g:1608:2: ( rule__InsertStatement__Group_11__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalNlToSql.g:1608:3: rule__InsertStatement__Group_11__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__InsertStatement__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getInsertStatementAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__11__Impl"


    // $ANTLR start "rule__InsertStatement__Group__12"
    // InternalNlToSql.g:1616:1: rule__InsertStatement__Group__12 : rule__InsertStatement__Group__12__Impl ;
    public final void rule__InsertStatement__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1620:1: ( rule__InsertStatement__Group__12__Impl )
            // InternalNlToSql.g:1621:2: rule__InsertStatement__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__12"


    // $ANTLR start "rule__InsertStatement__Group__12__Impl"
    // InternalNlToSql.g:1627:1: rule__InsertStatement__Group__12__Impl : ( ')' ) ;
    public final void rule__InsertStatement__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1631:1: ( ( ')' ) )
            // InternalNlToSql.g:1632:1: ( ')' )
            {
            // InternalNlToSql.g:1632:1: ( ')' )
            // InternalNlToSql.g:1633:2: ')'
            {
             before(grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_12()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group__12__Impl"


    // $ANTLR start "rule__InsertStatement__Group_0__0"
    // InternalNlToSql.g:1643:1: rule__InsertStatement__Group_0__0 : rule__InsertStatement__Group_0__0__Impl rule__InsertStatement__Group_0__1 ;
    public final void rule__InsertStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1647:1: ( rule__InsertStatement__Group_0__0__Impl rule__InsertStatement__Group_0__1 )
            // InternalNlToSql.g:1648:2: rule__InsertStatement__Group_0__0__Impl rule__InsertStatement__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__InsertStatement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_0__0"


    // $ANTLR start "rule__InsertStatement__Group_0__0__Impl"
    // InternalNlToSql.g:1655:1: rule__InsertStatement__Group_0__0__Impl : ( 'can' ) ;
    public final void rule__InsertStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1659:1: ( ( 'can' ) )
            // InternalNlToSql.g:1660:1: ( 'can' )
            {
            // InternalNlToSql.g:1660:1: ( 'can' )
            // InternalNlToSql.g:1661:2: 'can'
            {
             before(grammarAccess.getInsertStatementAccess().getCanKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getCanKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_0__0__Impl"


    // $ANTLR start "rule__InsertStatement__Group_0__1"
    // InternalNlToSql.g:1670:1: rule__InsertStatement__Group_0__1 : rule__InsertStatement__Group_0__1__Impl rule__InsertStatement__Group_0__2 ;
    public final void rule__InsertStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1674:1: ( rule__InsertStatement__Group_0__1__Impl rule__InsertStatement__Group_0__2 )
            // InternalNlToSql.g:1675:2: rule__InsertStatement__Group_0__1__Impl rule__InsertStatement__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__InsertStatement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_0__1"


    // $ANTLR start "rule__InsertStatement__Group_0__1__Impl"
    // InternalNlToSql.g:1682:1: rule__InsertStatement__Group_0__1__Impl : ( 'you' ) ;
    public final void rule__InsertStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1686:1: ( ( 'you' ) )
            // InternalNlToSql.g:1687:1: ( 'you' )
            {
            // InternalNlToSql.g:1687:1: ( 'you' )
            // InternalNlToSql.g:1688:2: 'you'
            {
             before(grammarAccess.getInsertStatementAccess().getYouKeyword_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getYouKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_0__1__Impl"


    // $ANTLR start "rule__InsertStatement__Group_0__2"
    // InternalNlToSql.g:1697:1: rule__InsertStatement__Group_0__2 : rule__InsertStatement__Group_0__2__Impl ;
    public final void rule__InsertStatement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1701:1: ( rule__InsertStatement__Group_0__2__Impl )
            // InternalNlToSql.g:1702:2: rule__InsertStatement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_0__2"


    // $ANTLR start "rule__InsertStatement__Group_0__2__Impl"
    // InternalNlToSql.g:1708:1: rule__InsertStatement__Group_0__2__Impl : ( 'please' ) ;
    public final void rule__InsertStatement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1712:1: ( ( 'please' ) )
            // InternalNlToSql.g:1713:1: ( 'please' )
            {
            // InternalNlToSql.g:1713:1: ( 'please' )
            // InternalNlToSql.g:1714:2: 'please'
            {
             before(grammarAccess.getInsertStatementAccess().getPleaseKeyword_0_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getPleaseKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_0__2__Impl"


    // $ANTLR start "rule__InsertStatement__Group_6__0"
    // InternalNlToSql.g:1724:1: rule__InsertStatement__Group_6__0 : rule__InsertStatement__Group_6__0__Impl rule__InsertStatement__Group_6__1 ;
    public final void rule__InsertStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1728:1: ( rule__InsertStatement__Group_6__0__Impl rule__InsertStatement__Group_6__1 )
            // InternalNlToSql.g:1729:2: rule__InsertStatement__Group_6__0__Impl rule__InsertStatement__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__InsertStatement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_6__0"


    // $ANTLR start "rule__InsertStatement__Group_6__0__Impl"
    // InternalNlToSql.g:1736:1: rule__InsertStatement__Group_6__0__Impl : ( ',' ) ;
    public final void rule__InsertStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1740:1: ( ( ',' ) )
            // InternalNlToSql.g:1741:1: ( ',' )
            {
            // InternalNlToSql.g:1741:1: ( ',' )
            // InternalNlToSql.g:1742:2: ','
            {
             before(grammarAccess.getInsertStatementAccess().getCommaKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_6__0__Impl"


    // $ANTLR start "rule__InsertStatement__Group_6__1"
    // InternalNlToSql.g:1751:1: rule__InsertStatement__Group_6__1 : rule__InsertStatement__Group_6__1__Impl ;
    public final void rule__InsertStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1755:1: ( rule__InsertStatement__Group_6__1__Impl )
            // InternalNlToSql.g:1756:2: rule__InsertStatement__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_6__1"


    // $ANTLR start "rule__InsertStatement__Group_6__1__Impl"
    // InternalNlToSql.g:1762:1: rule__InsertStatement__Group_6__1__Impl : ( ( rule__InsertStatement__PropertyListAssignment_6_1 ) ) ;
    public final void rule__InsertStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1766:1: ( ( ( rule__InsertStatement__PropertyListAssignment_6_1 ) ) )
            // InternalNlToSql.g:1767:1: ( ( rule__InsertStatement__PropertyListAssignment_6_1 ) )
            {
            // InternalNlToSql.g:1767:1: ( ( rule__InsertStatement__PropertyListAssignment_6_1 ) )
            // InternalNlToSql.g:1768:2: ( rule__InsertStatement__PropertyListAssignment_6_1 )
            {
             before(grammarAccess.getInsertStatementAccess().getPropertyListAssignment_6_1()); 
            // InternalNlToSql.g:1769:2: ( rule__InsertStatement__PropertyListAssignment_6_1 )
            // InternalNlToSql.g:1769:3: rule__InsertStatement__PropertyListAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__PropertyListAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertStatementAccess().getPropertyListAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_6__1__Impl"


    // $ANTLR start "rule__InsertStatement__Group_11__0"
    // InternalNlToSql.g:1778:1: rule__InsertStatement__Group_11__0 : rule__InsertStatement__Group_11__0__Impl rule__InsertStatement__Group_11__1 ;
    public final void rule__InsertStatement__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1782:1: ( rule__InsertStatement__Group_11__0__Impl rule__InsertStatement__Group_11__1 )
            // InternalNlToSql.g:1783:2: rule__InsertStatement__Group_11__0__Impl rule__InsertStatement__Group_11__1
            {
            pushFollow(FOLLOW_20);
            rule__InsertStatement__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_11__0"


    // $ANTLR start "rule__InsertStatement__Group_11__0__Impl"
    // InternalNlToSql.g:1790:1: rule__InsertStatement__Group_11__0__Impl : ( ',' ) ;
    public final void rule__InsertStatement__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1794:1: ( ( ',' ) )
            // InternalNlToSql.g:1795:1: ( ',' )
            {
            // InternalNlToSql.g:1795:1: ( ',' )
            // InternalNlToSql.g:1796:2: ','
            {
             before(grammarAccess.getInsertStatementAccess().getCommaKeyword_11_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInsertStatementAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_11__0__Impl"


    // $ANTLR start "rule__InsertStatement__Group_11__1"
    // InternalNlToSql.g:1805:1: rule__InsertStatement__Group_11__1 : rule__InsertStatement__Group_11__1__Impl ;
    public final void rule__InsertStatement__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1809:1: ( rule__InsertStatement__Group_11__1__Impl )
            // InternalNlToSql.g:1810:2: rule__InsertStatement__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_11__1"


    // $ANTLR start "rule__InsertStatement__Group_11__1__Impl"
    // InternalNlToSql.g:1816:1: rule__InsertStatement__Group_11__1__Impl : ( ( rule__InsertStatement__ValueListAssignment_11_1 ) ) ;
    public final void rule__InsertStatement__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1820:1: ( ( ( rule__InsertStatement__ValueListAssignment_11_1 ) ) )
            // InternalNlToSql.g:1821:1: ( ( rule__InsertStatement__ValueListAssignment_11_1 ) )
            {
            // InternalNlToSql.g:1821:1: ( ( rule__InsertStatement__ValueListAssignment_11_1 ) )
            // InternalNlToSql.g:1822:2: ( rule__InsertStatement__ValueListAssignment_11_1 )
            {
             before(grammarAccess.getInsertStatementAccess().getValueListAssignment_11_1()); 
            // InternalNlToSql.g:1823:2: ( rule__InsertStatement__ValueListAssignment_11_1 )
            // InternalNlToSql.g:1823:3: rule__InsertStatement__ValueListAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__InsertStatement__ValueListAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getInsertStatementAccess().getValueListAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__Group_11__1__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__0"
    // InternalNlToSql.g:1832:1: rule__UpdateStatement__Group__0 : rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 ;
    public final void rule__UpdateStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1836:1: ( rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1 )
            // InternalNlToSql.g:1837:2: rule__UpdateStatement__Group__0__Impl rule__UpdateStatement__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__UpdateStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__0"


    // $ANTLR start "rule__UpdateStatement__Group__0__Impl"
    // InternalNlToSql.g:1844:1: rule__UpdateStatement__Group__0__Impl : ( ( rule__UpdateStatement__Group_0__0 )? ) ;
    public final void rule__UpdateStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1848:1: ( ( ( rule__UpdateStatement__Group_0__0 )? ) )
            // InternalNlToSql.g:1849:1: ( ( rule__UpdateStatement__Group_0__0 )? )
            {
            // InternalNlToSql.g:1849:1: ( ( rule__UpdateStatement__Group_0__0 )? )
            // InternalNlToSql.g:1850:2: ( rule__UpdateStatement__Group_0__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_0()); 
            // InternalNlToSql.g:1851:2: ( rule__UpdateStatement__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalNlToSql.g:1851:3: rule__UpdateStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateStatement__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpdateStatementAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__0__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__1"
    // InternalNlToSql.g:1859:1: rule__UpdateStatement__Group__1 : rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 ;
    public final void rule__UpdateStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1863:1: ( rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2 )
            // InternalNlToSql.g:1864:2: rule__UpdateStatement__Group__1__Impl rule__UpdateStatement__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__UpdateStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__1"


    // $ANTLR start "rule__UpdateStatement__Group__1__Impl"
    // InternalNlToSql.g:1871:1: rule__UpdateStatement__Group__1__Impl : ( 'update' ) ;
    public final void rule__UpdateStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1875:1: ( ( 'update' ) )
            // InternalNlToSql.g:1876:1: ( 'update' )
            {
            // InternalNlToSql.g:1876:1: ( 'update' )
            // InternalNlToSql.g:1877:2: 'update'
            {
             before(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getUpdateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__1__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__2"
    // InternalNlToSql.g:1886:1: rule__UpdateStatement__Group__2 : rule__UpdateStatement__Group__2__Impl rule__UpdateStatement__Group__3 ;
    public final void rule__UpdateStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1890:1: ( rule__UpdateStatement__Group__2__Impl rule__UpdateStatement__Group__3 )
            // InternalNlToSql.g:1891:2: rule__UpdateStatement__Group__2__Impl rule__UpdateStatement__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__UpdateStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__2"


    // $ANTLR start "rule__UpdateStatement__Group__2__Impl"
    // InternalNlToSql.g:1898:1: rule__UpdateStatement__Group__2__Impl : ( ( rule__UpdateStatement__EntityAssignment_2 ) ) ;
    public final void rule__UpdateStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1902:1: ( ( ( rule__UpdateStatement__EntityAssignment_2 ) ) )
            // InternalNlToSql.g:1903:1: ( ( rule__UpdateStatement__EntityAssignment_2 ) )
            {
            // InternalNlToSql.g:1903:1: ( ( rule__UpdateStatement__EntityAssignment_2 ) )
            // InternalNlToSql.g:1904:2: ( rule__UpdateStatement__EntityAssignment_2 )
            {
             before(grammarAccess.getUpdateStatementAccess().getEntityAssignment_2()); 
            // InternalNlToSql.g:1905:2: ( rule__UpdateStatement__EntityAssignment_2 )
            // InternalNlToSql.g:1905:3: rule__UpdateStatement__EntityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__EntityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getEntityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__2__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__3"
    // InternalNlToSql.g:1913:1: rule__UpdateStatement__Group__3 : rule__UpdateStatement__Group__3__Impl rule__UpdateStatement__Group__4 ;
    public final void rule__UpdateStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1917:1: ( rule__UpdateStatement__Group__3__Impl rule__UpdateStatement__Group__4 )
            // InternalNlToSql.g:1918:2: rule__UpdateStatement__Group__3__Impl rule__UpdateStatement__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__UpdateStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__3"


    // $ANTLR start "rule__UpdateStatement__Group__3__Impl"
    // InternalNlToSql.g:1925:1: rule__UpdateStatement__Group__3__Impl : ( 'set' ) ;
    public final void rule__UpdateStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1929:1: ( ( 'set' ) )
            // InternalNlToSql.g:1930:1: ( 'set' )
            {
            // InternalNlToSql.g:1930:1: ( 'set' )
            // InternalNlToSql.g:1931:2: 'set'
            {
             before(grammarAccess.getUpdateStatementAccess().getSetKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getSetKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__3__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__4"
    // InternalNlToSql.g:1940:1: rule__UpdateStatement__Group__4 : rule__UpdateStatement__Group__4__Impl rule__UpdateStatement__Group__5 ;
    public final void rule__UpdateStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1944:1: ( rule__UpdateStatement__Group__4__Impl rule__UpdateStatement__Group__5 )
            // InternalNlToSql.g:1945:2: rule__UpdateStatement__Group__4__Impl rule__UpdateStatement__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__UpdateStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__4"


    // $ANTLR start "rule__UpdateStatement__Group__4__Impl"
    // InternalNlToSql.g:1952:1: rule__UpdateStatement__Group__4__Impl : ( ( rule__UpdateStatement__Group_4__0 ) ) ;
    public final void rule__UpdateStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1956:1: ( ( ( rule__UpdateStatement__Group_4__0 ) ) )
            // InternalNlToSql.g:1957:1: ( ( rule__UpdateStatement__Group_4__0 ) )
            {
            // InternalNlToSql.g:1957:1: ( ( rule__UpdateStatement__Group_4__0 ) )
            // InternalNlToSql.g:1958:2: ( rule__UpdateStatement__Group_4__0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_4()); 
            // InternalNlToSql.g:1959:2: ( rule__UpdateStatement__Group_4__0 )
            // InternalNlToSql.g:1959:3: rule__UpdateStatement__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__4__Impl"


    // $ANTLR start "rule__UpdateStatement__Group__5"
    // InternalNlToSql.g:1967:1: rule__UpdateStatement__Group__5 : rule__UpdateStatement__Group__5__Impl ;
    public final void rule__UpdateStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1971:1: ( rule__UpdateStatement__Group__5__Impl )
            // InternalNlToSql.g:1972:2: rule__UpdateStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__5"


    // $ANTLR start "rule__UpdateStatement__Group__5__Impl"
    // InternalNlToSql.g:1978:1: rule__UpdateStatement__Group__5__Impl : ( ( rule__UpdateStatement__Group_5__0 )? ) ;
    public final void rule__UpdateStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1982:1: ( ( ( rule__UpdateStatement__Group_5__0 )? ) )
            // InternalNlToSql.g:1983:1: ( ( rule__UpdateStatement__Group_5__0 )? )
            {
            // InternalNlToSql.g:1983:1: ( ( rule__UpdateStatement__Group_5__0 )? )
            // InternalNlToSql.g:1984:2: ( rule__UpdateStatement__Group_5__0 )?
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_5()); 
            // InternalNlToSql.g:1985:2: ( rule__UpdateStatement__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalNlToSql.g:1985:3: rule__UpdateStatement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateStatement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpdateStatementAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group__5__Impl"


    // $ANTLR start "rule__UpdateStatement__Group_0__0"
    // InternalNlToSql.g:1994:1: rule__UpdateStatement__Group_0__0 : rule__UpdateStatement__Group_0__0__Impl rule__UpdateStatement__Group_0__1 ;
    public final void rule__UpdateStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:1998:1: ( rule__UpdateStatement__Group_0__0__Impl rule__UpdateStatement__Group_0__1 )
            // InternalNlToSql.g:1999:2: rule__UpdateStatement__Group_0__0__Impl rule__UpdateStatement__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__UpdateStatement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_0__0"


    // $ANTLR start "rule__UpdateStatement__Group_0__0__Impl"
    // InternalNlToSql.g:2006:1: rule__UpdateStatement__Group_0__0__Impl : ( 'can' ) ;
    public final void rule__UpdateStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2010:1: ( ( 'can' ) )
            // InternalNlToSql.g:2011:1: ( 'can' )
            {
            // InternalNlToSql.g:2011:1: ( 'can' )
            // InternalNlToSql.g:2012:2: 'can'
            {
             before(grammarAccess.getUpdateStatementAccess().getCanKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getCanKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_0__0__Impl"


    // $ANTLR start "rule__UpdateStatement__Group_0__1"
    // InternalNlToSql.g:2021:1: rule__UpdateStatement__Group_0__1 : rule__UpdateStatement__Group_0__1__Impl rule__UpdateStatement__Group_0__2 ;
    public final void rule__UpdateStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2025:1: ( rule__UpdateStatement__Group_0__1__Impl rule__UpdateStatement__Group_0__2 )
            // InternalNlToSql.g:2026:2: rule__UpdateStatement__Group_0__1__Impl rule__UpdateStatement__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__UpdateStatement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_0__1"


    // $ANTLR start "rule__UpdateStatement__Group_0__1__Impl"
    // InternalNlToSql.g:2033:1: rule__UpdateStatement__Group_0__1__Impl : ( 'you' ) ;
    public final void rule__UpdateStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2037:1: ( ( 'you' ) )
            // InternalNlToSql.g:2038:1: ( 'you' )
            {
            // InternalNlToSql.g:2038:1: ( 'you' )
            // InternalNlToSql.g:2039:2: 'you'
            {
             before(grammarAccess.getUpdateStatementAccess().getYouKeyword_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getYouKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_0__1__Impl"


    // $ANTLR start "rule__UpdateStatement__Group_0__2"
    // InternalNlToSql.g:2048:1: rule__UpdateStatement__Group_0__2 : rule__UpdateStatement__Group_0__2__Impl ;
    public final void rule__UpdateStatement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2052:1: ( rule__UpdateStatement__Group_0__2__Impl )
            // InternalNlToSql.g:2053:2: rule__UpdateStatement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_0__2"


    // $ANTLR start "rule__UpdateStatement__Group_0__2__Impl"
    // InternalNlToSql.g:2059:1: rule__UpdateStatement__Group_0__2__Impl : ( 'please' ) ;
    public final void rule__UpdateStatement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2063:1: ( ( 'please' ) )
            // InternalNlToSql.g:2064:1: ( 'please' )
            {
            // InternalNlToSql.g:2064:1: ( 'please' )
            // InternalNlToSql.g:2065:2: 'please'
            {
             before(grammarAccess.getUpdateStatementAccess().getPleaseKeyword_0_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getPleaseKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_0__2__Impl"


    // $ANTLR start "rule__UpdateStatement__Group_4__0"
    // InternalNlToSql.g:2075:1: rule__UpdateStatement__Group_4__0 : rule__UpdateStatement__Group_4__0__Impl rule__UpdateStatement__Group_4__1 ;
    public final void rule__UpdateStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2079:1: ( rule__UpdateStatement__Group_4__0__Impl rule__UpdateStatement__Group_4__1 )
            // InternalNlToSql.g:2080:2: rule__UpdateStatement__Group_4__0__Impl rule__UpdateStatement__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__UpdateStatement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_4__0"


    // $ANTLR start "rule__UpdateStatement__Group_4__0__Impl"
    // InternalNlToSql.g:2087:1: rule__UpdateStatement__Group_4__0__Impl : ( ( rule__UpdateStatement__UpdateItemAssignment_4_0 ) ) ;
    public final void rule__UpdateStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2091:1: ( ( ( rule__UpdateStatement__UpdateItemAssignment_4_0 ) ) )
            // InternalNlToSql.g:2092:1: ( ( rule__UpdateStatement__UpdateItemAssignment_4_0 ) )
            {
            // InternalNlToSql.g:2092:1: ( ( rule__UpdateStatement__UpdateItemAssignment_4_0 ) )
            // InternalNlToSql.g:2093:2: ( rule__UpdateStatement__UpdateItemAssignment_4_0 )
            {
             before(grammarAccess.getUpdateStatementAccess().getUpdateItemAssignment_4_0()); 
            // InternalNlToSql.g:2094:2: ( rule__UpdateStatement__UpdateItemAssignment_4_0 )
            // InternalNlToSql.g:2094:3: rule__UpdateStatement__UpdateItemAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__UpdateItemAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getUpdateItemAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_4__0__Impl"


    // $ANTLR start "rule__UpdateStatement__Group_4__1"
    // InternalNlToSql.g:2102:1: rule__UpdateStatement__Group_4__1 : rule__UpdateStatement__Group_4__1__Impl ;
    public final void rule__UpdateStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2106:1: ( rule__UpdateStatement__Group_4__1__Impl )
            // InternalNlToSql.g:2107:2: rule__UpdateStatement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_4__1"


    // $ANTLR start "rule__UpdateStatement__Group_4__1__Impl"
    // InternalNlToSql.g:2113:1: rule__UpdateStatement__Group_4__1__Impl : ( ( rule__UpdateStatement__Group_4_1__0 )* ) ;
    public final void rule__UpdateStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2117:1: ( ( ( rule__UpdateStatement__Group_4_1__0 )* ) )
            // InternalNlToSql.g:2118:1: ( ( rule__UpdateStatement__Group_4_1__0 )* )
            {
            // InternalNlToSql.g:2118:1: ( ( rule__UpdateStatement__Group_4_1__0 )* )
            // InternalNlToSql.g:2119:2: ( rule__UpdateStatement__Group_4_1__0 )*
            {
             before(grammarAccess.getUpdateStatementAccess().getGroup_4_1()); 
            // InternalNlToSql.g:2120:2: ( rule__UpdateStatement__Group_4_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalNlToSql.g:2120:3: rule__UpdateStatement__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__UpdateStatement__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getUpdateStatementAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_4__1__Impl"


    // $ANTLR start "rule__UpdateStatement__Group_4_1__0"
    // InternalNlToSql.g:2129:1: rule__UpdateStatement__Group_4_1__0 : rule__UpdateStatement__Group_4_1__0__Impl rule__UpdateStatement__Group_4_1__1 ;
    public final void rule__UpdateStatement__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2133:1: ( rule__UpdateStatement__Group_4_1__0__Impl rule__UpdateStatement__Group_4_1__1 )
            // InternalNlToSql.g:2134:2: rule__UpdateStatement__Group_4_1__0__Impl rule__UpdateStatement__Group_4_1__1
            {
            pushFollow(FOLLOW_7);
            rule__UpdateStatement__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_4_1__0"


    // $ANTLR start "rule__UpdateStatement__Group_4_1__0__Impl"
    // InternalNlToSql.g:2141:1: rule__UpdateStatement__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__UpdateStatement__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2145:1: ( ( ',' ) )
            // InternalNlToSql.g:2146:1: ( ',' )
            {
            // InternalNlToSql.g:2146:1: ( ',' )
            // InternalNlToSql.g:2147:2: ','
            {
             before(grammarAccess.getUpdateStatementAccess().getCommaKeyword_4_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_4_1__0__Impl"


    // $ANTLR start "rule__UpdateStatement__Group_4_1__1"
    // InternalNlToSql.g:2156:1: rule__UpdateStatement__Group_4_1__1 : rule__UpdateStatement__Group_4_1__1__Impl ;
    public final void rule__UpdateStatement__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2160:1: ( rule__UpdateStatement__Group_4_1__1__Impl )
            // InternalNlToSql.g:2161:2: rule__UpdateStatement__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_4_1__1"


    // $ANTLR start "rule__UpdateStatement__Group_4_1__1__Impl"
    // InternalNlToSql.g:2167:1: rule__UpdateStatement__Group_4_1__1__Impl : ( ( rule__UpdateStatement__UpdateItemAssignment_4_1_1 ) ) ;
    public final void rule__UpdateStatement__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2171:1: ( ( ( rule__UpdateStatement__UpdateItemAssignment_4_1_1 ) ) )
            // InternalNlToSql.g:2172:1: ( ( rule__UpdateStatement__UpdateItemAssignment_4_1_1 ) )
            {
            // InternalNlToSql.g:2172:1: ( ( rule__UpdateStatement__UpdateItemAssignment_4_1_1 ) )
            // InternalNlToSql.g:2173:2: ( rule__UpdateStatement__UpdateItemAssignment_4_1_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getUpdateItemAssignment_4_1_1()); 
            // InternalNlToSql.g:2174:2: ( rule__UpdateStatement__UpdateItemAssignment_4_1_1 )
            // InternalNlToSql.g:2174:3: rule__UpdateStatement__UpdateItemAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__UpdateItemAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getUpdateItemAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_4_1__1__Impl"


    // $ANTLR start "rule__UpdateStatement__Group_5__0"
    // InternalNlToSql.g:2183:1: rule__UpdateStatement__Group_5__0 : rule__UpdateStatement__Group_5__0__Impl rule__UpdateStatement__Group_5__1 ;
    public final void rule__UpdateStatement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2187:1: ( rule__UpdateStatement__Group_5__0__Impl rule__UpdateStatement__Group_5__1 )
            // InternalNlToSql.g:2188:2: rule__UpdateStatement__Group_5__0__Impl rule__UpdateStatement__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__UpdateStatement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_5__0"


    // $ANTLR start "rule__UpdateStatement__Group_5__0__Impl"
    // InternalNlToSql.g:2195:1: rule__UpdateStatement__Group_5__0__Impl : ( 'where' ) ;
    public final void rule__UpdateStatement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2199:1: ( ( 'where' ) )
            // InternalNlToSql.g:2200:1: ( 'where' )
            {
            // InternalNlToSql.g:2200:1: ( 'where' )
            // InternalNlToSql.g:2201:2: 'where'
            {
             before(grammarAccess.getUpdateStatementAccess().getWhereKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUpdateStatementAccess().getWhereKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_5__0__Impl"


    // $ANTLR start "rule__UpdateStatement__Group_5__1"
    // InternalNlToSql.g:2210:1: rule__UpdateStatement__Group_5__1 : rule__UpdateStatement__Group_5__1__Impl ;
    public final void rule__UpdateStatement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2214:1: ( rule__UpdateStatement__Group_5__1__Impl )
            // InternalNlToSql.g:2215:2: rule__UpdateStatement__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_5__1"


    // $ANTLR start "rule__UpdateStatement__Group_5__1__Impl"
    // InternalNlToSql.g:2221:1: rule__UpdateStatement__Group_5__1__Impl : ( ( rule__UpdateStatement__ConditionAssignment_5_1 ) ) ;
    public final void rule__UpdateStatement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2225:1: ( ( ( rule__UpdateStatement__ConditionAssignment_5_1 ) ) )
            // InternalNlToSql.g:2226:1: ( ( rule__UpdateStatement__ConditionAssignment_5_1 ) )
            {
            // InternalNlToSql.g:2226:1: ( ( rule__UpdateStatement__ConditionAssignment_5_1 ) )
            // InternalNlToSql.g:2227:2: ( rule__UpdateStatement__ConditionAssignment_5_1 )
            {
             before(grammarAccess.getUpdateStatementAccess().getConditionAssignment_5_1()); 
            // InternalNlToSql.g:2228:2: ( rule__UpdateStatement__ConditionAssignment_5_1 )
            // InternalNlToSql.g:2228:3: rule__UpdateStatement__ConditionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__UpdateStatement__ConditionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateStatementAccess().getConditionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__Group_5__1__Impl"


    // $ANTLR start "rule__DeleteStatement__Group__0"
    // InternalNlToSql.g:2237:1: rule__DeleteStatement__Group__0 : rule__DeleteStatement__Group__0__Impl rule__DeleteStatement__Group__1 ;
    public final void rule__DeleteStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2241:1: ( rule__DeleteStatement__Group__0__Impl rule__DeleteStatement__Group__1 )
            // InternalNlToSql.g:2242:2: rule__DeleteStatement__Group__0__Impl rule__DeleteStatement__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__DeleteStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group__0"


    // $ANTLR start "rule__DeleteStatement__Group__0__Impl"
    // InternalNlToSql.g:2249:1: rule__DeleteStatement__Group__0__Impl : ( ( rule__DeleteStatement__Group_0__0 )? ) ;
    public final void rule__DeleteStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2253:1: ( ( ( rule__DeleteStatement__Group_0__0 )? ) )
            // InternalNlToSql.g:2254:1: ( ( rule__DeleteStatement__Group_0__0 )? )
            {
            // InternalNlToSql.g:2254:1: ( ( rule__DeleteStatement__Group_0__0 )? )
            // InternalNlToSql.g:2255:2: ( rule__DeleteStatement__Group_0__0 )?
            {
             before(grammarAccess.getDeleteStatementAccess().getGroup_0()); 
            // InternalNlToSql.g:2256:2: ( rule__DeleteStatement__Group_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalNlToSql.g:2256:3: rule__DeleteStatement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeleteStatement__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeleteStatementAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group__0__Impl"


    // $ANTLR start "rule__DeleteStatement__Group__1"
    // InternalNlToSql.g:2264:1: rule__DeleteStatement__Group__1 : rule__DeleteStatement__Group__1__Impl rule__DeleteStatement__Group__2 ;
    public final void rule__DeleteStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2268:1: ( rule__DeleteStatement__Group__1__Impl rule__DeleteStatement__Group__2 )
            // InternalNlToSql.g:2269:2: rule__DeleteStatement__Group__1__Impl rule__DeleteStatement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DeleteStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group__1"


    // $ANTLR start "rule__DeleteStatement__Group__1__Impl"
    // InternalNlToSql.g:2276:1: rule__DeleteStatement__Group__1__Impl : ( 'delete' ) ;
    public final void rule__DeleteStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2280:1: ( ( 'delete' ) )
            // InternalNlToSql.g:2281:1: ( 'delete' )
            {
            // InternalNlToSql.g:2281:1: ( 'delete' )
            // InternalNlToSql.g:2282:2: 'delete'
            {
             before(grammarAccess.getDeleteStatementAccess().getDeleteKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDeleteStatementAccess().getDeleteKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group__1__Impl"


    // $ANTLR start "rule__DeleteStatement__Group__2"
    // InternalNlToSql.g:2291:1: rule__DeleteStatement__Group__2 : rule__DeleteStatement__Group__2__Impl rule__DeleteStatement__Group__3 ;
    public final void rule__DeleteStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2295:1: ( rule__DeleteStatement__Group__2__Impl rule__DeleteStatement__Group__3 )
            // InternalNlToSql.g:2296:2: rule__DeleteStatement__Group__2__Impl rule__DeleteStatement__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__DeleteStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group__2"


    // $ANTLR start "rule__DeleteStatement__Group__2__Impl"
    // InternalNlToSql.g:2303:1: rule__DeleteStatement__Group__2__Impl : ( 'from' ) ;
    public final void rule__DeleteStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2307:1: ( ( 'from' ) )
            // InternalNlToSql.g:2308:1: ( 'from' )
            {
            // InternalNlToSql.g:2308:1: ( 'from' )
            // InternalNlToSql.g:2309:2: 'from'
            {
             before(grammarAccess.getDeleteStatementAccess().getFromKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDeleteStatementAccess().getFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group__2__Impl"


    // $ANTLR start "rule__DeleteStatement__Group__3"
    // InternalNlToSql.g:2318:1: rule__DeleteStatement__Group__3 : rule__DeleteStatement__Group__3__Impl rule__DeleteStatement__Group__4 ;
    public final void rule__DeleteStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2322:1: ( rule__DeleteStatement__Group__3__Impl rule__DeleteStatement__Group__4 )
            // InternalNlToSql.g:2323:2: rule__DeleteStatement__Group__3__Impl rule__DeleteStatement__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__DeleteStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group__3"


    // $ANTLR start "rule__DeleteStatement__Group__3__Impl"
    // InternalNlToSql.g:2330:1: rule__DeleteStatement__Group__3__Impl : ( ( rule__DeleteStatement__EntityAssignment_3 ) ) ;
    public final void rule__DeleteStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2334:1: ( ( ( rule__DeleteStatement__EntityAssignment_3 ) ) )
            // InternalNlToSql.g:2335:1: ( ( rule__DeleteStatement__EntityAssignment_3 ) )
            {
            // InternalNlToSql.g:2335:1: ( ( rule__DeleteStatement__EntityAssignment_3 ) )
            // InternalNlToSql.g:2336:2: ( rule__DeleteStatement__EntityAssignment_3 )
            {
             before(grammarAccess.getDeleteStatementAccess().getEntityAssignment_3()); 
            // InternalNlToSql.g:2337:2: ( rule__DeleteStatement__EntityAssignment_3 )
            // InternalNlToSql.g:2337:3: rule__DeleteStatement__EntityAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DeleteStatement__EntityAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDeleteStatementAccess().getEntityAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group__3__Impl"


    // $ANTLR start "rule__DeleteStatement__Group__4"
    // InternalNlToSql.g:2345:1: rule__DeleteStatement__Group__4 : rule__DeleteStatement__Group__4__Impl ;
    public final void rule__DeleteStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2349:1: ( rule__DeleteStatement__Group__4__Impl )
            // InternalNlToSql.g:2350:2: rule__DeleteStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group__4"


    // $ANTLR start "rule__DeleteStatement__Group__4__Impl"
    // InternalNlToSql.g:2356:1: rule__DeleteStatement__Group__4__Impl : ( ( rule__DeleteStatement__Group_4__0 )? ) ;
    public final void rule__DeleteStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2360:1: ( ( ( rule__DeleteStatement__Group_4__0 )? ) )
            // InternalNlToSql.g:2361:1: ( ( rule__DeleteStatement__Group_4__0 )? )
            {
            // InternalNlToSql.g:2361:1: ( ( rule__DeleteStatement__Group_4__0 )? )
            // InternalNlToSql.g:2362:2: ( rule__DeleteStatement__Group_4__0 )?
            {
             before(grammarAccess.getDeleteStatementAccess().getGroup_4()); 
            // InternalNlToSql.g:2363:2: ( rule__DeleteStatement__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalNlToSql.g:2363:3: rule__DeleteStatement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeleteStatement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeleteStatementAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group__4__Impl"


    // $ANTLR start "rule__DeleteStatement__Group_0__0"
    // InternalNlToSql.g:2372:1: rule__DeleteStatement__Group_0__0 : rule__DeleteStatement__Group_0__0__Impl rule__DeleteStatement__Group_0__1 ;
    public final void rule__DeleteStatement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2376:1: ( rule__DeleteStatement__Group_0__0__Impl rule__DeleteStatement__Group_0__1 )
            // InternalNlToSql.g:2377:2: rule__DeleteStatement__Group_0__0__Impl rule__DeleteStatement__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__DeleteStatement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteStatement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group_0__0"


    // $ANTLR start "rule__DeleteStatement__Group_0__0__Impl"
    // InternalNlToSql.g:2384:1: rule__DeleteStatement__Group_0__0__Impl : ( 'can' ) ;
    public final void rule__DeleteStatement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2388:1: ( ( 'can' ) )
            // InternalNlToSql.g:2389:1: ( 'can' )
            {
            // InternalNlToSql.g:2389:1: ( 'can' )
            // InternalNlToSql.g:2390:2: 'can'
            {
             before(grammarAccess.getDeleteStatementAccess().getCanKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeleteStatementAccess().getCanKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group_0__0__Impl"


    // $ANTLR start "rule__DeleteStatement__Group_0__1"
    // InternalNlToSql.g:2399:1: rule__DeleteStatement__Group_0__1 : rule__DeleteStatement__Group_0__1__Impl rule__DeleteStatement__Group_0__2 ;
    public final void rule__DeleteStatement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2403:1: ( rule__DeleteStatement__Group_0__1__Impl rule__DeleteStatement__Group_0__2 )
            // InternalNlToSql.g:2404:2: rule__DeleteStatement__Group_0__1__Impl rule__DeleteStatement__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__DeleteStatement__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteStatement__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group_0__1"


    // $ANTLR start "rule__DeleteStatement__Group_0__1__Impl"
    // InternalNlToSql.g:2411:1: rule__DeleteStatement__Group_0__1__Impl : ( 'you' ) ;
    public final void rule__DeleteStatement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2415:1: ( ( 'you' ) )
            // InternalNlToSql.g:2416:1: ( 'you' )
            {
            // InternalNlToSql.g:2416:1: ( 'you' )
            // InternalNlToSql.g:2417:2: 'you'
            {
             before(grammarAccess.getDeleteStatementAccess().getYouKeyword_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDeleteStatementAccess().getYouKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group_0__1__Impl"


    // $ANTLR start "rule__DeleteStatement__Group_0__2"
    // InternalNlToSql.g:2426:1: rule__DeleteStatement__Group_0__2 : rule__DeleteStatement__Group_0__2__Impl ;
    public final void rule__DeleteStatement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2430:1: ( rule__DeleteStatement__Group_0__2__Impl )
            // InternalNlToSql.g:2431:2: rule__DeleteStatement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteStatement__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group_0__2"


    // $ANTLR start "rule__DeleteStatement__Group_0__2__Impl"
    // InternalNlToSql.g:2437:1: rule__DeleteStatement__Group_0__2__Impl : ( 'please' ) ;
    public final void rule__DeleteStatement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2441:1: ( ( 'please' ) )
            // InternalNlToSql.g:2442:1: ( 'please' )
            {
            // InternalNlToSql.g:2442:1: ( 'please' )
            // InternalNlToSql.g:2443:2: 'please'
            {
             before(grammarAccess.getDeleteStatementAccess().getPleaseKeyword_0_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDeleteStatementAccess().getPleaseKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group_0__2__Impl"


    // $ANTLR start "rule__DeleteStatement__Group_4__0"
    // InternalNlToSql.g:2453:1: rule__DeleteStatement__Group_4__0 : rule__DeleteStatement__Group_4__0__Impl rule__DeleteStatement__Group_4__1 ;
    public final void rule__DeleteStatement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2457:1: ( rule__DeleteStatement__Group_4__0__Impl rule__DeleteStatement__Group_4__1 )
            // InternalNlToSql.g:2458:2: rule__DeleteStatement__Group_4__0__Impl rule__DeleteStatement__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__DeleteStatement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteStatement__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group_4__0"


    // $ANTLR start "rule__DeleteStatement__Group_4__0__Impl"
    // InternalNlToSql.g:2465:1: rule__DeleteStatement__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__DeleteStatement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2469:1: ( ( 'where' ) )
            // InternalNlToSql.g:2470:1: ( 'where' )
            {
            // InternalNlToSql.g:2470:1: ( 'where' )
            // InternalNlToSql.g:2471:2: 'where'
            {
             before(grammarAccess.getDeleteStatementAccess().getWhereKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDeleteStatementAccess().getWhereKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group_4__0__Impl"


    // $ANTLR start "rule__DeleteStatement__Group_4__1"
    // InternalNlToSql.g:2480:1: rule__DeleteStatement__Group_4__1 : rule__DeleteStatement__Group_4__1__Impl ;
    public final void rule__DeleteStatement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2484:1: ( rule__DeleteStatement__Group_4__1__Impl )
            // InternalNlToSql.g:2485:2: rule__DeleteStatement__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteStatement__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group_4__1"


    // $ANTLR start "rule__DeleteStatement__Group_4__1__Impl"
    // InternalNlToSql.g:2491:1: rule__DeleteStatement__Group_4__1__Impl : ( ( rule__DeleteStatement__ConditionAssignment_4_1 ) ) ;
    public final void rule__DeleteStatement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2495:1: ( ( ( rule__DeleteStatement__ConditionAssignment_4_1 ) ) )
            // InternalNlToSql.g:2496:1: ( ( rule__DeleteStatement__ConditionAssignment_4_1 ) )
            {
            // InternalNlToSql.g:2496:1: ( ( rule__DeleteStatement__ConditionAssignment_4_1 ) )
            // InternalNlToSql.g:2497:2: ( rule__DeleteStatement__ConditionAssignment_4_1 )
            {
             before(grammarAccess.getDeleteStatementAccess().getConditionAssignment_4_1()); 
            // InternalNlToSql.g:2498:2: ( rule__DeleteStatement__ConditionAssignment_4_1 )
            // InternalNlToSql.g:2498:3: rule__DeleteStatement__ConditionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DeleteStatement__ConditionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteStatementAccess().getConditionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__Group_4__1__Impl"


    // $ANTLR start "rule__SelectList__Group__0"
    // InternalNlToSql.g:2507:1: rule__SelectList__Group__0 : rule__SelectList__Group__0__Impl rule__SelectList__Group__1 ;
    public final void rule__SelectList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2511:1: ( rule__SelectList__Group__0__Impl rule__SelectList__Group__1 )
            // InternalNlToSql.g:2512:2: rule__SelectList__Group__0__Impl rule__SelectList__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SelectList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__Group__0"


    // $ANTLR start "rule__SelectList__Group__0__Impl"
    // InternalNlToSql.g:2519:1: rule__SelectList__Group__0__Impl : ( ( rule__SelectList__Alternatives_0 )? ) ;
    public final void rule__SelectList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2523:1: ( ( ( rule__SelectList__Alternatives_0 )? ) )
            // InternalNlToSql.g:2524:1: ( ( rule__SelectList__Alternatives_0 )? )
            {
            // InternalNlToSql.g:2524:1: ( ( rule__SelectList__Alternatives_0 )? )
            // InternalNlToSql.g:2525:2: ( rule__SelectList__Alternatives_0 )?
            {
             before(grammarAccess.getSelectListAccess().getAlternatives_0()); 
            // InternalNlToSql.g:2526:2: ( rule__SelectList__Alternatives_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==12) ) {
                alt25=1;
            }
            else if ( (LA25_0==13) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalNlToSql.g:2526:3: rule__SelectList__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectList__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectListAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__Group__0__Impl"


    // $ANTLR start "rule__SelectList__Group__1"
    // InternalNlToSql.g:2534:1: rule__SelectList__Group__1 : rule__SelectList__Group__1__Impl rule__SelectList__Group__2 ;
    public final void rule__SelectList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2538:1: ( rule__SelectList__Group__1__Impl rule__SelectList__Group__2 )
            // InternalNlToSql.g:2539:2: rule__SelectList__Group__1__Impl rule__SelectList__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SelectList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__Group__1"


    // $ANTLR start "rule__SelectList__Group__1__Impl"
    // InternalNlToSql.g:2546:1: rule__SelectList__Group__1__Impl : ( ( rule__SelectList__SelectItemAssignment_1 ) ) ;
    public final void rule__SelectList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2550:1: ( ( ( rule__SelectList__SelectItemAssignment_1 ) ) )
            // InternalNlToSql.g:2551:1: ( ( rule__SelectList__SelectItemAssignment_1 ) )
            {
            // InternalNlToSql.g:2551:1: ( ( rule__SelectList__SelectItemAssignment_1 ) )
            // InternalNlToSql.g:2552:2: ( rule__SelectList__SelectItemAssignment_1 )
            {
             before(grammarAccess.getSelectListAccess().getSelectItemAssignment_1()); 
            // InternalNlToSql.g:2553:2: ( rule__SelectList__SelectItemAssignment_1 )
            // InternalNlToSql.g:2553:3: rule__SelectList__SelectItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectList__SelectItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectListAccess().getSelectItemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__Group__1__Impl"


    // $ANTLR start "rule__SelectList__Group__2"
    // InternalNlToSql.g:2561:1: rule__SelectList__Group__2 : rule__SelectList__Group__2__Impl ;
    public final void rule__SelectList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2565:1: ( rule__SelectList__Group__2__Impl )
            // InternalNlToSql.g:2566:2: rule__SelectList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__Group__2"


    // $ANTLR start "rule__SelectList__Group__2__Impl"
    // InternalNlToSql.g:2572:1: rule__SelectList__Group__2__Impl : ( ( rule__SelectList__Group_2__0 )* ) ;
    public final void rule__SelectList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2576:1: ( ( ( rule__SelectList__Group_2__0 )* ) )
            // InternalNlToSql.g:2577:1: ( ( rule__SelectList__Group_2__0 )* )
            {
            // InternalNlToSql.g:2577:1: ( ( rule__SelectList__Group_2__0 )* )
            // InternalNlToSql.g:2578:2: ( rule__SelectList__Group_2__0 )*
            {
             before(grammarAccess.getSelectListAccess().getGroup_2()); 
            // InternalNlToSql.g:2579:2: ( rule__SelectList__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalNlToSql.g:2579:3: rule__SelectList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__SelectList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSelectListAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__Group__2__Impl"


    // $ANTLR start "rule__SelectList__Group_2__0"
    // InternalNlToSql.g:2588:1: rule__SelectList__Group_2__0 : rule__SelectList__Group_2__0__Impl rule__SelectList__Group_2__1 ;
    public final void rule__SelectList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2592:1: ( rule__SelectList__Group_2__0__Impl rule__SelectList__Group_2__1 )
            // InternalNlToSql.g:2593:2: rule__SelectList__Group_2__0__Impl rule__SelectList__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__SelectList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectList__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__Group_2__0"


    // $ANTLR start "rule__SelectList__Group_2__0__Impl"
    // InternalNlToSql.g:2600:1: rule__SelectList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SelectList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2604:1: ( ( ',' ) )
            // InternalNlToSql.g:2605:1: ( ',' )
            {
            // InternalNlToSql.g:2605:1: ( ',' )
            // InternalNlToSql.g:2606:2: ','
            {
             before(grammarAccess.getSelectListAccess().getCommaKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSelectListAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__Group_2__0__Impl"


    // $ANTLR start "rule__SelectList__Group_2__1"
    // InternalNlToSql.g:2615:1: rule__SelectList__Group_2__1 : rule__SelectList__Group_2__1__Impl ;
    public final void rule__SelectList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2619:1: ( rule__SelectList__Group_2__1__Impl )
            // InternalNlToSql.g:2620:2: rule__SelectList__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectList__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__Group_2__1"


    // $ANTLR start "rule__SelectList__Group_2__1__Impl"
    // InternalNlToSql.g:2626:1: rule__SelectList__Group_2__1__Impl : ( ( rule__SelectList__SelectItemAssignment_2_1 ) ) ;
    public final void rule__SelectList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2630:1: ( ( ( rule__SelectList__SelectItemAssignment_2_1 ) ) )
            // InternalNlToSql.g:2631:1: ( ( rule__SelectList__SelectItemAssignment_2_1 ) )
            {
            // InternalNlToSql.g:2631:1: ( ( rule__SelectList__SelectItemAssignment_2_1 ) )
            // InternalNlToSql.g:2632:2: ( rule__SelectList__SelectItemAssignment_2_1 )
            {
             before(grammarAccess.getSelectListAccess().getSelectItemAssignment_2_1()); 
            // InternalNlToSql.g:2633:2: ( rule__SelectList__SelectItemAssignment_2_1 )
            // InternalNlToSql.g:2633:3: rule__SelectList__SelectItemAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectList__SelectItemAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectListAccess().getSelectItemAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__Group_2__1__Impl"


    // $ANTLR start "rule__PropertyReference__Group__0"
    // InternalNlToSql.g:2642:1: rule__PropertyReference__Group__0 : rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 ;
    public final void rule__PropertyReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2646:1: ( rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1 )
            // InternalNlToSql.g:2647:2: rule__PropertyReference__Group__0__Impl rule__PropertyReference__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PropertyReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__0"


    // $ANTLR start "rule__PropertyReference__Group__0__Impl"
    // InternalNlToSql.g:2654:1: rule__PropertyReference__Group__0__Impl : ( ( rule__PropertyReference__Alternatives_0 )? ) ;
    public final void rule__PropertyReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2658:1: ( ( ( rule__PropertyReference__Alternatives_0 )? ) )
            // InternalNlToSql.g:2659:1: ( ( rule__PropertyReference__Alternatives_0 )? )
            {
            // InternalNlToSql.g:2659:1: ( ( rule__PropertyReference__Alternatives_0 )? )
            // InternalNlToSql.g:2660:2: ( rule__PropertyReference__Alternatives_0 )?
            {
             before(grammarAccess.getPropertyReferenceAccess().getAlternatives_0()); 
            // InternalNlToSql.g:2661:2: ( rule__PropertyReference__Alternatives_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=12 && LA27_0<=13)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalNlToSql.g:2661:3: rule__PropertyReference__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyReference__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyReferenceAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__0__Impl"


    // $ANTLR start "rule__PropertyReference__Group__1"
    // InternalNlToSql.g:2669:1: rule__PropertyReference__Group__1 : rule__PropertyReference__Group__1__Impl ;
    public final void rule__PropertyReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2673:1: ( rule__PropertyReference__Group__1__Impl )
            // InternalNlToSql.g:2674:2: rule__PropertyReference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__1"


    // $ANTLR start "rule__PropertyReference__Group__1__Impl"
    // InternalNlToSql.g:2680:1: rule__PropertyReference__Group__1__Impl : ( ( rule__PropertyReference__PropertyAssignment_1 ) ) ;
    public final void rule__PropertyReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2684:1: ( ( ( rule__PropertyReference__PropertyAssignment_1 ) ) )
            // InternalNlToSql.g:2685:1: ( ( rule__PropertyReference__PropertyAssignment_1 ) )
            {
            // InternalNlToSql.g:2685:1: ( ( rule__PropertyReference__PropertyAssignment_1 ) )
            // InternalNlToSql.g:2686:2: ( rule__PropertyReference__PropertyAssignment_1 )
            {
             before(grammarAccess.getPropertyReferenceAccess().getPropertyAssignment_1()); 
            // InternalNlToSql.g:2687:2: ( rule__PropertyReference__PropertyAssignment_1 )
            // InternalNlToSql.g:2687:3: rule__PropertyReference__PropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyReference__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyReferenceAccess().getPropertyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__Group__1__Impl"


    // $ANTLR start "rule__EntityName__Group__0"
    // InternalNlToSql.g:2696:1: rule__EntityName__Group__0 : rule__EntityName__Group__0__Impl rule__EntityName__Group__1 ;
    public final void rule__EntityName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2700:1: ( rule__EntityName__Group__0__Impl rule__EntityName__Group__1 )
            // InternalNlToSql.g:2701:2: rule__EntityName__Group__0__Impl rule__EntityName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__EntityName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EntityName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityName__Group__0"


    // $ANTLR start "rule__EntityName__Group__0__Impl"
    // InternalNlToSql.g:2708:1: rule__EntityName__Group__0__Impl : ( ( rule__EntityName__Alternatives_0 )? ) ;
    public final void rule__EntityName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2712:1: ( ( ( rule__EntityName__Alternatives_0 )? ) )
            // InternalNlToSql.g:2713:1: ( ( rule__EntityName__Alternatives_0 )? )
            {
            // InternalNlToSql.g:2713:1: ( ( rule__EntityName__Alternatives_0 )? )
            // InternalNlToSql.g:2714:2: ( rule__EntityName__Alternatives_0 )?
            {
             before(grammarAccess.getEntityNameAccess().getAlternatives_0()); 
            // InternalNlToSql.g:2715:2: ( rule__EntityName__Alternatives_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=12 && LA28_0<=13)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalNlToSql.g:2715:3: rule__EntityName__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EntityName__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityNameAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityName__Group__0__Impl"


    // $ANTLR start "rule__EntityName__Group__1"
    // InternalNlToSql.g:2723:1: rule__EntityName__Group__1 : rule__EntityName__Group__1__Impl ;
    public final void rule__EntityName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2727:1: ( rule__EntityName__Group__1__Impl )
            // InternalNlToSql.g:2728:2: rule__EntityName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EntityName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityName__Group__1"


    // $ANTLR start "rule__EntityName__Group__1__Impl"
    // InternalNlToSql.g:2734:1: rule__EntityName__Group__1__Impl : ( ( rule__EntityName__NameAssignment_1 ) ) ;
    public final void rule__EntityName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2738:1: ( ( ( rule__EntityName__NameAssignment_1 ) ) )
            // InternalNlToSql.g:2739:1: ( ( rule__EntityName__NameAssignment_1 ) )
            {
            // InternalNlToSql.g:2739:1: ( ( rule__EntityName__NameAssignment_1 ) )
            // InternalNlToSql.g:2740:2: ( rule__EntityName__NameAssignment_1 )
            {
             before(grammarAccess.getEntityNameAccess().getNameAssignment_1()); 
            // InternalNlToSql.g:2741:2: ( rule__EntityName__NameAssignment_1 )
            // InternalNlToSql.g:2741:3: rule__EntityName__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EntityName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityName__Group__1__Impl"


    // $ANTLR start "rule__PropertyName__Group__0"
    // InternalNlToSql.g:2750:1: rule__PropertyName__Group__0 : rule__PropertyName__Group__0__Impl rule__PropertyName__Group__1 ;
    public final void rule__PropertyName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2754:1: ( rule__PropertyName__Group__0__Impl rule__PropertyName__Group__1 )
            // InternalNlToSql.g:2755:2: rule__PropertyName__Group__0__Impl rule__PropertyName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PropertyName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyName__Group__0"


    // $ANTLR start "rule__PropertyName__Group__0__Impl"
    // InternalNlToSql.g:2762:1: rule__PropertyName__Group__0__Impl : ( ( rule__PropertyName__Alternatives_0 )? ) ;
    public final void rule__PropertyName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2766:1: ( ( ( rule__PropertyName__Alternatives_0 )? ) )
            // InternalNlToSql.g:2767:1: ( ( rule__PropertyName__Alternatives_0 )? )
            {
            // InternalNlToSql.g:2767:1: ( ( rule__PropertyName__Alternatives_0 )? )
            // InternalNlToSql.g:2768:2: ( rule__PropertyName__Alternatives_0 )?
            {
             before(grammarAccess.getPropertyNameAccess().getAlternatives_0()); 
            // InternalNlToSql.g:2769:2: ( rule__PropertyName__Alternatives_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=12 && LA29_0<=13)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalNlToSql.g:2769:3: rule__PropertyName__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyName__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyNameAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyName__Group__0__Impl"


    // $ANTLR start "rule__PropertyName__Group__1"
    // InternalNlToSql.g:2777:1: rule__PropertyName__Group__1 : rule__PropertyName__Group__1__Impl ;
    public final void rule__PropertyName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2781:1: ( rule__PropertyName__Group__1__Impl )
            // InternalNlToSql.g:2782:2: rule__PropertyName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyName__Group__1"


    // $ANTLR start "rule__PropertyName__Group__1__Impl"
    // InternalNlToSql.g:2788:1: rule__PropertyName__Group__1__Impl : ( ( rule__PropertyName__NameAssignment_1 ) ) ;
    public final void rule__PropertyName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2792:1: ( ( ( rule__PropertyName__NameAssignment_1 ) ) )
            // InternalNlToSql.g:2793:1: ( ( rule__PropertyName__NameAssignment_1 ) )
            {
            // InternalNlToSql.g:2793:1: ( ( rule__PropertyName__NameAssignment_1 ) )
            // InternalNlToSql.g:2794:2: ( rule__PropertyName__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyNameAccess().getNameAssignment_1()); 
            // InternalNlToSql.g:2795:2: ( rule__PropertyName__NameAssignment_1 )
            // InternalNlToSql.g:2795:3: rule__PropertyName__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyName__Group__1__Impl"


    // $ANTLR start "rule__UpdateItem__Group__0"
    // InternalNlToSql.g:2804:1: rule__UpdateItem__Group__0 : rule__UpdateItem__Group__0__Impl rule__UpdateItem__Group__1 ;
    public final void rule__UpdateItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2808:1: ( rule__UpdateItem__Group__0__Impl rule__UpdateItem__Group__1 )
            // InternalNlToSql.g:2809:2: rule__UpdateItem__Group__0__Impl rule__UpdateItem__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__UpdateItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateItem__Group__0"


    // $ANTLR start "rule__UpdateItem__Group__0__Impl"
    // InternalNlToSql.g:2816:1: rule__UpdateItem__Group__0__Impl : ( ( rule__UpdateItem__Alternatives_0 )? ) ;
    public final void rule__UpdateItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2820:1: ( ( ( rule__UpdateItem__Alternatives_0 )? ) )
            // InternalNlToSql.g:2821:1: ( ( rule__UpdateItem__Alternatives_0 )? )
            {
            // InternalNlToSql.g:2821:1: ( ( rule__UpdateItem__Alternatives_0 )? )
            // InternalNlToSql.g:2822:2: ( rule__UpdateItem__Alternatives_0 )?
            {
             before(grammarAccess.getUpdateItemAccess().getAlternatives_0()); 
            // InternalNlToSql.g:2823:2: ( rule__UpdateItem__Alternatives_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=12 && LA30_0<=13)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalNlToSql.g:2823:3: rule__UpdateItem__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UpdateItem__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUpdateItemAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateItem__Group__0__Impl"


    // $ANTLR start "rule__UpdateItem__Group__1"
    // InternalNlToSql.g:2831:1: rule__UpdateItem__Group__1 : rule__UpdateItem__Group__1__Impl rule__UpdateItem__Group__2 ;
    public final void rule__UpdateItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2835:1: ( rule__UpdateItem__Group__1__Impl rule__UpdateItem__Group__2 )
            // InternalNlToSql.g:2836:2: rule__UpdateItem__Group__1__Impl rule__UpdateItem__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__UpdateItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateItem__Group__1"


    // $ANTLR start "rule__UpdateItem__Group__1__Impl"
    // InternalNlToSql.g:2843:1: rule__UpdateItem__Group__1__Impl : ( ( rule__UpdateItem__PropertyAssignment_1 ) ) ;
    public final void rule__UpdateItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2847:1: ( ( ( rule__UpdateItem__PropertyAssignment_1 ) ) )
            // InternalNlToSql.g:2848:1: ( ( rule__UpdateItem__PropertyAssignment_1 ) )
            {
            // InternalNlToSql.g:2848:1: ( ( rule__UpdateItem__PropertyAssignment_1 ) )
            // InternalNlToSql.g:2849:2: ( rule__UpdateItem__PropertyAssignment_1 )
            {
             before(grammarAccess.getUpdateItemAccess().getPropertyAssignment_1()); 
            // InternalNlToSql.g:2850:2: ( rule__UpdateItem__PropertyAssignment_1 )
            // InternalNlToSql.g:2850:3: rule__UpdateItem__PropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UpdateItem__PropertyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUpdateItemAccess().getPropertyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateItem__Group__1__Impl"


    // $ANTLR start "rule__UpdateItem__Group__2"
    // InternalNlToSql.g:2858:1: rule__UpdateItem__Group__2 : rule__UpdateItem__Group__2__Impl rule__UpdateItem__Group__3 ;
    public final void rule__UpdateItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2862:1: ( rule__UpdateItem__Group__2__Impl rule__UpdateItem__Group__3 )
            // InternalNlToSql.g:2863:2: rule__UpdateItem__Group__2__Impl rule__UpdateItem__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__UpdateItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpdateItem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateItem__Group__2"


    // $ANTLR start "rule__UpdateItem__Group__2__Impl"
    // InternalNlToSql.g:2870:1: rule__UpdateItem__Group__2__Impl : ( '=' ) ;
    public final void rule__UpdateItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2874:1: ( ( '=' ) )
            // InternalNlToSql.g:2875:1: ( '=' )
            {
            // InternalNlToSql.g:2875:1: ( '=' )
            // InternalNlToSql.g:2876:2: '='
            {
             before(grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getUpdateItemAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateItem__Group__2__Impl"


    // $ANTLR start "rule__UpdateItem__Group__3"
    // InternalNlToSql.g:2885:1: rule__UpdateItem__Group__3 : rule__UpdateItem__Group__3__Impl ;
    public final void rule__UpdateItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2889:1: ( rule__UpdateItem__Group__3__Impl )
            // InternalNlToSql.g:2890:2: rule__UpdateItem__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpdateItem__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateItem__Group__3"


    // $ANTLR start "rule__UpdateItem__Group__3__Impl"
    // InternalNlToSql.g:2896:1: rule__UpdateItem__Group__3__Impl : ( ( rule__UpdateItem__ValueAssignment_3 ) ) ;
    public final void rule__UpdateItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2900:1: ( ( ( rule__UpdateItem__ValueAssignment_3 ) ) )
            // InternalNlToSql.g:2901:1: ( ( rule__UpdateItem__ValueAssignment_3 ) )
            {
            // InternalNlToSql.g:2901:1: ( ( rule__UpdateItem__ValueAssignment_3 ) )
            // InternalNlToSql.g:2902:2: ( rule__UpdateItem__ValueAssignment_3 )
            {
             before(grammarAccess.getUpdateItemAccess().getValueAssignment_3()); 
            // InternalNlToSql.g:2903:2: ( rule__UpdateItem__ValueAssignment_3 )
            // InternalNlToSql.g:2903:3: rule__UpdateItem__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UpdateItem__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUpdateItemAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateItem__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalNlToSql.g:2912:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2916:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalNlToSql.g:2917:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalNlToSql.g:2924:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__ExpressionAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2928:1: ( ( ( rule__Condition__ExpressionAssignment_0 ) ) )
            // InternalNlToSql.g:2929:1: ( ( rule__Condition__ExpressionAssignment_0 ) )
            {
            // InternalNlToSql.g:2929:1: ( ( rule__Condition__ExpressionAssignment_0 ) )
            // InternalNlToSql.g:2930:2: ( rule__Condition__ExpressionAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getExpressionAssignment_0()); 
            // InternalNlToSql.g:2931:2: ( rule__Condition__ExpressionAssignment_0 )
            // InternalNlToSql.g:2931:3: rule__Condition__ExpressionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalNlToSql.g:2939:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2943:1: ( rule__Condition__Group__1__Impl )
            // InternalNlToSql.g:2944:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalNlToSql.g:2950:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Group_1__0 )* ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2954:1: ( ( ( rule__Condition__Group_1__0 )* ) )
            // InternalNlToSql.g:2955:1: ( ( rule__Condition__Group_1__0 )* )
            {
            // InternalNlToSql.g:2955:1: ( ( rule__Condition__Group_1__0 )* )
            // InternalNlToSql.g:2956:2: ( rule__Condition__Group_1__0 )*
            {
             before(grammarAccess.getConditionAccess().getGroup_1()); 
            // InternalNlToSql.g:2957:2: ( rule__Condition__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=14 && LA31_0<=15)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalNlToSql.g:2957:3: rule__Condition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Condition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getConditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group_1__0"
    // InternalNlToSql.g:2966:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2970:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // InternalNlToSql.g:2971:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Condition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0"


    // $ANTLR start "rule__Condition__Group_1__0__Impl"
    // InternalNlToSql.g:2978:1: rule__Condition__Group_1__0__Impl : ( ( rule__Condition__LogicOperatorAssignment_1_0 ) ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2982:1: ( ( ( rule__Condition__LogicOperatorAssignment_1_0 ) ) )
            // InternalNlToSql.g:2983:1: ( ( rule__Condition__LogicOperatorAssignment_1_0 ) )
            {
            // InternalNlToSql.g:2983:1: ( ( rule__Condition__LogicOperatorAssignment_1_0 ) )
            // InternalNlToSql.g:2984:2: ( rule__Condition__LogicOperatorAssignment_1_0 )
            {
             before(grammarAccess.getConditionAccess().getLogicOperatorAssignment_1_0()); 
            // InternalNlToSql.g:2985:2: ( rule__Condition__LogicOperatorAssignment_1_0 )
            // InternalNlToSql.g:2985:3: rule__Condition__LogicOperatorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__LogicOperatorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getLogicOperatorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_1__1"
    // InternalNlToSql.g:2993:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:2997:1: ( rule__Condition__Group_1__1__Impl )
            // InternalNlToSql.g:2998:2: rule__Condition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1"


    // $ANTLR start "rule__Condition__Group_1__1__Impl"
    // InternalNlToSql.g:3004:1: rule__Condition__Group_1__1__Impl : ( ( rule__Condition__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3008:1: ( ( ( rule__Condition__ExpressionAssignment_1_1 ) ) )
            // InternalNlToSql.g:3009:1: ( ( rule__Condition__ExpressionAssignment_1_1 ) )
            {
            // InternalNlToSql.g:3009:1: ( ( rule__Condition__ExpressionAssignment_1_1 ) )
            // InternalNlToSql.g:3010:2: ( rule__Condition__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getConditionAccess().getExpressionAssignment_1_1()); 
            // InternalNlToSql.g:3011:2: ( rule__Condition__ExpressionAssignment_1_1 )
            // InternalNlToSql.g:3011:3: rule__Condition__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalNlToSql.g:3020:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3024:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalNlToSql.g:3025:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalNlToSql.g:3032:1: rule__Comparison__Group__0__Impl : ( ( rule__Comparison__Alternatives_0 )? ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3036:1: ( ( ( rule__Comparison__Alternatives_0 )? ) )
            // InternalNlToSql.g:3037:1: ( ( rule__Comparison__Alternatives_0 )? )
            {
            // InternalNlToSql.g:3037:1: ( ( rule__Comparison__Alternatives_0 )? )
            // InternalNlToSql.g:3038:2: ( rule__Comparison__Alternatives_0 )?
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_0()); 
            // InternalNlToSql.g:3039:2: ( rule__Comparison__Alternatives_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=12 && LA32_0<=13)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalNlToSql.g:3039:3: rule__Comparison__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComparisonAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalNlToSql.g:3047:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3051:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // InternalNlToSql.g:3052:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Comparison__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalNlToSql.g:3059:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__LeftHandSideAssignment_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3063:1: ( ( ( rule__Comparison__LeftHandSideAssignment_1 ) ) )
            // InternalNlToSql.g:3064:1: ( ( rule__Comparison__LeftHandSideAssignment_1 ) )
            {
            // InternalNlToSql.g:3064:1: ( ( rule__Comparison__LeftHandSideAssignment_1 ) )
            // InternalNlToSql.g:3065:2: ( rule__Comparison__LeftHandSideAssignment_1 )
            {
             before(grammarAccess.getComparisonAccess().getLeftHandSideAssignment_1()); 
            // InternalNlToSql.g:3066:2: ( rule__Comparison__LeftHandSideAssignment_1 )
            // InternalNlToSql.g:3066:3: rule__Comparison__LeftHandSideAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__LeftHandSideAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getLeftHandSideAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__2"
    // InternalNlToSql.g:3074:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl rule__Comparison__Group__3 ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3078:1: ( rule__Comparison__Group__2__Impl rule__Comparison__Group__3 )
            // InternalNlToSql.g:3079:2: rule__Comparison__Group__2__Impl rule__Comparison__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Comparison__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__2"


    // $ANTLR start "rule__Comparison__Group__2__Impl"
    // InternalNlToSql.g:3086:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__OperatorAssignment_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3090:1: ( ( ( rule__Comparison__OperatorAssignment_2 ) ) )
            // InternalNlToSql.g:3091:1: ( ( rule__Comparison__OperatorAssignment_2 ) )
            {
            // InternalNlToSql.g:3091:1: ( ( rule__Comparison__OperatorAssignment_2 ) )
            // InternalNlToSql.g:3092:2: ( rule__Comparison__OperatorAssignment_2 )
            {
             before(grammarAccess.getComparisonAccess().getOperatorAssignment_2()); 
            // InternalNlToSql.g:3093:2: ( rule__Comparison__OperatorAssignment_2 )
            // InternalNlToSql.g:3093:3: rule__Comparison__OperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__2__Impl"


    // $ANTLR start "rule__Comparison__Group__3"
    // InternalNlToSql.g:3101:1: rule__Comparison__Group__3 : rule__Comparison__Group__3__Impl ;
    public final void rule__Comparison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3105:1: ( rule__Comparison__Group__3__Impl )
            // InternalNlToSql.g:3106:2: rule__Comparison__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__3"


    // $ANTLR start "rule__Comparison__Group__3__Impl"
    // InternalNlToSql.g:3112:1: rule__Comparison__Group__3__Impl : ( ( rule__Comparison__RightHandSideAssignment_3 ) ) ;
    public final void rule__Comparison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3116:1: ( ( ( rule__Comparison__RightHandSideAssignment_3 ) ) )
            // InternalNlToSql.g:3117:1: ( ( rule__Comparison__RightHandSideAssignment_3 ) )
            {
            // InternalNlToSql.g:3117:1: ( ( rule__Comparison__RightHandSideAssignment_3 ) )
            // InternalNlToSql.g:3118:2: ( rule__Comparison__RightHandSideAssignment_3 )
            {
             before(grammarAccess.getComparisonAccess().getRightHandSideAssignment_3()); 
            // InternalNlToSql.g:3119:2: ( rule__Comparison__RightHandSideAssignment_3 )
            // InternalNlToSql.g:3119:3: rule__Comparison__RightHandSideAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightHandSideAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightHandSideAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__3__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_1__0"
    // InternalNlToSql.g:3128:1: rule__ComparisonOperator__Group_1__0 : rule__ComparisonOperator__Group_1__0__Impl rule__ComparisonOperator__Group_1__1 ;
    public final void rule__ComparisonOperator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3132:1: ( rule__ComparisonOperator__Group_1__0__Impl rule__ComparisonOperator__Group_1__1 )
            // InternalNlToSql.g:3133:2: rule__ComparisonOperator__Group_1__0__Impl rule__ComparisonOperator__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__ComparisonOperator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_1__0"


    // $ANTLR start "rule__ComparisonOperator__Group_1__0__Impl"
    // InternalNlToSql.g:3140:1: rule__ComparisonOperator__Group_1__0__Impl : ( 'is' ) ;
    public final void rule__ComparisonOperator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3144:1: ( ( 'is' ) )
            // InternalNlToSql.g:3145:1: ( 'is' )
            {
            // InternalNlToSql.g:3145:1: ( 'is' )
            // InternalNlToSql.g:3146:2: 'is'
            {
             before(grammarAccess.getComparisonOperatorAccess().getIsKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getIsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_1__1"
    // InternalNlToSql.g:3155:1: rule__ComparisonOperator__Group_1__1 : rule__ComparisonOperator__Group_1__1__Impl rule__ComparisonOperator__Group_1__2 ;
    public final void rule__ComparisonOperator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3159:1: ( rule__ComparisonOperator__Group_1__1__Impl rule__ComparisonOperator__Group_1__2 )
            // InternalNlToSql.g:3160:2: rule__ComparisonOperator__Group_1__1__Impl rule__ComparisonOperator__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__ComparisonOperator__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_1__1"


    // $ANTLR start "rule__ComparisonOperator__Group_1__1__Impl"
    // InternalNlToSql.g:3167:1: rule__ComparisonOperator__Group_1__1__Impl : ( 'equal' ) ;
    public final void rule__ComparisonOperator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3171:1: ( ( 'equal' ) )
            // InternalNlToSql.g:3172:1: ( 'equal' )
            {
            // InternalNlToSql.g:3172:1: ( 'equal' )
            // InternalNlToSql.g:3173:2: 'equal'
            {
             before(grammarAccess.getComparisonOperatorAccess().getEqualKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getEqualKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_1__2"
    // InternalNlToSql.g:3182:1: rule__ComparisonOperator__Group_1__2 : rule__ComparisonOperator__Group_1__2__Impl ;
    public final void rule__ComparisonOperator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3186:1: ( rule__ComparisonOperator__Group_1__2__Impl )
            // InternalNlToSql.g:3187:2: rule__ComparisonOperator__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_1__2"


    // $ANTLR start "rule__ComparisonOperator__Group_1__2__Impl"
    // InternalNlToSql.g:3193:1: rule__ComparisonOperator__Group_1__2__Impl : ( 'to' ) ;
    public final void rule__ComparisonOperator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3197:1: ( ( 'to' ) )
            // InternalNlToSql.g:3198:1: ( 'to' )
            {
            // InternalNlToSql.g:3198:1: ( 'to' )
            // InternalNlToSql.g:3199:2: 'to'
            {
             before(grammarAccess.getComparisonOperatorAccess().getToKeyword_1_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getToKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_2__0"
    // InternalNlToSql.g:3209:1: rule__ComparisonOperator__Group_2__0 : rule__ComparisonOperator__Group_2__0__Impl rule__ComparisonOperator__Group_2__1 ;
    public final void rule__ComparisonOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3213:1: ( rule__ComparisonOperator__Group_2__0__Impl rule__ComparisonOperator__Group_2__1 )
            // InternalNlToSql.g:3214:2: rule__ComparisonOperator__Group_2__0__Impl rule__ComparisonOperator__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__ComparisonOperator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__0"


    // $ANTLR start "rule__ComparisonOperator__Group_2__0__Impl"
    // InternalNlToSql.g:3221:1: rule__ComparisonOperator__Group_2__0__Impl : ( 'is' ) ;
    public final void rule__ComparisonOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3225:1: ( ( 'is' ) )
            // InternalNlToSql.g:3226:1: ( 'is' )
            {
            // InternalNlToSql.g:3226:1: ( 'is' )
            // InternalNlToSql.g:3227:2: 'is'
            {
             before(grammarAccess.getComparisonOperatorAccess().getIsKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getIsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_2__1"
    // InternalNlToSql.g:3236:1: rule__ComparisonOperator__Group_2__1 : rule__ComparisonOperator__Group_2__1__Impl rule__ComparisonOperator__Group_2__2 ;
    public final void rule__ComparisonOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3240:1: ( rule__ComparisonOperator__Group_2__1__Impl rule__ComparisonOperator__Group_2__2 )
            // InternalNlToSql.g:3241:2: rule__ComparisonOperator__Group_2__1__Impl rule__ComparisonOperator__Group_2__2
            {
            pushFollow(FOLLOW_29);
            rule__ComparisonOperator__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__1"


    // $ANTLR start "rule__ComparisonOperator__Group_2__1__Impl"
    // InternalNlToSql.g:3248:1: rule__ComparisonOperator__Group_2__1__Impl : ( 'not' ) ;
    public final void rule__ComparisonOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3252:1: ( ( 'not' ) )
            // InternalNlToSql.g:3253:1: ( 'not' )
            {
            // InternalNlToSql.g:3253:1: ( 'not' )
            // InternalNlToSql.g:3254:2: 'not'
            {
             before(grammarAccess.getComparisonOperatorAccess().getNotKeyword_2_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getNotKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__1__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_2__2"
    // InternalNlToSql.g:3263:1: rule__ComparisonOperator__Group_2__2 : rule__ComparisonOperator__Group_2__2__Impl rule__ComparisonOperator__Group_2__3 ;
    public final void rule__ComparisonOperator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3267:1: ( rule__ComparisonOperator__Group_2__2__Impl rule__ComparisonOperator__Group_2__3 )
            // InternalNlToSql.g:3268:2: rule__ComparisonOperator__Group_2__2__Impl rule__ComparisonOperator__Group_2__3
            {
            pushFollow(FOLLOW_30);
            rule__ComparisonOperator__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__2"


    // $ANTLR start "rule__ComparisonOperator__Group_2__2__Impl"
    // InternalNlToSql.g:3275:1: rule__ComparisonOperator__Group_2__2__Impl : ( 'equal' ) ;
    public final void rule__ComparisonOperator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3279:1: ( ( 'equal' ) )
            // InternalNlToSql.g:3280:1: ( 'equal' )
            {
            // InternalNlToSql.g:3280:1: ( 'equal' )
            // InternalNlToSql.g:3281:2: 'equal'
            {
             before(grammarAccess.getComparisonOperatorAccess().getEqualKeyword_2_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getEqualKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__2__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_2__3"
    // InternalNlToSql.g:3290:1: rule__ComparisonOperator__Group_2__3 : rule__ComparisonOperator__Group_2__3__Impl ;
    public final void rule__ComparisonOperator__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3294:1: ( rule__ComparisonOperator__Group_2__3__Impl )
            // InternalNlToSql.g:3295:2: rule__ComparisonOperator__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__3"


    // $ANTLR start "rule__ComparisonOperator__Group_2__3__Impl"
    // InternalNlToSql.g:3301:1: rule__ComparisonOperator__Group_2__3__Impl : ( 'to' ) ;
    public final void rule__ComparisonOperator__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3305:1: ( ( 'to' ) )
            // InternalNlToSql.g:3306:1: ( 'to' )
            {
            // InternalNlToSql.g:3306:1: ( 'to' )
            // InternalNlToSql.g:3307:2: 'to'
            {
             before(grammarAccess.getComparisonOperatorAccess().getToKeyword_2_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getToKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_2__3__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_3__0"
    // InternalNlToSql.g:3317:1: rule__ComparisonOperator__Group_3__0 : rule__ComparisonOperator__Group_3__0__Impl rule__ComparisonOperator__Group_3__1 ;
    public final void rule__ComparisonOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3321:1: ( rule__ComparisonOperator__Group_3__0__Impl rule__ComparisonOperator__Group_3__1 )
            // InternalNlToSql.g:3322:2: rule__ComparisonOperator__Group_3__0__Impl rule__ComparisonOperator__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__ComparisonOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_3__0"


    // $ANTLR start "rule__ComparisonOperator__Group_3__0__Impl"
    // InternalNlToSql.g:3329:1: rule__ComparisonOperator__Group_3__0__Impl : ( 'less' ) ;
    public final void rule__ComparisonOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3333:1: ( ( 'less' ) )
            // InternalNlToSql.g:3334:1: ( 'less' )
            {
            // InternalNlToSql.g:3334:1: ( 'less' )
            // InternalNlToSql.g:3335:2: 'less'
            {
             before(grammarAccess.getComparisonOperatorAccess().getLessKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getLessKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_3__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_3__1"
    // InternalNlToSql.g:3344:1: rule__ComparisonOperator__Group_3__1 : rule__ComparisonOperator__Group_3__1__Impl ;
    public final void rule__ComparisonOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3348:1: ( rule__ComparisonOperator__Group_3__1__Impl )
            // InternalNlToSql.g:3349:2: rule__ComparisonOperator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_3__1"


    // $ANTLR start "rule__ComparisonOperator__Group_3__1__Impl"
    // InternalNlToSql.g:3355:1: rule__ComparisonOperator__Group_3__1__Impl : ( 'than' ) ;
    public final void rule__ComparisonOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3359:1: ( ( 'than' ) )
            // InternalNlToSql.g:3360:1: ( 'than' )
            {
            // InternalNlToSql.g:3360:1: ( 'than' )
            // InternalNlToSql.g:3361:2: 'than'
            {
             before(grammarAccess.getComparisonOperatorAccess().getThanKeyword_3_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getThanKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_3__1__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_4__0"
    // InternalNlToSql.g:3371:1: rule__ComparisonOperator__Group_4__0 : rule__ComparisonOperator__Group_4__0__Impl rule__ComparisonOperator__Group_4__1 ;
    public final void rule__ComparisonOperator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3375:1: ( rule__ComparisonOperator__Group_4__0__Impl rule__ComparisonOperator__Group_4__1 )
            // InternalNlToSql.g:3376:2: rule__ComparisonOperator__Group_4__0__Impl rule__ComparisonOperator__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__ComparisonOperator__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_4__0"


    // $ANTLR start "rule__ComparisonOperator__Group_4__0__Impl"
    // InternalNlToSql.g:3383:1: rule__ComparisonOperator__Group_4__0__Impl : ( 'greater' ) ;
    public final void rule__ComparisonOperator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3387:1: ( ( 'greater' ) )
            // InternalNlToSql.g:3388:1: ( 'greater' )
            {
            // InternalNlToSql.g:3388:1: ( 'greater' )
            // InternalNlToSql.g:3389:2: 'greater'
            {
             before(grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_4__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_4__1"
    // InternalNlToSql.g:3398:1: rule__ComparisonOperator__Group_4__1 : rule__ComparisonOperator__Group_4__1__Impl ;
    public final void rule__ComparisonOperator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3402:1: ( rule__ComparisonOperator__Group_4__1__Impl )
            // InternalNlToSql.g:3403:2: rule__ComparisonOperator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_4__1"


    // $ANTLR start "rule__ComparisonOperator__Group_4__1__Impl"
    // InternalNlToSql.g:3409:1: rule__ComparisonOperator__Group_4__1__Impl : ( 'than' ) ;
    public final void rule__ComparisonOperator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3413:1: ( ( 'than' ) )
            // InternalNlToSql.g:3414:1: ( 'than' )
            {
            // InternalNlToSql.g:3414:1: ( 'than' )
            // InternalNlToSql.g:3415:2: 'than'
            {
             before(grammarAccess.getComparisonOperatorAccess().getThanKeyword_4_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getThanKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_4__1__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_5__0"
    // InternalNlToSql.g:3425:1: rule__ComparisonOperator__Group_5__0 : rule__ComparisonOperator__Group_5__0__Impl rule__ComparisonOperator__Group_5__1 ;
    public final void rule__ComparisonOperator__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3429:1: ( rule__ComparisonOperator__Group_5__0__Impl rule__ComparisonOperator__Group_5__1 )
            // InternalNlToSql.g:3430:2: rule__ComparisonOperator__Group_5__0__Impl rule__ComparisonOperator__Group_5__1
            {
            pushFollow(FOLLOW_32);
            rule__ComparisonOperator__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__0"


    // $ANTLR start "rule__ComparisonOperator__Group_5__0__Impl"
    // InternalNlToSql.g:3437:1: rule__ComparisonOperator__Group_5__0__Impl : ( 'less' ) ;
    public final void rule__ComparisonOperator__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3441:1: ( ( 'less' ) )
            // InternalNlToSql.g:3442:1: ( 'less' )
            {
            // InternalNlToSql.g:3442:1: ( 'less' )
            // InternalNlToSql.g:3443:2: 'less'
            {
             before(grammarAccess.getComparisonOperatorAccess().getLessKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getLessKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_5__1"
    // InternalNlToSql.g:3452:1: rule__ComparisonOperator__Group_5__1 : rule__ComparisonOperator__Group_5__1__Impl rule__ComparisonOperator__Group_5__2 ;
    public final void rule__ComparisonOperator__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3456:1: ( rule__ComparisonOperator__Group_5__1__Impl rule__ComparisonOperator__Group_5__2 )
            // InternalNlToSql.g:3457:2: rule__ComparisonOperator__Group_5__1__Impl rule__ComparisonOperator__Group_5__2
            {
            pushFollow(FOLLOW_33);
            rule__ComparisonOperator__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__1"


    // $ANTLR start "rule__ComparisonOperator__Group_5__1__Impl"
    // InternalNlToSql.g:3464:1: rule__ComparisonOperator__Group_5__1__Impl : ( 'than' ) ;
    public final void rule__ComparisonOperator__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3468:1: ( ( 'than' ) )
            // InternalNlToSql.g:3469:1: ( 'than' )
            {
            // InternalNlToSql.g:3469:1: ( 'than' )
            // InternalNlToSql.g:3470:2: 'than'
            {
             before(grammarAccess.getComparisonOperatorAccess().getThanKeyword_5_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getThanKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__1__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_5__2"
    // InternalNlToSql.g:3479:1: rule__ComparisonOperator__Group_5__2 : rule__ComparisonOperator__Group_5__2__Impl rule__ComparisonOperator__Group_5__3 ;
    public final void rule__ComparisonOperator__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3483:1: ( rule__ComparisonOperator__Group_5__2__Impl rule__ComparisonOperator__Group_5__3 )
            // InternalNlToSql.g:3484:2: rule__ComparisonOperator__Group_5__2__Impl rule__ComparisonOperator__Group_5__3
            {
            pushFollow(FOLLOW_29);
            rule__ComparisonOperator__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__2"


    // $ANTLR start "rule__ComparisonOperator__Group_5__2__Impl"
    // InternalNlToSql.g:3491:1: rule__ComparisonOperator__Group_5__2__Impl : ( 'or' ) ;
    public final void rule__ComparisonOperator__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3495:1: ( ( 'or' ) )
            // InternalNlToSql.g:3496:1: ( 'or' )
            {
            // InternalNlToSql.g:3496:1: ( 'or' )
            // InternalNlToSql.g:3497:2: 'or'
            {
             before(grammarAccess.getComparisonOperatorAccess().getOrKeyword_5_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getOrKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__2__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_5__3"
    // InternalNlToSql.g:3506:1: rule__ComparisonOperator__Group_5__3 : rule__ComparisonOperator__Group_5__3__Impl rule__ComparisonOperator__Group_5__4 ;
    public final void rule__ComparisonOperator__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3510:1: ( rule__ComparisonOperator__Group_5__3__Impl rule__ComparisonOperator__Group_5__4 )
            // InternalNlToSql.g:3511:2: rule__ComparisonOperator__Group_5__3__Impl rule__ComparisonOperator__Group_5__4
            {
            pushFollow(FOLLOW_30);
            rule__ComparisonOperator__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__3"


    // $ANTLR start "rule__ComparisonOperator__Group_5__3__Impl"
    // InternalNlToSql.g:3518:1: rule__ComparisonOperator__Group_5__3__Impl : ( 'equal' ) ;
    public final void rule__ComparisonOperator__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3522:1: ( ( 'equal' ) )
            // InternalNlToSql.g:3523:1: ( 'equal' )
            {
            // InternalNlToSql.g:3523:1: ( 'equal' )
            // InternalNlToSql.g:3524:2: 'equal'
            {
             before(grammarAccess.getComparisonOperatorAccess().getEqualKeyword_5_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getEqualKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__3__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_5__4"
    // InternalNlToSql.g:3533:1: rule__ComparisonOperator__Group_5__4 : rule__ComparisonOperator__Group_5__4__Impl ;
    public final void rule__ComparisonOperator__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3537:1: ( rule__ComparisonOperator__Group_5__4__Impl )
            // InternalNlToSql.g:3538:2: rule__ComparisonOperator__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__4"


    // $ANTLR start "rule__ComparisonOperator__Group_5__4__Impl"
    // InternalNlToSql.g:3544:1: rule__ComparisonOperator__Group_5__4__Impl : ( 'to' ) ;
    public final void rule__ComparisonOperator__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3548:1: ( ( 'to' ) )
            // InternalNlToSql.g:3549:1: ( 'to' )
            {
            // InternalNlToSql.g:3549:1: ( 'to' )
            // InternalNlToSql.g:3550:2: 'to'
            {
             before(grammarAccess.getComparisonOperatorAccess().getToKeyword_5_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getToKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_5__4__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_6__0"
    // InternalNlToSql.g:3560:1: rule__ComparisonOperator__Group_6__0 : rule__ComparisonOperator__Group_6__0__Impl rule__ComparisonOperator__Group_6__1 ;
    public final void rule__ComparisonOperator__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3564:1: ( rule__ComparisonOperator__Group_6__0__Impl rule__ComparisonOperator__Group_6__1 )
            // InternalNlToSql.g:3565:2: rule__ComparisonOperator__Group_6__0__Impl rule__ComparisonOperator__Group_6__1
            {
            pushFollow(FOLLOW_32);
            rule__ComparisonOperator__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_6__0"


    // $ANTLR start "rule__ComparisonOperator__Group_6__0__Impl"
    // InternalNlToSql.g:3572:1: rule__ComparisonOperator__Group_6__0__Impl : ( 'greater' ) ;
    public final void rule__ComparisonOperator__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3576:1: ( ( 'greater' ) )
            // InternalNlToSql.g:3577:1: ( 'greater' )
            {
            // InternalNlToSql.g:3577:1: ( 'greater' )
            // InternalNlToSql.g:3578:2: 'greater'
            {
             before(grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getGreaterKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_6__0__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_6__1"
    // InternalNlToSql.g:3587:1: rule__ComparisonOperator__Group_6__1 : rule__ComparisonOperator__Group_6__1__Impl rule__ComparisonOperator__Group_6__2 ;
    public final void rule__ComparisonOperator__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3591:1: ( rule__ComparisonOperator__Group_6__1__Impl rule__ComparisonOperator__Group_6__2 )
            // InternalNlToSql.g:3592:2: rule__ComparisonOperator__Group_6__1__Impl rule__ComparisonOperator__Group_6__2
            {
            pushFollow(FOLLOW_33);
            rule__ComparisonOperator__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_6__1"


    // $ANTLR start "rule__ComparisonOperator__Group_6__1__Impl"
    // InternalNlToSql.g:3599:1: rule__ComparisonOperator__Group_6__1__Impl : ( 'than' ) ;
    public final void rule__ComparisonOperator__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3603:1: ( ( 'than' ) )
            // InternalNlToSql.g:3604:1: ( 'than' )
            {
            // InternalNlToSql.g:3604:1: ( 'than' )
            // InternalNlToSql.g:3605:2: 'than'
            {
             before(grammarAccess.getComparisonOperatorAccess().getThanKeyword_6_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getThanKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_6__1__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_6__2"
    // InternalNlToSql.g:3614:1: rule__ComparisonOperator__Group_6__2 : rule__ComparisonOperator__Group_6__2__Impl rule__ComparisonOperator__Group_6__3 ;
    public final void rule__ComparisonOperator__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3618:1: ( rule__ComparisonOperator__Group_6__2__Impl rule__ComparisonOperator__Group_6__3 )
            // InternalNlToSql.g:3619:2: rule__ComparisonOperator__Group_6__2__Impl rule__ComparisonOperator__Group_6__3
            {
            pushFollow(FOLLOW_29);
            rule__ComparisonOperator__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_6__2"


    // $ANTLR start "rule__ComparisonOperator__Group_6__2__Impl"
    // InternalNlToSql.g:3626:1: rule__ComparisonOperator__Group_6__2__Impl : ( 'or' ) ;
    public final void rule__ComparisonOperator__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3630:1: ( ( 'or' ) )
            // InternalNlToSql.g:3631:1: ( 'or' )
            {
            // InternalNlToSql.g:3631:1: ( 'or' )
            // InternalNlToSql.g:3632:2: 'or'
            {
             before(grammarAccess.getComparisonOperatorAccess().getOrKeyword_6_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getOrKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_6__2__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_6__3"
    // InternalNlToSql.g:3641:1: rule__ComparisonOperator__Group_6__3 : rule__ComparisonOperator__Group_6__3__Impl rule__ComparisonOperator__Group_6__4 ;
    public final void rule__ComparisonOperator__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3645:1: ( rule__ComparisonOperator__Group_6__3__Impl rule__ComparisonOperator__Group_6__4 )
            // InternalNlToSql.g:3646:2: rule__ComparisonOperator__Group_6__3__Impl rule__ComparisonOperator__Group_6__4
            {
            pushFollow(FOLLOW_30);
            rule__ComparisonOperator__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_6__3"


    // $ANTLR start "rule__ComparisonOperator__Group_6__3__Impl"
    // InternalNlToSql.g:3653:1: rule__ComparisonOperator__Group_6__3__Impl : ( 'equal' ) ;
    public final void rule__ComparisonOperator__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3657:1: ( ( 'equal' ) )
            // InternalNlToSql.g:3658:1: ( 'equal' )
            {
            // InternalNlToSql.g:3658:1: ( 'equal' )
            // InternalNlToSql.g:3659:2: 'equal'
            {
             before(grammarAccess.getComparisonOperatorAccess().getEqualKeyword_6_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getEqualKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_6__3__Impl"


    // $ANTLR start "rule__ComparisonOperator__Group_6__4"
    // InternalNlToSql.g:3668:1: rule__ComparisonOperator__Group_6__4 : rule__ComparisonOperator__Group_6__4__Impl ;
    public final void rule__ComparisonOperator__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3672:1: ( rule__ComparisonOperator__Group_6__4__Impl )
            // InternalNlToSql.g:3673:2: rule__ComparisonOperator__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_6__4"


    // $ANTLR start "rule__ComparisonOperator__Group_6__4__Impl"
    // InternalNlToSql.g:3679:1: rule__ComparisonOperator__Group_6__4__Impl : ( 'to' ) ;
    public final void rule__ComparisonOperator__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3683:1: ( ( 'to' ) )
            // InternalNlToSql.g:3684:1: ( 'to' )
            {
            // InternalNlToSql.g:3684:1: ( 'to' )
            // InternalNlToSql.g:3685:2: 'to'
            {
             before(grammarAccess.getComparisonOperatorAccess().getToKeyword_6_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getToKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Group_6__4__Impl"


    // $ANTLR start "rule__AccountingSpeech__StatementsAssignment"
    // InternalNlToSql.g:3695:1: rule__AccountingSpeech__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__AccountingSpeech__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3699:1: ( ( ruleStatement ) )
            // InternalNlToSql.g:3700:2: ( ruleStatement )
            {
            // InternalNlToSql.g:3700:2: ( ruleStatement )
            // InternalNlToSql.g:3701:3: ruleStatement
            {
             before(grammarAccess.getAccountingSpeechAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getAccountingSpeechAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AccountingSpeech__StatementsAssignment"


    // $ANTLR start "rule__SelectStatement__EntityAssignment_3"
    // InternalNlToSql.g:3710:1: rule__SelectStatement__EntityAssignment_3 : ( ruleEntityName ) ;
    public final void rule__SelectStatement__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3714:1: ( ( ruleEntityName ) )
            // InternalNlToSql.g:3715:2: ( ruleEntityName )
            {
            // InternalNlToSql.g:3715:2: ( ruleEntityName )
            // InternalNlToSql.g:3716:3: ruleEntityName
            {
             before(grammarAccess.getSelectStatementAccess().getEntityEntityNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getEntityEntityNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__EntityAssignment_3"


    // $ANTLR start "rule__SelectStatement__ConditionAssignment_4_1"
    // InternalNlToSql.g:3725:1: rule__SelectStatement__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__SelectStatement__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3729:1: ( ( ruleCondition ) )
            // InternalNlToSql.g:3730:2: ( ruleCondition )
            {
            // InternalNlToSql.g:3730:2: ( ruleCondition )
            // InternalNlToSql.g:3731:3: ruleCondition
            {
             before(grammarAccess.getSelectStatementAccess().getConditionConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getConditionConditionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__ConditionAssignment_4_1"


    // $ANTLR start "rule__SelectStatement__GroupByListAssignment_5_2"
    // InternalNlToSql.g:3740:1: rule__SelectStatement__GroupByListAssignment_5_2 : ( rulePropertyReference ) ;
    public final void rule__SelectStatement__GroupByListAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3744:1: ( ( rulePropertyReference ) )
            // InternalNlToSql.g:3745:2: ( rulePropertyReference )
            {
            // InternalNlToSql.g:3745:2: ( rulePropertyReference )
            // InternalNlToSql.g:3746:3: rulePropertyReference
            {
             before(grammarAccess.getSelectStatementAccess().getGroupByListPropertyReferenceParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getGroupByListPropertyReferenceParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__GroupByListAssignment_5_2"


    // $ANTLR start "rule__SelectStatement__GroupByListAssignment_5_3_1"
    // InternalNlToSql.g:3755:1: rule__SelectStatement__GroupByListAssignment_5_3_1 : ( rulePropertyReference ) ;
    public final void rule__SelectStatement__GroupByListAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3759:1: ( ( rulePropertyReference ) )
            // InternalNlToSql.g:3760:2: ( rulePropertyReference )
            {
            // InternalNlToSql.g:3760:2: ( rulePropertyReference )
            // InternalNlToSql.g:3761:3: rulePropertyReference
            {
             before(grammarAccess.getSelectStatementAccess().getGroupByListPropertyReferenceParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getSelectStatementAccess().getGroupByListPropertyReferenceParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectStatement__GroupByListAssignment_5_3_1"


    // $ANTLR start "rule__InsertStatement__EntityAssignment_3"
    // InternalNlToSql.g:3770:1: rule__InsertStatement__EntityAssignment_3 : ( ruleEntityName ) ;
    public final void rule__InsertStatement__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3774:1: ( ( ruleEntityName ) )
            // InternalNlToSql.g:3775:2: ( ruleEntityName )
            {
            // InternalNlToSql.g:3775:2: ( ruleEntityName )
            // InternalNlToSql.g:3776:3: ruleEntityName
            {
             before(grammarAccess.getInsertStatementAccess().getEntityEntityNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getInsertStatementAccess().getEntityEntityNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__EntityAssignment_3"


    // $ANTLR start "rule__InsertStatement__PropertyListAssignment_5"
    // InternalNlToSql.g:3785:1: rule__InsertStatement__PropertyListAssignment_5 : ( rulePropertyName ) ;
    public final void rule__InsertStatement__PropertyListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3789:1: ( ( rulePropertyName ) )
            // InternalNlToSql.g:3790:2: ( rulePropertyName )
            {
            // InternalNlToSql.g:3790:2: ( rulePropertyName )
            // InternalNlToSql.g:3791:3: rulePropertyName
            {
             before(grammarAccess.getInsertStatementAccess().getPropertyListPropertyNameParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyName();

            state._fsp--;

             after(grammarAccess.getInsertStatementAccess().getPropertyListPropertyNameParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__PropertyListAssignment_5"


    // $ANTLR start "rule__InsertStatement__PropertyListAssignment_6_1"
    // InternalNlToSql.g:3800:1: rule__InsertStatement__PropertyListAssignment_6_1 : ( rulePropertyName ) ;
    public final void rule__InsertStatement__PropertyListAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3804:1: ( ( rulePropertyName ) )
            // InternalNlToSql.g:3805:2: ( rulePropertyName )
            {
            // InternalNlToSql.g:3805:2: ( rulePropertyName )
            // InternalNlToSql.g:3806:3: rulePropertyName
            {
             before(grammarAccess.getInsertStatementAccess().getPropertyListPropertyNameParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyName();

            state._fsp--;

             after(grammarAccess.getInsertStatementAccess().getPropertyListPropertyNameParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__PropertyListAssignment_6_1"


    // $ANTLR start "rule__InsertStatement__ValueListAssignment_10"
    // InternalNlToSql.g:3815:1: rule__InsertStatement__ValueListAssignment_10 : ( ruleValue ) ;
    public final void rule__InsertStatement__ValueListAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3819:1: ( ( ruleValue ) )
            // InternalNlToSql.g:3820:2: ( ruleValue )
            {
            // InternalNlToSql.g:3820:2: ( ruleValue )
            // InternalNlToSql.g:3821:3: ruleValue
            {
             before(grammarAccess.getInsertStatementAccess().getValueListValueParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getInsertStatementAccess().getValueListValueParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__ValueListAssignment_10"


    // $ANTLR start "rule__InsertStatement__ValueListAssignment_11_1"
    // InternalNlToSql.g:3830:1: rule__InsertStatement__ValueListAssignment_11_1 : ( ruleValue ) ;
    public final void rule__InsertStatement__ValueListAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3834:1: ( ( ruleValue ) )
            // InternalNlToSql.g:3835:2: ( ruleValue )
            {
            // InternalNlToSql.g:3835:2: ( ruleValue )
            // InternalNlToSql.g:3836:3: ruleValue
            {
             before(grammarAccess.getInsertStatementAccess().getValueListValueParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getInsertStatementAccess().getValueListValueParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InsertStatement__ValueListAssignment_11_1"


    // $ANTLR start "rule__UpdateStatement__EntityAssignment_2"
    // InternalNlToSql.g:3845:1: rule__UpdateStatement__EntityAssignment_2 : ( ruleEntityName ) ;
    public final void rule__UpdateStatement__EntityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3849:1: ( ( ruleEntityName ) )
            // InternalNlToSql.g:3850:2: ( ruleEntityName )
            {
            // InternalNlToSql.g:3850:2: ( ruleEntityName )
            // InternalNlToSql.g:3851:3: ruleEntityName
            {
             before(grammarAccess.getUpdateStatementAccess().getEntityEntityNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getUpdateStatementAccess().getEntityEntityNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__EntityAssignment_2"


    // $ANTLR start "rule__UpdateStatement__UpdateItemAssignment_4_0"
    // InternalNlToSql.g:3860:1: rule__UpdateStatement__UpdateItemAssignment_4_0 : ( ruleUpdateItem ) ;
    public final void rule__UpdateStatement__UpdateItemAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3864:1: ( ( ruleUpdateItem ) )
            // InternalNlToSql.g:3865:2: ( ruleUpdateItem )
            {
            // InternalNlToSql.g:3865:2: ( ruleUpdateItem )
            // InternalNlToSql.g:3866:3: ruleUpdateItem
            {
             before(grammarAccess.getUpdateStatementAccess().getUpdateItemUpdateItemParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdateItem();

            state._fsp--;

             after(grammarAccess.getUpdateStatementAccess().getUpdateItemUpdateItemParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__UpdateItemAssignment_4_0"


    // $ANTLR start "rule__UpdateStatement__UpdateItemAssignment_4_1_1"
    // InternalNlToSql.g:3875:1: rule__UpdateStatement__UpdateItemAssignment_4_1_1 : ( ruleUpdateItem ) ;
    public final void rule__UpdateStatement__UpdateItemAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3879:1: ( ( ruleUpdateItem ) )
            // InternalNlToSql.g:3880:2: ( ruleUpdateItem )
            {
            // InternalNlToSql.g:3880:2: ( ruleUpdateItem )
            // InternalNlToSql.g:3881:3: ruleUpdateItem
            {
             before(grammarAccess.getUpdateStatementAccess().getUpdateItemUpdateItemParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUpdateItem();

            state._fsp--;

             after(grammarAccess.getUpdateStatementAccess().getUpdateItemUpdateItemParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__UpdateItemAssignment_4_1_1"


    // $ANTLR start "rule__UpdateStatement__ConditionAssignment_5_1"
    // InternalNlToSql.g:3890:1: rule__UpdateStatement__ConditionAssignment_5_1 : ( ruleCondition ) ;
    public final void rule__UpdateStatement__ConditionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3894:1: ( ( ruleCondition ) )
            // InternalNlToSql.g:3895:2: ( ruleCondition )
            {
            // InternalNlToSql.g:3895:2: ( ruleCondition )
            // InternalNlToSql.g:3896:3: ruleCondition
            {
             before(grammarAccess.getUpdateStatementAccess().getConditionConditionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getUpdateStatementAccess().getConditionConditionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateStatement__ConditionAssignment_5_1"


    // $ANTLR start "rule__DeleteStatement__EntityAssignment_3"
    // InternalNlToSql.g:3905:1: rule__DeleteStatement__EntityAssignment_3 : ( ruleEntityName ) ;
    public final void rule__DeleteStatement__EntityAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3909:1: ( ( ruleEntityName ) )
            // InternalNlToSql.g:3910:2: ( ruleEntityName )
            {
            // InternalNlToSql.g:3910:2: ( ruleEntityName )
            // InternalNlToSql.g:3911:3: ruleEntityName
            {
             before(grammarAccess.getDeleteStatementAccess().getEntityEntityNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityName();

            state._fsp--;

             after(grammarAccess.getDeleteStatementAccess().getEntityEntityNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__EntityAssignment_3"


    // $ANTLR start "rule__DeleteStatement__ConditionAssignment_4_1"
    // InternalNlToSql.g:3920:1: rule__DeleteStatement__ConditionAssignment_4_1 : ( ruleCondition ) ;
    public final void rule__DeleteStatement__ConditionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3924:1: ( ( ruleCondition ) )
            // InternalNlToSql.g:3925:2: ( ruleCondition )
            {
            // InternalNlToSql.g:3925:2: ( ruleCondition )
            // InternalNlToSql.g:3926:3: ruleCondition
            {
             before(grammarAccess.getDeleteStatementAccess().getConditionConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getDeleteStatementAccess().getConditionConditionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeleteStatement__ConditionAssignment_4_1"


    // $ANTLR start "rule__SelectList__SelectItemAssignment_1"
    // InternalNlToSql.g:3935:1: rule__SelectList__SelectItemAssignment_1 : ( rulePropertyReference ) ;
    public final void rule__SelectList__SelectItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3939:1: ( ( rulePropertyReference ) )
            // InternalNlToSql.g:3940:2: ( rulePropertyReference )
            {
            // InternalNlToSql.g:3940:2: ( rulePropertyReference )
            // InternalNlToSql.g:3941:3: rulePropertyReference
            {
             before(grammarAccess.getSelectListAccess().getSelectItemPropertyReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getSelectListAccess().getSelectItemPropertyReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__SelectItemAssignment_1"


    // $ANTLR start "rule__SelectList__SelectItemAssignment_2_1"
    // InternalNlToSql.g:3950:1: rule__SelectList__SelectItemAssignment_2_1 : ( rulePropertyReference ) ;
    public final void rule__SelectList__SelectItemAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3954:1: ( ( rulePropertyReference ) )
            // InternalNlToSql.g:3955:2: ( rulePropertyReference )
            {
            // InternalNlToSql.g:3955:2: ( rulePropertyReference )
            // InternalNlToSql.g:3956:3: rulePropertyReference
            {
             before(grammarAccess.getSelectListAccess().getSelectItemPropertyReferenceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyReference();

            state._fsp--;

             after(grammarAccess.getSelectListAccess().getSelectItemPropertyReferenceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectList__SelectItemAssignment_2_1"


    // $ANTLR start "rule__PropertyReference__PropertyAssignment_1"
    // InternalNlToSql.g:3965:1: rule__PropertyReference__PropertyAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PropertyReference__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3969:1: ( ( ( RULE_ID ) ) )
            // InternalNlToSql.g:3970:2: ( ( RULE_ID ) )
            {
            // InternalNlToSql.g:3970:2: ( ( RULE_ID ) )
            // InternalNlToSql.g:3971:3: ( RULE_ID )
            {
             before(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyCrossReference_1_0()); 
            // InternalNlToSql.g:3972:3: ( RULE_ID )
            // InternalNlToSql.g:3973:4: RULE_ID
            {
             before(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPropertyReferenceAccess().getPropertyPropertyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyReference__PropertyAssignment_1"


    // $ANTLR start "rule__EntityName__NameAssignment_1"
    // InternalNlToSql.g:3984:1: rule__EntityName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__EntityName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:3988:1: ( ( RULE_ID ) )
            // InternalNlToSql.g:3989:2: ( RULE_ID )
            {
            // InternalNlToSql.g:3989:2: ( RULE_ID )
            // InternalNlToSql.g:3990:3: RULE_ID
            {
             before(grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityNameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityName__NameAssignment_1"


    // $ANTLR start "rule__PropertyName__NameAssignment_1"
    // InternalNlToSql.g:3999:1: rule__PropertyName__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PropertyName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:4003:1: ( ( RULE_ID ) )
            // InternalNlToSql.g:4004:2: ( RULE_ID )
            {
            // InternalNlToSql.g:4004:2: ( RULE_ID )
            // InternalNlToSql.g:4005:3: RULE_ID
            {
             before(grammarAccess.getPropertyNameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyNameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyName__NameAssignment_1"


    // $ANTLR start "rule__UpdateItem__PropertyAssignment_1"
    // InternalNlToSql.g:4014:1: rule__UpdateItem__PropertyAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__UpdateItem__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:4018:1: ( ( ( RULE_ID ) ) )
            // InternalNlToSql.g:4019:2: ( ( RULE_ID ) )
            {
            // InternalNlToSql.g:4019:2: ( ( RULE_ID ) )
            // InternalNlToSql.g:4020:3: ( RULE_ID )
            {
             before(grammarAccess.getUpdateItemAccess().getPropertyPropertyCrossReference_1_0()); 
            // InternalNlToSql.g:4021:3: ( RULE_ID )
            // InternalNlToSql.g:4022:4: RULE_ID
            {
             before(grammarAccess.getUpdateItemAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUpdateItemAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getUpdateItemAccess().getPropertyPropertyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateItem__PropertyAssignment_1"


    // $ANTLR start "rule__UpdateItem__ValueAssignment_3"
    // InternalNlToSql.g:4033:1: rule__UpdateItem__ValueAssignment_3 : ( ruleValue ) ;
    public final void rule__UpdateItem__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:4037:1: ( ( ruleValue ) )
            // InternalNlToSql.g:4038:2: ( ruleValue )
            {
            // InternalNlToSql.g:4038:2: ( ruleValue )
            // InternalNlToSql.g:4039:3: ruleValue
            {
             before(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getUpdateItemAccess().getValueValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpdateItem__ValueAssignment_3"


    // $ANTLR start "rule__Condition__ExpressionAssignment_0"
    // InternalNlToSql.g:4048:1: rule__Condition__ExpressionAssignment_0 : ( ruleComparison ) ;
    public final void rule__Condition__ExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:4052:1: ( ( ruleComparison ) )
            // InternalNlToSql.g:4053:2: ( ruleComparison )
            {
            // InternalNlToSql.g:4053:2: ( ruleComparison )
            // InternalNlToSql.g:4054:3: ruleComparison
            {
             before(grammarAccess.getConditionAccess().getExpressionComparisonParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getExpressionComparisonParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ExpressionAssignment_0"


    // $ANTLR start "rule__Condition__LogicOperatorAssignment_1_0"
    // InternalNlToSql.g:4063:1: rule__Condition__LogicOperatorAssignment_1_0 : ( ruleLogicOperator ) ;
    public final void rule__Condition__LogicOperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:4067:1: ( ( ruleLogicOperator ) )
            // InternalNlToSql.g:4068:2: ( ruleLogicOperator )
            {
            // InternalNlToSql.g:4068:2: ( ruleLogicOperator )
            // InternalNlToSql.g:4069:3: ruleLogicOperator
            {
             before(grammarAccess.getConditionAccess().getLogicOperatorLogicOperatorParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicOperator();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getLogicOperatorLogicOperatorParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__LogicOperatorAssignment_1_0"


    // $ANTLR start "rule__Condition__ExpressionAssignment_1_1"
    // InternalNlToSql.g:4078:1: rule__Condition__ExpressionAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__Condition__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:4082:1: ( ( ruleComparison ) )
            // InternalNlToSql.g:4083:2: ( ruleComparison )
            {
            // InternalNlToSql.g:4083:2: ( ruleComparison )
            // InternalNlToSql.g:4084:3: ruleComparison
            {
             before(grammarAccess.getConditionAccess().getExpressionComparisonParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getExpressionComparisonParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ExpressionAssignment_1_1"


    // $ANTLR start "rule__Comparison__LeftHandSideAssignment_1"
    // InternalNlToSql.g:4093:1: rule__Comparison__LeftHandSideAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Comparison__LeftHandSideAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:4097:1: ( ( ( RULE_ID ) ) )
            // InternalNlToSql.g:4098:2: ( ( RULE_ID ) )
            {
            // InternalNlToSql.g:4098:2: ( ( RULE_ID ) )
            // InternalNlToSql.g:4099:3: ( RULE_ID )
            {
             before(grammarAccess.getComparisonAccess().getLeftHandSidePropertyCrossReference_1_0()); 
            // InternalNlToSql.g:4100:3: ( RULE_ID )
            // InternalNlToSql.g:4101:4: RULE_ID
            {
             before(grammarAccess.getComparisonAccess().getLeftHandSidePropertyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLeftHandSidePropertyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComparisonAccess().getLeftHandSidePropertyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__LeftHandSideAssignment_1"


    // $ANTLR start "rule__Comparison__OperatorAssignment_2"
    // InternalNlToSql.g:4112:1: rule__Comparison__OperatorAssignment_2 : ( ruleComparisonOperator ) ;
    public final void rule__Comparison__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:4116:1: ( ( ruleComparisonOperator ) )
            // InternalNlToSql.g:4117:2: ( ruleComparisonOperator )
            {
            // InternalNlToSql.g:4117:2: ( ruleComparisonOperator )
            // InternalNlToSql.g:4118:3: ruleComparisonOperator
            {
             before(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getOperatorComparisonOperatorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OperatorAssignment_2"


    // $ANTLR start "rule__Comparison__RightHandSideAssignment_3"
    // InternalNlToSql.g:4127:1: rule__Comparison__RightHandSideAssignment_3 : ( ruleValue ) ;
    public final void rule__Comparison__RightHandSideAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNlToSql.g:4131:1: ( ( ruleValue ) )
            // InternalNlToSql.g:4132:2: ( ruleValue )
            {
            // InternalNlToSql.g:4132:2: ( ruleValue )
            // InternalNlToSql.g:4133:3: ruleValue
            {
             before(grammarAccess.getComparisonAccess().getRightHandSideValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightHandSideValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightHandSideAssignment_3"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\7\uffff\1\11\1\13\4\uffff";
    static final String dfa_3s = "\1\20\1\uffff\1\44\2\50\2\uffff\2\4\4\uffff";
    static final String dfa_4s = "\1\51\1\uffff\1\46\2\50\2\uffff\2\17\4\uffff";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\2\1\3\2\uffff\1\4\1\6\1\5\1\7";
    static final String dfa_6s = "\15\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\22\uffff\1\2\3\uffff\1\3\1\uffff\1\4",
            "",
            "\1\5\1\uffff\1\6",
            "\1\7",
            "\1\10",
            "",
            "",
            "\2\11\11\uffff\1\12",
            "\2\13\11\uffff\1\14",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "674:1: rule__ComparisonOperator__Alternatives : ( ( '=' ) | ( ( rule__ComparisonOperator__Group_1__0 ) ) | ( ( rule__ComparisonOperator__Group_2__0 ) ) | ( ( rule__ComparisonOperator__Group_3__0 ) ) | ( ( rule__ComparisonOperator__Group_4__0 ) ) | ( ( rule__ComparisonOperator__Group_5__0 ) ) | ( ( rule__ComparisonOperator__Group_6__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000005080C0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003840L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000003040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000005080C0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000028800010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008000L});

}