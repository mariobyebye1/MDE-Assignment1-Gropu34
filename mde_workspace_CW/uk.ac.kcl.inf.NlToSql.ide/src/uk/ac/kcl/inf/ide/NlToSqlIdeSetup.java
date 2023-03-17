/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.kcl.inf.NlToSqlRuntimeModule;
import uk.ac.kcl.inf.NlToSqlStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class NlToSqlIdeSetup extends NlToSqlStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new NlToSqlRuntimeModule(), new NlToSqlIdeModule()));
	}
	
}
