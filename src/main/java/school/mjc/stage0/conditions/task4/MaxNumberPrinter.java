package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public static void main(String[] args) {
        printGreatest(4, 1, 4);
    }

    public static void printGreatest(int first, int second, int third) {
        int max = (first > (second > third ? second : third) ? first : second > third ? second : third);
        System.out.println(max);
//        if (first == max) {
//            System.out.println(first);
//            if (second == max) {
//                System.out.println(second);
//                if (third == max) {
//                    System.out.println(third);
//                }
//            } else if (third == max) {
//                System.out.println(third);
//            }
//        } else if (second == max) {
//            System.out.println(second);
//            if (third == max) {
//                System.out.println(third);
//            }
//        } else {
//            System.out.println(third);
//        }
    }
}

