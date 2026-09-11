public class Day4Exercise02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i == 2 || i ==5) {
                System.out.println("Testcase " + i + ": FAIL");
            } else {
                System.out.println("Testcase " + i + ": PASS");
            }
        }
    }
}

