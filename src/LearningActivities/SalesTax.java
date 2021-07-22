/*
Page 23, Algorithm Workbench, #2
 */
package LearningActivities;

public class SalesTax {
    public static void main(String[] args){
        Display to User, "How much does the item cost?";
        Display to User, "How much is the Sales Tax?";
        int ItemCost = UserInput1;
        int SalesTax = UserInput2;
        
        TotalCost = ItemCost * SalesTax;
        
        System.out.println("Using a sales tax of:" + SalesTax + ", your total cost will be: " + TotalCost + ".");
    }
}
