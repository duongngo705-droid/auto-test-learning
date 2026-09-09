public class Day2Exercise {
    public static void main(String[] args) {
        int TestcaseID = 101;
        String TestCaseName =  "Login with valid account";
        String Username =  "duongtest";
        int Password = 123456;
        int Expected_StatusCode = 200;
        int Actual_Status_Code = 200;
        boolean result = Expected_StatusCode == Actual_Status_Code;

        System.out.println("==== TEST CASE ====");
        System.out.println("Test case ID:" + TestcaseID);
        System.out.println("Test case name: " + TestCaseName);
        System.out.println("Username: " + Username);
        System.out.println("Password: " + Password);
        System.out.println("Expected Status Code: " + Expected_StatusCode);
        System.out.println("Actual Status Code: " + Actual_Status_Code);
        System.out.println("Result: " + result);

    }
}
