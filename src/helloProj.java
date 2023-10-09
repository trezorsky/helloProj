import java.util.Scanner;

public class helloProj {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число (c): ");
        int c = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        if (a % 5 == 0) result.append("a=").append(a).append(", ");
        if (b % 5 == 0) result.append("b=").append(b).append(", ");
        if (c % 5 == 0) result.append("c=").append(c).append(", ");

        if (result.length() > 0) {
            // убираем запятую с пробелом
            result.delete(result.length() - 2, result.length());
            System.out.println(result);
        } else {
            System.out.println("нет значений, кратных 5");
        }

        int divRes = a / b;
        System.out.println("Результат целочисленного деления a на b: " + divRes);

        double divResFloat = (double) a / b;
        System.out.println("Результат деления a на b (число с плавающей запятой): " + divResFloat);

        int roundedUp = (int) Math.ceil(divResFloat);
        System.out.println("Округлено до ближайшего целого в большую сторону: " + roundedUp);

        int roundedDown = (int) Math.floor(divResFloat);
        System.out.println("Округлено до ближайшего целого в меньшую сторону: " + roundedDown);

        int rounded = (int) Math.round(divResFloat);
        System.out.println("Математическое округление: " + rounded);

        int remainder = b % c;
        System.out.println("Остаток от деления b на c: " + remainder);

        int minAB = Math.min(a, b);
        System.out.println("Наименьшее значение из a и b: " + minAB);

        int maxBC = Math.max(b, c);
        System.out.println("Наибольшее значение из b и c: " + maxBC);

        scanner.close();

    }
}
