import java.util.Scanner;
/*
 * Project        : Magic Square Checker
 * Author         : Syed Muhammad Azmir Farhan
 * Github Profile : https://github.com/Azmir-Farhan
 * Language       : Java
 * Version        : 1.0
 * Date           : 9-March-2026
 * Description    : A program that checks whether a user-entered
 *                  3x3 or 4x4 or 5x5 matrix is a Magic Square.
 *
 * Features:
 * Accepts matrix size (3x3 or 4x4 or 5x5) from the user.
 * Takes user input to fill the matrix.
 * Calculates row sums.
 * Calculates column sums.
 * Calculates both diagonal sums.
 * Determines whether the matrix is a Magic Square.
 * Displays the result to the user.
 */
class MagicSquare    // PascalCase For Class Name
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Matrix Size ( 3 Or 4 Or 5 ): ");
        int n = input.nextInt();
        while ( n < 3 || n > 5) // Using "WHILE LOOP" For Invalid Matrix
            {
               System.out.println("Error: Size Of Matrix Must Be \"3\" Or \"4\" Or \"5\".");
               System.out.print("Please Re-Enter Matrix Size: ");       
               n = input.nextInt();
            }

            // --- 3x3 Matrix ---

            if ( n == 3 )
                {
                    int[][] a = new int[3][3]; 
                    System.out.println("Enter 9 Numbers:");
                    for( int i = 0; i < 3; i = i + 1 )
                        {    
                            for( int j = 0; j < 3; j = j + 1) 
                                {
                                    a[i][j] = input.nextInt();
                                }
                        }

                        // --- Matrix Display ---

                        System.out.println("\n=================");
                        System.out.println("Entered Matrix");
                        System.out.println("=================");
                        System.out.println("\nMatrix:");
                        for(int i = 0; i < 3; i = i + 1 )
                            {
                                for(int j = 0; j < 3; j = j + 1 ) 
                                    {
                                        System.out.print(a[i][j] + " ");
                                    }    
                                    System.out.println();
                            }

                    
                            // --- Rows Sum ---                    
                            int r1 = a[0][0] + a[0][1] + a[0][2];                    
                            int r2 = a[1][0] + a[1][1] + a[1][2];
                            int r3 = a[2][0] + a[2][1] + a[2][2];

                    
                            // --- Columns Sum ---
                    
                            int c1 = a[0][0] + a[1][0] + a[2][0];
                            int c2 = a[0][1] + a[1][1] + a[2][1];
                            int c3 = a[0][2] + a[1][2] + a[2][2];


                            // --- Diagonals Sum ---

                            int d1 = a[0][0] + a[1][1] + a[2][2];
                            int d2 = a[0][2] + a[1][1] + a[2][0];
                
                    
                            // --- Condition Check ---

                            System.out.println("\nChecking Magic Square...");
                            if( r1 == r2 && r2 == r3 && r3 == c1 && c1 == c2 && c2 == c3 && c3 == d1 && d1 == d2 )
                                {
                                    System.out.println("=====================");
                                    System.out.println("It Is A Magic Square.");
                                    System.out.println("=====================");
                                }
                                else
                                    {
                                        System.out.println("=========================");
                                        System.out.println("It Is NOT A Magic Square.");
                                        System.out.println("=========================");
                                    }
                }

            
                // ---- 4x4 Matrix ----
            
                else if( n == 4 )
                    {
                        int[][] a = new int[4][4];
                        System.out.println("Enter 16 Numbers:");
                        for( int i = 0; i < 4; i = i + 1 )
                            {
                                for( int j = 0; j < 4; j = j + 1 )
                                    {
                                        a[i][j] = input.nextInt();
                                    }
                            }

                
                            // ---- Matrix Display ----

                            System.out.println("\n=================");
                            System.out.println("Entered Matrix");
                            System.out.println("=================");
                            System.out.println("\nMatrix:");
                            for(int i = 0; i < 4; i = i + 1)
                                {
                                    for(int j = 0; j < 4; j = j + 1 )
                                        {
                                            System.out.print(a[i][j] + " ");
                                        }
                                        System.out.println();    
                                }
                        
                        
                                // ---- Rows Sum ----

                                int r1 = a[0][0] + a[0][1] + a[0][2] + a[0][3];
                                int r2 = a[1][0] + a[1][1] + a[1][2] + a[1][3];
                                int r3 = a[2][0] + a[2][1] + a[2][2] + a[2][3];
                                int r4 = a[3][0] + a[3][1] + a[3][2] + a[3][3];

                        
                                // ---- Columns Sum ----

                                int c1 = a[0][0] + a[1][0] + a[2][0] + a[3][0];
                                int c2 = a[0][1] + a[1][1] + a[2][1] + a[3][1];
                                int c3 = a[0][2] + a[1][2] + a[2][2] + a[3][2];
                                int c4 = a[0][3] + a[1][3] + a[2][3] + a[3][3];
                                
                                // ---- Diagonals Sum ----

                                int d1 = a[0][0] + a[1][1] + a[2][2] + a[3][3];
                                int d2 = a[0][3] + a[1][2] + a[2][1] + a[3][0];


                        
                                // ---- Condition Check ----

                                System.out.println("\nChecking Magic Square...");
                                if( r1 == r2 && r2 == r3 && r3 == r4 && 
                                    r4 == c1 && c1 == c2 && c2 == c3 && 
                                    c3 == c4 && c4 == d1 && d1 == d2 )                            
                                    { 
                                        
                                        System.out.println("=====================");
                                        System.out.println("It Is A Magic Square.");
                                        System.out.println("=====================");
                                    }
                                    else
                                        {    
                                            System.out.println("=========================");
                                            System.out.println("It Is NOT A Magic Square.");
                                            System.out.println("=========================");
                                        }
                
                    }

                
                    // ----- 5x5 Matrix -----

                    else 
                        {
                            int[][] a = new int[5][5];
                            System.out.println("Enter 25 Numbers:");
                            for ( int i = 0; i < 5; i = i + 1 )
                                {
                                    for ( int j = 0; j < 5; j = j + 1 )
                                        {
                                            a[i][j] = input.nextInt();
                                        }
                                }

                                // ----- Matrix Display -----

                                System.out.println("\n=================");
                                System.out.println("Entered Matrix");
                                System.out.println("=================");
                                System.out.println("\nMatrix:");
                                for(int i = 0; i < 5; i = i + 1)
                                    {
                                        for(int j = 0; j < 5; j = j + 1)
                                            {
                                                System.out.print(a[i][j] + " ");
                                            }
                                            System.out.println();
                                        }
                            
                                        // ----- Rows Sum -----

                                        int r1 = a[0][0] + a[0][1] + a[0][2] + a[0][3] + a[0][4];
                                        int r2 = a[1][0] + a[1][1] + a[1][2] + a[1][3] + a[1][4];
                                        int r3 = a[2][0] + a[2][1] + a[2][2] + a[2][3] + a[2][4];
                                        int r4 = a[3][0] + a[3][1] + a[3][2] + a[3][3] + a[3][4];
                                        int r5 = a[4][0] + a[4][1] + a[4][2] + a[4][3] + a[4][4];    
                        
                                        // ----- Columns Sum -----

                                        int c1 = a[0][0] + a[1][0] + a[2][0] + a[3][0] + a[4][0];
                                        int c2 = a[0][1] + a[1][1] + a[2][1] + a[3][1] + a[4][1];
                                        int c3 = a[0][2] + a[1][2] + a[2][2] + a[3][2] + a[4][2];
                                        int c4 = a[0][3] + a[1][3] + a[2][3] + a[3][3] + a[4][3];
                                        int c5 = a[0][4] + a[1][4] + a[2][4] + a[3][4] + a[4][4];
                            
                                        // ----- Diagonals Sum -----

                                        int d1 = a[0][0] + a[1][1] + a[2][2] + a[3][3] + a[4][4];
                                        int d2 = a[0][4] + a[1][3] + a[2][2] + a[3][1] + a[4][0];
                            
                                        // ----- Condition Check -----

                                        System.out.println("\nChecking Magic Square...");
                                        if( r1 == r2 && r2 == r3 && r3 == r4 && r4 == r5 && 
                                            r5 == c1 && c1 == c2 && c2 == c3 && c3 == c4 && 
                                            c4 == c5 && c5 == d1 && d1 == d2 )                            
                                            {     
                                                System.out.println("=====================");         
                                                System.out.println("It Is A Magic Square.");
                                                System.out.println("=====================");
                                            }
                                            else
                                                {    
                                                    System.out.println("=========================");
                                                    System.out.println("It Is NOT A Magic Square.");
                                                    System.out.println("=========================");
                                                }
                         
                        }    
                        input.close();
    }
} 