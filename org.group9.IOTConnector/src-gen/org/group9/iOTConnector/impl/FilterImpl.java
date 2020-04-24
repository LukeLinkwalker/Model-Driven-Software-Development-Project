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

import org.group9.iOTConnector.Filter;
import org.group9.iOTConnector.FilterAction;
import org.group9.iOTConnector.IOTConnectorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.group9.iOTConnector.impl.FilterImpl#getFilterActions <em>Filter Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterImpl extends FunctionImpl implements Filter
{
  /**
   * The cached value of the '{@link #getFilterActions() <em>Filter Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilterActions()
   * @generated
   * @ordered
   */
  protected EList<FilterAction> filterActions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterImpl()
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
    return IOTConnectorPackage.Literals.FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<FilterAction> getFilterActions()
  {
    if (filterActions == null)
    {
      filterActions = new EObjectContainmentEList<FilterAction>(FilterAction.class, this, IOTConnectorPackage.FILTER__FILTER_ACTIONS);
    }
    return filterActions;
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
      case IOTConnectorPackage.FILTER__FILTER_ACTIONS:
        return ((InternalEList<?>)getFilterActions()).basicRemove(otherEnd, msgs);
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
      case IOTConnectorPackage.FILTER__FILTER_ACTIONS:
        return getFilterActions();
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
      case IOTConnectorPackage.FILTER__FILTER_ACTIONS:
        getFilterActions().clear();
        getFilterActions().addAll((Collection<? extends FilterAction>)newValue);
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
      case IOTConnectorPackage.FILTER__FILTER_ACTIONS:
        getFilterActions().clear();
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
      case IOTConnectorPackage.FILTER__FILTER_ACTIONS:
        return filterActions != null && !filterActions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FilterImpl