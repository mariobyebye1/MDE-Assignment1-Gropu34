/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.nlToSql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.nlToSql.LogicExpressions;
import uk.ac.kcl.inf.nlToSql.NlToSqlPackage;
import uk.ac.kcl.inf.nlToSql.SelectColumnsList;
import uk.ac.kcl.inf.nlToSql.SelectStatement;
import uk.ac.kcl.inf.nlToSql.SelectTablesList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.nlToSql.impl.SelectStatementImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectStatementImpl extends StatementImpl implements SelectStatement
{
  /**
   * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTables()
   * @generated
   * @ordered
   */
  protected SelectTablesList tables;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected SelectColumnsList columns;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected LogicExpressions condition;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected SelectColumnsList group;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NlToSqlPackage.Literals.SELECT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectTablesList getTables()
  {
    return tables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTables(SelectTablesList newTables, NotificationChain msgs)
  {
    SelectTablesList oldTables = tables;
    tables = newTables;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NlToSqlPackage.SELECT_STATEMENT__TABLES, oldTables, newTables);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTables(SelectTablesList newTables)
  {
    if (newTables != tables)
    {
      NotificationChain msgs = null;
      if (tables != null)
        msgs = ((InternalEObject)tables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NlToSqlPackage.SELECT_STATEMENT__TABLES, null, msgs);
      if (newTables != null)
        msgs = ((InternalEObject)newTables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NlToSqlPackage.SELECT_STATEMENT__TABLES, null, msgs);
      msgs = basicSetTables(newTables, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NlToSqlPackage.SELECT_STATEMENT__TABLES, newTables, newTables));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectColumnsList getColumns()
  {
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColumns(SelectColumnsList newColumns, NotificationChain msgs)
  {
    SelectColumnsList oldColumns = columns;
    columns = newColumns;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NlToSqlPackage.SELECT_STATEMENT__COLUMNS, oldColumns, newColumns);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColumns(SelectColumnsList newColumns)
  {
    if (newColumns != columns)
    {
      NotificationChain msgs = null;
      if (columns != null)
        msgs = ((InternalEObject)columns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NlToSqlPackage.SELECT_STATEMENT__COLUMNS, null, msgs);
      if (newColumns != null)
        msgs = ((InternalEObject)newColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NlToSqlPackage.SELECT_STATEMENT__COLUMNS, null, msgs);
      msgs = basicSetColumns(newColumns, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NlToSqlPackage.SELECT_STATEMENT__COLUMNS, newColumns, newColumns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicExpressions getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(LogicExpressions newCondition, NotificationChain msgs)
  {
    LogicExpressions oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NlToSqlPackage.SELECT_STATEMENT__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(LogicExpressions newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NlToSqlPackage.SELECT_STATEMENT__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NlToSqlPackage.SELECT_STATEMENT__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NlToSqlPackage.SELECT_STATEMENT__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectColumnsList getGroup()
  {
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroup(SelectColumnsList newGroup, NotificationChain msgs)
  {
    SelectColumnsList oldGroup = group;
    group = newGroup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NlToSqlPackage.SELECT_STATEMENT__GROUP, oldGroup, newGroup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGroup(SelectColumnsList newGroup)
  {
    if (newGroup != group)
    {
      NotificationChain msgs = null;
      if (group != null)
        msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NlToSqlPackage.SELECT_STATEMENT__GROUP, null, msgs);
      if (newGroup != null)
        msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NlToSqlPackage.SELECT_STATEMENT__GROUP, null, msgs);
      msgs = basicSetGroup(newGroup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NlToSqlPackage.SELECT_STATEMENT__GROUP, newGroup, newGroup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case NlToSqlPackage.SELECT_STATEMENT__TABLES:
        return basicSetTables(null, msgs);
      case NlToSqlPackage.SELECT_STATEMENT__COLUMNS:
        return basicSetColumns(null, msgs);
      case NlToSqlPackage.SELECT_STATEMENT__CONDITION:
        return basicSetCondition(null, msgs);
      case NlToSqlPackage.SELECT_STATEMENT__GROUP:
        return basicSetGroup(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NlToSqlPackage.SELECT_STATEMENT__TABLES:
        return getTables();
      case NlToSqlPackage.SELECT_STATEMENT__COLUMNS:
        return getColumns();
      case NlToSqlPackage.SELECT_STATEMENT__CONDITION:
        return getCondition();
      case NlToSqlPackage.SELECT_STATEMENT__GROUP:
        return getGroup();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NlToSqlPackage.SELECT_STATEMENT__TABLES:
        setTables((SelectTablesList)newValue);
        return;
      case NlToSqlPackage.SELECT_STATEMENT__COLUMNS:
        setColumns((SelectColumnsList)newValue);
        return;
      case NlToSqlPackage.SELECT_STATEMENT__CONDITION:
        setCondition((LogicExpressions)newValue);
        return;
      case NlToSqlPackage.SELECT_STATEMENT__GROUP:
        setGroup((SelectColumnsList)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NlToSqlPackage.SELECT_STATEMENT__TABLES:
        setTables((SelectTablesList)null);
        return;
      case NlToSqlPackage.SELECT_STATEMENT__COLUMNS:
        setColumns((SelectColumnsList)null);
        return;
      case NlToSqlPackage.SELECT_STATEMENT__CONDITION:
        setCondition((LogicExpressions)null);
        return;
      case NlToSqlPackage.SELECT_STATEMENT__GROUP:
        setGroup((SelectColumnsList)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NlToSqlPackage.SELECT_STATEMENT__TABLES:
        return tables != null;
      case NlToSqlPackage.SELECT_STATEMENT__COLUMNS:
        return columns != null;
      case NlToSqlPackage.SELECT_STATEMENT__CONDITION:
        return condition != null;
      case NlToSqlPackage.SELECT_STATEMENT__GROUP:
        return group != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectStatementImpl
