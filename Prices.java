
package prices;

import java.util.Scanner;

public class Prices {

    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        getPrice();
        sum();
        lesser();
        average();
        higher();
        
        }
    
       static double[] arr = new double [5];
       static int b = 0;
       static double sum = 0;
       static double average = 0;
       
        public static void getPrice(){
           for (b = 0; b < arr.length; b++){
               System.out.print("Enter Price Number " + (b + 1) + ": ");
               arr [b] = sc.nextDouble(); 
            }
        }
       
        public static void sum(){ 
           sum = 0; 
           for (int i = 0; i < arr.length; i++){
               sum = sum + arr [i];
            }
           System.out.print("Sum: " + sum);
        }
       
        public static void lesser(){
           System.out.print("\nPrices Lesser Than $5.00: ");
            for (b = 0; b < arr.length; b++){
               if (arr [b] < 5.00){
                   System.out.print("$" + arr [b] + " , ");
                } 
            }
           System.out.println("");
        }
        
        public static void average(){
           double limit = arr.length;
           average = sum/limit;
           System.out.print("Average: " + average);
        }
       
        public static void higher(){
           System.out.print("\nPrices Higheer Than The Average: ");
           for (b = 0; b < arr.length; b++){
               if(arr[b] > average){
                   System.out.print("$" + arr[b] + " , ");
                }
            }
           System.out.println("");
        }
}
    
