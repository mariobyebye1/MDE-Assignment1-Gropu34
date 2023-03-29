package uk.ac.kcl.inf.languages.nlToSql.xpect.InsertStatement;

import org.eclipse.xpect.runner.XpectRunner;
import org.eclipse.xpect.runner.XpectSuiteClasses;
import org.eclipse.xpect.xtext.lib.tests.GeneratorTest;
import org.eclipse.xpect.xtext.lib.tests.JvmModelInferrerTest;
import org.eclipse.xpect.xtext.lib.tests.LinkingTest;
import org.eclipse.xpect.xtext.lib.tests.ScopingTest;
import org.eclipse.xpect.xtext.lib.tests.ValidationTest;
import org.eclipse.xpect.xtext.lib.tests.XtextTests;
import org.junit.runner.RunWith;


@XpectSuiteClasses({
	JvmModelInferrerTest.class,
	LinkingTest.class,
	ScopingTest.class,
	ValidationTest.class
})
@RunWith(XpectRunner.class)
public class XpectTestsInsertStatement extends GeneratorTest {

}


