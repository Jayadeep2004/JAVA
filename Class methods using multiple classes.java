/* Author : JAYADEEP G L 
  class methods using multiple classes */
//Main.java
 class car{
	String brand; 
    String colour;
    String speed;
    public void drive() {
        System.out.println("The car is safe to Drive!!");
    }
    public void breaking() {
        System.out.println("The cars's breaking efficiency is good.");
    }
}
//Second.java
class brand1{
    public static void main(String[] args) {
    car bmw = new car();
    bmw.brand = "BMW";
    bmw.colour = "silver";
    bmw. speed = "250kmph";
    System.out.println(bmw.brand);
    System.out.println(bmw.colour);
    System.out.println(bmw. speed);
    bmw.drive();
    bmw.breaking();
    }
   }

/* Output :
BMW
silver
250kmph
The car is safe to Drive!!
The cars's breaking efficiency is good. */
