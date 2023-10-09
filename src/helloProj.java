import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class helloProj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        // Ввод первой даты
        System.out.print("Введите первую дату в формате dd.MM.yyyy: ");
        String firstDateString = scanner.nextLine();

        Date firstDate;
        try {
            firstDate = dateFormat.parse(firstDateString);
        } catch (ParseException e) {
            System.out.println("Некорректный формат даты.");
            scanner.close();
            return;
        }
        // Увеличение на 45 дней
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(firstDate);
        calendar.add(Calendar.DAY_OF_YEAR, 45);
        Date increasedDate = calendar.getTime();
        System.out.println("Дата после увеличения на 45 дней: " + dateFormat.format(increasedDate));
        // Сдвиг на начало года
        calendar.setTime(firstDate);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date startOfYear = calendar.getTime();
        System.out.println("Дата после сдвига на начало года: " + dateFormat.format(startOfYear));
        // Увеличение на 10 рабочих дней
        calendar.setTime(firstDate);
        int workdaysToAdd = 10;
        while (workdaysToAdd > 0) {
            calendar.add(Calendar.DAY_OF_YEAR, 1);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
                workdaysToAdd--;
            }
        }
        Date increasedWorkdaysDate = calendar.getTime();
        System.out.println("Дата после увеличения на 10 рабочих дней: " + dateFormat.format(increasedWorkdaysDate));

        // Ввод второй даты
        System.out.print("Введите вторую дату в формате dd.MM.yyyy: ");
        String secondDateString = scanner.nextLine();

        Date secondDate;
        try {
            secondDate = dateFormat.parse(secondDateString);
        } catch (ParseException e) {
            System.out.println("Некорректный формат второй даты.");
            scanner.close();
            return;
        }

        // Подсчет рабочих дней между датами
        int workdaysBetweenDates = countWorkdaysBetweenDates(firstDate, secondDate);
        System.out.println("Количество рабочих дней между датами: " + workdaysBetweenDates);

        scanner.close();
    }

    // Метод для подсчета рабочих дней между двумя датами
    public static int countWorkdaysBetweenDates(Date startDate, Date endDate) {
        int workdays = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        while (calendar.getTime().before(endDate) || calendar.getTime().equals(endDate)) {
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY) {
                workdays++;
            }
            calendar.add(Calendar.DAY_OF_YEAR, 1);
        }

        return workdays;
    }
}
