/* Author : JAYADEEP
  Accessing of array elements using normal method and for loop */

import java.util.*;
public class concatenation{
    public static void main(String[] args) {
        
        
        String[] cars1 = {"Benz", "Ferrari", "Lamborgini", "Mazda"};
        String[] cars2 = {"Maruti", "Ford", "Toyota", "Hyundai"};
        //Method 1
        System.out.println("Accessing of array elements using normal method :");
        System.out.println("Cars1 :");
        System.out.println(cars1[0]);
        System.out.println(cars1[1]);
        System.out.println(cars1[2]);
        System.out.println(cars1[3]);
        System.out.println("--------------");
        System.out.println("Cars2 :");
        System.out.println(cars2[0]);
        System.out.println(cars2[1]);
        System.out.println(cars2[2]);
        System.out.println(cars2[3]); 
        System.out.println("--------------");
        
        //Method 2
        System.out.println("Accessing of array elements using for loop :");

        int i,j;
        System.out.println("Cars1 :");
        for (i=0; i<cars1.length; i++) {
            System.out.println(cars1[i] );
        }
        System.out.println("--------------");
        System.out.println("Cars2 :");
        for(j=0; j<cars2.length; j++) {
            System.out.println(cars2[j]);
        }
        System.out.println("--------------");
    }
}


/* Output:
Accessing of array elements using normal method :
Cars1 :
Benz
Ferrari
Lamborgini
Mazda
--------------
Cars2 :
Maruti
Ford
Toyota
Hyundai
--------------
Accessing of array elements using for loop :
Cars1 :
Benz
Ferrari
Lamborgini
Mazda
--------------
Cars2 :
Maruti
Ford
Toyota
Hyundai
-------------- */
