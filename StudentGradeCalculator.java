import java.util.Scanner;
/*
--> Project       : Student Grade Calculator
--> Author        : Syed Muhammad Azmir Farhan 
--> Github        : https://github.com/Azmir-Farhan/core-java-lab.git
--> Language      : JAVA
--> Version       : 1.0
--> Date          : 15-March-2026
--> Description   : This program takes marks of subjects from the user,
                    calculates total, percentage, grade, and pass/fail status.
*/
class StudentGradeCalculator
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        //--- Declare Variables ---

        double math, computer, physics, english, urdu, islamiat;
        double total, percentage;

        // --- Input Numbers ---

        System.out.println("Enter Numbers Of Given Subjects:");
        
        // -- Math --

        System.out.print("\tMath: ");
        math = input.nextDouble();
        while ( math < 0 || math > 100 ) 
            {
                System.out.println("Invalid Marks! Enter marks between 0 and 100.");
                System.out.print("Please Re-Enter Numbers: ");
                math = input.nextDouble();
            }

            // -- Computer --

            System.out.print("\tComputer: ");
            computer = input.nextDouble();
            while ( computer < 0 || computer > 100 ) 
                {
                    System.out.println("Invalid Marks! Enter marks between 0 and 100.");
                    System.out.print("Please Re-Enter Numbers: ");
                    computer = input.nextDouble();
                }

                // -- Physics --       
            
                System.out.print("\tPhysics: ");
                physics = input.nextDouble();
            
                while ( physics < 0 || physics > 100 ) 
                    {
                        System.out.println("Invalid Marks! Enter marks between 0 and 100.");
                        System.out.print("Please Re-Enter Numbers: ");
                        physics = input.nextDouble();
                    }
        
                    // -- English --
            
                    System.out.print("\tEnglish: ");
                    english = input.nextDouble();
                    while ( english < 0 || english > 100 ) 
                        {
                            System.out.println("Invalid Marks! Enter marks between 0 and 100.");
                            System.out.print("Please Re-Enter Numbers: ");
                            english = input.nextDouble();
                        }

                        // -- Urdu --
            
                        System.out.print("\tUrdu: ");        
                        urdu = input.nextDouble();
                        while ( urdu < 0 || urdu > 100 ) 
                            {
                                System.out.println("Invalid Marks! Enter marks between 0 and 100.");
                                System.out.print("Please Re-Enter Numbers: ");
                                urdu = input.nextDouble();
                            }

                            // -- Islamiat --

                            System.out.print("\tIslamiat: ");
                            islamiat = input.nextDouble();
                            while ( islamiat < 0 || islamiat > 50 ) 

                                {
                                    System.out.println("Invalid Marks! Enter marks between 0 and 50.");
                                    System.out.print("Please Re-Enter Numbers: ");
                                    islamiat = input.nextDouble();
                                }
                                
        // --- Sum Of Numbers ---

        total = math + computer + physics + english + urdu + islamiat;
        System.out.println("=============================");
        System.out.println("\tTotal : " + total + " / 550"); // 550 = 100 + 100 + 100 + 100 + 100 + 50
        System.out.println("=============================");

        // --- Calculate Percentage ---

        percentage = total / 550 * 100;
        System.out.printf("\tPercentage: %.2f%%\n", percentage);
        System.out.println("=============================");

        // --- Calculate Grades ---

        if ( percentage >= 80 && percentage <= 100)
            {
                System.out.println("\tGrade - A1 ");
                System.out.println("-----------------------------");
                System.out.println("\tRemarks: Exceptional");
                System.out.println("=============================");
            }
            else if( percentage >= 70 && percentage <= 79.9)
                {
                    System.out.println("\tGrade - A");
                    System.out.println("-----------------------------");
                    System.out.println("\tRemarks: Very Good");
                    System.out.println("=============================");                                
                }
                else if( percentage >= 60 && percentage <= 69.9)
                    {
                        System.out.println("\tGrade - B");
                        System.out.println("-----------------------------");
                        System.out.println("\tRemarks: Good");
                        System.out.println("=============================");
                    }
                    else if( percentage >= 50 && percentage <= 59.9)
                        {
                            System.out.println("\tGrade - C");
                            System.out.println("-----------------------------");
                            System.out.println("\tRemarks: Average");
                            System.out.println("=============================");
                        }
                        else if ( percentage >= 40 && percentage <= 49.9)
                            {
                                System.out.println("\tGrade - D");
                                System.out.println("-----------------------------");
                                System.out.println("\tRemarks: Pass");
                                System.out.println("=============================");
                            }
                            else 
                                {
                                    System.out.println("\tGrade - F");
                                    System.out.println("-----------------------------");
                                    System.out.println("\tRemarks: Fail");
                                    System.out.println("=============================");
                                }
        
        // --- Output Status ---
        
        if ( math < 40 || computer < 40 || physics < 40 ||
             urdu < 40 || islamiat < 20 || english < 40 ) 
            {
                System.out.println("\tStatus: FAIL");
                System.out.println("=============================");
            }
            else
                {
                    System.out.println("\tStatus: PASS");
                    System.out.println("=============================");
                }
        System.out.println("<---Calculation Completed--->");        
        System.out.println("Thank you For Using Student Grade Calculator");
        input.close();                         
    }
}