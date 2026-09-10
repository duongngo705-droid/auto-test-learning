public class Day3Exercise01 {
    public static void main(String[] args) {
        int statusCode = 200;
        int responseTime =  2500;

        if (statusCode == 200 && responseTime <= 3000)
        {System.out.println("Test result: PASS");}
        else
        {System.out.println("Test result: FAIL");}
    }
}
