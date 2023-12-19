/* Author : JAYADEEP G L 
  TASK : Simple concatenation example */

import java.util.*;
public class concatenation{
    public static void main(String[] args) {
        System.out.println("Concatenation example1:");
        String name1 = "Jaya";
        String name2 = "Deep";
        System.out.println("Before concatenation :\n" + name1 + "\n"+ name2 + "\n");
        System.out.println("After concatenation :");
        System.out.println(name1.concat(name2));
    }
}


/* Output:
Concatenation example1:
Before concatenation :
Jaya
Deep

After concatenation :
JayaDeep */
