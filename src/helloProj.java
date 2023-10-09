import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class helloProj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату в формате dd.mm.yyyy: ");
        String dateString = scanner.nextLine();

        SimpleDateFormat inputFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = inputFormat.parse(dateString);
            String formattedDate = outputFormat.format(date);
            System.out.println("Преобразованная дата: " + formattedDate);
        } catch (ParseException e) {
            System.out.println("Некорректный формат даты.");
        }

        scanner.close();
    }
}
