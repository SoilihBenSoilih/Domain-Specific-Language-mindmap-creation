/*
 * generated by Xtext 2.14.0
 */
package mindMap_CarteMentale.serializer;

import com.google.inject.Inject;
import java.util.Set;
import mindMap_CarteMentale.myDsl.CentralTopic;
import mindMap_CarteMentale.myDsl.MainTopic;
import mindMap_CarteMentale.myDsl.Marker;
import mindMap_CarteMentale.myDsl.MindMap;
import mindMap_CarteMentale.myDsl.MyDslPackage;
import mindMap_CarteMentale.myDsl.SubTopic;
import mindMap_CarteMentale.services.MyDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.CENTRAL_TOPIC:
				sequence_CentralTopic(context, (CentralTopic) semanticObject); 
				return; 
			case MyDslPackage.MAIN_TOPIC:
				sequence_MainTopic(context, (MainTopic) semanticObject); 
				return; 
			case MyDslPackage.MARKER:
				sequence_Marker(context, (Marker) semanticObject); 
				return; 
			case MyDslPackage.MIND_MAP:
				sequence_MindMap(context, (MindMap) semanticObject); 
				return; 
			case MyDslPackage.SUB_TOPIC:
				sequence_SubTopic(context, (SubTopic) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     CentralTopic returns CentralTopic
	 *
	 * Constraint:
	 *     (markers+=Marker* name=CHAINE maintopic+=MainTopic*)
	 */
	protected void sequence_CentralTopic(ISerializationContext context, CentralTopic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MainTopic returns MainTopic
	 *
	 * Constraint:
	 *     (markers+=Marker* name=CHAINE subtopic+=SubTopic*)
	 */
	protected void sequence_MainTopic(ISerializationContext context, MainTopic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Marker returns Marker
	 *
	 * Constraint:
	 *     symbol=ENTIER
	 */
	protected void sequence_Marker(ISerializationContext context, Marker semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MARKER__SYMBOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MARKER__SYMBOL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMarkerAccess().getSymbolENTIERParserRuleCall_0(), semanticObject.getSymbol());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MindMap returns MindMap
	 *
	 * Constraint:
	 *     (markers+=Marker* title=CHAINE centraltopic=CentralTopic)
	 */
	protected void sequence_MindMap(ISerializationContext context, MindMap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SubTopic returns SubTopic
	 *
	 * Constraint:
	 *     (markers+=Marker* name=CHAINE subtopic+=SubTopic*)
	 */
	protected void sequence_SubTopic(ISerializationContext context, SubTopic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
