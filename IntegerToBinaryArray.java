import java.util.Scanner;
class IntegerToBinaryArray
{
    static int[] Binary(int num, int[] size) {
        int arr[] = new int[32];
        int i = 0;

        while (num > 0) {
            arr[i] = num % 2;
            num = num / 2;
            i++;
        }

        size[0] = i; // store size
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer Number:");
        int num = input.nextInt();

        int size[] = new int[1]; // to hold size
        int result[] = Binary(num, size);

        // print in correct order
        for (int j = size[0] - 1; j >= 0; j--) {
            System.out.print(result[j]);
        }

        input.close();
    }
}
    
        
    