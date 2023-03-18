/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.nlToSql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.nlToSql.SelectList#getSelectItem <em>Select Item</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage#getSelectList()
 * @model
 * @generated
 */
public interface SelectList extends SelectStatement
{
  /**
   * Returns the value of the '<em><b>Select Item</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.nlToSql.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Select Item</em>' containment reference list.
   * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage#getSelectList_SelectItem()
   * @model containment="true"
   * @generated
   */
  EList<Property> getSelectItem();

} // SelectList
