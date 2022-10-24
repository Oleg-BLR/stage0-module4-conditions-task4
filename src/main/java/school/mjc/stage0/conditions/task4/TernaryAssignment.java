package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public static void main(String[] args) {
        assignAndPrintBasedOnWhichBigger(6, 5);
    }
    public static void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int results =  first > second ? 10 : -10;
        System.out.println(results);
    }
}
