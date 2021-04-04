/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.validation

import org.eclipse.xtext.validation.Check
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ScreenSpecification
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarGame
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntLiteral
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.RealLiteral
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Multiplication
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Addition
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Expression

/** 
 * This class contains custom validation rules. 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TankWarValidator extends AbstractTankWarValidator {
	public static final String INVALID_NAME = "invalidName"

	@Check def void checkGameNameCapital(TankWarGame tankWarGame) {
		if (!Character::isUpperCase(tankWarGame.getName().charAt(0))) {
			warning("Name should start with a capital", TankWarPackage::Literals::TANK_WAR_GAME__NAME, INVALID_NAME)
		}
	}

	@Check def void checkScreenSpecification(ScreenSpecification screenSpecification) {
		if (screenSpecification.screenWidth.evaluate.longValue < 720 || screenSpecification.screenWidth.evaluate.longValue > 1080) {
			error("Screen width can't lower 720 or higher 1080",
				TankWarPackage::Literals::SCREEN_SPECIFICATION__SCREEN_WIDTH, "SCREEN_WIDTH")
		}
		if (screenSpecification.screenHeight.evaluate.longValue < 720 || screenSpecification.screenHeight.evaluate.longValue > 1080) {
			error("Screen height can't lower 720 or higher 1080",
				TankWarPackage::Literals::SCREEN_SPECIFICATION__SCREEN_HEIGHT, "SCREEN_HEIGHT")
		}
		if (screenSpecification.screenWidth.evaluate.longValue < screenSpecification.screenHeight.evaluate.longValue) {
			warning("Screen width must higher than height ", TankWarPackage::Literals::SCREEN_SPECIFICATION__NAME,
				"SCREEN_WIDTH_HEIFHT")
		}
	}
	
	
	def String generateJavaExpression(Expression exp) {
		exp.evaluate.translateToJavaString
	}
	
	dispatch def Number evaluate(Expression exp) { null }
	dispatch def Number evaluate(Addition exp) {
		val evaluatedChildren = #[exp.left.evaluate] + exp.right.map[evaluate]
		
		val Number[] result = #[null]
		
		evaluatedChildren.forEach[ec, idx |
			result.set(0, 
				if (idx > 0) {
					if (exp.operator.get(idx - 1) == '+') {
						result.get(0).add(ec)
					} else {
						result.get(0).subtract(ec)						
					}
				} else {
					ec
				})
		]
		
		result.get(0)
	}
	
	dispatch def Number evaluate(Multiplication exp) {
		val evaluatedChildren = #[exp.left.evaluate] + exp.right.map[evaluate]
		
		val Number[] result = #[null]
		
		evaluatedChildren.forEach[ec, idx |
			result.set(0, 
				if (idx > 0) {
					if (exp.operator.get(idx - 1) == '*') {
						result.get(0).multiply(ec)
					} else {
						result.get(0).divide(ec)						
					}
				} else {
					ec
				})
		]
		
		result.get(0)
	}
	
	dispatch def Number evaluate(IntLiteral exp) { exp.^val }
	
	dispatch def Number evaluate(RealLiteral exp) { exp.^val }
		
	dispatch def Number add(Integer a, Number b) {
		if (b instanceof Integer) {
			Integer.valueOf(a.intValue + b.intValue)
		} else {
			a.floatValue + (b as Float).floatValue		
		}
	}
	dispatch def Number add(Float a, Number b) {
		if (b instanceof Integer) {
			a.floatValue + b.floatValue
		} else {
			a.floatValue + (b as Float).floatValue			
		}
	}
	
	dispatch def Number subtract(Integer a, Number b) {
		if (b instanceof Integer) {
			Integer.valueOf(a.intValue - b.intValue)
		} else {
			a.floatValue - (b as Float).floatValue		
		}
	}
	dispatch def Number subtract(Float a, Number b) {
		if (b instanceof Integer) {
			a.floatValue - b.floatValue
		} else {
			a.floatValue - (b as Float).floatValue			
		}
	}
	
	dispatch def Number multiply(Integer a, Number b) {
		if (b instanceof Integer) {
			Integer.valueOf(a.intValue * b.intValue)
		} else {
			a.floatValue * (b as Float).floatValue		
		}
	}
	dispatch def Number multiply(Float a, Number b) {
		if (b instanceof Integer) {
			a.floatValue * b.floatValue
		} else {
			a.floatValue * (b as Float).floatValue			
		}
	}
	
	dispatch def Number divide(Integer a, Number b) {
		if (b instanceof Integer) {
			Integer.valueOf(a.intValue / b.intValue)
		} else {
			a.floatValue / (b as Float).floatValue		
		}
	}
	dispatch def Number divide(Float a, Number b) {
		if (b instanceof Integer) {
			a.floatValue / b.floatValue
		} else {
			a.floatValue / (b as Float).floatValue			
		}
	}
	dispatch def String translateToJavaString(Number n) { n.toString }
	dispatch def String translateToJavaString(Float f) '''«f.toString»f'''
}
