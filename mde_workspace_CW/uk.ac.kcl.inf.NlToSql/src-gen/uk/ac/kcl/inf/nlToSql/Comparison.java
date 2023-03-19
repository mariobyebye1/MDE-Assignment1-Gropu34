/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.nlToSql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.nlToSql.Comparison#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.nlToSql.Comparison#getLogicOperator <em>Logic Operator</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.nlToSql.Comparison#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends LogicExpressions
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LogicExpressions)
   * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage#getComparison_Left()
   * @model containment="true"
   * @generated
   */
  LogicExpressions getLeft();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.nlToSql.Comparison#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LogicExpressions value);

  /**
   * Returns the value of the '<em><b>Logic Operator</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.inf.nlToSql.LogicOperator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic Operator</em>' attribute.
   * @see uk.ac.kcl.inf.nlToSql.LogicOperator
   * @see #setLogicOperator(LogicOperator)
   * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage#getComparison_LogicOperator()
   * @model
   * @generated
   */
  LogicOperator getLogicOperator();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.nlToSql.Comparison#getLogicOperator <em>Logic Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logic Operator</em>' attribute.
   * @see uk.ac.kcl.inf.nlToSql.LogicOperator
   * @see #getLogicOperator()
   * @generated
   */
  void setLogicOperator(LogicOperator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.nlToSql.LogicExpressions}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage#getComparison_Right()
   * @model containment="true"
   * @generated
   */
  EList<LogicExpressions> getRight();

} // Comparison
