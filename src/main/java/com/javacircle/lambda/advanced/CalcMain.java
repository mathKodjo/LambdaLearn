package com.javacircle.lambda.advanced;

import jdk.swing.interop.SwingInterOpUtils;

public class CalcMain {
    public static void main(String[] args) {
        String salem = "Je suis fort ..";
      System.out.println( Add.findTrueResult(salem));
      Calc cal = (x,y)->x/y;
        System.out.println(cal.findTrue(50,10));
        cal = (x,y)->x*3+y*4;
        System.out.println(cal.findTrue(5,9));

    }
}
