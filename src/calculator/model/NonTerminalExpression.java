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
public abstract class NonTerminalExpression implements Expression {
  private Expression leftNode;

  private Expression rightNode;

  public NonTerminalExpression(Expression l, Expression r) {
    setLeftNode(l);
    setRightNode(r);
  }

  public void setLeftNode(Expression node) {
    leftNode = node;
  }

  public void setRightNode(Expression node) {
    rightNode = node;
  }

  public Expression getLeftNode() {
    return leftNode;
  }

  public Expression getRightNode() {
    return rightNode;
  }
}// NonTerminalExpression