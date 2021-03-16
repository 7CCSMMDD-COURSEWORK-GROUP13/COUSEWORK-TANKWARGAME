/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.kcl.inf.mdd.cf.tankwar.TankWarRuntimeModule;
import uk.ac.kcl.inf.mdd.cf.tankwar.TankWarStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class TankWarIdeSetup extends TankWarStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new TankWarRuntimeModule(), new TankWarIdeModule()));
	}
	
}
