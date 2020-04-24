/**
 * generated by Xtext 2.21.0
 */
package org.group9.iOTConnector.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.group9.iOTConnector.IOTConnectorPackage;
import org.group9.iOTConnector.Sample;
import org.group9.iOTConnector.SampleAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sample</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.group9.iOTConnector.impl.SampleImpl#getSampleActions <em>Sample Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SampleImpl extends FunctionImpl implements Sample
{
  /**
   * The cached value of the '{@link #getSampleActions() <em>Sample Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSampleActions()
   * @generated
   * @ordered
   */
  protected EList<SampleAction> sampleActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SampleImpl()
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
    return IOTConnectorPackage.Literals.SAMPLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SampleAction> getSampleActions()
  {
    if (sampleActions == null)
    {
      sampleActions = new EObjectContainmentEList<SampleAction>(SampleAction.class, this, IOTConnectorPackage.SAMPLE__SAMPLE_ACTIONS);
    }
    return sampleActions;
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
      case IOTConnectorPackage.SAMPLE__SAMPLE_ACTIONS:
        return ((InternalEList<?>)getSampleActions()).basicRemove(otherEnd, msgs);
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
      case IOTConnectorPackage.SAMPLE__SAMPLE_ACTIONS:
        return getSampleActions();
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
      case IOTConnectorPackage.SAMPLE__SAMPLE_ACTIONS:
        getSampleActions().clear();
        getSampleActions().addAll((Collection<? extends SampleAction>)newValue);
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
      case IOTConnectorPackage.SAMPLE__SAMPLE_ACTIONS:
        getSampleActions().clear();
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
      case IOTConnectorPackage.SAMPLE__SAMPLE_ACTIONS:
        return sampleActions != null && !sampleActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SampleImpl
