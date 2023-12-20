/* Author : JAYADEEP G L
  Constructors example */

public class Main{
    int carYear;
    String carName;
    
    public Main(int year,String name) {
        carYear = year;
        carName = name;
        } 
    public static void main(String[] args) {
        Main myCar = new Main(1970,"Mustang");
        System.out.println("My car was made in " + myCar.carYear + " and the name is "+ myCar.carName);
        
    }
}


/* Output :
My car was made in 1970 and the name is Mustang */
