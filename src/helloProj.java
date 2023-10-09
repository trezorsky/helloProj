import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class helloProj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        // ���� ������ ����
        System.out.print("������� ������ ���� � ������� dd.MM.yyyy: ");
        String firstDateString = scanner.nextLine();

        Date firstDate;
        try {
            firstDate = dateFormat.parse(firstDateString);
        } catch (ParseException e) {
            System.out.println("������������ ������ ����.");
            scanner.close();
            return;
        }
        // ���������� �� 45 ����
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(firstDate);
        calendar.add(Calendar.DAY_OF_YEAR, 45);
        Date increasedDate = calendar.getTime();
        System.out.println("���� ����� ���������� �� 45 ����: " + dateFormat.format(increasedDate));
        // ����� �� ������ ����
        calendar.setTime(firstDate);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date startOfYear = calendar.getTime();
        System.out.println("���� ����� ������ �� ������ ����: " + dateFormat.format(startOfYear));
        // ���������� �� 10 ������� ����
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
        System.out.println("���� ����� ���������� �� 10 ������� ����: " + dateFormat.format(increasedWorkdaysDate));

        // ���� ������ ����
        System.out.print("������� ������ ���� � ������� dd.MM.yyyy: ");
        String secondDateString = scanner.nextLine();

        Date secondDate;
        try {
            secondDate = dateFormat.parse(secondDateString);
        } catch (ParseException e) {
            System.out.println("������������ ������ ������ ����.");
            scanner.close();
            return;
        }

        // ������� ������� ���� ����� ������
        int workdaysBetweenDates = countWorkdaysBetweenDates(firstDate, secondDate);
        System.out.println("���������� ������� ���� ����� ������: " + workdaysBetweenDates);

        scanner.close();
    }

    // ����� ��� �������� ������� ���� ����� ����� ������
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
