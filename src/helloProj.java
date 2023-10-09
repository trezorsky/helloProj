import java.util.Scanner;

public class helloProj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        System.out.print("Введите подстроку: ");
        String substring = scanner.nextLine();

        int count = countSubstr(inputString, substring);
        System.out.println("Подстрока встречается " + count + " раз(а) в строке.");

        scanner.close();
    }

    // Метод для подсчета количества вхождений подстроки в строку
    public static int countSubstr(String input, String substring) {
        int count = 0;
        int index = input.indexOf(substring);
        while (index != -1) {
            count++;
            index = input.indexOf(substring, index + 1);
        }
        return count;
    }
}
