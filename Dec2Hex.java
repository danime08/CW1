public class Dec2Hex {

    public static String decimalToHex(long num) {  // Change int to long
        // Handle negative numbers using two's complement (32-bit representation)
        if (num < 0) {
            // Convert negative number to two's complement hex representation
            num = Integer.toUnsignedLong((int) num) & 0xFFFFFFFFL; // Treat as unsigned 32-bit (long)
        }

        char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexadecimal = "";

        // Edge case: if the number is 0, directly return "0"
        if (num == 0) {
            return "0";
        }

        while (num != 0) {
            int rem = (int) (num % 16);
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        return hexadecimal;
    }

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Error: No input provided.");
            return;
        }

        try {
            long num = Long.parseLong(args[0]); // Change to long
            String result = decimalToHex(num);
            System.out.println("Converting the Decimal Value " + num + " to Hex...");
            System.out.println("Hexadecimal representation is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please provide a valid integer.");
        }
    }
}



