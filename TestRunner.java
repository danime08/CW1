import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        // Run the test cases in Dec2HexTest.class
        Result result = JUnitCore.runClasses(Dec2HexTest.class);

        // Print the results
        System.out.println("Test Run Result: " + result.wasSuccessful());
        
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        // Optional: Exit status based on test result
        System.exit(result.wasSuccessful() ? 0 : 1);
    }
}
