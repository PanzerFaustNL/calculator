/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author marco
 */
public class Context {
  private HashMap varList = new HashMap();

  public void assign(String var, int value) {
    varList.put(var, new Double(value));
  }
  
  public void assign(String var, double value)
  {
      varList.put(var, new Double(value));
  }

  public double getValue(String var) {
    Double objInt = (Double) varList.get(var);
    return objInt.doubleValue();
  }

  public Context() {
    initialize();
  }

  //Values are hardcoded to keep the example simple
  private void initialize() {
    assign("a", 20);
    assign("b", 40);
    assign("c", 30);
    assign("d", 10);
    assign("e", 5);
  }
  
  public void initialize(HashMap hash)
  {
      Set entrySet = hash.entrySet();
      Iterator it = entrySet.iterator();
      while(it.hasNext())
      {
          Map.Entry me = (Map.Entry)it.next();
          assign(me.getKey().toString(),Double.parseDouble(me.getValue().toString()));
      }
  }

}