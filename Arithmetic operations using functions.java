/* Author : JAYADEEP G L 
  Arithmetic operations using functions */

public class main{
    static void add(int x,int y){
        System.out.println("sum = " + (x+y));
    }
    
    static void sub(int x,int y){
        System.out.println("sum = " + (x-y));
    }
    
    static void mul(int x,int y){
        System.out.println("product = " + (x*y));
    }
    
    static void div(int x,int y){
        System.out.println("product = " + (x/y));
    }
    
    static void mod(int x,int y){
        System.out.println("product = " + (x%y));
    }
    
    public static void main(String[] args) {
        add(12,16);
        sub(18,6);
        mul(16,5);
        div(120,10);
        mod(100,8);
    }
}

/* Output :
sum = 28
sum = 12
product = 80
product = 12
product = 4 */
