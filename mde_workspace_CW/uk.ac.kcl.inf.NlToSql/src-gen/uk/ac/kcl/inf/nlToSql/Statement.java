/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.nlToSql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.nlToSql.Statement#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(EntityName)
   * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage#getStatement_Entity()
   * @model containment="true"
   * @generated
   */
  EntityName getEntity();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.nlToSql.Statement#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(EntityName value);

} // Statement
