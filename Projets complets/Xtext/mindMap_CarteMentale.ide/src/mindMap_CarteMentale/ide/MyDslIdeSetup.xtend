/*
 * generated by Xtext 2.14.0
 */
package mindMap_CarteMentale.ide

import com.google.inject.Guice
import mindMap_CarteMentale.MyDslRuntimeModule
import mindMap_CarteMentale.MyDslStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class MyDslIdeSetup extends MyDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new MyDslRuntimeModule, new MyDslIdeModule))
	}
	
}
