/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TankWarFactoryImpl extends EFactoryImpl implements TankWarFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TankWarFactory init()
  {
    try
    {
      TankWarFactory theTankWarFactory = (TankWarFactory)EPackage.Registry.INSTANCE.getEFactory(TankWarPackage.eNS_URI);
      if (theTankWarFactory != null)
      {
        return theTankWarFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TankWarFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TankWarFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TankWarPackage.TANK_WAR_GAME: return createTankWarGame();
      case TankWarPackage.VALUE: return createValue();
      case TankWarPackage.DIRECT_BEHAVIOUR: return createDirectBehaviour();
      case TankWarPackage.END_GAME_BEHAVIOUR: return createEndGameBehaviour();
      case TankWarPackage.STRING_VALUE: return createStringValue();
      case TankWarPackage.INT_VALUE: return createIntValue();
      case TankWarPackage.SCREEN_SPECIFICATION: return createScreenSpecification();
      case TankWarPackage.OBSTACLEPECIFICATION: return createObstaclepecification();
      case TankWarPackage.OBSTACLE_MEMBER: return createObstacleMember();
      case TankWarPackage.WATER_OBSTACLE: return createWaterObstacle();
      case TankWarPackage.WALL_OBSTACLE: return createWallObstacle();
      case TankWarPackage.FIELD_SPECIFICATION: return createFieldSpecification();
      case TankWarPackage.FIELD_INITIALISATIONS: return createFieldInitialisations();
      case TankWarPackage.LOCAL_FIELD_INITIALISATIONS: return createLocalFieldInitialisations();
      case TankWarPackage.OPTION_SPECIFICATION: return createOptionSpecification();
      case TankWarPackage.SUPER_MODE_DECLARATION: return createSuperModeDeclaration();
      case TankWarPackage.START_FIELD_DECLARATION: return createStartFieldDeclaration();
      case TankWarPackage.ALLOW_RESTART_MENU: return createAllowRestartMenu();
      case TankWarPackage.NO_OP_BEHAVIOUR: return createNoOpBehaviour();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TankWarGame createTankWarGame()
  {
    TankWarGameImpl tankWarGame = new TankWarGameImpl();
    return tankWarGame;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DirectBehaviour createDirectBehaviour()
  {
    DirectBehaviourImpl directBehaviour = new DirectBehaviourImpl();
    return directBehaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EndGameBehaviour createEndGameBehaviour()
  {
    EndGameBehaviourImpl endGameBehaviour = new EndGameBehaviourImpl();
    return endGameBehaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntValue createIntValue()
  {
    IntValueImpl intValue = new IntValueImpl();
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ScreenSpecification createScreenSpecification()
  {
    ScreenSpecificationImpl screenSpecification = new ScreenSpecificationImpl();
    return screenSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Obstaclepecification createObstaclepecification()
  {
    ObstaclepecificationImpl obstaclepecification = new ObstaclepecificationImpl();
    return obstaclepecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObstacleMember createObstacleMember()
  {
    ObstacleMemberImpl obstacleMember = new ObstacleMemberImpl();
    return obstacleMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WaterObstacle createWaterObstacle()
  {
    WaterObstacleImpl waterObstacle = new WaterObstacleImpl();
    return waterObstacle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WallObstacle createWallObstacle()
  {
    WallObstacleImpl wallObstacle = new WallObstacleImpl();
    return wallObstacle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FieldSpecification createFieldSpecification()
  {
    FieldSpecificationImpl fieldSpecification = new FieldSpecificationImpl();
    return fieldSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FieldInitialisations createFieldInitialisations()
  {
    FieldInitialisationsImpl fieldInitialisations = new FieldInitialisationsImpl();
    return fieldInitialisations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocalFieldInitialisations createLocalFieldInitialisations()
  {
    LocalFieldInitialisationsImpl localFieldInitialisations = new LocalFieldInitialisationsImpl();
    return localFieldInitialisations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OptionSpecification createOptionSpecification()
  {
    OptionSpecificationImpl optionSpecification = new OptionSpecificationImpl();
    return optionSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SuperModeDeclaration createSuperModeDeclaration()
  {
    SuperModeDeclarationImpl superModeDeclaration = new SuperModeDeclarationImpl();
    return superModeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StartFieldDeclaration createStartFieldDeclaration()
  {
    StartFieldDeclarationImpl startFieldDeclaration = new StartFieldDeclarationImpl();
    return startFieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AllowRestartMenu createAllowRestartMenu()
  {
    AllowRestartMenuImpl allowRestartMenu = new AllowRestartMenuImpl();
    return allowRestartMenu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NoOpBehaviour createNoOpBehaviour()
  {
    NoOpBehaviourImpl noOpBehaviour = new NoOpBehaviourImpl();
    return noOpBehaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TankWarPackage getTankWarPackage()
  {
    return (TankWarPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TankWarPackage getPackage()
  {
    return TankWarPackage.eINSTANCE;
  }

} //TankWarFactoryImpl
