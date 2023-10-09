import java.util.Scanner;

public class helloProj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();

        // Заменяем слова "кака" и "бяка" на "вырезано цензурой"
        String censoredString = inputString.replaceAll("(.*)кака(.*)|(.*)бяка(.*)", "вырезано цензурой");

        System.out.println("Результат замены:");
        System.out.println(censoredString);

        scanner.close();
    }
}
