import java.util.Scanner;
/*
 * Project        : Carpet Area Calculator
 * Author         : Syed Muhammad Azmir Farhan
 * Github Profile : https://github.com/Azmir-Farhan
 * Language       : JAVA
 * Version        : 1.0
 * Date           : 7-March-2026
 * Features:
 * Converts Inches to Feet.
 * Calculates Area in Square Feet.
 * Applies Discount.
 * Generate Final Invoice.
 */
class CarpetCostCalculator  //PascalCase For Class Name
{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        
        // --- Length Input ---
 
        System.out.print("Enter Length In Inches : ");
        double length = input.nextDouble();    
        while(length <= 0)  // We can use "FOR LOOP" eg,[ for(;length;) ]
            {
                System.out.println("Length Must Be Greater Than Zero !");
                System.out.print("Please Enter Length Again : ");
                length = input.nextDouble();
            }   
            System.out.println("Length : " + length + " in");
            length = length / 12;  // Inches To Feet
            System.out.printf("Length : %.2f ft%n", length);
            
            // --- Width Input ---

            System.out.print("Enter Width In Inches : ");
            double width = input.nextDouble();    
             while (width <= 0)  
                {
                    System.out.println("Width Must Be Greater Than Zero !");
                    System.out.print("Please Enter Width Again : ");
                    width = input.nextDouble();
                }   
                System.out.println("Width : " + width + " in");
                width = width / 12;  // Inches To Feet        
                System.out.printf("Width : %.2f ft%n", width);
                
                // --- Area Calculating ---
                
                double area = length * width ;
                System.out.printf("%nTotal Area: %.4f sq-ft%n", area);
                
                // --- Price Input ---
                
                System.out.print("Enter the Price of Carpet per Sq-Ft (Rs): ");
                double price = input.nextDouble();
                while (price <= 0) 
                    {
                        if (price < 0) 
                            {
                                System.out.println("Price Cannot be Negative!"); 
                            }
                            else
                                {
                                    System.out.println("Price Cannot be Zero!");
                                }
                                System.out.print("Enter Price again Rs : ");
                                price = input.nextDouble();
                            } 
                            
                            // --- Discount Input ---
                             
                            System.out.print("Discount (%) : ");
                            double discount = input.nextDouble();
                            while (discount < 0 || discount > 100) 
                                {
                                    System.out.println("Discount Must Be Between 0% and 100% !");
                                    System.out.print("Please Enter Discount Again : ");
                                    discount = input.nextDouble();
                                }
                               
                                // --- Final Calculation ---
                                
                                double amount_1 = area * price;
                                double amount_2 = amount_1 * discount / 100;
                                double amount = amount_1 - amount_2;
                                
                                // --- Final Output ---
                                
                                if (discount != 0) 
                                    {
                                        System.out.println("\n==============================");
                                        System.out.println("          FINAL INVOICE");
                                        System.out.println("==============================");
                                        System.out.printf("Base Amount:      Rs %.2f%n", amount_1);
                                        System.out.printf("Discount (%.0f%%):  - Rs %.2f%n",discount,amount_2 ); 
                                        System.out.println("------------------------------");  
                                        System.out.printf("TOTAL PAYABLE:    Rs %.2f%n", amount);
                                        System.out.println("==============================");
                                    }
                                    else  
                                        {
                                            System.out.println("================================");
                                            System.out.println("          FINAL INVOICE");
                                            System.out.println("--------------------------------");
                                            System.out.printf("TOTAL PAYABLE:    Rs %.2f%n", amount); 
                                            System.out.print("================================");
                                        } 
                                        System.out.println("--- Calculation Completed ---");
                                        System.out.println("Thank you for using the Carpet Area Calculator.");
                                        System.out.println("==============================");
                                        input.close();
    }        
}





