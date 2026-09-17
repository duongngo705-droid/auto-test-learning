public class ReviewDay1To5 {
    public static void main(String[] args) {
        int[] expectedCodes = {200, 201, 404, 500};
        int[] actualCodes = {200, 400, 404, 503};
        for (int i = 0; i < expectedCodes.length; i++) {
            boolean isPassed = expectedCodes[i] == actualCodes[i];
            if (isPassed) {
                System.out.println("Testcase " + (i + 1) + ": " + "expected = " + expectedCodes[i] + ", actual = " + actualCodes[i] + "-> PASS");
            } else {
                System.out.println("Testcase " + (i + 1) + ": " + "expected = " + expectedCodes[i] + ", actual = " + actualCodes[i] + "-> FAIL");
            }
        }
    }
}

