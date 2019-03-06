
package salary;


public class Salary {
    
    public static void main(String[] args) {
        
        System.out.print("Input Your Hourly Pay Rate: ");
        java.util.Scanner a = new java.util.Scanner (System.in);
        double HourlyPay = a.nextDouble();
        
        System.out.print("Input Your Regular Hours: ");
        java.util.Scanner b = new java.util.Scanner (System.in);
        double RegularHours = b.nextDouble();
        
        System.out.print("Input Your Overtime Hours: ");
        java.util.Scanner c = new java.util.Scanner (System.in);
        double OvertimeHours = c.nextDouble();
        
        double OvertimePay = getOvertimePay (RegularHours, OvertimeHours, HourlyPay);
        System.out.println("Your Overtime Pay is: " +OvertimePay);
    }
    
    static double getOvertimePay (double RegularHours, double OvertimeHours, double HourlyPay){
        double OvertimePay = ((((RegularHours * HourlyPay) + OvertimeHours) * 1.5) * HourlyPay);
        return OvertimePay;
    }
}
