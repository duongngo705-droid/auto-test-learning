public class Day2Exercise {
    public static void main(String[] args) {
        int testCaseID = 102;
        String testCaseName =  "Login with invalid account";
        String username =  "duongtest";
        String password = "111111";
        int expectedStatusCode = 401;
        int actualStatusCode = 401;
        boolean result = expectedStatusCode == actualStatusCode;

        System.out.println("==== TEST CASE ====");
        System.out.println("Test case ID:" + testCaseID);
        System.out.println("Test case name: " + testCaseName);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Expected Status Code: " + expectedStatusCode);
        System.out.println("Actual Status Code: " + actualStatusCode);
        System.out.println("Result: " + result);
        if (result) {
            System.out.println("Test Status: PASS");
        }
            else { System.out.println("Test Status: FAIL");
        }
    }
}
