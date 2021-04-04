/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.tankWar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage
 * @generated
 */
public interface TankWarFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TankWarFactory eINSTANCE = uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.impl.TankWarFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Game</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Game</em>'.
   * @generated
   */
  TankWarGame createTankWarGame();

  /**
   * Returns a new object of class '<em>End Game Behaviour</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>End Game Behaviour</em>'.
   * @generated
   */
  EndGameBehaviour createEndGameBehaviour();

  /**
   * Returns a new object of class '<em>Screen Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Screen Specification</em>'.
   * @generated
   */
  ScreenSpecification createScreenSpecification();

  /**
   * Returns a new object of class '<em>Obstaclepecification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Obstaclepecification</em>'.
   * @generated
   */
  Obstaclepecification createObstaclepecification();

  /**
   * Returns a new object of class '<em>Obstacle Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Obstacle Member</em>'.
   * @generated
   */
  ObstacleMember createObstacleMember();

  /**
   * Returns a new object of class '<em>Water Obstacle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Water Obstacle</em>'.
   * @generated
   */
  WaterObstacle createWaterObstacle();

  /**
   * Returns a new object of class '<em>Wall Obstacle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wall Obstacle</em>'.
   * @generated
   */
  WallObstacle createWallObstacle();

  /**
   * Returns a new object of class '<em>Field Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Specification</em>'.
   * @generated
   */
  FieldSpecification createFieldSpecification();

  /**
   * Returns a new object of class '<em>Option Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Option Specification</em>'.
   * @generated
   */
  OptionSpecification createOptionSpecification();

  /**
   * Returns a new object of class '<em>Super Mode Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Super Mode Declaration</em>'.
   * @generated
   */
  SuperModeDeclaration createSuperModeDeclaration();

  /**
   * Returns a new object of class '<em>Start Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Field Declaration</em>'.
   * @generated
   */
  StartFieldDeclaration createStartFieldDeclaration();

  /**
   * Returns a new object of class '<em>Allow Restart Menu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Allow Restart Menu</em>'.
   * @generated
   */
  AllowRestartMenu createAllowRestartMenu();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  RealLiteral createRealLiteral();

  /**
   * Returns a new object of class '<em>Addition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Addition</em>'.
   * @generated
   */
  Addition createAddition();

  /**
   * Returns a new object of class '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication</em>'.
   * @generated
   */
  Multiplication createMultiplication();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TankWarPackage getTankWarPackage();

} //TankWarFactory
