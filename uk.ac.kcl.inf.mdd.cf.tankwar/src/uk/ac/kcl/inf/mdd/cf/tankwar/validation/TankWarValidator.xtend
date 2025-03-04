/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.validation

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Addition
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Expression
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.FieldSpecification
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntLiteral
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntVarExpression
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Multiplication
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.RealLiteral
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.ScreenSpecification
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarGame
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.WallObstacle
import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.semantics.validation.TgameSemanticsValidator

/** 
 * This class contains custom validation rules.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all") class TankWarValidator extends TgameSemanticsValidator {
	public static final String INVALID_NAME = "invalidName"
	public static final String INVALID_SCREEN_WIDTH = "screenWidth"
	public static final String INVALID_SCREEN_HEIGHT = "screenHeight"
	public static final String INVALID_SCREEN_COMPARE = "screenCompare"
	public static final String INVALID_WALL_X = "wallX"
	public static final String INVALID_WALL_Y = "wallY"
	public static final String INVALID_ENEMY_COUNT_POSITIVE = "ENEMY_COUNT_POSITIVE"
	public static final String INVALID_ENEMY_COUNT_DECIMAL = "ENEMY_COUNT_DECIMAL"
	

	@Check def void checkGameNameCapital(TankWarGame tankWarGame) {
		if (!Character::isUpperCase(tankWarGame.getName().charAt(0))) {
			warning("Name should start with a capital", TankWarPackage::Literals::TANK_WAR_GAME__NAME, INVALID_NAME)
		}
	}

	@Check def void checkScreenSpecification(ScreenSpecification screenSpecification) {
		if (screenSpecification.screenWidth < 720 || screenSpecification.screenWidth > 1080) {
			error("Screen width can't lower 720 or higher 1080",
				TankWarPackage::Literals::SCREEN_SPECIFICATION__SCREEN_WIDTH, INVALID_SCREEN_WIDTH)
		}
		if (screenSpecification.screenHeight < 720 || screenSpecification.screenHeight > 1080) {
			error("Screen height can't lower 720 or higher 1080",
				TankWarPackage::Literals::SCREEN_SPECIFICATION__SCREEN_HEIGHT, INVALID_SCREEN_HEIGHT)
		}
		if (screenSpecification.screenWidth < screenSpecification.screenHeight) {
			warning("Screen width must higher than height ", TankWarPackage::Literals::SCREEN_SPECIFICATION__NAME,
				INVALID_SCREEN_COMPARE)
		}
	}

	def TankWarGame getTankWarGame(EObject object){
		if(object === null){
			return null;
		}
		if(object instanceof TankWarGame){
			return object as TankWarGame;
		} else {
			return getTankWarGame(object.eContainer);
		}
	}

	@Check def void checkWall(WallObstacle wallObstacle) {
		if( getTankWarGame(wallObstacle) !== null){
			if (wallObstacle.wallWidth + wallObstacle.wallPosX > getTankWarGame(wallObstacle).screen.screenWidth) {
				error("Wall must inside the screen", 
					TankWarPackage::Literals::WALL_OBSTACLE__WALL_WIDTH, INVALID_WALL_X)
			}
			if(wallObstacle.wallHeight + wallObstacle.wallPosY > getTankWarGame(wallObstacle).screen.screenHeight){
				error("Wall must inside the screen", 
					TankWarPackage::Literals::WALL_OBSTACLE__WALL_HEIGHT, INVALID_WALL_Y)
			}
		}
	}

	@Check def void checkEnemyCount(FieldSpecification fieldSpecification) {
	
		if (fieldSpecification.enemyCount!==null) {
			if (fieldSpecification.enemyCount.evaluate.intValue<1) {
				error("enemyCount should be a positive integer",
					TankWarPackage.Literals.FIELD_SPECIFICATION__ENEMY_COUNT, INVALID_ENEMY_COUNT_POSITIVE)
			} else {
				if(fieldSpecification.enemyCount.evaluate.doubleValue!==fieldSpecification.enemyCount.evaluate.intValue){
					error("enemyCount should be a integer",
						TankWarPackage.Literals.FIELD_SPECIFICATION__ENEMY_COUNT,INVALID_ENEMY_COUNT_DECIMAL )
				}
				
			}
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
	dispatch def Number evaluate(IntVarExpression exp) { exp.^var.value }
	
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
			(Float.valueOf(a.intValue)) / (Float.valueOf(b.intValue))
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
			(Float.valueOf(a.intValue)) / (Float.valueOf(b.intValue))
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
