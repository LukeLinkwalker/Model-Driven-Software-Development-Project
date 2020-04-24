/**
 * generated by Xtext 2.21.0
 */
package org.group9.iOTConnector;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.group9.iOTConnector.SensorConfig#getName <em>Name</em>}</li>
 *   <li>{@link org.group9.iOTConnector.SensorConfig#getPinIn <em>Pin In</em>}</li>
 *   <li>{@link org.group9.iOTConnector.SensorConfig#getPinOut <em>Pin Out</em>}</li>
 * </ul>
 *
 * @see org.group9.iOTConnector.IOTConnectorPackage#getSensorConfig()
 * @model
 * @generated
 */
public interface SensorConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSensorConfig_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SensorConfig#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pin In</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pin In</em>' attribute.
   * @see #setPinIn(String)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSensorConfig_PinIn()
   * @model
   * @generated
   */
  String getPinIn();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SensorConfig#getPinIn <em>Pin In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pin In</em>' attribute.
   * @see #getPinIn()
   * @generated
   */
  void setPinIn(String value);

  /**
   * Returns the value of the '<em><b>Pin Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pin Out</em>' attribute.
   * @see #setPinOut(String)
   * @see org.group9.iOTConnector.IOTConnectorPackage#getSensorConfig_PinOut()
   * @model
   * @generated
   */
  String getPinOut();

  /**
   * Sets the value of the '{@link org.group9.iOTConnector.SensorConfig#getPinOut <em>Pin Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pin Out</em>' attribute.
   * @see #getPinOut()
   * @generated
   */
  void setPinOut(String value);

} // SensorConfig