/*
 * Program          : SelectionSort
 * Author           : Syed Muhammad Azmir Farhan
 * Github Profile   : https://github.com/Azmir-Farhan
 * linkedin Profile : https://www.linkedin.com/feed/
 * Language         : Java
 * Date             : 25-August-2026
 * Description      : A program that sorts an array of integers
                      in ascending order using the Selection Sort algorithm..

 */

public class SelectionSort 
{
    // Function to perform selection sort

    public static void selectionSort(int[] arr) 
    {
        int n = arr.length;
        int i = 0;

        while (i < n - 1) 
            {
                // a => Minimum Index
                int a = i;
                int j = i + 1;

                while (j < n) 
                    {
                        /*
                        For Descending Order
                        if (arr[j] > arr[a])
                        */
                        if (arr[j] < arr[a]) 
                            {
                                a = j;
                            }
                        j++;
                    }
                    if (a != i) 
                        {
                            // b => is temporary variable for storing value
                            int b = arr[a];
                            arr[a] = arr[i];
                            arr[i] = b;
                        }
                        i++;
            }
            
    }

    // Function to print the array

    public static void printArray(int[] arr) 
    {
        for (int i = 0; i < arr.length; i++) 
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    }

    public static void main(String[] args) 
    {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
            


