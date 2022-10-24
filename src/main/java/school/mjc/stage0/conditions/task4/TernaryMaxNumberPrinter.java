package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void main(String[] args) {
        printGreatest(1,2,2);
    }

    public static void printGreatest(int first, int second, int third) {
        int max = (first > (second > third ? second : third) ? first : second > third ? second : third);
        System.out.println(max);
    }
}
