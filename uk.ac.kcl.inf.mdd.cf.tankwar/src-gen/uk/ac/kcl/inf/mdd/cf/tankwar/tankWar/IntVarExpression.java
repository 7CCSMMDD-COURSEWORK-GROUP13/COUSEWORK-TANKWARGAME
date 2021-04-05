/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.mdd.cf.tankwar.tankWar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Var Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntVarExpression#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage#getIntVarExpression()
 * @model
 * @generated
 */
public interface IntVarExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(VariableDeclaration)
   * @see uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.TankWarPackage#getIntVarExpression_Var()
   * @model
   * @generated
   */
  VariableDeclaration getVar();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mdd.cf.tankwar.tankWar.IntVarExpression#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(VariableDeclaration value);

} // IntVarExpression
