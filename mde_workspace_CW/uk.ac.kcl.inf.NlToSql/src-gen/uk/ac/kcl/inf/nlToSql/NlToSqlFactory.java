/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.nlToSql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.nlToSql.NlToSqlPackage
 * @generated
 */
public interface NlToSqlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NlToSqlFactory eINSTANCE = uk.ac.kcl.inf.nlToSql.impl.NlToSqlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Accounting Speech</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Accounting Speech</em>'.
   * @generated
   */
  AccountingSpeech createAccountingSpeech();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Create Table Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Table Statement</em>'.
   * @generated
   */
  CreateTableStatement createCreateTableStatement();

  /**
   * Returns a new object of class '<em>Column List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column List</em>'.
   * @generated
   */
  ColumnList createColumnList();

  /**
   * Returns a new object of class '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table</em>'.
   * @generated
   */
  Table createTable();

  /**
   * Returns a new object of class '<em>Column</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column</em>'.
   * @generated
   */
  Column createColumn();

  /**
   * Returns a new object of class '<em>Select Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Statement</em>'.
   * @generated
   */
  SelectStatement createSelectStatement();

  /**
   * Returns a new object of class '<em>Select Tables List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Tables List</em>'.
   * @generated
   */
  SelectTablesList createSelectTablesList();

  /**
   * Returns a new object of class '<em>Select Columns List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Columns List</em>'.
   * @generated
   */
  SelectColumnsList createSelectColumnsList();

  /**
   * Returns a new object of class '<em>Column Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Column Reference</em>'.
   * @generated
   */
  ColumnReference createColumnReference();

  /**
   * Returns a new object of class '<em>Logic Expressions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logic Expressions</em>'.
   * @generated
   */
  LogicExpressions createLogicExpressions();

  /**
   * Returns a new object of class '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison</em>'.
   * @generated
   */
  Comparison createComparison();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  NlToSqlPackage getNlToSqlPackage();

} //NlToSqlFactory
