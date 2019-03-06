
package intarray;

import java.util.Scanner;

public class IntArray {

    Scanner sc = new Scanner (System.in);

    
    public static void main(String[] args) {
        new IntArray().input().firstToLast().lastToFirst();
    }
    
    
       int a = 0;
       int [] arr = new int [5];
    
     public IntArray input(){
        for(a = 0; a <= 4; a++){
        System.out.print("Enter an Integer: " + a + ": ");
        arr[a] = sc.nextInt();
        }
        return this;
    }
     
     public IntArray firstToLast(){
         System.out.println("___________________________________________________");
         System.out.println("First To Last: ");
         for (a =0; a <= 4; a++){
             System.out.print(arr[a] + " ");
         }
         return this;
     }
         
     public IntArray lastToFirst(){
         System.out.println("\nLast To First: ");
         for(a = 4; a >= 0; a--){
             System.out.print(arr[a] + " ");
         }
         return this;
     }
        
    }
    
    
    

