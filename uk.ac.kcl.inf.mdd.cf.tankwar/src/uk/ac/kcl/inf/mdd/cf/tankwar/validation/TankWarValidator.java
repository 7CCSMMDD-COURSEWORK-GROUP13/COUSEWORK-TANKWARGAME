/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.validation;

import org.eclipse.xtext.validation.Check;

import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ScreenSpecification;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarGame;
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class TankWarValidator extends AbstractTankWarValidator {
	
	public static final String INVALID_NAME = "invalidName";

	@Check
	public void checkGameNameCapital(TankWarGame tankWarGame) {
		if (!Character.isUpperCase(tankWarGame.getName().charAt(0))) {
			warning("Name should start with a capital",
					TankWarPackage.Literals.TANK_WAR_GAME__NAME,
					INVALID_NAME);
		}
	}
	
	@Check
	public void checkScreenSpecification(ScreenSpecification screenSpecification) {
		if (screenSpecification.getScreenWidth() < 720 || screenSpecification.getScreenWidth() > 1080) {
			error("Screen width can't lower 720 or higher 1080",
					TankWarPackage.Literals.SCREEN_SPECIFICATION__SCREEN_WIDTH,"SCREEN_WIDTH");
		}
		
		if (screenSpecification.getScreenHeight() < 720 || screenSpecification.getScreenHeight() > 1080) {
			error("Screen height can't lower 720 or higher 1080",
					TankWarPackage.Literals.SCREEN_SPECIFICATION__SCREEN_HEIGHT,"SCREEN_HEIGHT");
		}
		
		if (screenSpecification.getScreenWidth() < screenSpecification.getScreenHeight()) {
			
			warning("Screen width must higher than height ",
					TankWarPackage.Literals.SCREEN_SPECIFICATION__NAME,"SCREEN_WIDTH_HEIFHT");
		}
	}
	
}
