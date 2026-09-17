public class Day5AutomationTest {
    public static void main(String[] args) {
        int[] expectedCodes = {200, 201, 404};
        int[] actualCodes = {200, 400, 404};

        for (int i = 0; i < expectedCodes.length; i++) {
            if (expectedCodes[i] == actualCodes[i]) {
                System.out.println("Testcase " + (i + 1) + ": PASS");
            } else {
                System.out.println("Testcase " + (i + 1) + ": FAIL");
            }
        }
    }
}
