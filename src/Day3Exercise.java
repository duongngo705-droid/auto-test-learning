public class Day3Exercise {
    public static void main(String[] args) {
        int responseTime = 2500;
        if (responseTime <= 1000) {System.out.println("FAST");}
        else  if (responseTime <=3000) {System.out.println("ACCEPTABLE");}
        else {System.out.println("SLOW");}
    }
}
