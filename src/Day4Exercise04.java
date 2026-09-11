public class Day4Exercise04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("Testcase " + i + " : SKIP");
                continue;}
                if (i == 6) {
                    System.out.println("Testcase " + i + " : FAIL");
                    break;
                }
            System.out.println("Testcase " + i + " : PASS");
            }
        }
    }

