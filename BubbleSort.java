/*
 * Program          : Bubble Sort
 * Author           : Syed Muhammad Azmir Farhan
 * Github Profile   : https://github.com/Azmir-Farhan
 * linkedin Profile : https://www.linkedin.com/feed/
 * Language         : Java
 * Date             : 25-August-2026
 * Description      : A program that sorts an array of integers
                      in descending order using the Bubble Sort algorithm.
 */

public class BubbleSort 
{
    // Function to perform bubble sort

    public static void bubbleSort(int[] arr) 
    {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) 
            {
                for (int j = 0; j < n - 1 - i; j++) 
                    {
                        /*
                        For Ascending Order
                        if (arr[j] > arr[j + 1])
                        */
                        if (arr[j] < arr[j + 1]) 
                            {
                                // c => is temporary variable for storing value
                                int c = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = c;
                            }
                    }
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

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}