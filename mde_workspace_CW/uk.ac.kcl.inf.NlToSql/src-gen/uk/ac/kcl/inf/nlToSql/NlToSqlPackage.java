/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.nlToSql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.nlToSql.NlToSqlFactory
 * @model kind="package"
 * @generated
 */
public interface NlToSqlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "nlToSql";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/kcl/inf/NlToSql";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "nlToSql";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NlToSqlPackage eINSTANCE = uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.AccountingSpeechImpl <em>Accounting Speech</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.AccountingSpeechImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getAccountingSpeech()
   * @generated
   */
  int ACCOUNTING_SPEECH = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_SPEECH__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Accounting Speech</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCOUNTING_SPEECH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.StatementImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.CreateTableStatementImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getCreateTableStatement()
   * @generated
   */
  int CREATE_TABLE_STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT__TABLE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT__COLUMNS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Create Table Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_TABLE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.ColumnListImpl <em>Column List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.ColumnListImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getColumnList()
   * @generated
   */
  int COLUMN_LIST = 3;

  /**
   * The feature id for the '<em><b>Column Item</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_LIST__COLUMN_ITEM = 0;

  /**
   * The number of structural features of the '<em>Column List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.TableImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getTable()
   * @generated
   */
  int TABLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.ColumnImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__TYPE = 1;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl <em>Select Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getSelectStatement()
   * @generated
   */
  int SELECT_STATEMENT = 6;

  /**
   * The number of structural features of the '<em>Select Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.SelectTablesListImpl <em>Select Tables List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.SelectTablesListImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getSelectTablesList()
   * @generated
   */
  int SELECT_TABLES_LIST = 7;

  /**
   * The feature id for the '<em><b>Columns</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_TABLES_LIST__COLUMNS = SELECT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_TABLES_LIST__CONDITION = SELECT_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Group By List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_TABLES_LIST__GROUP_BY_LIST = SELECT_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Select Table</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_TABLES_LIST__SELECT_TABLE = SELECT_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Select Tables List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_TABLES_LIST_FEATURE_COUNT = SELECT_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.SelectColumnsListImpl <em>Select Columns List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.SelectColumnsListImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getSelectColumnsList()
   * @generated
   */
  int SELECT_COLUMNS_LIST = 8;

  /**
   * The feature id for the '<em><b>Select Column</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_COLUMNS_LIST__SELECT_COLUMN = 0;

  /**
   * The number of structural features of the '<em>Select Columns List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_COLUMNS_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.ColumnReferenceImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getColumnReference()
   * @generated
   */
  int COLUMN_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Column</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_REFERENCE__COLUMN = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_REFERENCE__TABLE = 1;

  /**
   * The number of structural features of the '<em>Column Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.LogicExpressionsImpl <em>Logic Expressions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.LogicExpressionsImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getLogicExpressions()
   * @generated
   */
  int LOGIC_EXPRESSIONS = 10;

  /**
   * The feature id for the '<em><b>Left Hand Side</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSIONS__LEFT_HAND_SIDE = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSIONS__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right Hand Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSIONS__RIGHT_HAND_SIDE = 2;

  /**
   * The number of structural features of the '<em>Logic Expressions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_EXPRESSIONS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.ComparisonImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 11;

  /**
   * The feature id for the '<em><b>Left Hand Side</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT_HAND_SIDE = LOGIC_EXPRESSIONS__LEFT_HAND_SIDE;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OPERATOR = LOGIC_EXPRESSIONS__OPERATOR;

  /**
   * The feature id for the '<em><b>Right Hand Side</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT_HAND_SIDE = LOGIC_EXPRESSIONS__RIGHT_HAND_SIDE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT = LOGIC_EXPRESSIONS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT = LOGIC_EXPRESSIONS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = LOGIC_EXPRESSIONS_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.AccountingSpeech <em>Accounting Speech</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Accounting Speech</em>'.
   * @see uk.ac.kcl.inf.nlToSql.AccountingSpeech
   * @generated
   */
  EClass getAccountingSpeech();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.nlToSql.AccountingSpeech#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see uk.ac.kcl.inf.nlToSql.AccountingSpeech#getStatements()
   * @see #getAccountingSpeech()
   * @generated
   */
  EReference getAccountingSpeech_Statements();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see uk.ac.kcl.inf.nlToSql.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.CreateTableStatement <em>Create Table Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Table Statement</em>'.
   * @see uk.ac.kcl.inf.nlToSql.CreateTableStatement
   * @generated
   */
  EClass getCreateTableStatement();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.nlToSql.CreateTableStatement#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see uk.ac.kcl.inf.nlToSql.CreateTableStatement#getTable()
   * @see #getCreateTableStatement()
   * @generated
   */
  EReference getCreateTableStatement_Table();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.nlToSql.CreateTableStatement#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Columns</em>'.
   * @see uk.ac.kcl.inf.nlToSql.CreateTableStatement#getColumns()
   * @see #getCreateTableStatement()
   * @generated
   */
  EReference getCreateTableStatement_Columns();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.ColumnList <em>Column List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column List</em>'.
   * @see uk.ac.kcl.inf.nlToSql.ColumnList
   * @generated
   */
  EClass getColumnList();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.nlToSql.ColumnList#getColumnItem <em>Column Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Column Item</em>'.
   * @see uk.ac.kcl.inf.nlToSql.ColumnList#getColumnItem()
   * @see #getColumnList()
   * @generated
   */
  EReference getColumnList_ColumnItem();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see uk.ac.kcl.inf.nlToSql.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.nlToSql.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.nlToSql.Table#getName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.Column <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see uk.ac.kcl.inf.nlToSql.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.nlToSql.Column#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.nlToSql.Column#getName()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Name();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.nlToSql.Column#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see uk.ac.kcl.inf.nlToSql.Column#getType()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Type();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Statement</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectStatement
   * @generated
   */
  EClass getSelectStatement();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.SelectTablesList <em>Select Tables List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Tables List</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectTablesList
   * @generated
   */
  EClass getSelectTablesList();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.nlToSql.SelectTablesList#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Columns</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectTablesList#getColumns()
   * @see #getSelectTablesList()
   * @generated
   */
  EReference getSelectTablesList_Columns();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.nlToSql.SelectTablesList#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectTablesList#getCondition()
   * @see #getSelectTablesList()
   * @generated
   */
  EReference getSelectTablesList_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.nlToSql.SelectTablesList#getGroupByList <em>Group By List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group By List</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectTablesList#getGroupByList()
   * @see #getSelectTablesList()
   * @generated
   */
  EReference getSelectTablesList_GroupByList();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.nlToSql.SelectTablesList#getSelectTable <em>Select Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Select Table</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectTablesList#getSelectTable()
   * @see #getSelectTablesList()
   * @generated
   */
  EReference getSelectTablesList_SelectTable();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.SelectColumnsList <em>Select Columns List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Columns List</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectColumnsList
   * @generated
   */
  EClass getSelectColumnsList();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.nlToSql.SelectColumnsList#getSelectColumn <em>Select Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Select Column</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectColumnsList#getSelectColumn()
   * @see #getSelectColumnsList()
   * @generated
   */
  EReference getSelectColumnsList_SelectColumn();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.ColumnReference <em>Column Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Reference</em>'.
   * @see uk.ac.kcl.inf.nlToSql.ColumnReference
   * @generated
   */
  EClass getColumnReference();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.nlToSql.ColumnReference#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Column</em>'.
   * @see uk.ac.kcl.inf.nlToSql.ColumnReference#getColumn()
   * @see #getColumnReference()
   * @generated
   */
  EReference getColumnReference_Column();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.nlToSql.ColumnReference#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Table</em>'.
   * @see uk.ac.kcl.inf.nlToSql.ColumnReference#getTable()
   * @see #getColumnReference()
   * @generated
   */
  EReference getColumnReference_Table();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.LogicExpressions <em>Logic Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logic Expressions</em>'.
   * @see uk.ac.kcl.inf.nlToSql.LogicExpressions
   * @generated
   */
  EClass getLogicExpressions();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.nlToSql.LogicExpressions#getLeftHandSide <em>Left Hand Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left Hand Side</em>'.
   * @see uk.ac.kcl.inf.nlToSql.LogicExpressions#getLeftHandSide()
   * @see #getLogicExpressions()
   * @generated
   */
  EReference getLogicExpressions_LeftHandSide();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.nlToSql.LogicExpressions#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see uk.ac.kcl.inf.nlToSql.LogicExpressions#getOperator()
   * @see #getLogicExpressions()
   * @generated
   */
  EAttribute getLogicExpressions_Operator();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.nlToSql.LogicExpressions#getRightHandSide <em>Right Hand Side</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Hand Side</em>'.
   * @see uk.ac.kcl.inf.nlToSql.LogicExpressions#getRightHandSide()
   * @see #getLogicExpressions()
   * @generated
   */
  EAttribute getLogicExpressions_RightHandSide();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see uk.ac.kcl.inf.nlToSql.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.nlToSql.Comparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see uk.ac.kcl.inf.nlToSql.Comparison#getLeft()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Left();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.nlToSql.Comparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Right</em>'.
   * @see uk.ac.kcl.inf.nlToSql.Comparison#getRight()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  NlToSqlFactory getNlToSqlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.AccountingSpeechImpl <em>Accounting Speech</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.AccountingSpeechImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getAccountingSpeech()
     * @generated
     */
    EClass ACCOUNTING_SPEECH = eINSTANCE.getAccountingSpeech();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCOUNTING_SPEECH__STATEMENTS = eINSTANCE.getAccountingSpeech_Statements();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.StatementImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.CreateTableStatementImpl <em>Create Table Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.CreateTableStatementImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getCreateTableStatement()
     * @generated
     */
    EClass CREATE_TABLE_STATEMENT = eINSTANCE.getCreateTableStatement();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_TABLE_STATEMENT__TABLE = eINSTANCE.getCreateTableStatement_Table();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE_TABLE_STATEMENT__COLUMNS = eINSTANCE.getCreateTableStatement_Columns();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.ColumnListImpl <em>Column List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.ColumnListImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getColumnList()
     * @generated
     */
    EClass COLUMN_LIST = eINSTANCE.getColumnList();

    /**
     * The meta object literal for the '<em><b>Column Item</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_LIST__COLUMN_ITEM = eINSTANCE.getColumnList_ColumnItem();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.TableImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.ColumnImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getColumn()
     * @generated
     */
    EClass COLUMN = eINSTANCE.getColumn();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__NAME = eINSTANCE.getColumn_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl <em>Select Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getSelectStatement()
     * @generated
     */
    EClass SELECT_STATEMENT = eINSTANCE.getSelectStatement();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.SelectTablesListImpl <em>Select Tables List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.SelectTablesListImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getSelectTablesList()
     * @generated
     */
    EClass SELECT_TABLES_LIST = eINSTANCE.getSelectTablesList();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_TABLES_LIST__COLUMNS = eINSTANCE.getSelectTablesList_Columns();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_TABLES_LIST__CONDITION = eINSTANCE.getSelectTablesList_Condition();

    /**
     * The meta object literal for the '<em><b>Group By List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_TABLES_LIST__GROUP_BY_LIST = eINSTANCE.getSelectTablesList_GroupByList();

    /**
     * The meta object literal for the '<em><b>Select Table</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_TABLES_LIST__SELECT_TABLE = eINSTANCE.getSelectTablesList_SelectTable();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.SelectColumnsListImpl <em>Select Columns List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.SelectColumnsListImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getSelectColumnsList()
     * @generated
     */
    EClass SELECT_COLUMNS_LIST = eINSTANCE.getSelectColumnsList();

    /**
     * The meta object literal for the '<em><b>Select Column</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_COLUMNS_LIST__SELECT_COLUMN = eINSTANCE.getSelectColumnsList_SelectColumn();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.ColumnReferenceImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getColumnReference()
     * @generated
     */
    EClass COLUMN_REFERENCE = eINSTANCE.getColumnReference();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_REFERENCE__COLUMN = eINSTANCE.getColumnReference_Column();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLUMN_REFERENCE__TABLE = eINSTANCE.getColumnReference_Table();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.LogicExpressionsImpl <em>Logic Expressions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.LogicExpressionsImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getLogicExpressions()
     * @generated
     */
    EClass LOGIC_EXPRESSIONS = eINSTANCE.getLogicExpressions();

    /**
     * The meta object literal for the '<em><b>Left Hand Side</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_EXPRESSIONS__LEFT_HAND_SIDE = eINSTANCE.getLogicExpressions_LeftHandSide();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_EXPRESSIONS__OPERATOR = eINSTANCE.getLogicExpressions_Operator();

    /**
     * The meta object literal for the '<em><b>Right Hand Side</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_EXPRESSIONS__RIGHT_HAND_SIDE = eINSTANCE.getLogicExpressions_RightHandSide();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.ComparisonImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

  }

} //NlToSqlPackage
