/**
 * generated by Xtext 2.21.0
 */
package org.group9.iOTConnector.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.group9.iOTConnector.Expression;
import org.group9.iOTConnector.IOTConnectorPackage;
import org.group9.iOTConnector.ProcessAction;
import org.group9.iOTConnector.ReadingName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.group9.iOTConnector.impl.ProcessActionImpl#getReadingName <em>Reading Name</em>}</li>
 *   <li>{@link org.group9.iOTConnector.impl.ProcessActionImpl#getExp <em>Exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessActionImpl extends MinimalEObjectImpl.Container implements ProcessAction
{
  /**
   * The cached value of the '{@link #getReadingName() <em>Reading Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadingName()
   * @generated
   * @ordered
   */
  protected ReadingName readingName;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected Expression exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessActionImpl()
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
    return IOTConnectorPackage.Literals.PROCESS_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReadingName getReadingName()
  {
    if (readingName != null && readingName.eIsProxy())
    {
      InternalEObject oldReadingName = (InternalEObject)readingName;
      readingName = (ReadingName)eResolveProxy(oldReadingName);
      if (readingName != oldReadingName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IOTConnectorPackage.PROCESS_ACTION__READING_NAME, oldReadingName, readingName));
      }
    }
    return readingName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReadingName basicGetReadingName()
  {
    return readingName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReadingName(ReadingName newReadingName)
  {
    ReadingName oldReadingName = readingName;
    readingName = newReadingName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IOTConnectorPackage.PROCESS_ACTION__READING_NAME, oldReadingName, readingName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(Expression newExp, NotificationChain msgs)
  {
    Expression oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IOTConnectorPackage.PROCESS_ACTION__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExp(Expression newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IOTConnectorPackage.PROCESS_ACTION__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IOTConnectorPackage.PROCESS_ACTION__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IOTConnectorPackage.PROCESS_ACTION__EXP, newExp, newExp));
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
      case IOTConnectorPackage.PROCESS_ACTION__EXP:
        return basicSetExp(null, msgs);
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
      case IOTConnectorPackage.PROCESS_ACTION__READING_NAME:
        if (resolve) return getReadingName();
        return basicGetReadingName();
      case IOTConnectorPackage.PROCESS_ACTION__EXP:
        return getExp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IOTConnectorPackage.PROCESS_ACTION__READING_NAME:
        setReadingName((ReadingName)newValue);
        return;
      case IOTConnectorPackage.PROCESS_ACTION__EXP:
        setExp((Expression)newValue);
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
      case IOTConnectorPackage.PROCESS_ACTION__READING_NAME:
        setReadingName((ReadingName)null);
        return;
      case IOTConnectorPackage.PROCESS_ACTION__EXP:
        setExp((Expression)null);
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
      case IOTConnectorPackage.PROCESS_ACTION__READING_NAME:
        return readingName != null;
      case IOTConnectorPackage.PROCESS_ACTION__EXP:
        return exp != null;
    }
    return super.eIsSet(featureID);
  }

} //ProcessActionImpl
