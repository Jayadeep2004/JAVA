/* Author : JAYADEEP G L
  Typecasting */

import java.util.*;
public class typecasting{
    public static void main(String[] args) {
        System.out.println("Widening Typecatsing");
        int intNum = 10;
        float floatNum = intNum;
        double doubleNum = intNum;
        long longNum = intNum;
        
        System.out.println(intNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(longNum);
        System.out.println("------------");
        
        System.out.println("Narrowing Typecatsing");
        double doubleNum2 =10.586d;
        float floatNum2 =(float) doubleNum;
        long longNum2 = (long) doubleNum2;
        int intNum2 = (int) doubleNum2;
        
        System.out.println(doubleNum2);
        System.out.println(floatNum2);
        System.out.println(longNum2);
        System.out.println(intNum2);
        System.out.println("------------");
       
    }
}

/* Output :
Widening Typecatsing
10
10.0
10.0
10
------------
Narrowing Typecatsing
10.586
10.0
10
10
------------ */
