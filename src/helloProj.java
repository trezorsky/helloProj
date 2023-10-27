import java.util.Scanner;
import java.util.stream.LongStream;

public class helloProj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        long sum = calculateSumBetween(a, b);
        System.out.println("Сумма чисел между " + a + " и " + b + " (не включая " + b + "): " + sum);

        long sum1 = calculateSumBetween(10000000, 1000000000);
        System.out.println("Сумма чисел между 10000000 и 1000000000 (не включая  1000000000): " + sum1);

        scanner.close();
    }

    public static long calculateSumBetween(int a, int b) {
        return LongStream.range(a, b)
                .sum();
    }
}
