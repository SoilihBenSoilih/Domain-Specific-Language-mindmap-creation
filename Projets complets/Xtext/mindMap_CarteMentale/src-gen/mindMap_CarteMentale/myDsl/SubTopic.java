/**
 * generated by Xtext 2.14.0
 */
package mindMap_CarteMentale.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Topic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindMap_CarteMentale.myDsl.SubTopic#getMarkers <em>Markers</em>}</li>
 *   <li>{@link mindMap_CarteMentale.myDsl.SubTopic#getName <em>Name</em>}</li>
 *   <li>{@link mindMap_CarteMentale.myDsl.SubTopic#getSubtopic <em>Subtopic</em>}</li>
 * </ul>
 *
 * @see mindMap_CarteMentale.myDsl.MyDslPackage#getSubTopic()
 * @model
 * @generated
 */
public interface SubTopic extends EObject
{
  /**
   * Returns the value of the '<em><b>Markers</b></em>' containment reference list.
   * The list contents are of type {@link mindMap_CarteMentale.myDsl.Marker}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Markers</em>' containment reference list.
   * @see mindMap_CarteMentale.myDsl.MyDslPackage#getSubTopic_Markers()
   * @model containment="true"
   * @generated
   */
  EList<Marker> getMarkers();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see mindMap_CarteMentale.myDsl.MyDslPackage#getSubTopic_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link mindMap_CarteMentale.myDsl.SubTopic#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Subtopic</b></em>' containment reference list.
   * The list contents are of type {@link mindMap_CarteMentale.myDsl.SubTopic}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtopic</em>' containment reference list.
   * @see mindMap_CarteMentale.myDsl.MyDslPackage#getSubTopic_Subtopic()
   * @model containment="true"
   * @generated
   */
  EList<SubTopic> getSubtopic();

} // SubTopic
