/**
 * generated by Xtext 2.14.0
 */
package mindMap_CarteMentale.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import mindMap_CarteMentale.MyDslRuntimeModule;
import mindMap_CarteMentale.MyDslStandaloneSetup;
import mindMap_CarteMentale.ide.MyDslIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class MyDslIdeSetup extends MyDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    MyDslRuntimeModule _myDslRuntimeModule = new MyDslRuntimeModule();
    MyDslIdeModule _myDslIdeModule = new MyDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_myDslRuntimeModule, _myDslIdeModule));
  }
}
