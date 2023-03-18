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
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl <em>Select Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getSelectStatement()
   * @generated
   */
  int SELECT_STATEMENT = 2;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__ENTITY = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Group By List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT__GROUP_BY_LIST = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Select Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.EntityNameImpl <em>Entity Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.EntityNameImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getEntityName()
   * @generated
   */
  int ENTITY_NAME = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Entity Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.SelectListImpl <em>Select List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.SelectListImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getSelectList()
   * @generated
   */
  int SELECT_LIST = 4;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_LIST__ENTITY = SELECT_STATEMENT__ENTITY;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_LIST__CONDITION = SELECT_STATEMENT__CONDITION;

  /**
   * The feature id for the '<em><b>Group By List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_LIST__GROUP_BY_LIST = SELECT_STATEMENT__GROUP_BY_LIST;

  /**
   * The feature id for the '<em><b>Select Item</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_LIST__SELECT_ITEM = SELECT_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Select List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_LIST_FEATURE_COUNT = SELECT_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.PropertyReferenceImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getPropertyReference()
   * @generated
   */
  int PROPERTY_REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE__PROPERTY = 0;

  /**
   * The number of structural features of the '<em>Property Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.PropertyImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.nlToSql.impl.LogicExpressionsImpl <em>Logic Expressions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.nlToSql.impl.LogicExpressionsImpl
   * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getLogicExpressions()
   * @generated
   */
  int LOGIC_EXPRESSIONS = 7;

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
  int COMPARISON = 8;

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
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.SelectStatement <em>Select Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Statement</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectStatement
   * @generated
   */
  EClass getSelectStatement();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.nlToSql.SelectStatement#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectStatement#getEntity()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_Entity();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.nlToSql.SelectStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectStatement#getCondition()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_Condition();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.nlToSql.SelectStatement#getGroupByList <em>Group By List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group By List</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectStatement#getGroupByList()
   * @see #getSelectStatement()
   * @generated
   */
  EReference getSelectStatement_GroupByList();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.EntityName <em>Entity Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Name</em>'.
   * @see uk.ac.kcl.inf.nlToSql.EntityName
   * @generated
   */
  EClass getEntityName();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.nlToSql.EntityName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.nlToSql.EntityName#getName()
   * @see #getEntityName()
   * @generated
   */
  EAttribute getEntityName_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.SelectList <em>Select List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select List</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectList
   * @generated
   */
  EClass getSelectList();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.nlToSql.SelectList#getSelectItem <em>Select Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Select Item</em>'.
   * @see uk.ac.kcl.inf.nlToSql.SelectList#getSelectItem()
   * @see #getSelectList()
   * @generated
   */
  EReference getSelectList_SelectItem();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.PropertyReference <em>Property Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Reference</em>'.
   * @see uk.ac.kcl.inf.nlToSql.PropertyReference
   * @generated
   */
  EClass getPropertyReference();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.nlToSql.PropertyReference#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see uk.ac.kcl.inf.nlToSql.PropertyReference#getProperty()
   * @see #getPropertyReference()
   * @generated
   */
  EReference getPropertyReference_Property();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.nlToSql.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see uk.ac.kcl.inf.nlToSql.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.nlToSql.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.nlToSql.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

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
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl <em>Select Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getSelectStatement()
     * @generated
     */
    EClass SELECT_STATEMENT = eINSTANCE.getSelectStatement();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__ENTITY = eINSTANCE.getSelectStatement_Entity();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__CONDITION = eINSTANCE.getSelectStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Group By List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_STATEMENT__GROUP_BY_LIST = eINSTANCE.getSelectStatement_GroupByList();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.EntityNameImpl <em>Entity Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.EntityNameImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getEntityName()
     * @generated
     */
    EClass ENTITY_NAME = eINSTANCE.getEntityName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_NAME__NAME = eINSTANCE.getEntityName_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.SelectListImpl <em>Select List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.SelectListImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getSelectList()
     * @generated
     */
    EClass SELECT_LIST = eINSTANCE.getSelectList();

    /**
     * The meta object literal for the '<em><b>Select Item</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_LIST__SELECT_ITEM = eINSTANCE.getSelectList_SelectItem();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.PropertyReferenceImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getPropertyReference()
     * @generated
     */
    EClass PROPERTY_REFERENCE = eINSTANCE.getPropertyReference();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_REFERENCE__PROPERTY = eINSTANCE.getPropertyReference_Property();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.nlToSql.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.nlToSql.impl.PropertyImpl
     * @see uk.ac.kcl.inf.nlToSql.impl.NlToSqlPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

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
