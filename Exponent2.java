
package exponent2;

import java.util.Scanner;

public class Exponent2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Input A Number: ");
        double number = sc.nextInt();
        
        double sq = square(number);
        System.out.println("The Square of " +number+ ": " +sq);
        
        double cube = cube(number);
        System.out.println("The Cube of " +number+ ": " +cube);
    }
    
    static double square(double number){
        double sq = Math.pow(number, 2);
        return sq;
    }
    
    static double cube(double number){
        double cube = square(number)*number;
        return cube;
    }
    
}
