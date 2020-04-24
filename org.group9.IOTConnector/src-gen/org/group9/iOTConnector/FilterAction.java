/**
 * generated by Xtext 2.21.0
 */
package org.group9.iOTConnector;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.group9.iOTConnector.FilterAction#getReadingName <em>Reading Name</em>}</li>
 *   <li>{@link org.group9.iOTConnector.FilterAction#getFilterType <em>Filter Type</em>}</li>
 *   <li>{@link org.group9.iOTConnector.FilterAction#getNumber <em>Number</em>}</li>
 *   <li>{@link org.group9.iOTConnector.FilterAction#getFilterExp <em>Filter Exp</em>}</li>
 * </ul>
 *
 * @see org.group9.iOTConnector.IOTConnectorPackage#getFilterAction()
 * @model
 * @generated
 */
public interface FilterAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Reading Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reading Name</em>' reference.
   * @see #setReadingName(ReadingName)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getFilterAction_ReadingName()
   * @model
   * @generated
   */
  ReadingName getReadingName();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.FilterAction#getReadingName <em>Reading Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reading Name</em>' reference.
   * @see #getReadingName()
   * @generated
   */
  void setReadingName(ReadingName value);

  /**
   * Returns the value of the '<em><b>Filter Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter Type</em>' containment reference.
   * @see #setFilterType(FilterType)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getFilterAction_FilterType()
   * @model containment="true"
   * @generated
   */
  FilterType getFilterType();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.FilterAction#getFilterType <em>Filter Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter Type</em>' containment reference.
   * @see #getFilterType()
   * @generated
   */
  void setFilterType(FilterType value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getFilterAction_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.FilterAction#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Filter Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter Exp</em>' containment reference.
   * @see #setFilterExp(FilterExp)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getFilterAction_FilterExp()
   * @model containment="true"
   * @generated
   */
  FilterExp getFilterExp();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.FilterAction#getFilterExp <em>Filter Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter Exp</em>' containment reference.
   * @see #getFilterExp()
   * @generated
   */
  void setFilterExp(FilterExp value);

} // FilterAction
