/**
 * generated by Xtext 2.14.0
 */
package mindMap_CarteMentale.myDsl.impl;

import java.util.Collection;

import mindMap_CarteMentale.myDsl.MainTopic;
import mindMap_CarteMentale.myDsl.Marker;
import mindMap_CarteMentale.myDsl.MyDslPackage;
import mindMap_CarteMentale.myDsl.SubTopic;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Topic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mindMap_CarteMentale.myDsl.impl.MainTopicImpl#getMarkers <em>Markers</em>}</li>
 *   <li>{@link mindMap_CarteMentale.myDsl.impl.MainTopicImpl#getName <em>Name</em>}</li>
 *   <li>{@link mindMap_CarteMentale.myDsl.impl.MainTopicImpl#getSubtopic <em>Subtopic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainTopicImpl extends MinimalEObjectImpl.Container implements MainTopic
{
  /**
   * The cached value of the '{@link #getMarkers() <em>Markers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarkers()
   * @generated
   * @ordered
   */
  protected EList<Marker> markers;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubtopic() <em>Subtopic</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtopic()
   * @generated
   * @ordered
   */
  protected EList<SubTopic> subtopic;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainTopicImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.MAIN_TOPIC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Marker> getMarkers()
  {
    if (markers == null)
    {
      markers = new EObjectContainmentEList<Marker>(Marker.class, this, MyDslPackage.MAIN_TOPIC__MARKERS);
    }
    return markers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MAIN_TOPIC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SubTopic> getSubtopic()
  {
    if (subtopic == null)
    {
      subtopic = new EObjectContainmentEList<SubTopic>(SubTopic.class, this, MyDslPackage.MAIN_TOPIC__SUBTOPIC);
    }
    return subtopic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.MAIN_TOPIC__MARKERS:
        return ((InternalEList<?>)getMarkers()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MAIN_TOPIC__SUBTOPIC:
        return ((InternalEList<?>)getSubtopic()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.MAIN_TOPIC__MARKERS:
        return getMarkers();
      case MyDslPackage.MAIN_TOPIC__NAME:
        return getName();
      case MyDslPackage.MAIN_TOPIC__SUBTOPIC:
        return getSubtopic();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.MAIN_TOPIC__MARKERS:
        getMarkers().clear();
        getMarkers().addAll((Collection<? extends Marker>)newValue);
        return;
      case MyDslPackage.MAIN_TOPIC__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.MAIN_TOPIC__SUBTOPIC:
        getSubtopic().clear();
        getSubtopic().addAll((Collection<? extends SubTopic>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MAIN_TOPIC__MARKERS:
        getMarkers().clear();
        return;
      case MyDslPackage.MAIN_TOPIC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.MAIN_TOPIC__SUBTOPIC:
        getSubtopic().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.MAIN_TOPIC__MARKERS:
        return markers != null && !markers.isEmpty();
      case MyDslPackage.MAIN_TOPIC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.MAIN_TOPIC__SUBTOPIC:
        return subtopic != null && !subtopic.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MainTopicImpl