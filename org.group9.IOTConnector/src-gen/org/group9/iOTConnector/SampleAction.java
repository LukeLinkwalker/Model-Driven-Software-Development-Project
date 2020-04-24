/**
 * generated by Xtext 2.21.0
 */
package org.group9.iOTConnector;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sample Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.group9.iOTConnector.SampleAction#getReadingName <em>Reading Name</em>}</li>
 *   <li>{@link org.group9.iOTConnector.SampleAction#getReadingNameToCompare <em>Reading Name To Compare</em>}</li>
 *   <li>{@link org.group9.iOTConnector.SampleAction#getRelationalOperator <em>Relational Operator</em>}</li>
 *   <li>{@link org.group9.iOTConnector.SampleAction#getNumber <em>Number</em>}</li>
 *   <li>{@link org.group9.iOTConnector.SampleAction#getAmountOfTime <em>Amount Of Time</em>}</li>
 *   <li>{@link org.group9.iOTConnector.SampleAction#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see org.group9.iOTConnector.IOTConnectorPackage#getSampleAction()
 * @model
 * @generated
 */
public interface SampleAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Reading Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reading Name</em>' reference.
   * @see #setReadingName(ReadingName)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSampleAction_ReadingName()
   * @model
   * @generated
   */
  ReadingName getReadingName();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SampleAction#getReadingName <em>Reading Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reading Name</em>' reference.
   * @see #getReadingName()
   * @generated
   */
  void setReadingName(ReadingName value);

  /**
   * Returns the value of the '<em><b>Reading Name To Compare</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reading Name To Compare</em>' containment reference.
   * @see #setReadingNameToCompare(ReadingNameWithConfigScope)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSampleAction_ReadingNameToCompare()
   * @model containment="true"
   * @generated
   */
  ReadingNameWithConfigScope getReadingNameToCompare();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SampleAction#getReadingNameToCompare <em>Reading Name To Compare</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reading Name To Compare</em>' containment reference.
   * @see #getReadingNameToCompare()
   * @generated
   */
  void setReadingNameToCompare(ReadingNameWithConfigScope value);

  /**
   * Returns the value of the '<em><b>Relational Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relational Operator</em>' containment reference.
   * @see #setRelationalOperator(RelationalOperator)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSampleAction_RelationalOperator()
   * @model containment="true"
   * @generated
   */
  RelationalOperator getRelationalOperator();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SampleAction#getRelationalOperator <em>Relational Operator</em>}' containment reference.
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
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSampleAction_Number()
   * @model
   * @generated
   */
  int getNumber();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SampleAction#getNumber <em>Number</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' attribute.
   * @see #getNumber()
   * @generated
   */
  void setNumber(int value);

  /**
   * Returns the value of the '<em><b>Amount Of Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amount Of Time</em>' attribute.
   * @see #setAmountOfTime(int)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSampleAction_AmountOfTime()
   * @model
   * @generated
   */
  int getAmountOfTime();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SampleAction#getAmountOfTime <em>Amount Of Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amount Of Time</em>' attribute.
   * @see #getAmountOfTime()
   * @generated
   */
  void setAmountOfTime(int value);

  /**
   * Returns the value of the '<em><b>Time Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Unit</em>' containment reference.
   * @see #setTimeUnit(TimeUnit)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSampleAction_TimeUnit()
   * @model containment="true"
   * @generated
   */
  TimeUnit getTimeUnit();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SampleAction#getTimeUnit <em>Time Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Unit</em>' containment reference.
   * @see #getTimeUnit()
   * @generated
   */
  void setTimeUnit(TimeUnit value);

} // SampleAction