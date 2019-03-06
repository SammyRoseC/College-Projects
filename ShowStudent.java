
package student;

public class ShowStudent {
    
    static String id;
    static double creditHours;
    static double points;
    static double gpa;
    
    public static void main (String [] args){
        id = Student.getStudentID();
        creditHours = Student.getCreditHours();
        points = Student.getPoints();
        gpa = Student.getGradePointAverage(creditHours, points);
        
        System.out.println("Enter Your ID Number: " + id);
        System.out.println("Enter Your Credit Hours Earned: " + creditHours);
        System.out.println("Enter Your Points Earned: " + points);
        System.out.println("Enter Your Grade Point Average: " + gpa);
    }
}
