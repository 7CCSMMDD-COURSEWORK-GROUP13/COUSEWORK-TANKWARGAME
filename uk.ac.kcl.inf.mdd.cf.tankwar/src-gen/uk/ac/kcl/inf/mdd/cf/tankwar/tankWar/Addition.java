/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.tankWar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Addition#getLeft <em>Left</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Addition#getOperator <em>Operator</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Addition#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage#getAddition()
 * @model
 * @generated
 */
public interface Addition extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage#getAddition_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Addition#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute list.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage#getAddition_Operator()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperator();

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference list.
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage#getAddition_Right()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getRight();

} // Addition
