/**
 * generated by Xtext 2.21.0
 */
package org.group9.iOTConnector.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.group9.iOTConnector.IOTConnectorPackage;
import org.group9.iOTConnector.Send;
import org.group9.iOTConnector.SendAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.group9.iOTConnector.impl.SendImpl#getSendActions <em>Send Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendImpl extends MinimalEObjectImpl.Container implements Send
{
  /**
   * The cached value of the '{@link #getSendActions() <em>Send Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSendActions()
   * @generated
   * @ordered
   */
  protected EList<SendAction> sendActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SendImpl()
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
    return IOTConnectorPackage.Literals.SEND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SendAction> getSendActions()
  {
    if (sendActions == null)
    {
      sendActions = new EObjectContainmentEList<SendAction>(SendAction.class, this, IOTConnectorPackage.SEND__SEND_ACTIONS);
    }
    return sendActions;
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
      case IOTConnectorPackage.SEND__SEND_ACTIONS:
        return ((InternalEList<?>)getSendActions()).basicRemove(otherEnd, msgs);
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
      case IOTConnectorPackage.SEND__SEND_ACTIONS:
        return getSendActions();
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
      case IOTConnectorPackage.SEND__SEND_ACTIONS:
        getSendActions().clear();
        getSendActions().addAll((Collection<? extends SendAction>)newValue);
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
      case IOTConnectorPackage.SEND__SEND_ACTIONS:
        getSendActions().clear();
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
      case IOTConnectorPackage.SEND__SEND_ACTIONS:
        return sendActions != null && !sendActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SendImpl
