public class Day3 {
    public static void main(String[] args) {
        int expectedStatusCode = 200;
        int actualStatusCode = 404;
        boolean result = expectedStatusCode == actualStatusCode;

        if (result) {System.out.println("Test result: PASS");}
        else {System.out.println("Test result: FAIL");}
    }
}
