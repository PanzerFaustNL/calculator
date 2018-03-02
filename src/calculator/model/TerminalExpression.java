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
public class TerminalExpression implements Expression {
  private String var;

  public TerminalExpression(String v) {
    var = v;
  }

  public double evaluate(Context c) {
    return c.getValue(var);
  }
}


