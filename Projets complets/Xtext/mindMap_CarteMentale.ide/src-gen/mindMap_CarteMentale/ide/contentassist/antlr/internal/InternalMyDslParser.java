package mindMap_CarteMentale.ide.contentassist.antlr.internal;

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
import mindMap_CarteMentale.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MindMap'", "'['", "']'", "'CentralTopic'", "'MainTopic'", "'SubTopic'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMindMap"
    // InternalMyDsl.g:53:1: entryRuleMindMap : ruleMindMap EOF ;
    public final void entryRuleMindMap() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleMindMap EOF )
            // InternalMyDsl.g:55:1: ruleMindMap EOF
            {
             before(grammarAccess.getMindMapRule()); 
            pushFollow(FOLLOW_1);
            ruleMindMap();

            state._fsp--;

             after(grammarAccess.getMindMapRule()); 
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
    // $ANTLR end "entryRuleMindMap"


    // $ANTLR start "ruleMindMap"
    // InternalMyDsl.g:62:1: ruleMindMap : ( ( rule__MindMap__Group__0 )? ) ;
    public final void ruleMindMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__MindMap__Group__0 )? ) )
            // InternalMyDsl.g:67:2: ( ( rule__MindMap__Group__0 )? )
            {
            // InternalMyDsl.g:67:2: ( ( rule__MindMap__Group__0 )? )
            // InternalMyDsl.g:68:3: ( rule__MindMap__Group__0 )?
            {
             before(grammarAccess.getMindMapAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__MindMap__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:69:4: rule__MindMap__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MindMap__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMindMapAccess().getGroup()); 

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
    // $ANTLR end "ruleMindMap"


    // $ANTLR start "entryRuleCentralTopic"
    // InternalMyDsl.g:78:1: entryRuleCentralTopic : ruleCentralTopic EOF ;
    public final void entryRuleCentralTopic() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleCentralTopic EOF )
            // InternalMyDsl.g:80:1: ruleCentralTopic EOF
            {
             before(grammarAccess.getCentralTopicRule()); 
            pushFollow(FOLLOW_1);
            ruleCentralTopic();

            state._fsp--;

             after(grammarAccess.getCentralTopicRule()); 
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
    // $ANTLR end "entryRuleCentralTopic"


    // $ANTLR start "ruleCentralTopic"
    // InternalMyDsl.g:87:1: ruleCentralTopic : ( ( rule__CentralTopic__Group__0 ) ) ;
    public final void ruleCentralTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__CentralTopic__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__CentralTopic__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__CentralTopic__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__CentralTopic__Group__0 )
            {
             before(grammarAccess.getCentralTopicAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__CentralTopic__Group__0 )
            // InternalMyDsl.g:94:4: rule__CentralTopic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CentralTopic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCentralTopicAccess().getGroup()); 

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
    // $ANTLR end "ruleCentralTopic"


    // $ANTLR start "entryRuleMainTopic"
    // InternalMyDsl.g:103:1: entryRuleMainTopic : ruleMainTopic EOF ;
    public final void entryRuleMainTopic() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleMainTopic EOF )
            // InternalMyDsl.g:105:1: ruleMainTopic EOF
            {
             before(grammarAccess.getMainTopicRule()); 
            pushFollow(FOLLOW_1);
            ruleMainTopic();

            state._fsp--;

             after(grammarAccess.getMainTopicRule()); 
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
    // $ANTLR end "entryRuleMainTopic"


    // $ANTLR start "ruleMainTopic"
    // InternalMyDsl.g:112:1: ruleMainTopic : ( ( rule__MainTopic__Group__0 ) ) ;
    public final void ruleMainTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__MainTopic__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__MainTopic__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__MainTopic__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__MainTopic__Group__0 )
            {
             before(grammarAccess.getMainTopicAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__MainTopic__Group__0 )
            // InternalMyDsl.g:119:4: rule__MainTopic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainTopic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainTopicAccess().getGroup()); 

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
    // $ANTLR end "ruleMainTopic"


    // $ANTLR start "entryRuleSubTopic"
    // InternalMyDsl.g:128:1: entryRuleSubTopic : ruleSubTopic EOF ;
    public final void entryRuleSubTopic() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleSubTopic EOF )
            // InternalMyDsl.g:130:1: ruleSubTopic EOF
            {
             before(grammarAccess.getSubTopicRule()); 
            pushFollow(FOLLOW_1);
            ruleSubTopic();

            state._fsp--;

             after(grammarAccess.getSubTopicRule()); 
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
    // $ANTLR end "entryRuleSubTopic"


    // $ANTLR start "ruleSubTopic"
    // InternalMyDsl.g:137:1: ruleSubTopic : ( ( rule__SubTopic__Group__0 ) ) ;
    public final void ruleSubTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__SubTopic__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__SubTopic__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__SubTopic__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__SubTopic__Group__0 )
            {
             before(grammarAccess.getSubTopicAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__SubTopic__Group__0 )
            // InternalMyDsl.g:144:4: rule__SubTopic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubTopic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubTopicAccess().getGroup()); 

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
    // $ANTLR end "ruleSubTopic"


    // $ANTLR start "entryRuleMarker"
    // InternalMyDsl.g:153:1: entryRuleMarker : ruleMarker EOF ;
    public final void entryRuleMarker() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleMarker EOF )
            // InternalMyDsl.g:155:1: ruleMarker EOF
            {
             before(grammarAccess.getMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getMarkerRule()); 
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
    // $ANTLR end "entryRuleMarker"


    // $ANTLR start "ruleMarker"
    // InternalMyDsl.g:162:1: ruleMarker : ( ( rule__Marker__SymbolAssignment ) ) ;
    public final void ruleMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Marker__SymbolAssignment ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Marker__SymbolAssignment ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Marker__SymbolAssignment ) )
            // InternalMyDsl.g:168:3: ( rule__Marker__SymbolAssignment )
            {
             before(grammarAccess.getMarkerAccess().getSymbolAssignment()); 
            // InternalMyDsl.g:169:3: ( rule__Marker__SymbolAssignment )
            // InternalMyDsl.g:169:4: rule__Marker__SymbolAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Marker__SymbolAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMarkerAccess().getSymbolAssignment()); 

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
    // $ANTLR end "ruleMarker"


    // $ANTLR start "entryRuleENTIER"
    // InternalMyDsl.g:178:1: entryRuleENTIER : ruleENTIER EOF ;
    public final void entryRuleENTIER() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleENTIER EOF )
            // InternalMyDsl.g:180:1: ruleENTIER EOF
            {
             before(grammarAccess.getENTIERRule()); 
            pushFollow(FOLLOW_1);
            ruleENTIER();

            state._fsp--;

             after(grammarAccess.getENTIERRule()); 
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
    // $ANTLR end "entryRuleENTIER"


    // $ANTLR start "ruleENTIER"
    // InternalMyDsl.g:187:1: ruleENTIER : ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) ;
    public final void ruleENTIER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) )
            // InternalMyDsl.g:192:2: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            {
            // InternalMyDsl.g:192:2: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
            // InternalMyDsl.g:193:3: ( ( RULE_INT ) ) ( ( RULE_INT )* )
            {
            // InternalMyDsl.g:193:3: ( ( RULE_INT ) )
            // InternalMyDsl.g:194:4: ( RULE_INT )
            {
             before(grammarAccess.getENTIERAccess().getINTTerminalRuleCall()); 
            // InternalMyDsl.g:195:4: ( RULE_INT )
            // InternalMyDsl.g:195:5: RULE_INT
            {
            match(input,RULE_INT,FOLLOW_3); 

            }

             after(grammarAccess.getENTIERAccess().getINTTerminalRuleCall()); 

            }

            // InternalMyDsl.g:198:3: ( ( RULE_INT )* )
            // InternalMyDsl.g:199:4: ( RULE_INT )*
            {
             before(grammarAccess.getENTIERAccess().getINTTerminalRuleCall()); 
            // InternalMyDsl.g:200:4: ( RULE_INT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_INT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:200:5: RULE_INT
            	    {
            	    match(input,RULE_INT,FOLLOW_3); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getENTIERAccess().getINTTerminalRuleCall()); 

            }


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
    // $ANTLR end "ruleENTIER"


    // $ANTLR start "entryRuleCHAINE"
    // InternalMyDsl.g:210:1: entryRuleCHAINE : ruleCHAINE EOF ;
    public final void entryRuleCHAINE() throws RecognitionException {
        try {
            // InternalMyDsl.g:211:1: ( ruleCHAINE EOF )
            // InternalMyDsl.g:212:1: ruleCHAINE EOF
            {
             before(grammarAccess.getCHAINERule()); 
            pushFollow(FOLLOW_1);
            ruleCHAINE();

            state._fsp--;

             after(grammarAccess.getCHAINERule()); 
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
    // $ANTLR end "entryRuleCHAINE"


    // $ANTLR start "ruleCHAINE"
    // InternalMyDsl.g:219:1: ruleCHAINE : ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) ;
    public final void ruleCHAINE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:2: ( ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) ) )
            // InternalMyDsl.g:224:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            {
            // InternalMyDsl.g:224:2: ( ( ( RULE_ID ) ) ( ( RULE_ID )* ) )
            // InternalMyDsl.g:225:3: ( ( RULE_ID ) ) ( ( RULE_ID )* )
            {
            // InternalMyDsl.g:225:3: ( ( RULE_ID ) )
            // InternalMyDsl.g:226:4: ( RULE_ID )
            {
             before(grammarAccess.getCHAINEAccess().getIDTerminalRuleCall()); 
            // InternalMyDsl.g:227:4: ( RULE_ID )
            // InternalMyDsl.g:227:5: RULE_ID
            {
            match(input,RULE_ID,FOLLOW_4); 

            }

             after(grammarAccess.getCHAINEAccess().getIDTerminalRuleCall()); 

            }

            // InternalMyDsl.g:230:3: ( ( RULE_ID )* )
            // InternalMyDsl.g:231:4: ( RULE_ID )*
            {
             before(grammarAccess.getCHAINEAccess().getIDTerminalRuleCall()); 
            // InternalMyDsl.g:232:4: ( RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:232:5: RULE_ID
            	    {
            	    match(input,RULE_ID,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCHAINEAccess().getIDTerminalRuleCall()); 

            }


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
    // $ANTLR end "ruleCHAINE"


    // $ANTLR start "rule__MindMap__Group__0"
    // InternalMyDsl.g:241:1: rule__MindMap__Group__0 : rule__MindMap__Group__0__Impl rule__MindMap__Group__1 ;
    public final void rule__MindMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:245:1: ( rule__MindMap__Group__0__Impl rule__MindMap__Group__1 )
            // InternalMyDsl.g:246:2: rule__MindMap__Group__0__Impl rule__MindMap__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MindMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MindMap__Group__1();

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
    // $ANTLR end "rule__MindMap__Group__0"


    // $ANTLR start "rule__MindMap__Group__0__Impl"
    // InternalMyDsl.g:253:1: rule__MindMap__Group__0__Impl : ( 'MindMap' ) ;
    public final void rule__MindMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:257:1: ( ( 'MindMap' ) )
            // InternalMyDsl.g:258:1: ( 'MindMap' )
            {
            // InternalMyDsl.g:258:1: ( 'MindMap' )
            // InternalMyDsl.g:259:2: 'MindMap'
            {
             before(grammarAccess.getMindMapAccess().getMindMapKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMindMapAccess().getMindMapKeyword_0()); 

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
    // $ANTLR end "rule__MindMap__Group__0__Impl"


    // $ANTLR start "rule__MindMap__Group__1"
    // InternalMyDsl.g:268:1: rule__MindMap__Group__1 : rule__MindMap__Group__1__Impl rule__MindMap__Group__2 ;
    public final void rule__MindMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:272:1: ( rule__MindMap__Group__1__Impl rule__MindMap__Group__2 )
            // InternalMyDsl.g:273:2: rule__MindMap__Group__1__Impl rule__MindMap__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MindMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MindMap__Group__2();

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
    // $ANTLR end "rule__MindMap__Group__1"


    // $ANTLR start "rule__MindMap__Group__1__Impl"
    // InternalMyDsl.g:280:1: rule__MindMap__Group__1__Impl : ( ( rule__MindMap__Group_1__0 )? ) ;
    public final void rule__MindMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:284:1: ( ( ( rule__MindMap__Group_1__0 )? ) )
            // InternalMyDsl.g:285:1: ( ( rule__MindMap__Group_1__0 )? )
            {
            // InternalMyDsl.g:285:1: ( ( rule__MindMap__Group_1__0 )? )
            // InternalMyDsl.g:286:2: ( rule__MindMap__Group_1__0 )?
            {
             before(grammarAccess.getMindMapAccess().getGroup_1()); 
            // InternalMyDsl.g:287:2: ( rule__MindMap__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:287:3: rule__MindMap__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MindMap__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMindMapAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MindMap__Group__1__Impl"


    // $ANTLR start "rule__MindMap__Group__2"
    // InternalMyDsl.g:295:1: rule__MindMap__Group__2 : rule__MindMap__Group__2__Impl rule__MindMap__Group__3 ;
    public final void rule__MindMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:299:1: ( rule__MindMap__Group__2__Impl rule__MindMap__Group__3 )
            // InternalMyDsl.g:300:2: rule__MindMap__Group__2__Impl rule__MindMap__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MindMap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MindMap__Group__3();

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
    // $ANTLR end "rule__MindMap__Group__2"


    // $ANTLR start "rule__MindMap__Group__2__Impl"
    // InternalMyDsl.g:307:1: rule__MindMap__Group__2__Impl : ( ( rule__MindMap__TitleAssignment_2 ) ) ;
    public final void rule__MindMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:311:1: ( ( ( rule__MindMap__TitleAssignment_2 ) ) )
            // InternalMyDsl.g:312:1: ( ( rule__MindMap__TitleAssignment_2 ) )
            {
            // InternalMyDsl.g:312:1: ( ( rule__MindMap__TitleAssignment_2 ) )
            // InternalMyDsl.g:313:2: ( rule__MindMap__TitleAssignment_2 )
            {
             before(grammarAccess.getMindMapAccess().getTitleAssignment_2()); 
            // InternalMyDsl.g:314:2: ( rule__MindMap__TitleAssignment_2 )
            // InternalMyDsl.g:314:3: rule__MindMap__TitleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MindMap__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMindMapAccess().getTitleAssignment_2()); 

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
    // $ANTLR end "rule__MindMap__Group__2__Impl"


    // $ANTLR start "rule__MindMap__Group__3"
    // InternalMyDsl.g:322:1: rule__MindMap__Group__3 : rule__MindMap__Group__3__Impl ;
    public final void rule__MindMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:326:1: ( rule__MindMap__Group__3__Impl )
            // InternalMyDsl.g:327:2: rule__MindMap__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MindMap__Group__3__Impl();

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
    // $ANTLR end "rule__MindMap__Group__3"


    // $ANTLR start "rule__MindMap__Group__3__Impl"
    // InternalMyDsl.g:333:1: rule__MindMap__Group__3__Impl : ( ( rule__MindMap__CentraltopicAssignment_3 ) ) ;
    public final void rule__MindMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:337:1: ( ( ( rule__MindMap__CentraltopicAssignment_3 ) ) )
            // InternalMyDsl.g:338:1: ( ( rule__MindMap__CentraltopicAssignment_3 ) )
            {
            // InternalMyDsl.g:338:1: ( ( rule__MindMap__CentraltopicAssignment_3 ) )
            // InternalMyDsl.g:339:2: ( rule__MindMap__CentraltopicAssignment_3 )
            {
             before(grammarAccess.getMindMapAccess().getCentraltopicAssignment_3()); 
            // InternalMyDsl.g:340:2: ( rule__MindMap__CentraltopicAssignment_3 )
            // InternalMyDsl.g:340:3: rule__MindMap__CentraltopicAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MindMap__CentraltopicAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMindMapAccess().getCentraltopicAssignment_3()); 

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
    // $ANTLR end "rule__MindMap__Group__3__Impl"


    // $ANTLR start "rule__MindMap__Group_1__0"
    // InternalMyDsl.g:349:1: rule__MindMap__Group_1__0 : rule__MindMap__Group_1__0__Impl rule__MindMap__Group_1__1 ;
    public final void rule__MindMap__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( rule__MindMap__Group_1__0__Impl rule__MindMap__Group_1__1 )
            // InternalMyDsl.g:354:2: rule__MindMap__Group_1__0__Impl rule__MindMap__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__MindMap__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MindMap__Group_1__1();

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
    // $ANTLR end "rule__MindMap__Group_1__0"


    // $ANTLR start "rule__MindMap__Group_1__0__Impl"
    // InternalMyDsl.g:361:1: rule__MindMap__Group_1__0__Impl : ( '[' ) ;
    public final void rule__MindMap__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:365:1: ( ( '[' ) )
            // InternalMyDsl.g:366:1: ( '[' )
            {
            // InternalMyDsl.g:366:1: ( '[' )
            // InternalMyDsl.g:367:2: '['
            {
             before(grammarAccess.getMindMapAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMindMapAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__MindMap__Group_1__0__Impl"


    // $ANTLR start "rule__MindMap__Group_1__1"
    // InternalMyDsl.g:376:1: rule__MindMap__Group_1__1 : rule__MindMap__Group_1__1__Impl rule__MindMap__Group_1__2 ;
    public final void rule__MindMap__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( rule__MindMap__Group_1__1__Impl rule__MindMap__Group_1__2 )
            // InternalMyDsl.g:381:2: rule__MindMap__Group_1__1__Impl rule__MindMap__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__MindMap__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MindMap__Group_1__2();

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
    // $ANTLR end "rule__MindMap__Group_1__1"


    // $ANTLR start "rule__MindMap__Group_1__1__Impl"
    // InternalMyDsl.g:388:1: rule__MindMap__Group_1__1__Impl : ( ( rule__MindMap__MarkersAssignment_1_1 )* ) ;
    public final void rule__MindMap__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:392:1: ( ( ( rule__MindMap__MarkersAssignment_1_1 )* ) )
            // InternalMyDsl.g:393:1: ( ( rule__MindMap__MarkersAssignment_1_1 )* )
            {
            // InternalMyDsl.g:393:1: ( ( rule__MindMap__MarkersAssignment_1_1 )* )
            // InternalMyDsl.g:394:2: ( rule__MindMap__MarkersAssignment_1_1 )*
            {
             before(grammarAccess.getMindMapAccess().getMarkersAssignment_1_1()); 
            // InternalMyDsl.g:395:2: ( rule__MindMap__MarkersAssignment_1_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:395:3: rule__MindMap__MarkersAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MindMap__MarkersAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMindMapAccess().getMarkersAssignment_1_1()); 

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
    // $ANTLR end "rule__MindMap__Group_1__1__Impl"


    // $ANTLR start "rule__MindMap__Group_1__2"
    // InternalMyDsl.g:403:1: rule__MindMap__Group_1__2 : rule__MindMap__Group_1__2__Impl ;
    public final void rule__MindMap__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( rule__MindMap__Group_1__2__Impl )
            // InternalMyDsl.g:408:2: rule__MindMap__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MindMap__Group_1__2__Impl();

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
    // $ANTLR end "rule__MindMap__Group_1__2"


    // $ANTLR start "rule__MindMap__Group_1__2__Impl"
    // InternalMyDsl.g:414:1: rule__MindMap__Group_1__2__Impl : ( ']' ) ;
    public final void rule__MindMap__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( ( ']' ) )
            // InternalMyDsl.g:419:1: ( ']' )
            {
            // InternalMyDsl.g:419:1: ( ']' )
            // InternalMyDsl.g:420:2: ']'
            {
             before(grammarAccess.getMindMapAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMindMapAccess().getRightSquareBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__MindMap__Group_1__2__Impl"


    // $ANTLR start "rule__CentralTopic__Group__0"
    // InternalMyDsl.g:430:1: rule__CentralTopic__Group__0 : rule__CentralTopic__Group__0__Impl rule__CentralTopic__Group__1 ;
    public final void rule__CentralTopic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( rule__CentralTopic__Group__0__Impl rule__CentralTopic__Group__1 )
            // InternalMyDsl.g:435:2: rule__CentralTopic__Group__0__Impl rule__CentralTopic__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CentralTopic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CentralTopic__Group__1();

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
    // $ANTLR end "rule__CentralTopic__Group__0"


    // $ANTLR start "rule__CentralTopic__Group__0__Impl"
    // InternalMyDsl.g:442:1: rule__CentralTopic__Group__0__Impl : ( 'CentralTopic' ) ;
    public final void rule__CentralTopic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:446:1: ( ( 'CentralTopic' ) )
            // InternalMyDsl.g:447:1: ( 'CentralTopic' )
            {
            // InternalMyDsl.g:447:1: ( 'CentralTopic' )
            // InternalMyDsl.g:448:2: 'CentralTopic'
            {
             before(grammarAccess.getCentralTopicAccess().getCentralTopicKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCentralTopicAccess().getCentralTopicKeyword_0()); 

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
    // $ANTLR end "rule__CentralTopic__Group__0__Impl"


    // $ANTLR start "rule__CentralTopic__Group__1"
    // InternalMyDsl.g:457:1: rule__CentralTopic__Group__1 : rule__CentralTopic__Group__1__Impl rule__CentralTopic__Group__2 ;
    public final void rule__CentralTopic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( rule__CentralTopic__Group__1__Impl rule__CentralTopic__Group__2 )
            // InternalMyDsl.g:462:2: rule__CentralTopic__Group__1__Impl rule__CentralTopic__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CentralTopic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CentralTopic__Group__2();

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
    // $ANTLR end "rule__CentralTopic__Group__1"


    // $ANTLR start "rule__CentralTopic__Group__1__Impl"
    // InternalMyDsl.g:469:1: rule__CentralTopic__Group__1__Impl : ( ( rule__CentralTopic__Group_1__0 )? ) ;
    public final void rule__CentralTopic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ( rule__CentralTopic__Group_1__0 )? ) )
            // InternalMyDsl.g:474:1: ( ( rule__CentralTopic__Group_1__0 )? )
            {
            // InternalMyDsl.g:474:1: ( ( rule__CentralTopic__Group_1__0 )? )
            // InternalMyDsl.g:475:2: ( rule__CentralTopic__Group_1__0 )?
            {
             before(grammarAccess.getCentralTopicAccess().getGroup_1()); 
            // InternalMyDsl.g:476:2: ( rule__CentralTopic__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:476:3: rule__CentralTopic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CentralTopic__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCentralTopicAccess().getGroup_1()); 

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
    // $ANTLR end "rule__CentralTopic__Group__1__Impl"


    // $ANTLR start "rule__CentralTopic__Group__2"
    // InternalMyDsl.g:484:1: rule__CentralTopic__Group__2 : rule__CentralTopic__Group__2__Impl rule__CentralTopic__Group__3 ;
    public final void rule__CentralTopic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( rule__CentralTopic__Group__2__Impl rule__CentralTopic__Group__3 )
            // InternalMyDsl.g:489:2: rule__CentralTopic__Group__2__Impl rule__CentralTopic__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CentralTopic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CentralTopic__Group__3();

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
    // $ANTLR end "rule__CentralTopic__Group__2"


    // $ANTLR start "rule__CentralTopic__Group__2__Impl"
    // InternalMyDsl.g:496:1: rule__CentralTopic__Group__2__Impl : ( ( rule__CentralTopic__NameAssignment_2 ) ) ;
    public final void rule__CentralTopic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:500:1: ( ( ( rule__CentralTopic__NameAssignment_2 ) ) )
            // InternalMyDsl.g:501:1: ( ( rule__CentralTopic__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:501:1: ( ( rule__CentralTopic__NameAssignment_2 ) )
            // InternalMyDsl.g:502:2: ( rule__CentralTopic__NameAssignment_2 )
            {
             before(grammarAccess.getCentralTopicAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:503:2: ( rule__CentralTopic__NameAssignment_2 )
            // InternalMyDsl.g:503:3: rule__CentralTopic__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CentralTopic__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCentralTopicAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__CentralTopic__Group__2__Impl"


    // $ANTLR start "rule__CentralTopic__Group__3"
    // InternalMyDsl.g:511:1: rule__CentralTopic__Group__3 : rule__CentralTopic__Group__3__Impl ;
    public final void rule__CentralTopic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( rule__CentralTopic__Group__3__Impl )
            // InternalMyDsl.g:516:2: rule__CentralTopic__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CentralTopic__Group__3__Impl();

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
    // $ANTLR end "rule__CentralTopic__Group__3"


    // $ANTLR start "rule__CentralTopic__Group__3__Impl"
    // InternalMyDsl.g:522:1: rule__CentralTopic__Group__3__Impl : ( ( rule__CentralTopic__MaintopicAssignment_3 )* ) ;
    public final void rule__CentralTopic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:526:1: ( ( ( rule__CentralTopic__MaintopicAssignment_3 )* ) )
            // InternalMyDsl.g:527:1: ( ( rule__CentralTopic__MaintopicAssignment_3 )* )
            {
            // InternalMyDsl.g:527:1: ( ( rule__CentralTopic__MaintopicAssignment_3 )* )
            // InternalMyDsl.g:528:2: ( rule__CentralTopic__MaintopicAssignment_3 )*
            {
             before(grammarAccess.getCentralTopicAccess().getMaintopicAssignment_3()); 
            // InternalMyDsl.g:529:2: ( rule__CentralTopic__MaintopicAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:529:3: rule__CentralTopic__MaintopicAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CentralTopic__MaintopicAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCentralTopicAccess().getMaintopicAssignment_3()); 

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
    // $ANTLR end "rule__CentralTopic__Group__3__Impl"


    // $ANTLR start "rule__CentralTopic__Group_1__0"
    // InternalMyDsl.g:538:1: rule__CentralTopic__Group_1__0 : rule__CentralTopic__Group_1__0__Impl rule__CentralTopic__Group_1__1 ;
    public final void rule__CentralTopic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( rule__CentralTopic__Group_1__0__Impl rule__CentralTopic__Group_1__1 )
            // InternalMyDsl.g:543:2: rule__CentralTopic__Group_1__0__Impl rule__CentralTopic__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__CentralTopic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CentralTopic__Group_1__1();

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
    // $ANTLR end "rule__CentralTopic__Group_1__0"


    // $ANTLR start "rule__CentralTopic__Group_1__0__Impl"
    // InternalMyDsl.g:550:1: rule__CentralTopic__Group_1__0__Impl : ( '[' ) ;
    public final void rule__CentralTopic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:554:1: ( ( '[' ) )
            // InternalMyDsl.g:555:1: ( '[' )
            {
            // InternalMyDsl.g:555:1: ( '[' )
            // InternalMyDsl.g:556:2: '['
            {
             before(grammarAccess.getCentralTopicAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCentralTopicAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__CentralTopic__Group_1__0__Impl"


    // $ANTLR start "rule__CentralTopic__Group_1__1"
    // InternalMyDsl.g:565:1: rule__CentralTopic__Group_1__1 : rule__CentralTopic__Group_1__1__Impl rule__CentralTopic__Group_1__2 ;
    public final void rule__CentralTopic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( rule__CentralTopic__Group_1__1__Impl rule__CentralTopic__Group_1__2 )
            // InternalMyDsl.g:570:2: rule__CentralTopic__Group_1__1__Impl rule__CentralTopic__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__CentralTopic__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CentralTopic__Group_1__2();

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
    // $ANTLR end "rule__CentralTopic__Group_1__1"


    // $ANTLR start "rule__CentralTopic__Group_1__1__Impl"
    // InternalMyDsl.g:577:1: rule__CentralTopic__Group_1__1__Impl : ( ( rule__CentralTopic__MarkersAssignment_1_1 )* ) ;
    public final void rule__CentralTopic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( ( ( rule__CentralTopic__MarkersAssignment_1_1 )* ) )
            // InternalMyDsl.g:582:1: ( ( rule__CentralTopic__MarkersAssignment_1_1 )* )
            {
            // InternalMyDsl.g:582:1: ( ( rule__CentralTopic__MarkersAssignment_1_1 )* )
            // InternalMyDsl.g:583:2: ( rule__CentralTopic__MarkersAssignment_1_1 )*
            {
             before(grammarAccess.getCentralTopicAccess().getMarkersAssignment_1_1()); 
            // InternalMyDsl.g:584:2: ( rule__CentralTopic__MarkersAssignment_1_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_INT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:584:3: rule__CentralTopic__MarkersAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__CentralTopic__MarkersAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCentralTopicAccess().getMarkersAssignment_1_1()); 

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
    // $ANTLR end "rule__CentralTopic__Group_1__1__Impl"


    // $ANTLR start "rule__CentralTopic__Group_1__2"
    // InternalMyDsl.g:592:1: rule__CentralTopic__Group_1__2 : rule__CentralTopic__Group_1__2__Impl ;
    public final void rule__CentralTopic__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( rule__CentralTopic__Group_1__2__Impl )
            // InternalMyDsl.g:597:2: rule__CentralTopic__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CentralTopic__Group_1__2__Impl();

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
    // $ANTLR end "rule__CentralTopic__Group_1__2"


    // $ANTLR start "rule__CentralTopic__Group_1__2__Impl"
    // InternalMyDsl.g:603:1: rule__CentralTopic__Group_1__2__Impl : ( ']' ) ;
    public final void rule__CentralTopic__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( ( ']' ) )
            // InternalMyDsl.g:608:1: ( ']' )
            {
            // InternalMyDsl.g:608:1: ( ']' )
            // InternalMyDsl.g:609:2: ']'
            {
             before(grammarAccess.getCentralTopicAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCentralTopicAccess().getRightSquareBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__CentralTopic__Group_1__2__Impl"


    // $ANTLR start "rule__MainTopic__Group__0"
    // InternalMyDsl.g:619:1: rule__MainTopic__Group__0 : rule__MainTopic__Group__0__Impl rule__MainTopic__Group__1 ;
    public final void rule__MainTopic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( rule__MainTopic__Group__0__Impl rule__MainTopic__Group__1 )
            // InternalMyDsl.g:624:2: rule__MainTopic__Group__0__Impl rule__MainTopic__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MainTopic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainTopic__Group__1();

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
    // $ANTLR end "rule__MainTopic__Group__0"


    // $ANTLR start "rule__MainTopic__Group__0__Impl"
    // InternalMyDsl.g:631:1: rule__MainTopic__Group__0__Impl : ( 'MainTopic' ) ;
    public final void rule__MainTopic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:635:1: ( ( 'MainTopic' ) )
            // InternalMyDsl.g:636:1: ( 'MainTopic' )
            {
            // InternalMyDsl.g:636:1: ( 'MainTopic' )
            // InternalMyDsl.g:637:2: 'MainTopic'
            {
             before(grammarAccess.getMainTopicAccess().getMainTopicKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMainTopicAccess().getMainTopicKeyword_0()); 

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
    // $ANTLR end "rule__MainTopic__Group__0__Impl"


    // $ANTLR start "rule__MainTopic__Group__1"
    // InternalMyDsl.g:646:1: rule__MainTopic__Group__1 : rule__MainTopic__Group__1__Impl rule__MainTopic__Group__2 ;
    public final void rule__MainTopic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( rule__MainTopic__Group__1__Impl rule__MainTopic__Group__2 )
            // InternalMyDsl.g:651:2: rule__MainTopic__Group__1__Impl rule__MainTopic__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MainTopic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainTopic__Group__2();

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
    // $ANTLR end "rule__MainTopic__Group__1"


    // $ANTLR start "rule__MainTopic__Group__1__Impl"
    // InternalMyDsl.g:658:1: rule__MainTopic__Group__1__Impl : ( ( rule__MainTopic__Group_1__0 )? ) ;
    public final void rule__MainTopic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:662:1: ( ( ( rule__MainTopic__Group_1__0 )? ) )
            // InternalMyDsl.g:663:1: ( ( rule__MainTopic__Group_1__0 )? )
            {
            // InternalMyDsl.g:663:1: ( ( rule__MainTopic__Group_1__0 )? )
            // InternalMyDsl.g:664:2: ( rule__MainTopic__Group_1__0 )?
            {
             before(grammarAccess.getMainTopicAccess().getGroup_1()); 
            // InternalMyDsl.g:665:2: ( rule__MainTopic__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:665:3: rule__MainTopic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MainTopic__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainTopicAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MainTopic__Group__1__Impl"


    // $ANTLR start "rule__MainTopic__Group__2"
    // InternalMyDsl.g:673:1: rule__MainTopic__Group__2 : rule__MainTopic__Group__2__Impl rule__MainTopic__Group__3 ;
    public final void rule__MainTopic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( rule__MainTopic__Group__2__Impl rule__MainTopic__Group__3 )
            // InternalMyDsl.g:678:2: rule__MainTopic__Group__2__Impl rule__MainTopic__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__MainTopic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainTopic__Group__3();

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
    // $ANTLR end "rule__MainTopic__Group__2"


    // $ANTLR start "rule__MainTopic__Group__2__Impl"
    // InternalMyDsl.g:685:1: rule__MainTopic__Group__2__Impl : ( ( rule__MainTopic__NameAssignment_2 ) ) ;
    public final void rule__MainTopic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:689:1: ( ( ( rule__MainTopic__NameAssignment_2 ) ) )
            // InternalMyDsl.g:690:1: ( ( rule__MainTopic__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:690:1: ( ( rule__MainTopic__NameAssignment_2 ) )
            // InternalMyDsl.g:691:2: ( rule__MainTopic__NameAssignment_2 )
            {
             before(grammarAccess.getMainTopicAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:692:2: ( rule__MainTopic__NameAssignment_2 )
            // InternalMyDsl.g:692:3: rule__MainTopic__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MainTopic__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMainTopicAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__MainTopic__Group__2__Impl"


    // $ANTLR start "rule__MainTopic__Group__3"
    // InternalMyDsl.g:700:1: rule__MainTopic__Group__3 : rule__MainTopic__Group__3__Impl ;
    public final void rule__MainTopic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:704:1: ( rule__MainTopic__Group__3__Impl )
            // InternalMyDsl.g:705:2: rule__MainTopic__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainTopic__Group__3__Impl();

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
    // $ANTLR end "rule__MainTopic__Group__3"


    // $ANTLR start "rule__MainTopic__Group__3__Impl"
    // InternalMyDsl.g:711:1: rule__MainTopic__Group__3__Impl : ( ( rule__MainTopic__SubtopicAssignment_3 )* ) ;
    public final void rule__MainTopic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( ( ( rule__MainTopic__SubtopicAssignment_3 )* ) )
            // InternalMyDsl.g:716:1: ( ( rule__MainTopic__SubtopicAssignment_3 )* )
            {
            // InternalMyDsl.g:716:1: ( ( rule__MainTopic__SubtopicAssignment_3 )* )
            // InternalMyDsl.g:717:2: ( rule__MainTopic__SubtopicAssignment_3 )*
            {
             before(grammarAccess.getMainTopicAccess().getSubtopicAssignment_3()); 
            // InternalMyDsl.g:718:2: ( rule__MainTopic__SubtopicAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:718:3: rule__MainTopic__SubtopicAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MainTopic__SubtopicAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMainTopicAccess().getSubtopicAssignment_3()); 

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
    // $ANTLR end "rule__MainTopic__Group__3__Impl"


    // $ANTLR start "rule__MainTopic__Group_1__0"
    // InternalMyDsl.g:727:1: rule__MainTopic__Group_1__0 : rule__MainTopic__Group_1__0__Impl rule__MainTopic__Group_1__1 ;
    public final void rule__MainTopic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( rule__MainTopic__Group_1__0__Impl rule__MainTopic__Group_1__1 )
            // InternalMyDsl.g:732:2: rule__MainTopic__Group_1__0__Impl rule__MainTopic__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__MainTopic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainTopic__Group_1__1();

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
    // $ANTLR end "rule__MainTopic__Group_1__0"


    // $ANTLR start "rule__MainTopic__Group_1__0__Impl"
    // InternalMyDsl.g:739:1: rule__MainTopic__Group_1__0__Impl : ( '[' ) ;
    public final void rule__MainTopic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:743:1: ( ( '[' ) )
            // InternalMyDsl.g:744:1: ( '[' )
            {
            // InternalMyDsl.g:744:1: ( '[' )
            // InternalMyDsl.g:745:2: '['
            {
             before(grammarAccess.getMainTopicAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMainTopicAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__MainTopic__Group_1__0__Impl"


    // $ANTLR start "rule__MainTopic__Group_1__1"
    // InternalMyDsl.g:754:1: rule__MainTopic__Group_1__1 : rule__MainTopic__Group_1__1__Impl rule__MainTopic__Group_1__2 ;
    public final void rule__MainTopic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( rule__MainTopic__Group_1__1__Impl rule__MainTopic__Group_1__2 )
            // InternalMyDsl.g:759:2: rule__MainTopic__Group_1__1__Impl rule__MainTopic__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__MainTopic__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainTopic__Group_1__2();

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
    // $ANTLR end "rule__MainTopic__Group_1__1"


    // $ANTLR start "rule__MainTopic__Group_1__1__Impl"
    // InternalMyDsl.g:766:1: rule__MainTopic__Group_1__1__Impl : ( ( rule__MainTopic__MarkersAssignment_1_1 )* ) ;
    public final void rule__MainTopic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( ( ( rule__MainTopic__MarkersAssignment_1_1 )* ) )
            // InternalMyDsl.g:771:1: ( ( rule__MainTopic__MarkersAssignment_1_1 )* )
            {
            // InternalMyDsl.g:771:1: ( ( rule__MainTopic__MarkersAssignment_1_1 )* )
            // InternalMyDsl.g:772:2: ( rule__MainTopic__MarkersAssignment_1_1 )*
            {
             before(grammarAccess.getMainTopicAccess().getMarkersAssignment_1_1()); 
            // InternalMyDsl.g:773:2: ( rule__MainTopic__MarkersAssignment_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_INT) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:773:3: rule__MainTopic__MarkersAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MainTopic__MarkersAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMainTopicAccess().getMarkersAssignment_1_1()); 

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
    // $ANTLR end "rule__MainTopic__Group_1__1__Impl"


    // $ANTLR start "rule__MainTopic__Group_1__2"
    // InternalMyDsl.g:781:1: rule__MainTopic__Group_1__2 : rule__MainTopic__Group_1__2__Impl ;
    public final void rule__MainTopic__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( rule__MainTopic__Group_1__2__Impl )
            // InternalMyDsl.g:786:2: rule__MainTopic__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainTopic__Group_1__2__Impl();

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
    // $ANTLR end "rule__MainTopic__Group_1__2"


    // $ANTLR start "rule__MainTopic__Group_1__2__Impl"
    // InternalMyDsl.g:792:1: rule__MainTopic__Group_1__2__Impl : ( ']' ) ;
    public final void rule__MainTopic__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( ( ']' ) )
            // InternalMyDsl.g:797:1: ( ']' )
            {
            // InternalMyDsl.g:797:1: ( ']' )
            // InternalMyDsl.g:798:2: ']'
            {
             before(grammarAccess.getMainTopicAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMainTopicAccess().getRightSquareBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__MainTopic__Group_1__2__Impl"


    // $ANTLR start "rule__SubTopic__Group__0"
    // InternalMyDsl.g:808:1: rule__SubTopic__Group__0 : rule__SubTopic__Group__0__Impl rule__SubTopic__Group__1 ;
    public final void rule__SubTopic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( rule__SubTopic__Group__0__Impl rule__SubTopic__Group__1 )
            // InternalMyDsl.g:813:2: rule__SubTopic__Group__0__Impl rule__SubTopic__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SubTopic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubTopic__Group__1();

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
    // $ANTLR end "rule__SubTopic__Group__0"


    // $ANTLR start "rule__SubTopic__Group__0__Impl"
    // InternalMyDsl.g:820:1: rule__SubTopic__Group__0__Impl : ( 'SubTopic' ) ;
    public final void rule__SubTopic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( ( 'SubTopic' ) )
            // InternalMyDsl.g:825:1: ( 'SubTopic' )
            {
            // InternalMyDsl.g:825:1: ( 'SubTopic' )
            // InternalMyDsl.g:826:2: 'SubTopic'
            {
             before(grammarAccess.getSubTopicAccess().getSubTopicKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubTopicAccess().getSubTopicKeyword_0()); 

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
    // $ANTLR end "rule__SubTopic__Group__0__Impl"


    // $ANTLR start "rule__SubTopic__Group__1"
    // InternalMyDsl.g:835:1: rule__SubTopic__Group__1 : rule__SubTopic__Group__1__Impl rule__SubTopic__Group__2 ;
    public final void rule__SubTopic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( rule__SubTopic__Group__1__Impl rule__SubTopic__Group__2 )
            // InternalMyDsl.g:840:2: rule__SubTopic__Group__1__Impl rule__SubTopic__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SubTopic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubTopic__Group__2();

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
    // $ANTLR end "rule__SubTopic__Group__1"


    // $ANTLR start "rule__SubTopic__Group__1__Impl"
    // InternalMyDsl.g:847:1: rule__SubTopic__Group__1__Impl : ( ( rule__SubTopic__Group_1__0 )? ) ;
    public final void rule__SubTopic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:851:1: ( ( ( rule__SubTopic__Group_1__0 )? ) )
            // InternalMyDsl.g:852:1: ( ( rule__SubTopic__Group_1__0 )? )
            {
            // InternalMyDsl.g:852:1: ( ( rule__SubTopic__Group_1__0 )? )
            // InternalMyDsl.g:853:2: ( rule__SubTopic__Group_1__0 )?
            {
             before(grammarAccess.getSubTopicAccess().getGroup_1()); 
            // InternalMyDsl.g:854:2: ( rule__SubTopic__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:854:3: rule__SubTopic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubTopic__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubTopicAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SubTopic__Group__1__Impl"


    // $ANTLR start "rule__SubTopic__Group__2"
    // InternalMyDsl.g:862:1: rule__SubTopic__Group__2 : rule__SubTopic__Group__2__Impl rule__SubTopic__Group__3 ;
    public final void rule__SubTopic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( rule__SubTopic__Group__2__Impl rule__SubTopic__Group__3 )
            // InternalMyDsl.g:867:2: rule__SubTopic__Group__2__Impl rule__SubTopic__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__SubTopic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubTopic__Group__3();

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
    // $ANTLR end "rule__SubTopic__Group__2"


    // $ANTLR start "rule__SubTopic__Group__2__Impl"
    // InternalMyDsl.g:874:1: rule__SubTopic__Group__2__Impl : ( ( rule__SubTopic__NameAssignment_2 ) ) ;
    public final void rule__SubTopic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:878:1: ( ( ( rule__SubTopic__NameAssignment_2 ) ) )
            // InternalMyDsl.g:879:1: ( ( rule__SubTopic__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:879:1: ( ( rule__SubTopic__NameAssignment_2 ) )
            // InternalMyDsl.g:880:2: ( rule__SubTopic__NameAssignment_2 )
            {
             before(grammarAccess.getSubTopicAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:881:2: ( rule__SubTopic__NameAssignment_2 )
            // InternalMyDsl.g:881:3: rule__SubTopic__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubTopic__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubTopicAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__SubTopic__Group__2__Impl"


    // $ANTLR start "rule__SubTopic__Group__3"
    // InternalMyDsl.g:889:1: rule__SubTopic__Group__3 : rule__SubTopic__Group__3__Impl ;
    public final void rule__SubTopic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( rule__SubTopic__Group__3__Impl )
            // InternalMyDsl.g:894:2: rule__SubTopic__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubTopic__Group__3__Impl();

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
    // $ANTLR end "rule__SubTopic__Group__3"


    // $ANTLR start "rule__SubTopic__Group__3__Impl"
    // InternalMyDsl.g:900:1: rule__SubTopic__Group__3__Impl : ( ( rule__SubTopic__SubtopicAssignment_3 )* ) ;
    public final void rule__SubTopic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( ( ( rule__SubTopic__SubtopicAssignment_3 )* ) )
            // InternalMyDsl.g:905:1: ( ( rule__SubTopic__SubtopicAssignment_3 )* )
            {
            // InternalMyDsl.g:905:1: ( ( rule__SubTopic__SubtopicAssignment_3 )* )
            // InternalMyDsl.g:906:2: ( rule__SubTopic__SubtopicAssignment_3 )*
            {
             before(grammarAccess.getSubTopicAccess().getSubtopicAssignment_3()); 
            // InternalMyDsl.g:907:2: ( rule__SubTopic__SubtopicAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:907:3: rule__SubTopic__SubtopicAssignment_3
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SubTopic__SubtopicAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSubTopicAccess().getSubtopicAssignment_3()); 

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
    // $ANTLR end "rule__SubTopic__Group__3__Impl"


    // $ANTLR start "rule__SubTopic__Group_1__0"
    // InternalMyDsl.g:916:1: rule__SubTopic__Group_1__0 : rule__SubTopic__Group_1__0__Impl rule__SubTopic__Group_1__1 ;
    public final void rule__SubTopic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( rule__SubTopic__Group_1__0__Impl rule__SubTopic__Group_1__1 )
            // InternalMyDsl.g:921:2: rule__SubTopic__Group_1__0__Impl rule__SubTopic__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__SubTopic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubTopic__Group_1__1();

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
    // $ANTLR end "rule__SubTopic__Group_1__0"


    // $ANTLR start "rule__SubTopic__Group_1__0__Impl"
    // InternalMyDsl.g:928:1: rule__SubTopic__Group_1__0__Impl : ( '[' ) ;
    public final void rule__SubTopic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:932:1: ( ( '[' ) )
            // InternalMyDsl.g:933:1: ( '[' )
            {
            // InternalMyDsl.g:933:1: ( '[' )
            // InternalMyDsl.g:934:2: '['
            {
             before(grammarAccess.getSubTopicAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSubTopicAccess().getLeftSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__SubTopic__Group_1__0__Impl"


    // $ANTLR start "rule__SubTopic__Group_1__1"
    // InternalMyDsl.g:943:1: rule__SubTopic__Group_1__1 : rule__SubTopic__Group_1__1__Impl rule__SubTopic__Group_1__2 ;
    public final void rule__SubTopic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( rule__SubTopic__Group_1__1__Impl rule__SubTopic__Group_1__2 )
            // InternalMyDsl.g:948:2: rule__SubTopic__Group_1__1__Impl rule__SubTopic__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__SubTopic__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubTopic__Group_1__2();

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
    // $ANTLR end "rule__SubTopic__Group_1__1"


    // $ANTLR start "rule__SubTopic__Group_1__1__Impl"
    // InternalMyDsl.g:955:1: rule__SubTopic__Group_1__1__Impl : ( ( rule__SubTopic__MarkersAssignment_1_1 )* ) ;
    public final void rule__SubTopic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:959:1: ( ( ( rule__SubTopic__MarkersAssignment_1_1 )* ) )
            // InternalMyDsl.g:960:1: ( ( rule__SubTopic__MarkersAssignment_1_1 )* )
            {
            // InternalMyDsl.g:960:1: ( ( rule__SubTopic__MarkersAssignment_1_1 )* )
            // InternalMyDsl.g:961:2: ( rule__SubTopic__MarkersAssignment_1_1 )*
            {
             before(grammarAccess.getSubTopicAccess().getMarkersAssignment_1_1()); 
            // InternalMyDsl.g:962:2: ( rule__SubTopic__MarkersAssignment_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_INT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:962:3: rule__SubTopic__MarkersAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__SubTopic__MarkersAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSubTopicAccess().getMarkersAssignment_1_1()); 

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
    // $ANTLR end "rule__SubTopic__Group_1__1__Impl"


    // $ANTLR start "rule__SubTopic__Group_1__2"
    // InternalMyDsl.g:970:1: rule__SubTopic__Group_1__2 : rule__SubTopic__Group_1__2__Impl ;
    public final void rule__SubTopic__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( rule__SubTopic__Group_1__2__Impl )
            // InternalMyDsl.g:975:2: rule__SubTopic__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubTopic__Group_1__2__Impl();

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
    // $ANTLR end "rule__SubTopic__Group_1__2"


    // $ANTLR start "rule__SubTopic__Group_1__2__Impl"
    // InternalMyDsl.g:981:1: rule__SubTopic__Group_1__2__Impl : ( ']' ) ;
    public final void rule__SubTopic__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:985:1: ( ( ']' ) )
            // InternalMyDsl.g:986:1: ( ']' )
            {
            // InternalMyDsl.g:986:1: ( ']' )
            // InternalMyDsl.g:987:2: ']'
            {
             before(grammarAccess.getSubTopicAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSubTopicAccess().getRightSquareBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__SubTopic__Group_1__2__Impl"


    // $ANTLR start "rule__MindMap__MarkersAssignment_1_1"
    // InternalMyDsl.g:997:1: rule__MindMap__MarkersAssignment_1_1 : ( ruleMarker ) ;
    public final void rule__MindMap__MarkersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1001:1: ( ( ruleMarker ) )
            // InternalMyDsl.g:1002:2: ( ruleMarker )
            {
            // InternalMyDsl.g:1002:2: ( ruleMarker )
            // InternalMyDsl.g:1003:3: ruleMarker
            {
             before(grammarAccess.getMindMapAccess().getMarkersMarkerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getMindMapAccess().getMarkersMarkerParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MindMap__MarkersAssignment_1_1"


    // $ANTLR start "rule__MindMap__TitleAssignment_2"
    // InternalMyDsl.g:1012:1: rule__MindMap__TitleAssignment_2 : ( ruleCHAINE ) ;
    public final void rule__MindMap__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( ( ruleCHAINE ) )
            // InternalMyDsl.g:1017:2: ( ruleCHAINE )
            {
            // InternalMyDsl.g:1017:2: ( ruleCHAINE )
            // InternalMyDsl.g:1018:3: ruleCHAINE
            {
             before(grammarAccess.getMindMapAccess().getTitleCHAINEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCHAINE();

            state._fsp--;

             after(grammarAccess.getMindMapAccess().getTitleCHAINEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MindMap__TitleAssignment_2"


    // $ANTLR start "rule__MindMap__CentraltopicAssignment_3"
    // InternalMyDsl.g:1027:1: rule__MindMap__CentraltopicAssignment_3 : ( ruleCentralTopic ) ;
    public final void rule__MindMap__CentraltopicAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1031:1: ( ( ruleCentralTopic ) )
            // InternalMyDsl.g:1032:2: ( ruleCentralTopic )
            {
            // InternalMyDsl.g:1032:2: ( ruleCentralTopic )
            // InternalMyDsl.g:1033:3: ruleCentralTopic
            {
             before(grammarAccess.getMindMapAccess().getCentraltopicCentralTopicParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCentralTopic();

            state._fsp--;

             after(grammarAccess.getMindMapAccess().getCentraltopicCentralTopicParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MindMap__CentraltopicAssignment_3"


    // $ANTLR start "rule__CentralTopic__MarkersAssignment_1_1"
    // InternalMyDsl.g:1042:1: rule__CentralTopic__MarkersAssignment_1_1 : ( ruleMarker ) ;
    public final void rule__CentralTopic__MarkersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1046:1: ( ( ruleMarker ) )
            // InternalMyDsl.g:1047:2: ( ruleMarker )
            {
            // InternalMyDsl.g:1047:2: ( ruleMarker )
            // InternalMyDsl.g:1048:3: ruleMarker
            {
             before(grammarAccess.getCentralTopicAccess().getMarkersMarkerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getCentralTopicAccess().getMarkersMarkerParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__CentralTopic__MarkersAssignment_1_1"


    // $ANTLR start "rule__CentralTopic__NameAssignment_2"
    // InternalMyDsl.g:1057:1: rule__CentralTopic__NameAssignment_2 : ( ruleCHAINE ) ;
    public final void rule__CentralTopic__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( ( ruleCHAINE ) )
            // InternalMyDsl.g:1062:2: ( ruleCHAINE )
            {
            // InternalMyDsl.g:1062:2: ( ruleCHAINE )
            // InternalMyDsl.g:1063:3: ruleCHAINE
            {
             before(grammarAccess.getCentralTopicAccess().getNameCHAINEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCHAINE();

            state._fsp--;

             after(grammarAccess.getCentralTopicAccess().getNameCHAINEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__CentralTopic__NameAssignment_2"


    // $ANTLR start "rule__CentralTopic__MaintopicAssignment_3"
    // InternalMyDsl.g:1072:1: rule__CentralTopic__MaintopicAssignment_3 : ( ruleMainTopic ) ;
    public final void rule__CentralTopic__MaintopicAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( ( ruleMainTopic ) )
            // InternalMyDsl.g:1077:2: ( ruleMainTopic )
            {
            // InternalMyDsl.g:1077:2: ( ruleMainTopic )
            // InternalMyDsl.g:1078:3: ruleMainTopic
            {
             before(grammarAccess.getCentralTopicAccess().getMaintopicMainTopicParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMainTopic();

            state._fsp--;

             after(grammarAccess.getCentralTopicAccess().getMaintopicMainTopicParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__CentralTopic__MaintopicAssignment_3"


    // $ANTLR start "rule__MainTopic__MarkersAssignment_1_1"
    // InternalMyDsl.g:1087:1: rule__MainTopic__MarkersAssignment_1_1 : ( ruleMarker ) ;
    public final void rule__MainTopic__MarkersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( ( ruleMarker ) )
            // InternalMyDsl.g:1092:2: ( ruleMarker )
            {
            // InternalMyDsl.g:1092:2: ( ruleMarker )
            // InternalMyDsl.g:1093:3: ruleMarker
            {
             before(grammarAccess.getMainTopicAccess().getMarkersMarkerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getMainTopicAccess().getMarkersMarkerParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MainTopic__MarkersAssignment_1_1"


    // $ANTLR start "rule__MainTopic__NameAssignment_2"
    // InternalMyDsl.g:1102:1: rule__MainTopic__NameAssignment_2 : ( ruleCHAINE ) ;
    public final void rule__MainTopic__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1106:1: ( ( ruleCHAINE ) )
            // InternalMyDsl.g:1107:2: ( ruleCHAINE )
            {
            // InternalMyDsl.g:1107:2: ( ruleCHAINE )
            // InternalMyDsl.g:1108:3: ruleCHAINE
            {
             before(grammarAccess.getMainTopicAccess().getNameCHAINEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCHAINE();

            state._fsp--;

             after(grammarAccess.getMainTopicAccess().getNameCHAINEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MainTopic__NameAssignment_2"


    // $ANTLR start "rule__MainTopic__SubtopicAssignment_3"
    // InternalMyDsl.g:1117:1: rule__MainTopic__SubtopicAssignment_3 : ( ruleSubTopic ) ;
    public final void rule__MainTopic__SubtopicAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1121:1: ( ( ruleSubTopic ) )
            // InternalMyDsl.g:1122:2: ( ruleSubTopic )
            {
            // InternalMyDsl.g:1122:2: ( ruleSubTopic )
            // InternalMyDsl.g:1123:3: ruleSubTopic
            {
             before(grammarAccess.getMainTopicAccess().getSubtopicSubTopicParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSubTopic();

            state._fsp--;

             after(grammarAccess.getMainTopicAccess().getSubtopicSubTopicParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MainTopic__SubtopicAssignment_3"


    // $ANTLR start "rule__SubTopic__MarkersAssignment_1_1"
    // InternalMyDsl.g:1132:1: rule__SubTopic__MarkersAssignment_1_1 : ( ruleMarker ) ;
    public final void rule__SubTopic__MarkersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( ruleMarker ) )
            // InternalMyDsl.g:1137:2: ( ruleMarker )
            {
            // InternalMyDsl.g:1137:2: ( ruleMarker )
            // InternalMyDsl.g:1138:3: ruleMarker
            {
             before(grammarAccess.getSubTopicAccess().getMarkersMarkerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getSubTopicAccess().getMarkersMarkerParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SubTopic__MarkersAssignment_1_1"


    // $ANTLR start "rule__SubTopic__NameAssignment_2"
    // InternalMyDsl.g:1147:1: rule__SubTopic__NameAssignment_2 : ( ruleCHAINE ) ;
    public final void rule__SubTopic__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( ( ruleCHAINE ) )
            // InternalMyDsl.g:1152:2: ( ruleCHAINE )
            {
            // InternalMyDsl.g:1152:2: ( ruleCHAINE )
            // InternalMyDsl.g:1153:3: ruleCHAINE
            {
             before(grammarAccess.getSubTopicAccess().getNameCHAINEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCHAINE();

            state._fsp--;

             after(grammarAccess.getSubTopicAccess().getNameCHAINEParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SubTopic__NameAssignment_2"


    // $ANTLR start "rule__SubTopic__SubtopicAssignment_3"
    // InternalMyDsl.g:1162:1: rule__SubTopic__SubtopicAssignment_3 : ( ruleSubTopic ) ;
    public final void rule__SubTopic__SubtopicAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1166:1: ( ( ruleSubTopic ) )
            // InternalMyDsl.g:1167:2: ( ruleSubTopic )
            {
            // InternalMyDsl.g:1167:2: ( ruleSubTopic )
            // InternalMyDsl.g:1168:3: ruleSubTopic
            {
             before(grammarAccess.getSubTopicAccess().getSubtopicSubTopicParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSubTopic();

            state._fsp--;

             after(grammarAccess.getSubTopicAccess().getSubtopicSubTopicParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SubTopic__SubtopicAssignment_3"


    // $ANTLR start "rule__Marker__SymbolAssignment"
    // InternalMyDsl.g:1177:1: rule__Marker__SymbolAssignment : ( ruleENTIER ) ;
    public final void rule__Marker__SymbolAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1181:1: ( ( ruleENTIER ) )
            // InternalMyDsl.g:1182:2: ( ruleENTIER )
            {
            // InternalMyDsl.g:1182:2: ( ruleENTIER )
            // InternalMyDsl.g:1183:3: ruleENTIER
            {
             before(grammarAccess.getMarkerAccess().getSymbolENTIERParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleENTIER();

            state._fsp--;

             after(grammarAccess.getMarkerAccess().getSymbolENTIERParserRuleCall_0()); 

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
    // $ANTLR end "rule__Marker__SymbolAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});

}