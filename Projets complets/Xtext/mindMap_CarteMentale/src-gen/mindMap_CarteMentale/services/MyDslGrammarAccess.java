/*
 * generated by Xtext 2.14.0
 */
package mindMap_CarteMentale.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MindMapElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mindMap_CarteMentale.MyDsl.MindMap");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMindMapKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cMarkersAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cMarkersMarkerParserRuleCall_1_1_0 = (RuleCall)cMarkersAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cTitleAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTitleCHAINEParserRuleCall_2_0 = (RuleCall)cTitleAssignment_2.eContents().get(0);
		private final Assignment cCentraltopicAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCentraltopicCentralTopicParserRuleCall_3_0 = (RuleCall)cCentraltopicAssignment_3.eContents().get(0);
		
		//MindMap:
		//	('MindMap' ('[' markers+=Marker* ']')? title=CHAINE centraltopic=CentralTopic)?;
		@Override public ParserRule getRule() { return rule; }
		
		//('MindMap' ('[' markers+=Marker* ']')? title=CHAINE centraltopic=CentralTopic)?
		public Group getGroup() { return cGroup; }
		
		//'MindMap'
		public Keyword getMindMapKeyword_0() { return cMindMapKeyword_0; }
		
		//('[' markers+=Marker* ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//markers+=Marker*
		public Assignment getMarkersAssignment_1_1() { return cMarkersAssignment_1_1; }
		
		//Marker
		public RuleCall getMarkersMarkerParserRuleCall_1_1_0() { return cMarkersMarkerParserRuleCall_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
		
		//title=CHAINE
		public Assignment getTitleAssignment_2() { return cTitleAssignment_2; }
		
		//CHAINE
		public RuleCall getTitleCHAINEParserRuleCall_2_0() { return cTitleCHAINEParserRuleCall_2_0; }
		
		//centraltopic=CentralTopic
		public Assignment getCentraltopicAssignment_3() { return cCentraltopicAssignment_3; }
		
		//CentralTopic
		public RuleCall getCentraltopicCentralTopicParserRuleCall_3_0() { return cCentraltopicCentralTopicParserRuleCall_3_0; }
	}
	public class CentralTopicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mindMap_CarteMentale.MyDsl.CentralTopic");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCentralTopicKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cMarkersAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cMarkersMarkerParserRuleCall_1_1_0 = (RuleCall)cMarkersAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameCHAINEParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cMaintopicAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMaintopicMainTopicParserRuleCall_3_0 = (RuleCall)cMaintopicAssignment_3.eContents().get(0);
		
		//CentralTopic:
		//	'CentralTopic' ('[' markers+=Marker* ']')? name=CHAINE maintopic+=MainTopic*;
		@Override public ParserRule getRule() { return rule; }
		
		//'CentralTopic' ('[' markers+=Marker* ']')? name=CHAINE maintopic+=MainTopic*
		public Group getGroup() { return cGroup; }
		
		//'CentralTopic'
		public Keyword getCentralTopicKeyword_0() { return cCentralTopicKeyword_0; }
		
		//('[' markers+=Marker* ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//markers+=Marker*
		public Assignment getMarkersAssignment_1_1() { return cMarkersAssignment_1_1; }
		
		//Marker
		public RuleCall getMarkersMarkerParserRuleCall_1_1_0() { return cMarkersMarkerParserRuleCall_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
		
		//name=CHAINE
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//CHAINE
		public RuleCall getNameCHAINEParserRuleCall_2_0() { return cNameCHAINEParserRuleCall_2_0; }
		
		//maintopic+=MainTopic*
		public Assignment getMaintopicAssignment_3() { return cMaintopicAssignment_3; }
		
		//MainTopic
		public RuleCall getMaintopicMainTopicParserRuleCall_3_0() { return cMaintopicMainTopicParserRuleCall_3_0; }
	}
	public class MainTopicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mindMap_CarteMentale.MyDsl.MainTopic");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMainTopicKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cMarkersAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cMarkersMarkerParserRuleCall_1_1_0 = (RuleCall)cMarkersAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameCHAINEParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cSubtopicAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSubtopicSubTopicParserRuleCall_3_0 = (RuleCall)cSubtopicAssignment_3.eContents().get(0);
		
		//MainTopic:
		//	'MainTopic' ('[' markers+=Marker* ']')? name=CHAINE subtopic+=SubTopic*;
		@Override public ParserRule getRule() { return rule; }
		
		//'MainTopic' ('[' markers+=Marker* ']')? name=CHAINE subtopic+=SubTopic*
		public Group getGroup() { return cGroup; }
		
		//'MainTopic'
		public Keyword getMainTopicKeyword_0() { return cMainTopicKeyword_0; }
		
		//('[' markers+=Marker* ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//markers+=Marker*
		public Assignment getMarkersAssignment_1_1() { return cMarkersAssignment_1_1; }
		
		//Marker
		public RuleCall getMarkersMarkerParserRuleCall_1_1_0() { return cMarkersMarkerParserRuleCall_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
		
		//name=CHAINE
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//CHAINE
		public RuleCall getNameCHAINEParserRuleCall_2_0() { return cNameCHAINEParserRuleCall_2_0; }
		
		//subtopic+=SubTopic*
		public Assignment getSubtopicAssignment_3() { return cSubtopicAssignment_3; }
		
		//SubTopic
		public RuleCall getSubtopicSubTopicParserRuleCall_3_0() { return cSubtopicSubTopicParserRuleCall_3_0; }
	}
	public class SubTopicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mindMap_CarteMentale.MyDsl.SubTopic");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubTopicKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cMarkersAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cMarkersMarkerParserRuleCall_1_1_0 = (RuleCall)cMarkersAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameCHAINEParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cSubtopicAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSubtopicSubTopicParserRuleCall_3_0 = (RuleCall)cSubtopicAssignment_3.eContents().get(0);
		
		//SubTopic:
		//	'SubTopic' ('[' markers+=Marker* ']')? name=CHAINE subtopic+=SubTopic*;
		@Override public ParserRule getRule() { return rule; }
		
		//'SubTopic' ('[' markers+=Marker* ']')? name=CHAINE subtopic+=SubTopic*
		public Group getGroup() { return cGroup; }
		
		//'SubTopic'
		public Keyword getSubTopicKeyword_0() { return cSubTopicKeyword_0; }
		
		//('[' markers+=Marker* ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//markers+=Marker*
		public Assignment getMarkersAssignment_1_1() { return cMarkersAssignment_1_1; }
		
		//Marker
		public RuleCall getMarkersMarkerParserRuleCall_1_1_0() { return cMarkersMarkerParserRuleCall_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
		
		//name=CHAINE
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//CHAINE
		public RuleCall getNameCHAINEParserRuleCall_2_0() { return cNameCHAINEParserRuleCall_2_0; }
		
		//subtopic+=SubTopic*
		public Assignment getSubtopicAssignment_3() { return cSubtopicAssignment_3; }
		
		//SubTopic
		public RuleCall getSubtopicSubTopicParserRuleCall_3_0() { return cSubtopicSubTopicParserRuleCall_3_0; }
	}
	public class MarkerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mindMap_CarteMentale.MyDsl.Marker");
		private final Assignment cSymbolAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSymbolENTIERParserRuleCall_0 = (RuleCall)cSymbolAssignment.eContents().get(0);
		
		//Marker:
		//	symbol=ENTIER;
		@Override public ParserRule getRule() { return rule; }
		
		//symbol=ENTIER
		public Assignment getSymbolAssignment() { return cSymbolAssignment; }
		
		//ENTIER
		public RuleCall getSymbolENTIERParserRuleCall_0() { return cSymbolENTIERParserRuleCall_0; }
	}
	public class ENTIERElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mindMap_CarteMentale.MyDsl.ENTIER");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ENTIER ecore::EInt:
		//	INT+;
		@Override public ParserRule getRule() { return rule; }
		
		//INT+
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	public class CHAINEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "mindMap_CarteMentale.MyDsl.CHAINE");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//CHAINE:
		//	ID+;
		@Override public ParserRule getRule() { return rule; }
		
		//ID+
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private final MindMapElements pMindMap;
	private final CentralTopicElements pCentralTopic;
	private final MainTopicElements pMainTopic;
	private final SubTopicElements pSubTopic;
	private final MarkerElements pMarker;
	private final ENTIERElements pENTIER;
	private final CHAINEElements pCHAINE;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMindMap = new MindMapElements();
		this.pCentralTopic = new CentralTopicElements();
		this.pMainTopic = new MainTopicElements();
		this.pSubTopic = new SubTopicElements();
		this.pMarker = new MarkerElements();
		this.pENTIER = new ENTIERElements();
		this.pCHAINE = new CHAINEElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("mindMap_CarteMentale.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MindMap:
	//	('MindMap' ('[' markers+=Marker* ']')? title=CHAINE centraltopic=CentralTopic)?;
	public MindMapElements getMindMapAccess() {
		return pMindMap;
	}
	
	public ParserRule getMindMapRule() {
		return getMindMapAccess().getRule();
	}
	
	//CentralTopic:
	//	'CentralTopic' ('[' markers+=Marker* ']')? name=CHAINE maintopic+=MainTopic*;
	public CentralTopicElements getCentralTopicAccess() {
		return pCentralTopic;
	}
	
	public ParserRule getCentralTopicRule() {
		return getCentralTopicAccess().getRule();
	}
	
	//MainTopic:
	//	'MainTopic' ('[' markers+=Marker* ']')? name=CHAINE subtopic+=SubTopic*;
	public MainTopicElements getMainTopicAccess() {
		return pMainTopic;
	}
	
	public ParserRule getMainTopicRule() {
		return getMainTopicAccess().getRule();
	}
	
	//SubTopic:
	//	'SubTopic' ('[' markers+=Marker* ']')? name=CHAINE subtopic+=SubTopic*;
	public SubTopicElements getSubTopicAccess() {
		return pSubTopic;
	}
	
	public ParserRule getSubTopicRule() {
		return getSubTopicAccess().getRule();
	}
	
	//Marker:
	//	symbol=ENTIER;
	public MarkerElements getMarkerAccess() {
		return pMarker;
	}
	
	public ParserRule getMarkerRule() {
		return getMarkerAccess().getRule();
	}
	
	//ENTIER ecore::EInt:
	//	INT+;
	public ENTIERElements getENTIERAccess() {
		return pENTIER;
	}
	
	public ParserRule getENTIERRule() {
		return getENTIERAccess().getRule();
	}
	
	//CHAINE:
	//	ID+;
	public CHAINEElements getCHAINEAccess() {
		return pCHAINE;
	}
	
	public ParserRule getCHAINERule() {
		return getCHAINEAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}