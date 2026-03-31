import java.util.Scanner;
class IntegerToBinary
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        // Assignment_A
        int num;
        System.out.println("Enter a Integer Number:");
        num = input.nextInt();
        
        if (num == 0) 
            {
                System.out.println(0);
            }
        
        int arr[] = new int [32]; //Store Bits
        int i = 0;

        while (num > 0) 
            {
                arr[i] = num % 2;
                num = num / 2;
                i++;
            }
        // Printing Message
        for (int j = i - 1; j >= 0; j--)    
        {
            System.out.print(arr[j]);
        }
        input.close();
    }
}
