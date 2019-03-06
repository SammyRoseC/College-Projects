
package student;

import java.util.Scanner;

public class Student {

    static Scanner sc = new Scanner (System.in);
    
    static String id;
    static double creditHours;
    static double points;
    static double gpa;
    
    public static void main(String[] args) {
        
        id = getStudentID();
        creditHours = getCreditHours();
        points = getPoints();
        gpa = getGradePointAverage(creditHours, points);
        
        System.out.println("Grade Point Average: " + gpa);
    }
    
    public static String getStudentID(){
        System.out.println("Enter Your ID Number: ");
        String idNo = sc.nextLine();
        
        return idNo;
    }
    
    public static double getCreditHours(){
        System.out.println("Enter Your Credit Hours Earned: ");
        double inCreditHours = sc.nextDouble();
        
        return inCreditHours;
    }
    
    public static double getPoints(){
        System.out.println("Enter Number of Points Earned: ");
        double inPoints = sc.nextDouble();
        
        return inPoints;
    }
    
    public static double getGradePointAverage(double creditHours, double points){
        gpa = points / creditHours;
        
        return gpa;
    }
    
}
