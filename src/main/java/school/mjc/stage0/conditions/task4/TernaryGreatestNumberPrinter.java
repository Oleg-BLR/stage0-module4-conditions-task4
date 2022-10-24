package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {

    public static void main(String[] args) {
        printGreatest(4, 9);
    }

    public static void printGreatest(int first, int second) {
        int max = (first > second ? first : second);
        System.out.println(max);
    }
}
