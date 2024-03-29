/**
 * generated by Xtext 2.14.0
 */
package mindMap_CarteMentale.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mindMap_CarteMentale.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = mindMap_CarteMentale.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Mind Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mind Map</em>'.
   * @generated
   */
  MindMap createMindMap();

  /**
   * Returns a new object of class '<em>Central Topic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Central Topic</em>'.
   * @generated
   */
  CentralTopic createCentralTopic();

  /**
   * Returns a new object of class '<em>Main Topic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main Topic</em>'.
   * @generated
   */
  MainTopic createMainTopic();

  /**
   * Returns a new object of class '<em>Sub Topic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Topic</em>'.
   * @generated
   */
  SubTopic createSubTopic();

  /**
   * Returns a new object of class '<em>Marker</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Marker</em>'.
   * @generated
   */
  Marker createMarker();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
