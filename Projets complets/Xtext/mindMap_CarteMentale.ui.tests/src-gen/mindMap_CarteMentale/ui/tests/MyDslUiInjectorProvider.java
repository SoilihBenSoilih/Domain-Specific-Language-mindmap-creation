/*
 * generated by Xtext 2.14.0
 */
package mindMap_CarteMentale.ui.tests;

import com.google.inject.Injector;
import mindMap_CarteMentale.ui.internal.MindMap_CarteMentaleActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class MyDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MindMap_CarteMentaleActivator.getInstance().getInjector("mindMap_CarteMentale.MyDsl");
	}

}
