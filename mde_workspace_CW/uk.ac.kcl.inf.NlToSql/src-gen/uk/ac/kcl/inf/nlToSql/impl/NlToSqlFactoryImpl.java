/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.nlToSql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.nlToSql.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NlToSqlFactoryImpl extends EFactoryImpl implements NlToSqlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NlToSqlFactory init()
  {
    try
    {
      NlToSqlFactory theNlToSqlFactory = (NlToSqlFactory)EPackage.Registry.INSTANCE.getEFactory(NlToSqlPackage.eNS_URI);
      if (theNlToSqlFactory != null)
      {
        return theNlToSqlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NlToSqlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NlToSqlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case NlToSqlPackage.ACCOUNTING_SPEECH: return createAccountingSpeech();
      case NlToSqlPackage.STATEMENT: return createStatement();
      case NlToSqlPackage.CREATE_TABLE_STATEMENT: return createCreateTableStatement();
      case NlToSqlPackage.COLUMN_LIST: return createColumnList();
      case NlToSqlPackage.TABLE: return createTable();
      case NlToSqlPackage.COLUMN: return createColumn();
      case NlToSqlPackage.SELECT_STATEMENT: return createSelectStatement();
      case NlToSqlPackage.SELECT_TABLES_LIST: return createSelectTablesList();
      case NlToSqlPackage.SELECT_COLUMNS_LIST: return createSelectColumnsList();
      case NlToSqlPackage.COLUMN_REFERENCE: return createColumnReference();
      case NlToSqlPackage.LOGIC_EXPRESSIONS: return createLogicExpressions();
      case NlToSqlPackage.COMPARISON: return createComparison();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AccountingSpeech createAccountingSpeech()
  {
    AccountingSpeechImpl accountingSpeech = new AccountingSpeechImpl();
    return accountingSpeech;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateTableStatement createCreateTableStatement()
  {
    CreateTableStatementImpl createTableStatement = new CreateTableStatementImpl();
    return createTableStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColumnList createColumnList()
  {
    ColumnListImpl columnList = new ColumnListImpl();
    return columnList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Column createColumn()
  {
    ColumnImpl column = new ColumnImpl();
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectStatement createSelectStatement()
  {
    SelectStatementImpl selectStatement = new SelectStatementImpl();
    return selectStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectTablesList createSelectTablesList()
  {
    SelectTablesListImpl selectTablesList = new SelectTablesListImpl();
    return selectTablesList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectColumnsList createSelectColumnsList()
  {
    SelectColumnsListImpl selectColumnsList = new SelectColumnsListImpl();
    return selectColumnsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColumnReference createColumnReference()
  {
    ColumnReferenceImpl columnReference = new ColumnReferenceImpl();
    return columnReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicExpressions createLogicExpressions()
  {
    LogicExpressionsImpl logicExpressions = new LogicExpressionsImpl();
    return logicExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NlToSqlPackage getNlToSqlPackage()
  {
    return (NlToSqlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NlToSqlPackage getPackage()
  {
    return NlToSqlPackage.eINSTANCE;
  }

} //NlToSqlFactoryImpl
