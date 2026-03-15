import java.util.Scanner;
/*
--> Project     : DiscountedPriceCalculator
--> Author      : Syed Muhammad Azmir Farhan and Badar Sami
--> Github      : https://github.com/Azmir-Farhan/core-java-lab.git
--> Language    : JAVA
--> Version     : 1.0
--> Date        : 15-March-2026
--> Description : Calculates the final price of a product after applying discounts with simple input and output.
*/
class DiscountedPriceCalculatorBasic
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        // --- Declare Variables ---

        double originalPrice, discountPercentage, discountAmount, finalPrice;

        // --- Input Current Selling Price ---

        System.out.print("Enter Original Price Rs: ");
        originalPrice = input.nextDouble();
        while ( originalPrice <= 0 )
            {
                System.out.println("Price Must Be Greater Than Zero!");
                System.out.print("Please Re-Enter Price Rs: ");
                originalPrice = input.nextDouble();
            }
        
        // --- Determine Discount Percentage ---
        
        if ( originalPrice > 8000 )
            {
                discountPercentage = 20;
            }
            else if ( originalPrice > 4000) 
                {
                    discountPercentage = 10;
                }
                else 
                    {
                        discountPercentage = 0;
                    }
                    
        // --- Calculate Discount Amount and Final Price ---
                    
        discountAmount = discountPercentage * originalPrice / 100;
        finalPrice = originalPrice - discountAmount;
                    
        // --- Display Results ---
                    
        System.out.println("\n===============================");
        System.out.printf("Original Price Rs: %.2f\n", originalPrice);
        System.out.printf("Discount Percentage: %.2f%%\n", discountPercentage);
        System.out.println("-------------------------------");
        System.out.printf("Discount Amount Rs: %.2f\n", discountAmount);
        System.out.println("-------------------------------");
        System.out.printf("Final Price Rs: %.2f\n", finalPrice);
        System.out.println("===============================");
        System.out.println("\n---------------------------------------------");
        System.out.println("    <------ Calculation Completed ------>");        
        System.out.println("Thanks For Using Discounted Price Calculator.");
        System.out.println("---------------------------------------------");
        
        input.close(); 
    }
}