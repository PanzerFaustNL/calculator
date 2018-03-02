/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.model;

/**
 *
 * @author marco
 */
public class SubtractExpression extends NonTerminalExpression {
  public double evaluate(Context c) {
    return getLeftNode().evaluate(c) - getRightNode().evaluate(c);
  }

  public SubtractExpression(Expression l, Expression r) {
    super(l, r);
  }
}// SubtractExpression