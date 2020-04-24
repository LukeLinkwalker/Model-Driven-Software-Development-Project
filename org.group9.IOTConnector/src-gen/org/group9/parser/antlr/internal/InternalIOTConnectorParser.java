package org.group9.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.group9.services.IOTConnectorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalIOTConnectorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'define'", "'webserver'", "'('", "'host'", "'is'", "','", "'port'", "')'", "'wifi'", "'ssid'", "'password'", "'config'", "'board'", "'id'", "'use'", "'sensor'", "'external'", "'pin'", "'in'", "'out'", "'light'", "'temperature'", "'output'", "'sample'", "'when'", "'every'", "'filter'", "'with'", "'values'", "'process'", "'+'", "'-'", "'*'", "'/'", "'send'", "'samples'", "'AND'", "'OR'", "'>'", "'>='", "'=='", "'<='", "'<'", "'!='", "'millisecond'", "'second'", "'minute'", "'ms'", "'s'", "'m'", "'medianfilter'", "'meanfilter'"
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
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
    public static final int T__62=62;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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


        public InternalIOTConnectorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIOTConnectorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIOTConnectorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalIOTConnector.g"; }



     	private IOTConnectorGrammarAccess grammarAccess;

        public InternalIOTConnectorParser(TokenStream input, IOTConnectorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected IOTConnectorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalIOTConnector.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalIOTConnector.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalIOTConnector.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalIOTConnector.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_webserver_0_0= ruleWebserver ) ) ( (lv_wifis_1_0= ruleWifi ) )+ ( (lv_configs_2_0= ruleConfig ) )+ ( (lv_boards_3_0= ruleBoard ) )+ ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_webserver_0_0 = null;

        EObject lv_wifis_1_0 = null;

        EObject lv_configs_2_0 = null;

        EObject lv_boards_3_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:77:2: ( ( ( (lv_webserver_0_0= ruleWebserver ) ) ( (lv_wifis_1_0= ruleWifi ) )+ ( (lv_configs_2_0= ruleConfig ) )+ ( (lv_boards_3_0= ruleBoard ) )+ ) )
            // InternalIOTConnector.g:78:2: ( ( (lv_webserver_0_0= ruleWebserver ) ) ( (lv_wifis_1_0= ruleWifi ) )+ ( (lv_configs_2_0= ruleConfig ) )+ ( (lv_boards_3_0= ruleBoard ) )+ )
            {
            // InternalIOTConnector.g:78:2: ( ( (lv_webserver_0_0= ruleWebserver ) ) ( (lv_wifis_1_0= ruleWifi ) )+ ( (lv_configs_2_0= ruleConfig ) )+ ( (lv_boards_3_0= ruleBoard ) )+ )
            // InternalIOTConnector.g:79:3: ( (lv_webserver_0_0= ruleWebserver ) ) ( (lv_wifis_1_0= ruleWifi ) )+ ( (lv_configs_2_0= ruleConfig ) )+ ( (lv_boards_3_0= ruleBoard ) )+
            {
            // InternalIOTConnector.g:79:3: ( (lv_webserver_0_0= ruleWebserver ) )
            // InternalIOTConnector.g:80:4: (lv_webserver_0_0= ruleWebserver )
            {
            // InternalIOTConnector.g:80:4: (lv_webserver_0_0= ruleWebserver )
            // InternalIOTConnector.g:81:5: lv_webserver_0_0= ruleWebserver
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getWebserverWebserverParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_webserver_0_0=ruleWebserver();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"webserver",
            						lv_webserver_0_0,
            						"org.group9.IOTConnector.Webserver");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIOTConnector.g:98:3: ( (lv_wifis_1_0= ruleWifi ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalIOTConnector.g:99:4: (lv_wifis_1_0= ruleWifi )
            	    {
            	    // InternalIOTConnector.g:99:4: (lv_wifis_1_0= ruleWifi )
            	    // InternalIOTConnector.g:100:5: lv_wifis_1_0= ruleWifi
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getWifisWifiParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_wifis_1_0=ruleWifi();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"wifis",
            	    						lv_wifis_1_0,
            	    						"org.group9.IOTConnector.Wifi");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // InternalIOTConnector.g:117:3: ( (lv_configs_2_0= ruleConfig ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalIOTConnector.g:118:4: (lv_configs_2_0= ruleConfig )
            	    {
            	    // InternalIOTConnector.g:118:4: (lv_configs_2_0= ruleConfig )
            	    // InternalIOTConnector.g:119:5: lv_configs_2_0= ruleConfig
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getConfigsConfigParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_configs_2_0=ruleConfig();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"configs",
            	    						lv_configs_2_0,
            	    						"org.group9.IOTConnector.Config");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalIOTConnector.g:136:3: ( (lv_boards_3_0= ruleBoard ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalIOTConnector.g:137:4: (lv_boards_3_0= ruleBoard )
            	    {
            	    // InternalIOTConnector.g:137:4: (lv_boards_3_0= ruleBoard )
            	    // InternalIOTConnector.g:138:5: lv_boards_3_0= ruleBoard
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getBoardsBoardParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_boards_3_0=ruleBoard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"boards",
            	    						lv_boards_3_0,
            	    						"org.group9.IOTConnector.Board");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleWebserver"
    // InternalIOTConnector.g:159:1: entryRuleWebserver returns [EObject current=null] : iv_ruleWebserver= ruleWebserver EOF ;
    public final EObject entryRuleWebserver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebserver = null;


        try {
            // InternalIOTConnector.g:159:50: (iv_ruleWebserver= ruleWebserver EOF )
            // InternalIOTConnector.g:160:2: iv_ruleWebserver= ruleWebserver EOF
            {
             newCompositeNode(grammarAccess.getWebserverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebserver=ruleWebserver();

            state._fsp--;

             current =iv_ruleWebserver; 
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
    // $ANTLR end "entryRuleWebserver"


    // $ANTLR start "ruleWebserver"
    // InternalIOTConnector.g:166:1: ruleWebserver returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'webserver' otherlv_2= '(' otherlv_3= 'host' otherlv_4= 'is' ( (lv_url_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'port' otherlv_8= 'is' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' ) ;
    public final EObject ruleWebserver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_port_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalIOTConnector.g:172:2: ( (otherlv_0= 'define' otherlv_1= 'webserver' otherlv_2= '(' otherlv_3= 'host' otherlv_4= 'is' ( (lv_url_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'port' otherlv_8= 'is' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' ) )
            // InternalIOTConnector.g:173:2: (otherlv_0= 'define' otherlv_1= 'webserver' otherlv_2= '(' otherlv_3= 'host' otherlv_4= 'is' ( (lv_url_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'port' otherlv_8= 'is' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' )
            {
            // InternalIOTConnector.g:173:2: (otherlv_0= 'define' otherlv_1= 'webserver' otherlv_2= '(' otherlv_3= 'host' otherlv_4= 'is' ( (lv_url_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'port' otherlv_8= 'is' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')' )
            // InternalIOTConnector.g:174:3: otherlv_0= 'define' otherlv_1= 'webserver' otherlv_2= '(' otherlv_3= 'host' otherlv_4= 'is' ( (lv_url_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'port' otherlv_8= 'is' ( (lv_port_9_0= RULE_INT ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getWebserverAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWebserverAccess().getWebserverKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWebserverAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getWebserverAccess().getHostKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getWebserverAccess().getIsKeyword_4());
            		
            // InternalIOTConnector.g:194:3: ( (lv_url_5_0= RULE_STRING ) )
            // InternalIOTConnector.g:195:4: (lv_url_5_0= RULE_STRING )
            {
            // InternalIOTConnector.g:195:4: (lv_url_5_0= RULE_STRING )
            // InternalIOTConnector.g:196:5: lv_url_5_0= RULE_STRING
            {
            lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_url_5_0, grammarAccess.getWebserverAccess().getUrlSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWebserverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getWebserverAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getWebserverAccess().getPortKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getWebserverAccess().getIsKeyword_8());
            		
            // InternalIOTConnector.g:224:3: ( (lv_port_9_0= RULE_INT ) )
            // InternalIOTConnector.g:225:4: (lv_port_9_0= RULE_INT )
            {
            // InternalIOTConnector.g:225:4: (lv_port_9_0= RULE_INT )
            // InternalIOTConnector.g:226:5: lv_port_9_0= RULE_INT
            {
            lv_port_9_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_port_9_0, grammarAccess.getWebserverAccess().getPortINTTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWebserverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_9_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getWebserverAccess().getRightParenthesisKeyword_10());
            		

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
    // $ANTLR end "ruleWebserver"


    // $ANTLR start "entryRuleWifi"
    // InternalIOTConnector.g:250:1: entryRuleWifi returns [EObject current=null] : iv_ruleWifi= ruleWifi EOF ;
    public final EObject entryRuleWifi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWifi = null;


        try {
            // InternalIOTConnector.g:250:45: (iv_ruleWifi= ruleWifi EOF )
            // InternalIOTConnector.g:251:2: iv_ruleWifi= ruleWifi EOF
            {
             newCompositeNode(grammarAccess.getWifiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWifi=ruleWifi();

            state._fsp--;

             current =iv_ruleWifi; 
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
    // $ANTLR end "entryRuleWifi"


    // $ANTLR start "ruleWifi"
    // InternalIOTConnector.g:257:1: ruleWifi returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'wifi' otherlv_2= '(' otherlv_3= 'ssid' otherlv_4= 'is' ( (lv_ssid_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'password' otherlv_8= 'is' ( (lv_password_9_0= RULE_STRING ) ) otherlv_10= ')' ) ;
    public final EObject ruleWifi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_ssid_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_password_9_0=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalIOTConnector.g:263:2: ( (otherlv_0= 'define' otherlv_1= 'wifi' otherlv_2= '(' otherlv_3= 'ssid' otherlv_4= 'is' ( (lv_ssid_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'password' otherlv_8= 'is' ( (lv_password_9_0= RULE_STRING ) ) otherlv_10= ')' ) )
            // InternalIOTConnector.g:264:2: (otherlv_0= 'define' otherlv_1= 'wifi' otherlv_2= '(' otherlv_3= 'ssid' otherlv_4= 'is' ( (lv_ssid_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'password' otherlv_8= 'is' ( (lv_password_9_0= RULE_STRING ) ) otherlv_10= ')' )
            {
            // InternalIOTConnector.g:264:2: (otherlv_0= 'define' otherlv_1= 'wifi' otherlv_2= '(' otherlv_3= 'ssid' otherlv_4= 'is' ( (lv_ssid_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'password' otherlv_8= 'is' ( (lv_password_9_0= RULE_STRING ) ) otherlv_10= ')' )
            // InternalIOTConnector.g:265:3: otherlv_0= 'define' otherlv_1= 'wifi' otherlv_2= '(' otherlv_3= 'ssid' otherlv_4= 'is' ( (lv_ssid_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'password' otherlv_8= 'is' ( (lv_password_9_0= RULE_STRING ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getWifiAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWifiAccess().getWifiKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getWifiAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getWifiAccess().getSsidKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getWifiAccess().getIsKeyword_4());
            		
            // InternalIOTConnector.g:285:3: ( (lv_ssid_5_0= RULE_STRING ) )
            // InternalIOTConnector.g:286:4: (lv_ssid_5_0= RULE_STRING )
            {
            // InternalIOTConnector.g:286:4: (lv_ssid_5_0= RULE_STRING )
            // InternalIOTConnector.g:287:5: lv_ssid_5_0= RULE_STRING
            {
            lv_ssid_5_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_ssid_5_0, grammarAccess.getWifiAccess().getSsidSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ssid",
            						lv_ssid_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getWifiAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getWifiAccess().getPasswordKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getWifiAccess().getIsKeyword_8());
            		
            // InternalIOTConnector.g:315:3: ( (lv_password_9_0= RULE_STRING ) )
            // InternalIOTConnector.g:316:4: (lv_password_9_0= RULE_STRING )
            {
            // InternalIOTConnector.g:316:4: (lv_password_9_0= RULE_STRING )
            // InternalIOTConnector.g:317:5: lv_password_9_0= RULE_STRING
            {
            lv_password_9_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_password_9_0, grammarAccess.getWifiAccess().getPasswordSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWifiRule());
            					}
            					setWithLastConsumed(
            						current,
            						"password",
            						lv_password_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getWifiAccess().getRightParenthesisKeyword_10());
            		

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
    // $ANTLR end "ruleWifi"


    // $ANTLR start "entryRuleConfig"
    // InternalIOTConnector.g:341:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalIOTConnector.g:341:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalIOTConnector.g:342:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalIOTConnector.g:348:1: ruleConfig returns [EObject current=null] : (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sensors_2_0= ruleSensor ) )+ ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_sensors_2_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:354:2: ( (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sensors_2_0= ruleSensor ) )+ ) )
            // InternalIOTConnector.g:355:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sensors_2_0= ruleSensor ) )+ )
            {
            // InternalIOTConnector.g:355:2: (otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sensors_2_0= ruleSensor ) )+ )
            // InternalIOTConnector.g:356:3: otherlv_0= 'config' ( (lv_name_1_0= RULE_ID ) ) ( (lv_sensors_2_0= ruleSensor ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigAccess().getConfigKeyword_0());
            		
            // InternalIOTConnector.g:360:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalIOTConnector.g:361:4: (lv_name_1_0= RULE_ID )
            {
            // InternalIOTConnector.g:361:4: (lv_name_1_0= RULE_ID )
            // InternalIOTConnector.g:362:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalIOTConnector.g:378:3: ( (lv_sensors_2_0= ruleSensor ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==26) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalIOTConnector.g:379:4: (lv_sensors_2_0= ruleSensor )
            	    {
            	    // InternalIOTConnector.g:379:4: (lv_sensors_2_0= ruleSensor )
            	    // InternalIOTConnector.g:380:5: lv_sensors_2_0= ruleSensor
            	    {

            	    					newCompositeNode(grammarAccess.getConfigAccess().getSensorsSensorParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_sensors_2_0=ruleSensor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sensors",
            	    						lv_sensors_2_0,
            	    						"org.group9.IOTConnector.Sensor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleBoard"
    // InternalIOTConnector.g:401:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalIOTConnector.g:401:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalIOTConnector.g:402:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalIOTConnector.g:408:1: ruleBoard returns [EObject current=null] : (otherlv_0= 'board' (otherlv_1= '(' otherlv_2= 'id' otherlv_3= 'is' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ')' )? ( (lv_sensorConfigs_6_0= ruleSensorConfig ) )* otherlv_7= 'use' otherlv_8= 'config' ( (otherlv_9= RULE_ID ) ) ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_sensorConfigs_6_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:414:2: ( (otherlv_0= 'board' (otherlv_1= '(' otherlv_2= 'id' otherlv_3= 'is' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ')' )? ( (lv_sensorConfigs_6_0= ruleSensorConfig ) )* otherlv_7= 'use' otherlv_8= 'config' ( (otherlv_9= RULE_ID ) ) ) )
            // InternalIOTConnector.g:415:2: (otherlv_0= 'board' (otherlv_1= '(' otherlv_2= 'id' otherlv_3= 'is' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ')' )? ( (lv_sensorConfigs_6_0= ruleSensorConfig ) )* otherlv_7= 'use' otherlv_8= 'config' ( (otherlv_9= RULE_ID ) ) )
            {
            // InternalIOTConnector.g:415:2: (otherlv_0= 'board' (otherlv_1= '(' otherlv_2= 'id' otherlv_3= 'is' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ')' )? ( (lv_sensorConfigs_6_0= ruleSensorConfig ) )* otherlv_7= 'use' otherlv_8= 'config' ( (otherlv_9= RULE_ID ) ) )
            // InternalIOTConnector.g:416:3: otherlv_0= 'board' (otherlv_1= '(' otherlv_2= 'id' otherlv_3= 'is' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ')' )? ( (lv_sensorConfigs_6_0= ruleSensorConfig ) )* otherlv_7= 'use' otherlv_8= 'config' ( (otherlv_9= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		
            // InternalIOTConnector.g:420:3: (otherlv_1= '(' otherlv_2= 'id' otherlv_3= 'is' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalIOTConnector.g:421:4: otherlv_1= '(' otherlv_2= 'id' otherlv_3= 'is' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getBoardAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getIdKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getBoardAccess().getIsKeyword_1_2());
                    			
                    // InternalIOTConnector.g:433:4: ( (lv_name_4_0= RULE_STRING ) )
                    // InternalIOTConnector.g:434:5: (lv_name_4_0= RULE_STRING )
                    {
                    // InternalIOTConnector.g:434:5: (lv_name_4_0= RULE_STRING )
                    // InternalIOTConnector.g:435:6: lv_name_4_0= RULE_STRING
                    {
                    lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getBoardAccess().getNameSTRINGTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBoardRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_24); 

                    				newLeafNode(otherlv_5, grammarAccess.getBoardAccess().getRightParenthesisKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalIOTConnector.g:456:3: ( (lv_sensorConfigs_6_0= ruleSensorConfig ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalIOTConnector.g:457:4: (lv_sensorConfigs_6_0= ruleSensorConfig )
            	    {
            	    // InternalIOTConnector.g:457:4: (lv_sensorConfigs_6_0= ruleSensorConfig )
            	    // InternalIOTConnector.g:458:5: lv_sensorConfigs_6_0= ruleSensorConfig
            	    {

            	    					newCompositeNode(grammarAccess.getBoardAccess().getSensorConfigsSensorConfigParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_sensorConfigs_6_0=ruleSensorConfig();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBoardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sensorConfigs",
            	    						lv_sensorConfigs_6_0,
            	    						"org.group9.IOTConnector.SensorConfig");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getBoardAccess().getUseKeyword_3());
            		
            otherlv_8=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getBoardAccess().getConfigKeyword_4());
            		
            // InternalIOTConnector.g:483:3: ( (otherlv_9= RULE_ID ) )
            // InternalIOTConnector.g:484:4: (otherlv_9= RULE_ID )
            {
            // InternalIOTConnector.g:484:4: (otherlv_9= RULE_ID )
            // InternalIOTConnector.g:485:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_9, grammarAccess.getBoardAccess().getConfigNameConfigCrossReference_5_0());
            				

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
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleSensorConfig"
    // InternalIOTConnector.g:500:1: entryRuleSensorConfig returns [EObject current=null] : iv_ruleSensorConfig= ruleSensorConfig EOF ;
    public final EObject entryRuleSensorConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorConfig = null;


        try {
            // InternalIOTConnector.g:500:53: (iv_ruleSensorConfig= ruleSensorConfig EOF )
            // InternalIOTConnector.g:501:2: iv_ruleSensorConfig= ruleSensorConfig EOF
            {
             newCompositeNode(grammarAccess.getSensorConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorConfig=ruleSensorConfig();

            state._fsp--;

             current =iv_ruleSensorConfig; 
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
    // $ANTLR end "entryRuleSensorConfig"


    // $ANTLR start "ruleSensorConfig"
    // InternalIOTConnector.g:507:1: ruleSensorConfig returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= ruleSensorName ) ) (otherlv_2= 'external' otherlv_3= '(' otherlv_4= 'pin' otherlv_5= 'in' otherlv_6= 'is' ( (lv_pinIn_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'pin' otherlv_10= 'out' otherlv_11= 'is' ( (lv_pinOut_12_0= RULE_STRING ) ) otherlv_13= ')' )? ) ;
    public final EObject ruleSensorConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_pinIn_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_pinOut_12_0=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:513:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= ruleSensorName ) ) (otherlv_2= 'external' otherlv_3= '(' otherlv_4= 'pin' otherlv_5= 'in' otherlv_6= 'is' ( (lv_pinIn_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'pin' otherlv_10= 'out' otherlv_11= 'is' ( (lv_pinOut_12_0= RULE_STRING ) ) otherlv_13= ')' )? ) )
            // InternalIOTConnector.g:514:2: (otherlv_0= 'sensor' ( (lv_name_1_0= ruleSensorName ) ) (otherlv_2= 'external' otherlv_3= '(' otherlv_4= 'pin' otherlv_5= 'in' otherlv_6= 'is' ( (lv_pinIn_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'pin' otherlv_10= 'out' otherlv_11= 'is' ( (lv_pinOut_12_0= RULE_STRING ) ) otherlv_13= ')' )? )
            {
            // InternalIOTConnector.g:514:2: (otherlv_0= 'sensor' ( (lv_name_1_0= ruleSensorName ) ) (otherlv_2= 'external' otherlv_3= '(' otherlv_4= 'pin' otherlv_5= 'in' otherlv_6= 'is' ( (lv_pinIn_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'pin' otherlv_10= 'out' otherlv_11= 'is' ( (lv_pinOut_12_0= RULE_STRING ) ) otherlv_13= ')' )? )
            // InternalIOTConnector.g:515:3: otherlv_0= 'sensor' ( (lv_name_1_0= ruleSensorName ) ) (otherlv_2= 'external' otherlv_3= '(' otherlv_4= 'pin' otherlv_5= 'in' otherlv_6= 'is' ( (lv_pinIn_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'pin' otherlv_10= 'out' otherlv_11= 'is' ( (lv_pinOut_12_0= RULE_STRING ) ) otherlv_13= ')' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorConfigAccess().getSensorKeyword_0());
            		
            // InternalIOTConnector.g:519:3: ( (lv_name_1_0= ruleSensorName ) )
            // InternalIOTConnector.g:520:4: (lv_name_1_0= ruleSensorName )
            {
            // InternalIOTConnector.g:520:4: (lv_name_1_0= ruleSensorName )
            // InternalIOTConnector.g:521:5: lv_name_1_0= ruleSensorName
            {

            					newCompositeNode(grammarAccess.getSensorConfigAccess().getNameSensorNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_name_1_0=ruleSensorName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorConfigRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.group9.IOTConnector.SensorName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIOTConnector.g:538:3: (otherlv_2= 'external' otherlv_3= '(' otherlv_4= 'pin' otherlv_5= 'in' otherlv_6= 'is' ( (lv_pinIn_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'pin' otherlv_10= 'out' otherlv_11= 'is' ( (lv_pinOut_12_0= RULE_STRING ) ) otherlv_13= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalIOTConnector.g:539:4: otherlv_2= 'external' otherlv_3= '(' otherlv_4= 'pin' otherlv_5= 'in' otherlv_6= 'is' ( (lv_pinIn_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'pin' otherlv_10= 'out' otherlv_11= 'is' ( (lv_pinOut_12_0= RULE_STRING ) ) otherlv_13= ')'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getSensorConfigAccess().getExternalKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorConfigAccess().getLeftParenthesisKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorConfigAccess().getPinKeyword_2_2());
                    			
                    otherlv_5=(Token)match(input,29,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorConfigAccess().getInKeyword_2_3());
                    			
                    otherlv_6=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getSensorConfigAccess().getIsKeyword_2_4());
                    			
                    // InternalIOTConnector.g:559:4: ( (lv_pinIn_7_0= RULE_STRING ) )
                    // InternalIOTConnector.g:560:5: (lv_pinIn_7_0= RULE_STRING )
                    {
                    // InternalIOTConnector.g:560:5: (lv_pinIn_7_0= RULE_STRING )
                    // InternalIOTConnector.g:561:6: lv_pinIn_7_0= RULE_STRING
                    {
                    lv_pinIn_7_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_pinIn_7_0, grammarAccess.getSensorConfigAccess().getPinInSTRINGTerminalRuleCall_2_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorConfigRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pinIn",
                    							lv_pinIn_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,16,FOLLOW_28); 

                    				newLeafNode(otherlv_8, grammarAccess.getSensorConfigAccess().getCommaKeyword_2_6());
                    			
                    otherlv_9=(Token)match(input,28,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getSensorConfigAccess().getPinKeyword_2_7());
                    			
                    otherlv_10=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorConfigAccess().getOutKeyword_2_8());
                    			
                    otherlv_11=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getSensorConfigAccess().getIsKeyword_2_9());
                    			
                    // InternalIOTConnector.g:593:4: ( (lv_pinOut_12_0= RULE_STRING ) )
                    // InternalIOTConnector.g:594:5: (lv_pinOut_12_0= RULE_STRING )
                    {
                    // InternalIOTConnector.g:594:5: (lv_pinOut_12_0= RULE_STRING )
                    // InternalIOTConnector.g:595:6: lv_pinOut_12_0= RULE_STRING
                    {
                    lv_pinOut_12_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

                    						newLeafNode(lv_pinOut_12_0, grammarAccess.getSensorConfigAccess().getPinOutSTRINGTerminalRuleCall_2_10_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorConfigRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"pinOut",
                    							lv_pinOut_12_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_13=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getSensorConfigAccess().getRightParenthesisKeyword_2_11());
                    			

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
    // $ANTLR end "ruleSensorConfig"


    // $ANTLR start "entryRuleSensor"
    // InternalIOTConnector.g:620:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalIOTConnector.g:620:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalIOTConnector.g:621:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalIOTConnector.g:627:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'sensor' ( (lv_name_1_0= ruleSensorName ) ) ( (lv_type_2_0= 'external' ) )? ( (lv_output_3_0= ruleOutput ) ) ( (lv_functions_4_0= ruleFunction ) )+ ( (lv_send_5_0= ruleSend ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_2_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_output_3_0 = null;

        EObject lv_functions_4_0 = null;

        EObject lv_send_5_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:633:2: ( (otherlv_0= 'sensor' ( (lv_name_1_0= ruleSensorName ) ) ( (lv_type_2_0= 'external' ) )? ( (lv_output_3_0= ruleOutput ) ) ( (lv_functions_4_0= ruleFunction ) )+ ( (lv_send_5_0= ruleSend ) ) ) )
            // InternalIOTConnector.g:634:2: (otherlv_0= 'sensor' ( (lv_name_1_0= ruleSensorName ) ) ( (lv_type_2_0= 'external' ) )? ( (lv_output_3_0= ruleOutput ) ) ( (lv_functions_4_0= ruleFunction ) )+ ( (lv_send_5_0= ruleSend ) ) )
            {
            // InternalIOTConnector.g:634:2: (otherlv_0= 'sensor' ( (lv_name_1_0= ruleSensorName ) ) ( (lv_type_2_0= 'external' ) )? ( (lv_output_3_0= ruleOutput ) ) ( (lv_functions_4_0= ruleFunction ) )+ ( (lv_send_5_0= ruleSend ) ) )
            // InternalIOTConnector.g:635:3: otherlv_0= 'sensor' ( (lv_name_1_0= ruleSensorName ) ) ( (lv_type_2_0= 'external' ) )? ( (lv_output_3_0= ruleOutput ) ) ( (lv_functions_4_0= ruleFunction ) )+ ( (lv_send_5_0= ruleSend ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalIOTConnector.g:639:3: ( (lv_name_1_0= ruleSensorName ) )
            // InternalIOTConnector.g:640:4: (lv_name_1_0= ruleSensorName )
            {
            // InternalIOTConnector.g:640:4: (lv_name_1_0= ruleSensorName )
            // InternalIOTConnector.g:641:5: lv_name_1_0= ruleSensorName
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameSensorNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_1_0=ruleSensorName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.group9.IOTConnector.SensorName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIOTConnector.g:658:3: ( (lv_type_2_0= 'external' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalIOTConnector.g:659:4: (lv_type_2_0= 'external' )
                    {
                    // InternalIOTConnector.g:659:4: (lv_type_2_0= 'external' )
                    // InternalIOTConnector.g:660:5: lv_type_2_0= 'external'
                    {
                    lv_type_2_0=(Token)match(input,27,FOLLOW_31); 

                    					newLeafNode(lv_type_2_0, grammarAccess.getSensorAccess().getTypeExternalKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSensorRule());
                    					}
                    					setWithLastConsumed(current, "type", lv_type_2_0, "external");
                    				

                    }


                    }
                    break;

            }

            // InternalIOTConnector.g:672:3: ( (lv_output_3_0= ruleOutput ) )
            // InternalIOTConnector.g:673:4: (lv_output_3_0= ruleOutput )
            {
            // InternalIOTConnector.g:673:4: (lv_output_3_0= ruleOutput )
            // InternalIOTConnector.g:674:5: lv_output_3_0= ruleOutput
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getOutputOutputParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_output_3_0=ruleOutput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_3_0,
            						"org.group9.IOTConnector.Output");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIOTConnector.g:691:3: ( (lv_functions_4_0= ruleFunction ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==34||LA9_0==37||LA9_0==40) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalIOTConnector.g:692:4: (lv_functions_4_0= ruleFunction )
            	    {
            	    // InternalIOTConnector.g:692:4: (lv_functions_4_0= ruleFunction )
            	    // InternalIOTConnector.g:693:5: lv_functions_4_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getSensorAccess().getFunctionsFunctionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_functions_4_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSensorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_4_0,
            	    						"org.group9.IOTConnector.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalIOTConnector.g:710:3: ( (lv_send_5_0= ruleSend ) )
            // InternalIOTConnector.g:711:4: (lv_send_5_0= ruleSend )
            {
            // InternalIOTConnector.g:711:4: (lv_send_5_0= ruleSend )
            // InternalIOTConnector.g:712:5: lv_send_5_0= ruleSend
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSendSendParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_send_5_0=ruleSend();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"send",
            						lv_send_5_0,
            						"org.group9.IOTConnector.Send");
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleSensorName"
    // InternalIOTConnector.g:733:1: entryRuleSensorName returns [String current=null] : iv_ruleSensorName= ruleSensorName EOF ;
    public final String entryRuleSensorName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSensorName = null;


        try {
            // InternalIOTConnector.g:733:50: (iv_ruleSensorName= ruleSensorName EOF )
            // InternalIOTConnector.g:734:2: iv_ruleSensorName= ruleSensorName EOF
            {
             newCompositeNode(grammarAccess.getSensorNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorName=ruleSensorName();

            state._fsp--;

             current =iv_ruleSensorName.getText(); 
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
    // $ANTLR end "entryRuleSensorName"


    // $ANTLR start "ruleSensorName"
    // InternalIOTConnector.g:740:1: ruleSensorName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'light' | kw= 'temperature' ) ;
    public final AntlrDatatypeRuleToken ruleSensorName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalIOTConnector.g:746:2: ( (kw= 'light' | kw= 'temperature' ) )
            // InternalIOTConnector.g:747:2: (kw= 'light' | kw= 'temperature' )
            {
            // InternalIOTConnector.g:747:2: (kw= 'light' | kw= 'temperature' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalIOTConnector.g:748:3: kw= 'light'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSensorNameAccess().getLightKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalIOTConnector.g:754:3: kw= 'temperature'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getSensorNameAccess().getTemperatureKeyword_1());
                    		

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
    // $ANTLR end "ruleSensorName"


    // $ANTLR start "entryRuleOutput"
    // InternalIOTConnector.g:763:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalIOTConnector.g:763:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalIOTConnector.g:764:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalIOTConnector.g:770:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'output' ( (lv_readingNames_1_0= ruleReadingName ) ) (otherlv_2= ',' ( (lv_readingNames_3_0= ruleReadingName ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_readingNames_1_0 = null;

        EObject lv_readingNames_3_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:776:2: ( (otherlv_0= 'output' ( (lv_readingNames_1_0= ruleReadingName ) ) (otherlv_2= ',' ( (lv_readingNames_3_0= ruleReadingName ) ) )* ) )
            // InternalIOTConnector.g:777:2: (otherlv_0= 'output' ( (lv_readingNames_1_0= ruleReadingName ) ) (otherlv_2= ',' ( (lv_readingNames_3_0= ruleReadingName ) ) )* )
            {
            // InternalIOTConnector.g:777:2: (otherlv_0= 'output' ( (lv_readingNames_1_0= ruleReadingName ) ) (otherlv_2= ',' ( (lv_readingNames_3_0= ruleReadingName ) ) )* )
            // InternalIOTConnector.g:778:3: otherlv_0= 'output' ( (lv_readingNames_1_0= ruleReadingName ) ) (otherlv_2= ',' ( (lv_readingNames_3_0= ruleReadingName ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            // InternalIOTConnector.g:782:3: ( (lv_readingNames_1_0= ruleReadingName ) )
            // InternalIOTConnector.g:783:4: (lv_readingNames_1_0= ruleReadingName )
            {
            // InternalIOTConnector.g:783:4: (lv_readingNames_1_0= ruleReadingName )
            // InternalIOTConnector.g:784:5: lv_readingNames_1_0= ruleReadingName
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getReadingNamesReadingNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_34);
            lv_readingNames_1_0=ruleReadingName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					add(
            						current,
            						"readingNames",
            						lv_readingNames_1_0,
            						"org.group9.IOTConnector.ReadingName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIOTConnector.g:801:3: (otherlv_2= ',' ( (lv_readingNames_3_0= ruleReadingName ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalIOTConnector.g:802:4: otherlv_2= ',' ( (lv_readingNames_3_0= ruleReadingName ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalIOTConnector.g:806:4: ( (lv_readingNames_3_0= ruleReadingName ) )
            	    // InternalIOTConnector.g:807:5: (lv_readingNames_3_0= ruleReadingName )
            	    {
            	    // InternalIOTConnector.g:807:5: (lv_readingNames_3_0= ruleReadingName )
            	    // InternalIOTConnector.g:808:6: lv_readingNames_3_0= ruleReadingName
            	    {

            	    						newCompositeNode(grammarAccess.getOutputAccess().getReadingNamesReadingNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_34);
            	    lv_readingNames_3_0=ruleReadingName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"readingNames",
            	    							lv_readingNames_3_0,
            	    							"org.group9.IOTConnector.ReadingName");
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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleFunction"
    // InternalIOTConnector.g:830:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalIOTConnector.g:830:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalIOTConnector.g:831:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalIOTConnector.g:837:1: ruleFunction returns [EObject current=null] : (this_Sample_0= ruleSample | this_Filter_1= ruleFilter | this_Process_2= ruleProcess ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_Sample_0 = null;

        EObject this_Filter_1 = null;

        EObject this_Process_2 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:843:2: ( (this_Sample_0= ruleSample | this_Filter_1= ruleFilter | this_Process_2= ruleProcess ) )
            // InternalIOTConnector.g:844:2: (this_Sample_0= ruleSample | this_Filter_1= ruleFilter | this_Process_2= ruleProcess )
            {
            // InternalIOTConnector.g:844:2: (this_Sample_0= ruleSample | this_Filter_1= ruleFilter | this_Process_2= ruleProcess )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 37:
                {
                alt12=2;
                }
                break;
            case 40:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalIOTConnector.g:845:3: this_Sample_0= ruleSample
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getSampleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sample_0=ruleSample();

                    state._fsp--;


                    			current = this_Sample_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIOTConnector.g:854:3: this_Filter_1= ruleFilter
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getFilterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Filter_1=ruleFilter();

                    state._fsp--;


                    			current = this_Filter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIOTConnector.g:863:3: this_Process_2= ruleProcess
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getProcessParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Process_2=ruleProcess();

                    state._fsp--;


                    			current = this_Process_2;
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleSample"
    // InternalIOTConnector.g:875:1: entryRuleSample returns [EObject current=null] : iv_ruleSample= ruleSample EOF ;
    public final EObject entryRuleSample() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSample = null;


        try {
            // InternalIOTConnector.g:875:47: (iv_ruleSample= ruleSample EOF )
            // InternalIOTConnector.g:876:2: iv_ruleSample= ruleSample EOF
            {
             newCompositeNode(grammarAccess.getSampleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSample=ruleSample();

            state._fsp--;

             current =iv_ruleSample; 
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
    // $ANTLR end "entryRuleSample"


    // $ANTLR start "ruleSample"
    // InternalIOTConnector.g:882:1: ruleSample returns [EObject current=null] : (otherlv_0= 'sample' ( (lv_sampleActions_1_0= ruleSampleAction ) )+ ) ;
    public final EObject ruleSample() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sampleActions_1_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:888:2: ( (otherlv_0= 'sample' ( (lv_sampleActions_1_0= ruleSampleAction ) )+ ) )
            // InternalIOTConnector.g:889:2: (otherlv_0= 'sample' ( (lv_sampleActions_1_0= ruleSampleAction ) )+ )
            {
            // InternalIOTConnector.g:889:2: (otherlv_0= 'sample' ( (lv_sampleActions_1_0= ruleSampleAction ) )+ )
            // InternalIOTConnector.g:890:3: otherlv_0= 'sample' ( (lv_sampleActions_1_0= ruleSampleAction ) )+
            {
            otherlv_0=(Token)match(input,34,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSampleAccess().getSampleKeyword_0());
            		
            // InternalIOTConnector.g:894:3: ( (lv_sampleActions_1_0= ruleSampleAction ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalIOTConnector.g:895:4: (lv_sampleActions_1_0= ruleSampleAction )
            	    {
            	    // InternalIOTConnector.g:895:4: (lv_sampleActions_1_0= ruleSampleAction )
            	    // InternalIOTConnector.g:896:5: lv_sampleActions_1_0= ruleSampleAction
            	    {

            	    					newCompositeNode(grammarAccess.getSampleAccess().getSampleActionsSampleActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_sampleActions_1_0=ruleSampleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSampleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sampleActions",
            	    						lv_sampleActions_1_0,
            	    						"org.group9.IOTConnector.SampleAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // $ANTLR end "ruleSample"


    // $ANTLR start "entryRuleSampleAction"
    // InternalIOTConnector.g:917:1: entryRuleSampleAction returns [EObject current=null] : iv_ruleSampleAction= ruleSampleAction EOF ;
    public final EObject entryRuleSampleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSampleAction = null;


        try {
            // InternalIOTConnector.g:917:53: (iv_ruleSampleAction= ruleSampleAction EOF )
            // InternalIOTConnector.g:918:2: iv_ruleSampleAction= ruleSampleAction EOF
            {
             newCompositeNode(grammarAccess.getSampleActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSampleAction=ruleSampleAction();

            state._fsp--;

             current =iv_ruleSampleAction; 
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
    // $ANTLR end "entryRuleSampleAction"


    // $ANTLR start "ruleSampleAction"
    // InternalIOTConnector.g:924:1: ruleSampleAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'when' ( (lv_readingNameToCompare_2_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) ) )? otherlv_5= 'every' ( (lv_amountOfTime_6_0= RULE_INT ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) ) ;
    public final EObject ruleSampleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_number_4_0=null;
        Token otherlv_5=null;
        Token lv_amountOfTime_6_0=null;
        EObject lv_readingNameToCompare_2_0 = null;

        EObject lv_relationalOperator_3_0 = null;

        EObject lv_timeUnit_7_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:930:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'when' ( (lv_readingNameToCompare_2_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) ) )? otherlv_5= 'every' ( (lv_amountOfTime_6_0= RULE_INT ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) ) )
            // InternalIOTConnector.g:931:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'when' ( (lv_readingNameToCompare_2_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) ) )? otherlv_5= 'every' ( (lv_amountOfTime_6_0= RULE_INT ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )
            {
            // InternalIOTConnector.g:931:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'when' ( (lv_readingNameToCompare_2_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) ) )? otherlv_5= 'every' ( (lv_amountOfTime_6_0= RULE_INT ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) ) )
            // InternalIOTConnector.g:932:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= 'when' ( (lv_readingNameToCompare_2_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) ) )? otherlv_5= 'every' ( (lv_amountOfTime_6_0= RULE_INT ) ) ( (lv_timeUnit_7_0= ruleTimeUnit ) )
            {
            // InternalIOTConnector.g:932:3: ( (otherlv_0= RULE_ID ) )
            // InternalIOTConnector.g:933:4: (otherlv_0= RULE_ID )
            {
            // InternalIOTConnector.g:933:4: (otherlv_0= RULE_ID )
            // InternalIOTConnector.g:934:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSampleActionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_0, grammarAccess.getSampleActionAccess().getReadingNameReadingNameCrossReference_0_0());
            				

            }


            }

            // InternalIOTConnector.g:945:3: (otherlv_1= 'when' ( (lv_readingNameToCompare_2_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalIOTConnector.g:946:4: otherlv_1= 'when' ( (lv_readingNameToCompare_2_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getSampleActionAccess().getWhenKeyword_1_0());
                    			
                    // InternalIOTConnector.g:950:4: ( (lv_readingNameToCompare_2_0= ruleReadingNameWithConfigScope ) )
                    // InternalIOTConnector.g:951:5: (lv_readingNameToCompare_2_0= ruleReadingNameWithConfigScope )
                    {
                    // InternalIOTConnector.g:951:5: (lv_readingNameToCompare_2_0= ruleReadingNameWithConfigScope )
                    // InternalIOTConnector.g:952:6: lv_readingNameToCompare_2_0= ruleReadingNameWithConfigScope
                    {

                    						newCompositeNode(grammarAccess.getSampleActionAccess().getReadingNameToCompareReadingNameWithConfigScopeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_readingNameToCompare_2_0=ruleReadingNameWithConfigScope();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSampleActionRule());
                    						}
                    						set(
                    							current,
                    							"readingNameToCompare",
                    							lv_readingNameToCompare_2_0,
                    							"org.group9.IOTConnector.ReadingNameWithConfigScope");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIOTConnector.g:969:4: ( (lv_relationalOperator_3_0= ruleRelationalOperator ) )
                    // InternalIOTConnector.g:970:5: (lv_relationalOperator_3_0= ruleRelationalOperator )
                    {
                    // InternalIOTConnector.g:970:5: (lv_relationalOperator_3_0= ruleRelationalOperator )
                    // InternalIOTConnector.g:971:6: lv_relationalOperator_3_0= ruleRelationalOperator
                    {

                    						newCompositeNode(grammarAccess.getSampleActionAccess().getRelationalOperatorRelationalOperatorParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_relationalOperator_3_0=ruleRelationalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSampleActionRule());
                    						}
                    						set(
                    							current,
                    							"relationalOperator",
                    							lv_relationalOperator_3_0,
                    							"org.group9.IOTConnector.RelationalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIOTConnector.g:988:4: ( (lv_number_4_0= RULE_INT ) )
                    // InternalIOTConnector.g:989:5: (lv_number_4_0= RULE_INT )
                    {
                    // InternalIOTConnector.g:989:5: (lv_number_4_0= RULE_INT )
                    // InternalIOTConnector.g:990:6: lv_number_4_0= RULE_INT
                    {
                    lv_number_4_0=(Token)match(input,RULE_INT,FOLLOW_38); 

                    						newLeafNode(lv_number_4_0, grammarAccess.getSampleActionAccess().getNumberINTTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSampleActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getSampleActionAccess().getEveryKeyword_2());
            		
            // InternalIOTConnector.g:1011:3: ( (lv_amountOfTime_6_0= RULE_INT ) )
            // InternalIOTConnector.g:1012:4: (lv_amountOfTime_6_0= RULE_INT )
            {
            // InternalIOTConnector.g:1012:4: (lv_amountOfTime_6_0= RULE_INT )
            // InternalIOTConnector.g:1013:5: lv_amountOfTime_6_0= RULE_INT
            {
            lv_amountOfTime_6_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            					newLeafNode(lv_amountOfTime_6_0, grammarAccess.getSampleActionAccess().getAmountOfTimeINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSampleActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amountOfTime",
            						lv_amountOfTime_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalIOTConnector.g:1029:3: ( (lv_timeUnit_7_0= ruleTimeUnit ) )
            // InternalIOTConnector.g:1030:4: (lv_timeUnit_7_0= ruleTimeUnit )
            {
            // InternalIOTConnector.g:1030:4: (lv_timeUnit_7_0= ruleTimeUnit )
            // InternalIOTConnector.g:1031:5: lv_timeUnit_7_0= ruleTimeUnit
            {

            					newCompositeNode(grammarAccess.getSampleActionAccess().getTimeUnitTimeUnitParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_timeUnit_7_0=ruleTimeUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSampleActionRule());
            					}
            					set(
            						current,
            						"timeUnit",
            						lv_timeUnit_7_0,
            						"org.group9.IOTConnector.TimeUnit");
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
    // $ANTLR end "ruleSampleAction"


    // $ANTLR start "entryRuleFilter"
    // InternalIOTConnector.g:1052:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalIOTConnector.g:1052:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalIOTConnector.g:1053:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalIOTConnector.g:1059:1: ruleFilter returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_filterActions_1_0= ruleFilterAction ) )+ ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_filterActions_1_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1065:2: ( (otherlv_0= 'filter' ( (lv_filterActions_1_0= ruleFilterAction ) )+ ) )
            // InternalIOTConnector.g:1066:2: (otherlv_0= 'filter' ( (lv_filterActions_1_0= ruleFilterAction ) )+ )
            {
            // InternalIOTConnector.g:1066:2: (otherlv_0= 'filter' ( (lv_filterActions_1_0= ruleFilterAction ) )+ )
            // InternalIOTConnector.g:1067:3: otherlv_0= 'filter' ( (lv_filterActions_1_0= ruleFilterAction ) )+
            {
            otherlv_0=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterAccess().getFilterKeyword_0());
            		
            // InternalIOTConnector.g:1071:3: ( (lv_filterActions_1_0= ruleFilterAction ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalIOTConnector.g:1072:4: (lv_filterActions_1_0= ruleFilterAction )
            	    {
            	    // InternalIOTConnector.g:1072:4: (lv_filterActions_1_0= ruleFilterAction )
            	    // InternalIOTConnector.g:1073:5: lv_filterActions_1_0= ruleFilterAction
            	    {

            	    					newCompositeNode(grammarAccess.getFilterAccess().getFilterActionsFilterActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_filterActions_1_0=ruleFilterAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFilterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"filterActions",
            	    						lv_filterActions_1_0,
            	    						"org.group9.IOTConnector.FilterAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleFilterAction"
    // InternalIOTConnector.g:1094:1: entryRuleFilterAction returns [EObject current=null] : iv_ruleFilterAction= ruleFilterAction EOF ;
    public final EObject entryRuleFilterAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterAction = null;


        try {
            // InternalIOTConnector.g:1094:53: (iv_ruleFilterAction= ruleFilterAction EOF )
            // InternalIOTConnector.g:1095:2: iv_ruleFilterAction= ruleFilterAction EOF
            {
             newCompositeNode(grammarAccess.getFilterActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterAction=ruleFilterAction();

            state._fsp--;

             current =iv_ruleFilterAction; 
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
    // $ANTLR end "entryRuleFilterAction"


    // $ANTLR start "ruleFilterAction"
    // InternalIOTConnector.g:1101:1: ruleFilterAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'use' ( ( ( (lv_filterType_2_0= ruleFilterType ) ) otherlv_3= 'with' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'values' ) | ( (lv_filterExp_6_0= ruleFilterExp ) ) ) ) ;
    public final EObject ruleFilterAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_number_4_0=null;
        Token otherlv_5=null;
        EObject lv_filterType_2_0 = null;

        EObject lv_filterExp_6_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1107:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'use' ( ( ( (lv_filterType_2_0= ruleFilterType ) ) otherlv_3= 'with' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'values' ) | ( (lv_filterExp_6_0= ruleFilterExp ) ) ) ) )
            // InternalIOTConnector.g:1108:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'use' ( ( ( (lv_filterType_2_0= ruleFilterType ) ) otherlv_3= 'with' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'values' ) | ( (lv_filterExp_6_0= ruleFilterExp ) ) ) )
            {
            // InternalIOTConnector.g:1108:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'use' ( ( ( (lv_filterType_2_0= ruleFilterType ) ) otherlv_3= 'with' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'values' ) | ( (lv_filterExp_6_0= ruleFilterExp ) ) ) )
            // InternalIOTConnector.g:1109:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'use' ( ( ( (lv_filterType_2_0= ruleFilterType ) ) otherlv_3= 'with' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'values' ) | ( (lv_filterExp_6_0= ruleFilterExp ) ) )
            {
            // InternalIOTConnector.g:1109:3: ( (otherlv_0= RULE_ID ) )
            // InternalIOTConnector.g:1110:4: (otherlv_0= RULE_ID )
            {
            // InternalIOTConnector.g:1110:4: (otherlv_0= RULE_ID )
            // InternalIOTConnector.g:1111:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterActionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_40); 

            					newLeafNode(otherlv_0, grammarAccess.getFilterActionAccess().getReadingNameReadingNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterActionAccess().getUseKeyword_1());
            		
            // InternalIOTConnector.g:1126:3: ( ( ( (lv_filterType_2_0= ruleFilterType ) ) otherlv_3= 'with' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'values' ) | ( (lv_filterExp_6_0= ruleFilterExp ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=61 && LA16_0<=62)) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalIOTConnector.g:1127:4: ( ( (lv_filterType_2_0= ruleFilterType ) ) otherlv_3= 'with' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'values' )
                    {
                    // InternalIOTConnector.g:1127:4: ( ( (lv_filterType_2_0= ruleFilterType ) ) otherlv_3= 'with' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'values' )
                    // InternalIOTConnector.g:1128:5: ( (lv_filterType_2_0= ruleFilterType ) ) otherlv_3= 'with' ( (lv_number_4_0= RULE_INT ) ) otherlv_5= 'values'
                    {
                    // InternalIOTConnector.g:1128:5: ( (lv_filterType_2_0= ruleFilterType ) )
                    // InternalIOTConnector.g:1129:6: (lv_filterType_2_0= ruleFilterType )
                    {
                    // InternalIOTConnector.g:1129:6: (lv_filterType_2_0= ruleFilterType )
                    // InternalIOTConnector.g:1130:7: lv_filterType_2_0= ruleFilterType
                    {

                    							newCompositeNode(grammarAccess.getFilterActionAccess().getFilterTypeFilterTypeParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_42);
                    lv_filterType_2_0=ruleFilterType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFilterActionRule());
                    							}
                    							set(
                    								current,
                    								"filterType",
                    								lv_filterType_2_0,
                    								"org.group9.IOTConnector.FilterType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,38,FOLLOW_14); 

                    					newLeafNode(otherlv_3, grammarAccess.getFilterActionAccess().getWithKeyword_2_0_1());
                    				
                    // InternalIOTConnector.g:1151:5: ( (lv_number_4_0= RULE_INT ) )
                    // InternalIOTConnector.g:1152:6: (lv_number_4_0= RULE_INT )
                    {
                    // InternalIOTConnector.g:1152:6: (lv_number_4_0= RULE_INT )
                    // InternalIOTConnector.g:1153:7: lv_number_4_0= RULE_INT
                    {
                    lv_number_4_0=(Token)match(input,RULE_INT,FOLLOW_43); 

                    							newLeafNode(lv_number_4_0, grammarAccess.getFilterActionAccess().getNumberINTTerminalRuleCall_2_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getFilterActionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"number",
                    								lv_number_4_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getFilterActionAccess().getValuesKeyword_2_0_3());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalIOTConnector.g:1175:4: ( (lv_filterExp_6_0= ruleFilterExp ) )
                    {
                    // InternalIOTConnector.g:1175:4: ( (lv_filterExp_6_0= ruleFilterExp ) )
                    // InternalIOTConnector.g:1176:5: (lv_filterExp_6_0= ruleFilterExp )
                    {
                    // InternalIOTConnector.g:1176:5: (lv_filterExp_6_0= ruleFilterExp )
                    // InternalIOTConnector.g:1177:6: lv_filterExp_6_0= ruleFilterExp
                    {

                    						newCompositeNode(grammarAccess.getFilterActionAccess().getFilterExpFilterExpParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_filterExp_6_0=ruleFilterExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilterActionRule());
                    						}
                    						set(
                    							current,
                    							"filterExp",
                    							lv_filterExp_6_0,
                    							"org.group9.IOTConnector.FilterExp");
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
    // $ANTLR end "ruleFilterAction"


    // $ANTLR start "entryRuleFilterExp"
    // InternalIOTConnector.g:1199:1: entryRuleFilterExp returns [EObject current=null] : iv_ruleFilterExp= ruleFilterExp EOF ;
    public final EObject entryRuleFilterExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterExp = null;


        try {
            // InternalIOTConnector.g:1199:50: (iv_ruleFilterExp= ruleFilterExp EOF )
            // InternalIOTConnector.g:1200:2: iv_ruleFilterExp= ruleFilterExp EOF
            {
             newCompositeNode(grammarAccess.getFilterExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterExp=ruleFilterExp();

            state._fsp--;

             current =iv_ruleFilterExp; 
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
    // $ANTLR end "entryRuleFilterExp"


    // $ANTLR start "ruleFilterExp"
    // InternalIOTConnector.g:1206:1: ruleFilterExp returns [EObject current=null] : ( ( (lv_readingName_0_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_1_0= ruleRelationalOperator ) ) ( (lv_number_2_0= RULE_INT ) ) ( ( (lv_bitwiseOperator_3_0= ruleBitwiseOperator ) ) ( (lv_filterExp_4_0= ruleFilterExp ) ) )? ) ;
    public final EObject ruleFilterExp() throws RecognitionException {
        EObject current = null;

        Token lv_number_2_0=null;
        EObject lv_readingName_0_0 = null;

        EObject lv_relationalOperator_1_0 = null;

        EObject lv_bitwiseOperator_3_0 = null;

        EObject lv_filterExp_4_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1212:2: ( ( ( (lv_readingName_0_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_1_0= ruleRelationalOperator ) ) ( (lv_number_2_0= RULE_INT ) ) ( ( (lv_bitwiseOperator_3_0= ruleBitwiseOperator ) ) ( (lv_filterExp_4_0= ruleFilterExp ) ) )? ) )
            // InternalIOTConnector.g:1213:2: ( ( (lv_readingName_0_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_1_0= ruleRelationalOperator ) ) ( (lv_number_2_0= RULE_INT ) ) ( ( (lv_bitwiseOperator_3_0= ruleBitwiseOperator ) ) ( (lv_filterExp_4_0= ruleFilterExp ) ) )? )
            {
            // InternalIOTConnector.g:1213:2: ( ( (lv_readingName_0_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_1_0= ruleRelationalOperator ) ) ( (lv_number_2_0= RULE_INT ) ) ( ( (lv_bitwiseOperator_3_0= ruleBitwiseOperator ) ) ( (lv_filterExp_4_0= ruleFilterExp ) ) )? )
            // InternalIOTConnector.g:1214:3: ( (lv_readingName_0_0= ruleReadingNameWithConfigScope ) ) ( (lv_relationalOperator_1_0= ruleRelationalOperator ) ) ( (lv_number_2_0= RULE_INT ) ) ( ( (lv_bitwiseOperator_3_0= ruleBitwiseOperator ) ) ( (lv_filterExp_4_0= ruleFilterExp ) ) )?
            {
            // InternalIOTConnector.g:1214:3: ( (lv_readingName_0_0= ruleReadingNameWithConfigScope ) )
            // InternalIOTConnector.g:1215:4: (lv_readingName_0_0= ruleReadingNameWithConfigScope )
            {
            // InternalIOTConnector.g:1215:4: (lv_readingName_0_0= ruleReadingNameWithConfigScope )
            // InternalIOTConnector.g:1216:5: lv_readingName_0_0= ruleReadingNameWithConfigScope
            {

            					newCompositeNode(grammarAccess.getFilterExpAccess().getReadingNameReadingNameWithConfigScopeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_readingName_0_0=ruleReadingNameWithConfigScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterExpRule());
            					}
            					set(
            						current,
            						"readingName",
            						lv_readingName_0_0,
            						"org.group9.IOTConnector.ReadingNameWithConfigScope");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIOTConnector.g:1233:3: ( (lv_relationalOperator_1_0= ruleRelationalOperator ) )
            // InternalIOTConnector.g:1234:4: (lv_relationalOperator_1_0= ruleRelationalOperator )
            {
            // InternalIOTConnector.g:1234:4: (lv_relationalOperator_1_0= ruleRelationalOperator )
            // InternalIOTConnector.g:1235:5: lv_relationalOperator_1_0= ruleRelationalOperator
            {

            					newCompositeNode(grammarAccess.getFilterExpAccess().getRelationalOperatorRelationalOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_relationalOperator_1_0=ruleRelationalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterExpRule());
            					}
            					set(
            						current,
            						"relationalOperator",
            						lv_relationalOperator_1_0,
            						"org.group9.IOTConnector.RelationalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIOTConnector.g:1252:3: ( (lv_number_2_0= RULE_INT ) )
            // InternalIOTConnector.g:1253:4: (lv_number_2_0= RULE_INT )
            {
            // InternalIOTConnector.g:1253:4: (lv_number_2_0= RULE_INT )
            // InternalIOTConnector.g:1254:5: lv_number_2_0= RULE_INT
            {
            lv_number_2_0=(Token)match(input,RULE_INT,FOLLOW_44); 

            					newLeafNode(lv_number_2_0, grammarAccess.getFilterExpAccess().getNumberINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalIOTConnector.g:1270:3: ( ( (lv_bitwiseOperator_3_0= ruleBitwiseOperator ) ) ( (lv_filterExp_4_0= ruleFilterExp ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=47 && LA17_0<=48)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalIOTConnector.g:1271:4: ( (lv_bitwiseOperator_3_0= ruleBitwiseOperator ) ) ( (lv_filterExp_4_0= ruleFilterExp ) )
                    {
                    // InternalIOTConnector.g:1271:4: ( (lv_bitwiseOperator_3_0= ruleBitwiseOperator ) )
                    // InternalIOTConnector.g:1272:5: (lv_bitwiseOperator_3_0= ruleBitwiseOperator )
                    {
                    // InternalIOTConnector.g:1272:5: (lv_bitwiseOperator_3_0= ruleBitwiseOperator )
                    // InternalIOTConnector.g:1273:6: lv_bitwiseOperator_3_0= ruleBitwiseOperator
                    {

                    						newCompositeNode(grammarAccess.getFilterExpAccess().getBitwiseOperatorBitwiseOperatorParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_bitwiseOperator_3_0=ruleBitwiseOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilterExpRule());
                    						}
                    						set(
                    							current,
                    							"bitwiseOperator",
                    							lv_bitwiseOperator_3_0,
                    							"org.group9.IOTConnector.BitwiseOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalIOTConnector.g:1290:4: ( (lv_filterExp_4_0= ruleFilterExp ) )
                    // InternalIOTConnector.g:1291:5: (lv_filterExp_4_0= ruleFilterExp )
                    {
                    // InternalIOTConnector.g:1291:5: (lv_filterExp_4_0= ruleFilterExp )
                    // InternalIOTConnector.g:1292:6: lv_filterExp_4_0= ruleFilterExp
                    {

                    						newCompositeNode(grammarAccess.getFilterExpAccess().getFilterExpFilterExpParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_filterExp_4_0=ruleFilterExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilterExpRule());
                    						}
                    						set(
                    							current,
                    							"filterExp",
                    							lv_filterExp_4_0,
                    							"org.group9.IOTConnector.FilterExp");
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
    // $ANTLR end "ruleFilterExp"


    // $ANTLR start "entryRuleProcess"
    // InternalIOTConnector.g:1314:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalIOTConnector.g:1314:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalIOTConnector.g:1315:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalIOTConnector.g:1321:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_processActions_1_0= ruleProcessAction ) )+ ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_processActions_1_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1327:2: ( (otherlv_0= 'process' ( (lv_processActions_1_0= ruleProcessAction ) )+ ) )
            // InternalIOTConnector.g:1328:2: (otherlv_0= 'process' ( (lv_processActions_1_0= ruleProcessAction ) )+ )
            {
            // InternalIOTConnector.g:1328:2: (otherlv_0= 'process' ( (lv_processActions_1_0= ruleProcessAction ) )+ )
            // InternalIOTConnector.g:1329:3: otherlv_0= 'process' ( (lv_processActions_1_0= ruleProcessAction ) )+
            {
            otherlv_0=(Token)match(input,40,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalIOTConnector.g:1333:3: ( (lv_processActions_1_0= ruleProcessAction ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalIOTConnector.g:1334:4: (lv_processActions_1_0= ruleProcessAction )
            	    {
            	    // InternalIOTConnector.g:1334:4: (lv_processActions_1_0= ruleProcessAction )
            	    // InternalIOTConnector.g:1335:5: lv_processActions_1_0= ruleProcessAction
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getProcessActionsProcessActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_processActions_1_0=ruleProcessAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processActions",
            	    						lv_processActions_1_0,
            	    						"org.group9.IOTConnector.ProcessAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessAction"
    // InternalIOTConnector.g:1356:1: entryRuleProcessAction returns [EObject current=null] : iv_ruleProcessAction= ruleProcessAction EOF ;
    public final EObject entryRuleProcessAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessAction = null;


        try {
            // InternalIOTConnector.g:1356:54: (iv_ruleProcessAction= ruleProcessAction EOF )
            // InternalIOTConnector.g:1357:2: iv_ruleProcessAction= ruleProcessAction EOF
            {
             newCompositeNode(grammarAccess.getProcessActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessAction=ruleProcessAction();

            state._fsp--;

             current =iv_ruleProcessAction; 
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
    // $ANTLR end "entryRuleProcessAction"


    // $ANTLR start "ruleProcessAction"
    // InternalIOTConnector.g:1363:1: ruleProcessAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleProcessAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1369:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalIOTConnector.g:1370:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalIOTConnector.g:1370:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) ) )
            // InternalIOTConnector.g:1371:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'is' ( (lv_exp_2_0= ruleExp ) )
            {
            // InternalIOTConnector.g:1371:3: ( (otherlv_0= RULE_ID ) )
            // InternalIOTConnector.g:1372:4: (otherlv_0= RULE_ID )
            {
            // InternalIOTConnector.g:1372:4: (otherlv_0= RULE_ID )
            // InternalIOTConnector.g:1373:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessActionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getProcessActionAccess().getReadingNameReadingNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessActionAccess().getIsKeyword_1());
            		
            // InternalIOTConnector.g:1388:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalIOTConnector.g:1389:4: (lv_exp_2_0= ruleExp )
            {
            // InternalIOTConnector.g:1389:4: (lv_exp_2_0= ruleExp )
            // InternalIOTConnector.g:1390:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getProcessActionAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcessActionRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"org.group9.IOTConnector.Exp");
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
    // $ANTLR end "ruleProcessAction"


    // $ANTLR start "entryRuleExp"
    // InternalIOTConnector.g:1411:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalIOTConnector.g:1411:44: (iv_ruleExp= ruleExp EOF )
            // InternalIOTConnector.g:1412:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalIOTConnector.g:1418:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1424:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalIOTConnector.g:1425:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalIOTConnector.g:1425:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalIOTConnector.g:1426:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_46);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIOTConnector.g:1434:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=41 && LA20_0<=42)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalIOTConnector.g:1435:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalIOTConnector.g:1435:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==41) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==42) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalIOTConnector.g:1436:5: (otherlv_1= '+' () )
            	            {
            	            // InternalIOTConnector.g:1436:5: (otherlv_1= '+' () )
            	            // InternalIOTConnector.g:1437:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,41,FOLLOW_45); 

            	            						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalIOTConnector.g:1441:6: ()
            	            // InternalIOTConnector.g:1442:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalIOTConnector.g:1450:5: (otherlv_3= '-' () )
            	            {
            	            // InternalIOTConnector.g:1450:5: (otherlv_3= '-' () )
            	            // InternalIOTConnector.g:1451:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,42,FOLLOW_45); 

            	            						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalIOTConnector.g:1455:6: ()
            	            // InternalIOTConnector.g:1456:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalIOTConnector.g:1464:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalIOTConnector.g:1465:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalIOTConnector.g:1465:5: (lv_right_5_0= ruleFactor )
            	    // InternalIOTConnector.g:1466:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.group9.IOTConnector.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalIOTConnector.g:1488:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalIOTConnector.g:1488:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalIOTConnector.g:1489:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalIOTConnector.g:1495:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1501:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalIOTConnector.g:1502:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalIOTConnector.g:1502:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalIOTConnector.g:1503:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalIOTConnector.g:1511:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=43 && LA22_0<=44)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalIOTConnector.g:1512:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalIOTConnector.g:1512:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==43) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==44) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalIOTConnector.g:1513:5: (otherlv_1= '*' () )
            	            {
            	            // InternalIOTConnector.g:1513:5: (otherlv_1= '*' () )
            	            // InternalIOTConnector.g:1514:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,43,FOLLOW_45); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalIOTConnector.g:1518:6: ()
            	            // InternalIOTConnector.g:1519:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalIOTConnector.g:1527:5: (otherlv_3= '/' () )
            	            {
            	            // InternalIOTConnector.g:1527:5: (otherlv_3= '/' () )
            	            // InternalIOTConnector.g:1528:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,44,FOLLOW_45); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalIOTConnector.g:1532:6: ()
            	            // InternalIOTConnector.g:1533:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalIOTConnector.g:1541:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalIOTConnector.g:1542:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalIOTConnector.g:1542:5: (lv_right_5_0= rulePrimary )
            	    // InternalIOTConnector.g:1543:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.group9.IOTConnector.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalIOTConnector.g:1565:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalIOTConnector.g:1565:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalIOTConnector.g:1566:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalIOTConnector.g:1572:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Variable_2= ruleVariable ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_Variable_2 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1578:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Variable_2= ruleVariable ) )
            // InternalIOTConnector.g:1579:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Variable_2= ruleVariable )
            {
            // InternalIOTConnector.g:1579:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Variable_2= ruleVariable )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt23=1;
                }
                break;
            case 13:
                {
                alt23=2;
                }
                break;
            case RULE_ID:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalIOTConnector.g:1580:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalIOTConnector.g:1589:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalIOTConnector.g:1598:3: this_Variable_2= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_2=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_2;
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleNumber"
    // InternalIOTConnector.g:1610:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalIOTConnector.g:1610:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalIOTConnector.g:1611:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalIOTConnector.g:1617:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalIOTConnector.g:1623:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalIOTConnector.g:1624:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalIOTConnector.g:1624:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalIOTConnector.g:1625:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalIOTConnector.g:1625:3: ()
            // InternalIOTConnector.g:1626:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalIOTConnector.g:1632:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalIOTConnector.g:1633:4: (lv_value_1_0= RULE_INT )
            {
            // InternalIOTConnector.g:1633:4: (lv_value_1_0= RULE_INT )
            // InternalIOTConnector.g:1634:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleParenthesis"
    // InternalIOTConnector.g:1654:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalIOTConnector.g:1654:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalIOTConnector.g:1655:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalIOTConnector.g:1661:1: ruleParenthesis returns [EObject current=null] : (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Exp_1 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1667:2: ( (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' ) )
            // InternalIOTConnector.g:1668:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            {
            // InternalIOTConnector.g:1668:2: (otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')' )
            // InternalIOTConnector.g:1669:3: otherlv_0= '(' this_Exp_1= ruleExp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1());
            		
            pushFollow(FOLLOW_15);
            this_Exp_1=ruleExp();

            state._fsp--;


            			current = this_Exp_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleVariable"
    // InternalIOTConnector.g:1689:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalIOTConnector.g:1689:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalIOTConnector.g:1690:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalIOTConnector.g:1696:1: ruleVariable returns [EObject current=null] : ( () ( (lv_readingName_1_0= ruleReadingNameWithConfigScope ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        EObject lv_readingName_1_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1702:2: ( ( () ( (lv_readingName_1_0= ruleReadingNameWithConfigScope ) ) ) )
            // InternalIOTConnector.g:1703:2: ( () ( (lv_readingName_1_0= ruleReadingNameWithConfigScope ) ) )
            {
            // InternalIOTConnector.g:1703:2: ( () ( (lv_readingName_1_0= ruleReadingNameWithConfigScope ) ) )
            // InternalIOTConnector.g:1704:3: () ( (lv_readingName_1_0= ruleReadingNameWithConfigScope ) )
            {
            // InternalIOTConnector.g:1704:3: ()
            // InternalIOTConnector.g:1705:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVarAction_0(),
            					current);
            			

            }

            // InternalIOTConnector.g:1711:3: ( (lv_readingName_1_0= ruleReadingNameWithConfigScope ) )
            // InternalIOTConnector.g:1712:4: (lv_readingName_1_0= ruleReadingNameWithConfigScope )
            {
            // InternalIOTConnector.g:1712:4: (lv_readingName_1_0= ruleReadingNameWithConfigScope )
            // InternalIOTConnector.g:1713:5: lv_readingName_1_0= ruleReadingNameWithConfigScope
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getReadingNameReadingNameWithConfigScopeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_readingName_1_0=ruleReadingNameWithConfigScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"readingName",
            						lv_readingName_1_0,
            						"org.group9.IOTConnector.ReadingNameWithConfigScope");
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleSend"
    // InternalIOTConnector.g:1734:1: entryRuleSend returns [EObject current=null] : iv_ruleSend= ruleSend EOF ;
    public final EObject entryRuleSend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSend = null;


        try {
            // InternalIOTConnector.g:1734:45: (iv_ruleSend= ruleSend EOF )
            // InternalIOTConnector.g:1735:2: iv_ruleSend= ruleSend EOF
            {
             newCompositeNode(grammarAccess.getSendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSend=ruleSend();

            state._fsp--;

             current =iv_ruleSend; 
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
    // $ANTLR end "entryRuleSend"


    // $ANTLR start "ruleSend"
    // InternalIOTConnector.g:1741:1: ruleSend returns [EObject current=null] : (otherlv_0= 'send' ( (lv_sendActions_1_0= ruleSendAction ) )+ ) ;
    public final EObject ruleSend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sendActions_1_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1747:2: ( (otherlv_0= 'send' ( (lv_sendActions_1_0= ruleSendAction ) )+ ) )
            // InternalIOTConnector.g:1748:2: (otherlv_0= 'send' ( (lv_sendActions_1_0= ruleSendAction ) )+ )
            {
            // InternalIOTConnector.g:1748:2: (otherlv_0= 'send' ( (lv_sendActions_1_0= ruleSendAction ) )+ )
            // InternalIOTConnector.g:1749:3: otherlv_0= 'send' ( (lv_sendActions_1_0= ruleSendAction ) )+
            {
            otherlv_0=(Token)match(input,45,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSendAccess().getSendKeyword_0());
            		
            // InternalIOTConnector.g:1753:3: ( (lv_sendActions_1_0= ruleSendAction ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalIOTConnector.g:1754:4: (lv_sendActions_1_0= ruleSendAction )
            	    {
            	    // InternalIOTConnector.g:1754:4: (lv_sendActions_1_0= ruleSendAction )
            	    // InternalIOTConnector.g:1755:5: lv_sendActions_1_0= ruleSendAction
            	    {

            	    					newCompositeNode(grammarAccess.getSendAccess().getSendActionsSendActionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_35);
            	    lv_sendActions_1_0=ruleSendAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSendRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sendActions",
            	    						lv_sendActions_1_0,
            	    						"org.group9.IOTConnector.SendAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
    // $ANTLR end "ruleSend"


    // $ANTLR start "entryRuleSendAction"
    // InternalIOTConnector.g:1776:1: entryRuleSendAction returns [EObject current=null] : iv_ruleSendAction= ruleSendAction EOF ;
    public final EObject entryRuleSendAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendAction = null;


        try {
            // InternalIOTConnector.g:1776:51: (iv_ruleSendAction= ruleSendAction EOF )
            // InternalIOTConnector.g:1777:2: iv_ruleSendAction= ruleSendAction EOF
            {
             newCompositeNode(grammarAccess.getSendActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendAction=ruleSendAction();

            state._fsp--;

             current =iv_ruleSendAction; 
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
    // $ANTLR end "entryRuleSendAction"


    // $ANTLR start "ruleSendAction"
    // InternalIOTConnector.g:1783:1: ruleSendAction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'samples' ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) ) ) ;
    public final EObject ruleSendAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_number_4_0=null;
        EObject lv_relationalOperator_3_0 = null;



        	enterRule();

        try {
            // InternalIOTConnector.g:1789:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'samples' ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) ) ) )
            // InternalIOTConnector.g:1790:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'samples' ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) ) )
            {
            // InternalIOTConnector.g:1790:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'samples' ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) ) )
            // InternalIOTConnector.g:1791:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= 'when' otherlv_2= 'samples' ( (lv_relationalOperator_3_0= ruleRelationalOperator ) ) ( (lv_number_4_0= RULE_INT ) )
            {
            // InternalIOTConnector.g:1791:3: ( (otherlv_0= RULE_ID ) )
            // InternalIOTConnector.g:1792:4: (otherlv_0= RULE_ID )
            {
            // InternalIOTConnector.g:1792:4: (otherlv_0= RULE_ID )
            // InternalIOTConnector.g:1793:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendActionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_48); 

            					newLeafNode(otherlv_0, grammarAccess.getSendActionAccess().getReadingNameReadingNameCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getSendActionAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getSendActionAccess().getSamplesKeyword_2());
            		
            // InternalIOTConnector.g:1812:3: ( (lv_relationalOperator_3_0= ruleRelationalOperator ) )
            // InternalIOTConnector.g:1813:4: (lv_relationalOperator_3_0= ruleRelationalOperator )
            {
            // InternalIOTConnector.g:1813:4: (lv_relationalOperator_3_0= ruleRelationalOperator )
            // InternalIOTConnector.g:1814:5: lv_relationalOperator_3_0= ruleRelationalOperator
            {

            					newCompositeNode(grammarAccess.getSendActionAccess().getRelationalOperatorRelationalOperatorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_relationalOperator_3_0=ruleRelationalOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSendActionRule());
            					}
            					set(
            						current,
            						"relationalOperator",
            						lv_relationalOperator_3_0,
            						"org.group9.IOTConnector.RelationalOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalIOTConnector.g:1831:3: ( (lv_number_4_0= RULE_INT ) )
            // InternalIOTConnector.g:1832:4: (lv_number_4_0= RULE_INT )
            {
            // InternalIOTConnector.g:1832:4: (lv_number_4_0= RULE_INT )
            // InternalIOTConnector.g:1833:5: lv_number_4_0= RULE_INT
            {
            lv_number_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_number_4_0, grammarAccess.getSendActionAccess().getNumberINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"number",
            						lv_number_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleSendAction"


    // $ANTLR start "entryRuleReadingName"
    // InternalIOTConnector.g:1853:1: entryRuleReadingName returns [EObject current=null] : iv_ruleReadingName= ruleReadingName EOF ;
    public final EObject entryRuleReadingName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadingName = null;


        try {
            // InternalIOTConnector.g:1853:52: (iv_ruleReadingName= ruleReadingName EOF )
            // InternalIOTConnector.g:1854:2: iv_ruleReadingName= ruleReadingName EOF
            {
             newCompositeNode(grammarAccess.getReadingNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadingName=ruleReadingName();

            state._fsp--;

             current =iv_ruleReadingName; 
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
    // $ANTLR end "entryRuleReadingName"


    // $ANTLR start "ruleReadingName"
    // InternalIOTConnector.g:1860:1: ruleReadingName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleReadingName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalIOTConnector.g:1866:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalIOTConnector.g:1867:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalIOTConnector.g:1867:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalIOTConnector.g:1868:3: (lv_name_0_0= RULE_ID )
            {
            // InternalIOTConnector.g:1868:3: (lv_name_0_0= RULE_ID )
            // InternalIOTConnector.g:1869:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getReadingNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReadingNameRule());
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
    // $ANTLR end "ruleReadingName"


    // $ANTLR start "entryRuleReadingNameWithConfigScope"
    // InternalIOTConnector.g:1888:1: entryRuleReadingNameWithConfigScope returns [EObject current=null] : iv_ruleReadingNameWithConfigScope= ruleReadingNameWithConfigScope EOF ;
    public final EObject entryRuleReadingNameWithConfigScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadingNameWithConfigScope = null;


        try {
            // InternalIOTConnector.g:1888:67: (iv_ruleReadingNameWithConfigScope= ruleReadingNameWithConfigScope EOF )
            // InternalIOTConnector.g:1889:2: iv_ruleReadingNameWithConfigScope= ruleReadingNameWithConfigScope EOF
            {
             newCompositeNode(grammarAccess.getReadingNameWithConfigScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReadingNameWithConfigScope=ruleReadingNameWithConfigScope();

            state._fsp--;

             current =iv_ruleReadingNameWithConfigScope; 
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
    // $ANTLR end "entryRuleReadingNameWithConfigScope"


    // $ANTLR start "ruleReadingNameWithConfigScope"
    // InternalIOTConnector.g:1895:1: ruleReadingNameWithConfigScope returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleReadingNameWithConfigScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalIOTConnector.g:1901:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalIOTConnector.g:1902:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalIOTConnector.g:1902:2: ( (otherlv_0= RULE_ID ) )
            // InternalIOTConnector.g:1903:3: (otherlv_0= RULE_ID )
            {
            // InternalIOTConnector.g:1903:3: (otherlv_0= RULE_ID )
            // InternalIOTConnector.g:1904:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getReadingNameWithConfigScopeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getReadingNameWithConfigScopeAccess().getNameReadingNameCrossReference_0());
            			

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
    // $ANTLR end "ruleReadingNameWithConfigScope"


    // $ANTLR start "entryRuleBitwiseOperator"
    // InternalIOTConnector.g:1918:1: entryRuleBitwiseOperator returns [EObject current=null] : iv_ruleBitwiseOperator= ruleBitwiseOperator EOF ;
    public final EObject entryRuleBitwiseOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBitwiseOperator = null;


        try {
            // InternalIOTConnector.g:1918:56: (iv_ruleBitwiseOperator= ruleBitwiseOperator EOF )
            // InternalIOTConnector.g:1919:2: iv_ruleBitwiseOperator= ruleBitwiseOperator EOF
            {
             newCompositeNode(grammarAccess.getBitwiseOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBitwiseOperator=ruleBitwiseOperator();

            state._fsp--;

             current =iv_ruleBitwiseOperator; 
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
    // $ANTLR end "entryRuleBitwiseOperator"


    // $ANTLR start "ruleBitwiseOperator"
    // InternalIOTConnector.g:1925:1: ruleBitwiseOperator returns [EObject current=null] : ( ( (lv_value_0_1= 'AND' | lv_value_0_2= 'OR' ) ) ) ;
    public final EObject ruleBitwiseOperator() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalIOTConnector.g:1931:2: ( ( ( (lv_value_0_1= 'AND' | lv_value_0_2= 'OR' ) ) ) )
            // InternalIOTConnector.g:1932:2: ( ( (lv_value_0_1= 'AND' | lv_value_0_2= 'OR' ) ) )
            {
            // InternalIOTConnector.g:1932:2: ( ( (lv_value_0_1= 'AND' | lv_value_0_2= 'OR' ) ) )
            // InternalIOTConnector.g:1933:3: ( (lv_value_0_1= 'AND' | lv_value_0_2= 'OR' ) )
            {
            // InternalIOTConnector.g:1933:3: ( (lv_value_0_1= 'AND' | lv_value_0_2= 'OR' ) )
            // InternalIOTConnector.g:1934:4: (lv_value_0_1= 'AND' | lv_value_0_2= 'OR' )
            {
            // InternalIOTConnector.g:1934:4: (lv_value_0_1= 'AND' | lv_value_0_2= 'OR' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            else if ( (LA25_0==48) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalIOTConnector.g:1935:5: lv_value_0_1= 'AND'
                    {
                    lv_value_0_1=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getBitwiseOperatorAccess().getValueANDKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBitwiseOperatorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalIOTConnector.g:1946:5: lv_value_0_2= 'OR'
                    {
                    lv_value_0_2=(Token)match(input,48,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getBitwiseOperatorAccess().getValueORKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBitwiseOperatorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleBitwiseOperator"


    // $ANTLR start "entryRuleRelationalOperator"
    // InternalIOTConnector.g:1962:1: entryRuleRelationalOperator returns [EObject current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final EObject entryRuleRelationalOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalOperator = null;


        try {
            // InternalIOTConnector.g:1962:59: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalIOTConnector.g:1963:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
             newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;

             current =iv_ruleRelationalOperator; 
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
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalIOTConnector.g:1969:1: ruleRelationalOperator returns [EObject current=null] : ( ( (lv_value_0_1= '>' | lv_value_0_2= '>=' | lv_value_0_3= '==' | lv_value_0_4= '<=' | lv_value_0_5= '<' | lv_value_0_6= '!=' ) ) ) ;
    public final EObject ruleRelationalOperator() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;


        	enterRule();

        try {
            // InternalIOTConnector.g:1975:2: ( ( ( (lv_value_0_1= '>' | lv_value_0_2= '>=' | lv_value_0_3= '==' | lv_value_0_4= '<=' | lv_value_0_5= '<' | lv_value_0_6= '!=' ) ) ) )
            // InternalIOTConnector.g:1976:2: ( ( (lv_value_0_1= '>' | lv_value_0_2= '>=' | lv_value_0_3= '==' | lv_value_0_4= '<=' | lv_value_0_5= '<' | lv_value_0_6= '!=' ) ) )
            {
            // InternalIOTConnector.g:1976:2: ( ( (lv_value_0_1= '>' | lv_value_0_2= '>=' | lv_value_0_3= '==' | lv_value_0_4= '<=' | lv_value_0_5= '<' | lv_value_0_6= '!=' ) ) )
            // InternalIOTConnector.g:1977:3: ( (lv_value_0_1= '>' | lv_value_0_2= '>=' | lv_value_0_3= '==' | lv_value_0_4= '<=' | lv_value_0_5= '<' | lv_value_0_6= '!=' ) )
            {
            // InternalIOTConnector.g:1977:3: ( (lv_value_0_1= '>' | lv_value_0_2= '>=' | lv_value_0_3= '==' | lv_value_0_4= '<=' | lv_value_0_5= '<' | lv_value_0_6= '!=' ) )
            // InternalIOTConnector.g:1978:4: (lv_value_0_1= '>' | lv_value_0_2= '>=' | lv_value_0_3= '==' | lv_value_0_4= '<=' | lv_value_0_5= '<' | lv_value_0_6= '!=' )
            {
            // InternalIOTConnector.g:1978:4: (lv_value_0_1= '>' | lv_value_0_2= '>=' | lv_value_0_3= '==' | lv_value_0_4= '<=' | lv_value_0_5= '<' | lv_value_0_6= '!=' )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt26=1;
                }
                break;
            case 50:
                {
                alt26=2;
                }
                break;
            case 51:
                {
                alt26=3;
                }
                break;
            case 52:
                {
                alt26=4;
                }
                break;
            case 53:
                {
                alt26=5;
                }
                break;
            case 54:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalIOTConnector.g:1979:5: lv_value_0_1= '>'
                    {
                    lv_value_0_1=(Token)match(input,49,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getRelationalOperatorAccess().getValueGreaterThanSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalIOTConnector.g:1990:5: lv_value_0_2= '>='
                    {
                    lv_value_0_2=(Token)match(input,50,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getRelationalOperatorAccess().getValueGreaterThanSignEqualsSignKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalIOTConnector.g:2001:5: lv_value_0_3= '=='
                    {
                    lv_value_0_3=(Token)match(input,51,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getRelationalOperatorAccess().getValueEqualsSignEqualsSignKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalIOTConnector.g:2012:5: lv_value_0_4= '<='
                    {
                    lv_value_0_4=(Token)match(input,52,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getRelationalOperatorAccess().getValueLessThanSignEqualsSignKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalIOTConnector.g:2023:5: lv_value_0_5= '<'
                    {
                    lv_value_0_5=(Token)match(input,53,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getRelationalOperatorAccess().getValueLessThanSignKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalIOTConnector.g:2034:5: lv_value_0_6= '!='
                    {
                    lv_value_0_6=(Token)match(input,54,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getRelationalOperatorAccess().getValueExclamationMarkEqualsSignKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRelationalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalIOTConnector.g:2050:1: entryRuleTimeUnit returns [EObject current=null] : iv_ruleTimeUnit= ruleTimeUnit EOF ;
    public final EObject entryRuleTimeUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeUnit = null;


        try {
            // InternalIOTConnector.g:2050:49: (iv_ruleTimeUnit= ruleTimeUnit EOF )
            // InternalIOTConnector.g:2051:2: iv_ruleTimeUnit= ruleTimeUnit EOF
            {
             newCompositeNode(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeUnit=ruleTimeUnit();

            state._fsp--;

             current =iv_ruleTimeUnit; 
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
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // InternalIOTConnector.g:2057:1: ruleTimeUnit returns [EObject current=null] : ( ( (lv_value_0_1= 'millisecond' | lv_value_0_2= 'second' | lv_value_0_3= 'minute' | lv_value_0_4= 'ms' | lv_value_0_5= 's' | lv_value_0_6= 'm' ) ) ) ;
    public final EObject ruleTimeUnit() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;
        Token lv_value_0_5=null;
        Token lv_value_0_6=null;


        	enterRule();

        try {
            // InternalIOTConnector.g:2063:2: ( ( ( (lv_value_0_1= 'millisecond' | lv_value_0_2= 'second' | lv_value_0_3= 'minute' | lv_value_0_4= 'ms' | lv_value_0_5= 's' | lv_value_0_6= 'm' ) ) ) )
            // InternalIOTConnector.g:2064:2: ( ( (lv_value_0_1= 'millisecond' | lv_value_0_2= 'second' | lv_value_0_3= 'minute' | lv_value_0_4= 'ms' | lv_value_0_5= 's' | lv_value_0_6= 'm' ) ) )
            {
            // InternalIOTConnector.g:2064:2: ( ( (lv_value_0_1= 'millisecond' | lv_value_0_2= 'second' | lv_value_0_3= 'minute' | lv_value_0_4= 'ms' | lv_value_0_5= 's' | lv_value_0_6= 'm' ) ) )
            // InternalIOTConnector.g:2065:3: ( (lv_value_0_1= 'millisecond' | lv_value_0_2= 'second' | lv_value_0_3= 'minute' | lv_value_0_4= 'ms' | lv_value_0_5= 's' | lv_value_0_6= 'm' ) )
            {
            // InternalIOTConnector.g:2065:3: ( (lv_value_0_1= 'millisecond' | lv_value_0_2= 'second' | lv_value_0_3= 'minute' | lv_value_0_4= 'ms' | lv_value_0_5= 's' | lv_value_0_6= 'm' ) )
            // InternalIOTConnector.g:2066:4: (lv_value_0_1= 'millisecond' | lv_value_0_2= 'second' | lv_value_0_3= 'minute' | lv_value_0_4= 'ms' | lv_value_0_5= 's' | lv_value_0_6= 'm' )
            {
            // InternalIOTConnector.g:2066:4: (lv_value_0_1= 'millisecond' | lv_value_0_2= 'second' | lv_value_0_3= 'minute' | lv_value_0_4= 'ms' | lv_value_0_5= 's' | lv_value_0_6= 'm' )
            int alt27=6;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt27=1;
                }
                break;
            case 56:
                {
                alt27=2;
                }
                break;
            case 57:
                {
                alt27=3;
                }
                break;
            case 58:
                {
                alt27=4;
                }
                break;
            case 59:
                {
                alt27=5;
                }
                break;
            case 60:
                {
                alt27=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalIOTConnector.g:2067:5: lv_value_0_1= 'millisecond'
                    {
                    lv_value_0_1=(Token)match(input,55,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getTimeUnitAccess().getValueMillisecondKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimeUnitRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalIOTConnector.g:2078:5: lv_value_0_2= 'second'
                    {
                    lv_value_0_2=(Token)match(input,56,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getTimeUnitAccess().getValueSecondKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimeUnitRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalIOTConnector.g:2089:5: lv_value_0_3= 'minute'
                    {
                    lv_value_0_3=(Token)match(input,57,FOLLOW_2); 

                    					newLeafNode(lv_value_0_3, grammarAccess.getTimeUnitAccess().getValueMinuteKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimeUnitRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalIOTConnector.g:2100:5: lv_value_0_4= 'ms'
                    {
                    lv_value_0_4=(Token)match(input,58,FOLLOW_2); 

                    					newLeafNode(lv_value_0_4, grammarAccess.getTimeUnitAccess().getValueMsKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimeUnitRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalIOTConnector.g:2111:5: lv_value_0_5= 's'
                    {
                    lv_value_0_5=(Token)match(input,59,FOLLOW_2); 

                    					newLeafNode(lv_value_0_5, grammarAccess.getTimeUnitAccess().getValueSKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimeUnitRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalIOTConnector.g:2122:5: lv_value_0_6= 'm'
                    {
                    lv_value_0_6=(Token)match(input,60,FOLLOW_2); 

                    					newLeafNode(lv_value_0_6, grammarAccess.getTimeUnitAccess().getValueMKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTimeUnitRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_6, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "entryRuleFilterType"
    // InternalIOTConnector.g:2138:1: entryRuleFilterType returns [EObject current=null] : iv_ruleFilterType= ruleFilterType EOF ;
    public final EObject entryRuleFilterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterType = null;


        try {
            // InternalIOTConnector.g:2138:51: (iv_ruleFilterType= ruleFilterType EOF )
            // InternalIOTConnector.g:2139:2: iv_ruleFilterType= ruleFilterType EOF
            {
             newCompositeNode(grammarAccess.getFilterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterType=ruleFilterType();

            state._fsp--;

             current =iv_ruleFilterType; 
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
    // $ANTLR end "entryRuleFilterType"


    // $ANTLR start "ruleFilterType"
    // InternalIOTConnector.g:2145:1: ruleFilterType returns [EObject current=null] : ( ( (lv_value_0_1= 'medianfilter' | lv_value_0_2= 'meanfilter' ) ) ) ;
    public final EObject ruleFilterType() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalIOTConnector.g:2151:2: ( ( ( (lv_value_0_1= 'medianfilter' | lv_value_0_2= 'meanfilter' ) ) ) )
            // InternalIOTConnector.g:2152:2: ( ( (lv_value_0_1= 'medianfilter' | lv_value_0_2= 'meanfilter' ) ) )
            {
            // InternalIOTConnector.g:2152:2: ( ( (lv_value_0_1= 'medianfilter' | lv_value_0_2= 'meanfilter' ) ) )
            // InternalIOTConnector.g:2153:3: ( (lv_value_0_1= 'medianfilter' | lv_value_0_2= 'meanfilter' ) )
            {
            // InternalIOTConnector.g:2153:3: ( (lv_value_0_1= 'medianfilter' | lv_value_0_2= 'meanfilter' ) )
            // InternalIOTConnector.g:2154:4: (lv_value_0_1= 'medianfilter' | lv_value_0_2= 'meanfilter' )
            {
            // InternalIOTConnector.g:2154:4: (lv_value_0_1= 'medianfilter' | lv_value_0_2= 'meanfilter' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==61) ) {
                alt28=1;
            }
            else if ( (LA28_0==62) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalIOTConnector.g:2155:5: lv_value_0_1= 'medianfilter'
                    {
                    lv_value_0_1=(Token)match(input,61,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getFilterTypeAccess().getValueMedianfilterKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterTypeRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalIOTConnector.g:2166:5: lv_value_0_2= 'meanfilter'
                    {
                    lv_value_0_2=(Token)match(input,62,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getFilterTypeAccess().getValueMeanfilterKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterTypeRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleFilterType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000012400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000212400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x007E000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1F80000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x6000000000000040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000002060L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000000000L});

}