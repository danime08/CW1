public class Dec2Hex {
    
    public static String decimalToHex(int num) {
        char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexadecimal = "";
        
        while(num != 0) {
            int rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        return hexadecimal.isEmpty() ? "0" : hexadecimal;
    }

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Error: No input provided.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            String result = decimalToHex(num);
            System.out.println("Converting the Decimal Value " + num + " to Hex...");
            System.out.println("Hexadecimal representation is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please provide an integer.");
        }
    }
}

