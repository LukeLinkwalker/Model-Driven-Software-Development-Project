/**
 * generated by Xtext 2.21.0
 */
package org.group9.iOTConnector;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.group9.iOTConnector.SendAction#getReadingName <em>Reading Name</em>}</li>
 *   <li>{@link org.group9.iOTConnector.SendAction#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link org.group9.iOTConnector.SendAction#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see org.group9.iOTConnector.IOTConnectorPackage#getSendAction()
 * @model
 * @generated
 */
public interface SendAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Reading Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reading Name</em>' reference.
   * @see #setReadingName(ReadingName)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSendAction_ReadingName()
   * @model
   * @generated
   */
  ReadingName getReadingName();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SendAction#getReadingName <em>Reading Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reading Name</em>' reference.
   * @see #getReadingName()
   * @generated
   */
  void setReadingName(ReadingName value);

  /**
   * Returns the value of the '<em><b>Relational Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational Operator</em>' containment reference.
   * @see #setRelationalOperator(RelationalOperator)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSendAction_RelationalOperator()
   * @model containment="true"
   * @generated
   */
  RelationalOperator getRelationalOperator();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SendAction#getRelationalOperator <em>Relational Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relational Operator</em>' containment reference.
   * @see #getRelationalOperator()
   * @generated
   */
  void setRelationalOperator(RelationalOperator value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' attribute.
   * @see #setNumber(int)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSendAction_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SendAction#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

} // SendAction
