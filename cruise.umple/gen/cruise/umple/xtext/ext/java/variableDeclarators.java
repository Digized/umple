/**
 * <copyright>
 * </copyright>
 *
 */
package cruise.umple.xtext.ext.java;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable Declarators</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cruise.umple.xtext.ext.java.variableDeclarators#getVd <em>Vd</em>}</li>
 * </ul>
 * </p>
 *
 * @see cruise.umple.xtext.ext.java.JavaPackage#getvariableDeclarators()
 * @model
 * @generated
 */
public interface variableDeclarators extends EObject
{
  /**
   * Returns the value of the '<em><b>Vd</b></em>' containment reference list.
   * The list contents are of type {@link cruise.umple.xtext.ext.java.variableDeclarator}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vd</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vd</em>' containment reference list.
   * @see cruise.umple.xtext.ext.java.JavaPackage#getvariableDeclarators_Vd()
   * @model containment="true"
   * @generated
   */
  EList<variableDeclarator> getVd();

} // variableDeclarators
