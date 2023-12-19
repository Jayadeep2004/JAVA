/*Author : JAYADEEP G L 
  Addition of two numbers */

import java.util.Scanner;
public class addition{
    public static void main(String[] args){
        System.out.println("Addition of two numbers :");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer :");
        int a = input.nextInt();
        System.out.println("Enter second integer :");
        int b = input.nextInt();
        int sum;
        sum = a+b;
        System.out.println("Addition of two numbers is :" + sum);
        input.close();
        
    }
}

/* output:
Addition of two numbers :
Enter first integer
10
Enter second integer :
20
Addition of two numbers is :30 */
