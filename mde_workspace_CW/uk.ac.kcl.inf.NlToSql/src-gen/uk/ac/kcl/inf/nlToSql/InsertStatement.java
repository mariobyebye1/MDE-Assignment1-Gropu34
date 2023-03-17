/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.nlToSql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.nlToSql.InsertStatement#getPropertyList <em>Property List</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.nlToSql.InsertStatement#getValueList <em>Value List</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage#getInsertStatement()
 * @model
 * @generated
 */
public interface InsertStatement extends Statement
{
  /**
   * Returns the value of the '<em><b>Property List</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.nlToSql.PropertyName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property List</em>' containment reference list.
   * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage#getInsertStatement_PropertyList()
   * @model containment="true"
   * @generated
   */
  EList<PropertyName> getPropertyList();

  /**
   * Returns the value of the '<em><b>Value List</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value List</em>' attribute list.
   * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage#getInsertStatement_ValueList()
   * @model unique="false"
   * @generated
   */
  EList<String> getValueList();

} // InsertStatement
