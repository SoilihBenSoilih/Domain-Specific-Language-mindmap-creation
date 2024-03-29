/**
 * generated by Xtext 2.14.0
 */
package mindMap_CarteMentale.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mindMap_CarteMentale.myDsl.MindMap#getMarkers <em>Markers</em>}</li>
 *   <li>{@link mindMap_CarteMentale.myDsl.MindMap#getTitle <em>Title</em>}</li>
 *   <li>{@link mindMap_CarteMentale.myDsl.MindMap#getCentraltopic <em>Centraltopic</em>}</li>
 * </ul>
 *
 * @see mindMap_CarteMentale.myDsl.MyDslPackage#getMindMap()
 * @model
 * @generated
 */
public interface MindMap extends EObject
{
  /**
   * Returns the value of the '<em><b>Markers</b></em>' containment reference list.
   * The list contents are of type {@link mindMap_CarteMentale.myDsl.Marker}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Markers</em>' containment reference list.
   * @see mindMap_CarteMentale.myDsl.MyDslPackage#getMindMap_Markers()
   * @model containment="true"
   * @generated
   */
  EList<Marker> getMarkers();

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see mindMap_CarteMentale.myDsl.MyDslPackage#getMindMap_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link mindMap_CarteMentale.myDsl.MindMap#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Centraltopic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Centraltopic</em>' containment reference.
   * @see #setCentraltopic(CentralTopic)
   * @see mindMap_CarteMentale.myDsl.MyDslPackage#getMindMap_Centraltopic()
   * @model containment="true"
   * @generated
   */
  CentralTopic getCentraltopic();

  /**
   * Sets the value of the '{@link mindMap_CarteMentale.myDsl.MindMap#getCentraltopic <em>Centraltopic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Centraltopic</em>' containment reference.
   * @see #getCentraltopic()
   * @generated
   */
  void setCentraltopic(CentralTopic value);

} // MindMap
