package mindMap_CarteMentale.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import mindMap_CarteMentale.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MindMap";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMindMap"
    // InternalMyDsl.g:64:1: entryRuleMindMap returns [EObject current=null] : iv_ruleMindMap= ruleMindMap EOF ;
    public final EObject entryRuleMindMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMindMap = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleMindMap= ruleMindMap EOF )
            // InternalMyDsl.g:65:2: iv_ruleMindMap= ruleMindMap EOF
            {
             newCompositeNode(grammarAccess.getMindMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMindMap=ruleMindMap();

            state._fsp--;

             current =iv_ruleMindMap; 
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
    // $ANTLR end "entryRuleMindMap"


    // $ANTLR start "ruleMindMap"
    // InternalMyDsl.g:71:1: ruleMindMap returns [EObject current=null] : (otherlv_0= 'MindMap' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_title_4_0= ruleCHAINE ) ) ( (lv_centraltopic_5_0= ruleCentralTopic ) ) )? ;
    public final EObject ruleMindMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_markers_2_0 = null;

        AntlrDatatypeRuleToken lv_title_4_0 = null;

        EObject lv_centraltopic_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'MindMap' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_title_4_0= ruleCHAINE ) ) ( (lv_centraltopic_5_0= ruleCentralTopic ) ) )? )
            // InternalMyDsl.g:78:2: (otherlv_0= 'MindMap' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_title_4_0= ruleCHAINE ) ) ( (lv_centraltopic_5_0= ruleCentralTopic ) ) )?
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'MindMap' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_title_4_0= ruleCHAINE ) ) ( (lv_centraltopic_5_0= ruleCentralTopic ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:79:3: otherlv_0= 'MindMap' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_title_4_0= ruleCHAINE ) ) ( (lv_centraltopic_5_0= ruleCentralTopic ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    			newLeafNode(otherlv_0, grammarAccess.getMindMapAccess().getMindMapKeyword_0());
                    		
                    // InternalMyDsl.g:83:3: (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==12) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalMyDsl.g:84:4: otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']'
                            {
                            otherlv_1=(Token)match(input,12,FOLLOW_4); 

                            				newLeafNode(otherlv_1, grammarAccess.getMindMapAccess().getLeftSquareBracketKeyword_1_0());
                            			
                            // InternalMyDsl.g:88:4: ( (lv_markers_2_0= ruleMarker ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==RULE_INT) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // InternalMyDsl.g:89:5: (lv_markers_2_0= ruleMarker )
                            	    {
                            	    // InternalMyDsl.g:89:5: (lv_markers_2_0= ruleMarker )
                            	    // InternalMyDsl.g:90:6: lv_markers_2_0= ruleMarker
                            	    {

                            	    						newCompositeNode(grammarAccess.getMindMapAccess().getMarkersMarkerParserRuleCall_1_1_0());
                            	    					
                            	    pushFollow(FOLLOW_4);
                            	    lv_markers_2_0=ruleMarker();

                            	    state._fsp--;


                            	    						if (current==null) {
                            	    							current = createModelElementForParent(grammarAccess.getMindMapRule());
                            	    						}
                            	    						add(
                            	    							current,
                            	    							"markers",
                            	    							lv_markers_2_0,
                            	    							"mindMap_CarteMentale.MyDsl.Marker");
                            	    						afterParserOrEnumRuleCall();
                            	    					

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop1;
                                }
                            } while (true);

                            otherlv_3=(Token)match(input,13,FOLLOW_3); 

                            				newLeafNode(otherlv_3, grammarAccess.getMindMapAccess().getRightSquareBracketKeyword_1_2());
                            			

                            }
                            break;

                    }

                    // InternalMyDsl.g:112:3: ( (lv_title_4_0= ruleCHAINE ) )
                    // InternalMyDsl.g:113:4: (lv_title_4_0= ruleCHAINE )
                    {
                    // InternalMyDsl.g:113:4: (lv_title_4_0= ruleCHAINE )
                    // InternalMyDsl.g:114:5: lv_title_4_0= ruleCHAINE
                    {

                    					newCompositeNode(grammarAccess.getMindMapAccess().getTitleCHAINEParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_title_4_0=ruleCHAINE();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMindMapRule());
                    					}
                    					set(
                    						current,
                    						"title",
                    						lv_title_4_0,
                    						"mindMap_CarteMentale.MyDsl.CHAINE");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }

                    // InternalMyDsl.g:131:3: ( (lv_centraltopic_5_0= ruleCentralTopic ) )
                    // InternalMyDsl.g:132:4: (lv_centraltopic_5_0= ruleCentralTopic )
                    {
                    // InternalMyDsl.g:132:4: (lv_centraltopic_5_0= ruleCentralTopic )
                    // InternalMyDsl.g:133:5: lv_centraltopic_5_0= ruleCentralTopic
                    {

                    					newCompositeNode(grammarAccess.getMindMapAccess().getCentraltopicCentralTopicParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_centraltopic_5_0=ruleCentralTopic();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMindMapRule());
                    					}
                    					set(
                    						current,
                    						"centraltopic",
                    						lv_centraltopic_5_0,
                    						"mindMap_CarteMentale.MyDsl.CentralTopic");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleMindMap"


    // $ANTLR start "entryRuleCentralTopic"
    // InternalMyDsl.g:154:1: entryRuleCentralTopic returns [EObject current=null] : iv_ruleCentralTopic= ruleCentralTopic EOF ;
    public final EObject entryRuleCentralTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCentralTopic = null;


        try {
            // InternalMyDsl.g:154:53: (iv_ruleCentralTopic= ruleCentralTopic EOF )
            // InternalMyDsl.g:155:2: iv_ruleCentralTopic= ruleCentralTopic EOF
            {
             newCompositeNode(grammarAccess.getCentralTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCentralTopic=ruleCentralTopic();

            state._fsp--;

             current =iv_ruleCentralTopic; 
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
    // $ANTLR end "entryRuleCentralTopic"


    // $ANTLR start "ruleCentralTopic"
    // InternalMyDsl.g:161:1: ruleCentralTopic returns [EObject current=null] : (otherlv_0= 'CentralTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_maintopic_5_0= ruleMainTopic ) )* ) ;
    public final EObject ruleCentralTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_markers_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_maintopic_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:167:2: ( (otherlv_0= 'CentralTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_maintopic_5_0= ruleMainTopic ) )* ) )
            // InternalMyDsl.g:168:2: (otherlv_0= 'CentralTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_maintopic_5_0= ruleMainTopic ) )* )
            {
            // InternalMyDsl.g:168:2: (otherlv_0= 'CentralTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_maintopic_5_0= ruleMainTopic ) )* )
            // InternalMyDsl.g:169:3: otherlv_0= 'CentralTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_maintopic_5_0= ruleMainTopic ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCentralTopicAccess().getCentralTopicKeyword_0());
            		
            // InternalMyDsl.g:173:3: (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:174:4: otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getCentralTopicAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMyDsl.g:178:4: ( (lv_markers_2_0= ruleMarker ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_INT) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:179:5: (lv_markers_2_0= ruleMarker )
                    	    {
                    	    // InternalMyDsl.g:179:5: (lv_markers_2_0= ruleMarker )
                    	    // InternalMyDsl.g:180:6: lv_markers_2_0= ruleMarker
                    	    {

                    	    						newCompositeNode(grammarAccess.getCentralTopicAccess().getMarkersMarkerParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_markers_2_0=ruleMarker();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCentralTopicRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"markers",
                    	    							lv_markers_2_0,
                    	    							"mindMap_CarteMentale.MyDsl.Marker");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getCentralTopicAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:202:3: ( (lv_name_4_0= ruleCHAINE ) )
            // InternalMyDsl.g:203:4: (lv_name_4_0= ruleCHAINE )
            {
            // InternalMyDsl.g:203:4: (lv_name_4_0= ruleCHAINE )
            // InternalMyDsl.g:204:5: lv_name_4_0= ruleCHAINE
            {

            					newCompositeNode(grammarAccess.getCentralTopicAccess().getNameCHAINEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleCHAINE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCentralTopicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"mindMap_CarteMentale.MyDsl.CHAINE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:221:3: ( (lv_maintopic_5_0= ruleMainTopic ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:222:4: (lv_maintopic_5_0= ruleMainTopic )
            	    {
            	    // InternalMyDsl.g:222:4: (lv_maintopic_5_0= ruleMainTopic )
            	    // InternalMyDsl.g:223:5: lv_maintopic_5_0= ruleMainTopic
            	    {

            	    					newCompositeNode(grammarAccess.getCentralTopicAccess().getMaintopicMainTopicParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_maintopic_5_0=ruleMainTopic();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCentralTopicRule());
            	    					}
            	    					add(
            	    						current,
            	    						"maintopic",
            	    						lv_maintopic_5_0,
            	    						"mindMap_CarteMentale.MyDsl.MainTopic");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleCentralTopic"


    // $ANTLR start "entryRuleMainTopic"
    // InternalMyDsl.g:244:1: entryRuleMainTopic returns [EObject current=null] : iv_ruleMainTopic= ruleMainTopic EOF ;
    public final EObject entryRuleMainTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainTopic = null;


        try {
            // InternalMyDsl.g:244:50: (iv_ruleMainTopic= ruleMainTopic EOF )
            // InternalMyDsl.g:245:2: iv_ruleMainTopic= ruleMainTopic EOF
            {
             newCompositeNode(grammarAccess.getMainTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainTopic=ruleMainTopic();

            state._fsp--;

             current =iv_ruleMainTopic; 
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
    // $ANTLR end "entryRuleMainTopic"


    // $ANTLR start "ruleMainTopic"
    // InternalMyDsl.g:251:1: ruleMainTopic returns [EObject current=null] : (otherlv_0= 'MainTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_subtopic_5_0= ruleSubTopic ) )* ) ;
    public final EObject ruleMainTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_markers_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_subtopic_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:257:2: ( (otherlv_0= 'MainTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_subtopic_5_0= ruleSubTopic ) )* ) )
            // InternalMyDsl.g:258:2: (otherlv_0= 'MainTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_subtopic_5_0= ruleSubTopic ) )* )
            {
            // InternalMyDsl.g:258:2: (otherlv_0= 'MainTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_subtopic_5_0= ruleSubTopic ) )* )
            // InternalMyDsl.g:259:3: otherlv_0= 'MainTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_subtopic_5_0= ruleSubTopic ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMainTopicAccess().getMainTopicKeyword_0());
            		
            // InternalMyDsl.g:263:3: (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:264:4: otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getMainTopicAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMyDsl.g:268:4: ( (lv_markers_2_0= ruleMarker ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==RULE_INT) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:269:5: (lv_markers_2_0= ruleMarker )
                    	    {
                    	    // InternalMyDsl.g:269:5: (lv_markers_2_0= ruleMarker )
                    	    // InternalMyDsl.g:270:6: lv_markers_2_0= ruleMarker
                    	    {

                    	    						newCompositeNode(grammarAccess.getMainTopicAccess().getMarkersMarkerParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_markers_2_0=ruleMarker();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMainTopicRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"markers",
                    	    							lv_markers_2_0,
                    	    							"mindMap_CarteMentale.MyDsl.Marker");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMainTopicAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:292:3: ( (lv_name_4_0= ruleCHAINE ) )
            // InternalMyDsl.g:293:4: (lv_name_4_0= ruleCHAINE )
            {
            // InternalMyDsl.g:293:4: (lv_name_4_0= ruleCHAINE )
            // InternalMyDsl.g:294:5: lv_name_4_0= ruleCHAINE
            {

            					newCompositeNode(grammarAccess.getMainTopicAccess().getNameCHAINEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_4_0=ruleCHAINE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainTopicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"mindMap_CarteMentale.MyDsl.CHAINE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:311:3: ( (lv_subtopic_5_0= ruleSubTopic ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:312:4: (lv_subtopic_5_0= ruleSubTopic )
            	    {
            	    // InternalMyDsl.g:312:4: (lv_subtopic_5_0= ruleSubTopic )
            	    // InternalMyDsl.g:313:5: lv_subtopic_5_0= ruleSubTopic
            	    {

            	    					newCompositeNode(grammarAccess.getMainTopicAccess().getSubtopicSubTopicParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_subtopic_5_0=ruleSubTopic();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainTopicRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subtopic",
            	    						lv_subtopic_5_0,
            	    						"mindMap_CarteMentale.MyDsl.SubTopic");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleMainTopic"


    // $ANTLR start "entryRuleSubTopic"
    // InternalMyDsl.g:334:1: entryRuleSubTopic returns [EObject current=null] : iv_ruleSubTopic= ruleSubTopic EOF ;
    public final EObject entryRuleSubTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubTopic = null;


        try {
            // InternalMyDsl.g:334:49: (iv_ruleSubTopic= ruleSubTopic EOF )
            // InternalMyDsl.g:335:2: iv_ruleSubTopic= ruleSubTopic EOF
            {
             newCompositeNode(grammarAccess.getSubTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubTopic=ruleSubTopic();

            state._fsp--;

             current =iv_ruleSubTopic; 
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
    // $ANTLR end "entryRuleSubTopic"


    // $ANTLR start "ruleSubTopic"
    // InternalMyDsl.g:341:1: ruleSubTopic returns [EObject current=null] : (otherlv_0= 'SubTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_subtopic_5_0= ruleSubTopic ) )* ) ;
    public final EObject ruleSubTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_markers_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_subtopic_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:347:2: ( (otherlv_0= 'SubTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_subtopic_5_0= ruleSubTopic ) )* ) )
            // InternalMyDsl.g:348:2: (otherlv_0= 'SubTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_subtopic_5_0= ruleSubTopic ) )* )
            {
            // InternalMyDsl.g:348:2: (otherlv_0= 'SubTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_subtopic_5_0= ruleSubTopic ) )* )
            // InternalMyDsl.g:349:3: otherlv_0= 'SubTopic' (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )? ( (lv_name_4_0= ruleCHAINE ) ) ( (lv_subtopic_5_0= ruleSubTopic ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubTopicAccess().getSubTopicKeyword_0());
            		
            // InternalMyDsl.g:353:3: (otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:354:4: otherlv_1= '[' ( (lv_markers_2_0= ruleMarker ) )* otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getSubTopicAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMyDsl.g:358:4: ( (lv_markers_2_0= ruleMarker ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_INT) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:359:5: (lv_markers_2_0= ruleMarker )
                    	    {
                    	    // InternalMyDsl.g:359:5: (lv_markers_2_0= ruleMarker )
                    	    // InternalMyDsl.g:360:6: lv_markers_2_0= ruleMarker
                    	    {

                    	    						newCompositeNode(grammarAccess.getSubTopicAccess().getMarkersMarkerParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_markers_2_0=ruleMarker();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSubTopicRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"markers",
                    	    							lv_markers_2_0,
                    	    							"mindMap_CarteMentale.MyDsl.Marker");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubTopicAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:382:3: ( (lv_name_4_0= ruleCHAINE ) )
            // InternalMyDsl.g:383:4: (lv_name_4_0= ruleCHAINE )
            {
            // InternalMyDsl.g:383:4: (lv_name_4_0= ruleCHAINE )
            // InternalMyDsl.g:384:5: lv_name_4_0= ruleCHAINE
            {

            					newCompositeNode(grammarAccess.getSubTopicAccess().getNameCHAINEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_4_0=ruleCHAINE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubTopicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"mindMap_CarteMentale.MyDsl.CHAINE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:401:3: ( (lv_subtopic_5_0= ruleSubTopic ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:402:4: (lv_subtopic_5_0= ruleSubTopic )
            	    {
            	    // InternalMyDsl.g:402:4: (lv_subtopic_5_0= ruleSubTopic )
            	    // InternalMyDsl.g:403:5: lv_subtopic_5_0= ruleSubTopic
            	    {

            	    					newCompositeNode(grammarAccess.getSubTopicAccess().getSubtopicSubTopicParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_subtopic_5_0=ruleSubTopic();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSubTopicRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subtopic",
            	    						lv_subtopic_5_0,
            	    						"mindMap_CarteMentale.MyDsl.SubTopic");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleSubTopic"


    // $ANTLR start "entryRuleMarker"
    // InternalMyDsl.g:424:1: entryRuleMarker returns [EObject current=null] : iv_ruleMarker= ruleMarker EOF ;
    public final EObject entryRuleMarker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMarker = null;


        try {
            // InternalMyDsl.g:424:47: (iv_ruleMarker= ruleMarker EOF )
            // InternalMyDsl.g:425:2: iv_ruleMarker= ruleMarker EOF
            {
             newCompositeNode(grammarAccess.getMarkerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMarker=ruleMarker();

            state._fsp--;

             current =iv_ruleMarker; 
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
    // $ANTLR end "entryRuleMarker"


    // $ANTLR start "ruleMarker"
    // InternalMyDsl.g:431:1: ruleMarker returns [EObject current=null] : ( (lv_symbol_0_0= ruleENTIER ) ) ;
    public final EObject ruleMarker() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_symbol_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:437:2: ( ( (lv_symbol_0_0= ruleENTIER ) ) )
            // InternalMyDsl.g:438:2: ( (lv_symbol_0_0= ruleENTIER ) )
            {
            // InternalMyDsl.g:438:2: ( (lv_symbol_0_0= ruleENTIER ) )
            // InternalMyDsl.g:439:3: (lv_symbol_0_0= ruleENTIER )
            {
            // InternalMyDsl.g:439:3: (lv_symbol_0_0= ruleENTIER )
            // InternalMyDsl.g:440:4: lv_symbol_0_0= ruleENTIER
            {

            				newCompositeNode(grammarAccess.getMarkerAccess().getSymbolENTIERParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_symbol_0_0=ruleENTIER();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getMarkerRule());
            				}
            				set(
            					current,
            					"symbol",
            					lv_symbol_0_0,
            					"mindMap_CarteMentale.MyDsl.ENTIER");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleMarker"


    // $ANTLR start "entryRuleENTIER"
    // InternalMyDsl.g:460:1: entryRuleENTIER returns [String current=null] : iv_ruleENTIER= ruleENTIER EOF ;
    public final String entryRuleENTIER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENTIER = null;


        try {
            // InternalMyDsl.g:460:46: (iv_ruleENTIER= ruleENTIER EOF )
            // InternalMyDsl.g:461:2: iv_ruleENTIER= ruleENTIER EOF
            {
             newCompositeNode(grammarAccess.getENTIERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENTIER=ruleENTIER();

            state._fsp--;

             current =iv_ruleENTIER.getText(); 
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
    // $ANTLR end "entryRuleENTIER"


    // $ANTLR start "ruleENTIER"
    // InternalMyDsl.g:467:1: ruleENTIER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT )+ ;
    public final AntlrDatatypeRuleToken ruleENTIER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:473:2: ( (this_INT_0= RULE_INT )+ )
            // InternalMyDsl.g:474:2: (this_INT_0= RULE_INT )+
            {
            // InternalMyDsl.g:474:2: (this_INT_0= RULE_INT )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_INT) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:475:3: this_INT_0= RULE_INT
            	    {
            	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            	    			current.merge(this_INT_0);
            	    		

            	    			newLeafNode(this_INT_0, grammarAccess.getENTIERAccess().getINTTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // $ANTLR end "ruleENTIER"


    // $ANTLR start "entryRuleCHAINE"
    // InternalMyDsl.g:486:1: entryRuleCHAINE returns [String current=null] : iv_ruleCHAINE= ruleCHAINE EOF ;
    public final String entryRuleCHAINE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCHAINE = null;


        try {
            // InternalMyDsl.g:486:46: (iv_ruleCHAINE= ruleCHAINE EOF )
            // InternalMyDsl.g:487:2: iv_ruleCHAINE= ruleCHAINE EOF
            {
             newCompositeNode(grammarAccess.getCHAINERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCHAINE=ruleCHAINE();

            state._fsp--;

             current =iv_ruleCHAINE.getText(); 
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
    // $ANTLR end "entryRuleCHAINE"


    // $ANTLR start "ruleCHAINE"
    // InternalMyDsl.g:493:1: ruleCHAINE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID )+ ;
    public final AntlrDatatypeRuleToken ruleCHAINE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:499:2: ( (this_ID_0= RULE_ID )+ )
            // InternalMyDsl.g:500:2: (this_ID_0= RULE_ID )+
            {
            // InternalMyDsl.g:500:2: (this_ID_0= RULE_ID )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:501:3: this_ID_0= RULE_ID
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    			current.merge(this_ID_0);
            	    		

            	    			newLeafNode(this_ID_0, grammarAccess.getCHAINEAccess().getIDTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // $ANTLR end "ruleCHAINE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});

}