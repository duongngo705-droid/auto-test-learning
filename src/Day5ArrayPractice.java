public class Day5ArrayPractice {
    public static void main(String[] args) {
        String[] browsers = {"Chrome", "Firefox", "Edge", "Safari"};
        System.out.println("Total browser: " + browsers.length);
        for (int i = 0; i < browsers.length; i++) {
            System.out.println("Browser " + (i+1) + ": " + browsers[i]);
        }
    }
}

