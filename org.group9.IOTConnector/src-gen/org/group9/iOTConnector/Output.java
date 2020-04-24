/**
 * generated by Xtext 2.21.0
 */
package org.group9.iOTConnector;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.group9.iOTConnector.Output#getReadingNames <em>Reading Names</em>}</li>
 * </ul>
 *
 * @see org.group9.iOTConnector.IOTConnectorPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject
{
  /**
   * Returns the value of the '<em><b>Reading Names</b></em>' containment reference list.
   * The list contents are of type {@link org.group9.iOTConnector.ReadingName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reading Names</em>' containment reference list.
   * @see org.group9.iOTConnector.IOTConnectorPackage#getOutput_ReadingNames()
   * @model containment="true"
   * @generated
   */
  EList<ReadingName> getReadingNames();

} // Output