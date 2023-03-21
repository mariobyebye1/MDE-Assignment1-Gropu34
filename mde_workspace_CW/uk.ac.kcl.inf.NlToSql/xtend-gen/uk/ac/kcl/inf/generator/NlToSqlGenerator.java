/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.generator;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.nlToSql.AccountingSpeech;
import uk.ac.kcl.inf.nlToSql.Column;
import uk.ac.kcl.inf.nlToSql.CreateTableStatement;
import uk.ac.kcl.inf.nlToSql.Datatype;
import uk.ac.kcl.inf.nlToSql.InsertStatement;
import uk.ac.kcl.inf.nlToSql.SelectStatement;
import uk.ac.kcl.inf.nlToSql.Statement;
import uk.ac.kcl.inf.nlToSql.UpdateStatement;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class NlToSqlGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final AccountingSpeech model = ((AccountingSpeech) _head);
    final String className = this.deriveClassName(resource);
    fsa.generateFile((className + ".sql"), this.doGenerateClass(model, className));
  }
  
  public CharSequence doGenerateClass(final AccountingSpeech program, final String string) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<Statement, CharSequence> _function = (Statement it) -> {
      return this.generateSQLStatement(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<Statement, CharSequence>map(program.getStatements(), _function), "\n");
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generateSQLStatement(final Statement statement) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence _generateSQLStatement(final CreateTableStatement statement) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE ");
    String _firstUpper = StringExtensions.toFirstUpper(statement.getTable().getName());
    _builder.append(_firstUpper);
    _builder.append("(");
    _builder.newLineIfNotEmpty();
    {
      EList<Column> _columnItem = statement.getColumns().getColumnItem();
      for(final Column column : _columnItem) {
        _builder.append("    ");
        String _firstUpper_1 = StringExtensions.toFirstUpper(column.getName());
        _builder.append(_firstUpper_1, "    ");
        _builder.append(" ");
        CharSequence _sqlString = this.toSqlString(column.getType());
        _builder.append(_sqlString, "    ");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append(");");
    return _builder;
  }
  
  public CharSequence toSqlString(final Datatype datatype) {
    StringConcatenation _builder = new StringConcatenation();
    String _switchResult = null;
    if (datatype != null) {
      switch (datatype) {
        case INTEGER:
          _switchResult = "INT";
          break;
        case STRING:
          _switchResult = "VARCHAR(255)";
          break;
        case DATE:
          _switchResult = "DATE";
          break;
        default:
          break;
      }
    }
    _builder.append(_switchResult);
    return _builder;
  }
  
  protected CharSequence _generateSQLStatement(final SelectStatement statement) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field generate is undefined for the type LogicExpressions");
  }
  
  protected CharSequence _generateSQLStatement(final InsertStatement statement) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field generate is undefined for the type String");
  }
  
  protected CharSequence _generateSQLStatement(final UpdateStatement statement) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field generate is undefined for the type String"
      + "\nThe method or field generate is undefined for the type LogicExpressions");
  }
  
  public String deriveClassName(final Resource resource) {
    String _xblockexpression = null;
    {
      final String originalFileName = resource.getURI().lastSegment();
      String _firstUpper = StringExtensions.toFirstUpper(originalFileName.substring(0, originalFileName.indexOf(".")));
      _xblockexpression = (_firstUpper + "AccountingSpeech");
    }
    return _xblockexpression;
  }
  
  public String deriveTargetFileNameFor(final AccountingSpeech speech, final Resource resource) {
    return resource.getURI().appendFileExtension("sql").lastSegment();
  }
  
  public CharSequence generateSQLStatement(final Statement statement) {
    if (statement instanceof CreateTableStatement) {
      return _generateSQLStatement((CreateTableStatement)statement);
    } else if (statement instanceof InsertStatement) {
      return _generateSQLStatement((InsertStatement)statement);
    } else if (statement instanceof SelectStatement) {
      return _generateSQLStatement((SelectStatement)statement);
    } else if (statement instanceof UpdateStatement) {
      return _generateSQLStatement((UpdateStatement)statement);
    } else if (statement != null) {
      return _generateSQLStatement(statement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(statement).toString());
    }
  }
}
