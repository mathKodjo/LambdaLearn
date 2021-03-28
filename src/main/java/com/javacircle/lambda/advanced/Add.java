package com.javacircle.lambda.advanced;

public class Add {

    public static String findTrueResult(String str){
        Calc calc = (x,y)->x*y;
       return  str + " are " + calc.findTrue(9,8);
    }

}
