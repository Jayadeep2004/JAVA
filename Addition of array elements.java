/* Author : JAYADEEP G L 
  Addition of array elements */

class arrAdd{
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,10};
        int i,j,k;
        System.out.println("Elements in array1 :");
        for(i=0; i<arr1.length; i++) {
            System.out.print(arr1[i] + " ");
            
        }
        
        int[] arr2 = {5,7,9,11,15};
        System.out.println("\nElements in array2 :");
        for(j=0; j<arr2.length; j++) {
            System.out.print(arr2[j] + " ");
            
        }
        
        int[] sum = new int[arr2.length];
        for(k=0; k<arr1.length; k++) {
            sum[k] = arr1[k] + arr2[k];
        }
        
        System.out.println("\nSum of both arrays is :");
        for(i=0; i<sum.length; i++) {
            System.out.print(sum[i] + " ");
        }
        
    }
}


/* Output :
Elements in array1 :
2 4 6 8 10 
Elements in array2 :
5 7 9 11 15 
Sum of both arrays is :
7 11 15 19 25  */
  
