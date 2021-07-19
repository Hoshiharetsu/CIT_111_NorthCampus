/*
Gaddis Code Listing 1-1, Page 9
 */
package chapterexamples;

public class Ch1_Payroll {
    public static void main(String[] args){
        int hours = 40;
        double grossPay, payRate = 25.0;
        
        grossPay = hours * payRate;
        System.out.println("Your gross pay is $" + grossPay);
    }
}
