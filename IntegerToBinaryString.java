import java.util.Scanner;

class DecimalToBinaryString {

    // User-defined function to convert decimal to binary
    static String BinaryString(int num) {
        if (num == 0) return "0"; // handle 0 case

        String binary = "";
        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary; // prepend to keep correct order
            num = num / 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer Number:");
        int num = input.nextInt();

        // Call user-defined function
        String binaryResult = BinaryString(num);

        // Print result
        System.out.println("Binary representation: " + binaryResult);

        input.close();
    }
}