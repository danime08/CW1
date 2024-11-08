import java.util.Scanner;

class Dec2Hex
{
    public static int Arg1;

    public static void main(String args[]) {
        // Check if at least one argument is passed
        if (args.length == 0) {
            System.out.println("No argument provided. Please provide a decimal number to convert.");
            return;  // Exit the program if no argument is provided
        }

        // Parse the first argument as an integer
        try {
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid decimal number.");
            return;  // Exit if the argument is not a valid number
        }

        // Hexadecimal conversion logic
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = Arg1;
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}
