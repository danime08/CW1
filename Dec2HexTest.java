import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Dec2HexTest {

    @Test
    public void testDecimalToHex_1() {
        int input = 10;
        String expected = "A";
        String result = Dec2Hex.decimalToHex(input);
        assertEquals("The hexadecimal of 10 should be A", expected, result);
    }

    @Test
    public void testDecimalToHex_2() {
        int input = 255;
        String expected = "FF";
        String result = Dec2Hex.decimalToHex(input);
        assertEquals("The hexadecimal of 255 should be FF", expected, result);
    }

    @Test
    public void testDecimalToHex_3() {
        int input = 0;
        String expected = "0";
        String result = Dec2Hex.decimalToHex(input);
        assertEquals("The hexadecimal of 0 should be 0", expected, result);
    }

    @Test
    public void testDecimalToHex_4() {
        int input = 256;
        String expected = "100";
        String result = Dec2Hex.decimalToHex(input);
        assertEquals("The hexadecimal of 256 should be 100", expected, result);
    }

    @Test
    public void testDecimalToHex_negative() {
        int input = -1;
        String expected = "FFFFFFFF";
        String result = Dec2Hex.decimalToHex(input); // In Java, negative numbers are treated as large unsigned values
        assertEquals("The hexadecimal of -1 should be FFFFFFFF", expected, result);
    }
}
