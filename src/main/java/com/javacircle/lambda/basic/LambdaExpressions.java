package com.javacircle.lambda.basic;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class LambdaExpressions {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n) -> {
            System.out.println(n);
        });

        StringLenghLambda lenghOfString = (s,x) -> s*x;

        StringLenghLambda lenghOfString2 = (s,x) -> x+x*5;

        System.out.println("Surface is : " + lenghOfString.getLenght(5,7));

        System.out.println("Surface2 is : " + lenghOfString2.getLenght(5,7));

    }

}


interface StringLenghLambda {
    int getLenght(int a,int b);
}
