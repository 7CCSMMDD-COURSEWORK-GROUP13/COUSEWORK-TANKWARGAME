/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.tankWar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Game Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.EndGameBehaviour#getWin <em>Win</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.EndGameBehaviour#getLost <em>Lost</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage#getEndGameBehaviour()
 * @model
 * @generated
 */
public interface EndGameBehaviour extends OptionSpecification
{
  /**
   * Returns the value of the '<em><b>Win</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Win</em>' attribute.
   * @see #setWin(String)
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage#getEndGameBehaviour_Win()
   * @model
   * @generated
   */
  String getWin();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.EndGameBehaviour#getWin <em>Win</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Win</em>' attribute.
   * @see #getWin()
   * @generated
   */
  void setWin(String value);

  /**
   * Returns the value of the '<em><b>Lost</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lost</em>' attribute.
   * @see #setLost(String)
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage#getEndGameBehaviour_Lost()
   * @model
   * @generated
   */
  String getLost();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.EndGameBehaviour#getLost <em>Lost</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lost</em>' attribute.
   * @see #getLost()
   * @generated
   */
  void setLost(String value);

} // EndGameBehaviour
