import java.util.Scanner;

public class helloProj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ���� � ������� dd.mm.yyyy: ");
        String dateString = scanner.nextLine();

        String[] parts = dateString.split("\\.");
        if (parts.length == 3) {
            String year = parts[2];
            String month = parts[1];
            String day = parts[0];
            String formattedDate = year + "-" + month + "-" + day;
            System.out.println("��������������� ����: " + formattedDate);
        } else {
            System.out.println("������������ ������ ����.");
        }

        scanner.close();
    }
}
