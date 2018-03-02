/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.model;

import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author marco
 */
public class Calculator {
    
    String berekening;
    double resultaat;

    public Calculator(String berekening) {

        this.berekening = berekening;
//        String berekening = "(20+30)+(40+50)+60=";
        String letterBerekening = berekening;
        String[] alfa = {"a", "b", "c", "d", "e", "f", "g"};
        HashMap hash = new HashMap();
        int hashTeller = 0;
        String getal = null;
        for (int i = 0; i < berekening.length(); i++) {
            if (isOperator(String.valueOf(berekening.charAt(i))) != true) {
                if (getal == null) {
                    getal = String.valueOf(berekening.charAt(i));
                } else {
                    getal += String.valueOf(berekening.charAt(i));
                }
                System.out.println(getal);
                if (getal.equals("60")) {
                    System.out.println("het is 6");
                }
            } else {
                if (getal != null) {
                    hash.put(alfa[hashTeller], getal);
                    letterBerekening =letterBerekening.replace(getal, alfa[hashTeller]);
                    hashTeller++;
                    getal = null;
                }
            }
//            System.out.println(berekening.charAt(i));
        }
        letterBerekening=letterBerekening.substring(0, letterBerekening.length()-1);
        Calculation c = new Calculation(letterBerekening, hash);
//        //          System.out.println(" Variable Values: " + "a=" + c.getValue("a")
//        //        + ", b=" + ctx.getValue("b") + ", c=" + ctx.getValue("c")
//        //        + ", d=" + ctx.getValue("d"));
//        c.setExpression("(a+b)+(c+d)+e");
//        System.out.println(" Expression = (a+b)*(c-d)");
//        System.out.println(" Result = " + c.evaluate());
//        System.out.println(c.getResult());
        resultaat = c.getResult();
    }
    
    public double getResultaat()
    {
        return resultaat;
    }

    private boolean isOperator(String str) {
        if ((str.equals("+")) || (str.equals("-")) || (str.equals("(")) || 
                (str.equals(")")) || (str.equals("*")) || (str.equals("="))
                || (str.equals("/"))) {
            return true;
        }
        return false;
    }
}
