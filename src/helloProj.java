import java.util.Scanner;

public class helloProj {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ������ ����� (a): ");
        int a = scanner.nextInt();
        System.out.print("������� ������ ����� (b): ");
        int b = scanner.nextInt();
        System.out.print("������� ������ ����� (c): ");
        int c = scanner.nextInt();

        StringBuilder result = new StringBuilder();

        if (a % 5 == 0) result.append("a=").append(a).append(", ");
        if (b % 5 == 0) result.append("b=").append(b).append(", ");
        if (c % 5 == 0) result.append("c=").append(c).append(", ");

        if (result.length() > 0) {
            // ������� ������� � ��������
            result.delete(result.length() - 2, result.length());
            System.out.println(result);
        } else {
            System.out.println("��� ��������, ������� 5");
        }

        int divRes = a / b;
        System.out.println("��������� �������������� ������� a �� b: " + divRes);

        double divResFloat = (double) a / b;
        System.out.println("��������� ������� a �� b (����� � ��������� �������): " + divResFloat);

        int roundedUp = (int) Math.ceil(divResFloat);
        System.out.println("��������� �� ���������� ������ � ������� �������: " + roundedUp);

        int roundedDown = (int) Math.floor(divResFloat);
        System.out.println("��������� �� ���������� ������ � ������� �������: " + roundedDown);

        int rounded = (int) Math.round(divResFloat);
        System.out.println("�������������� ����������: " + rounded);

        int remainder = b % c;
        System.out.println("������� �� ������� b �� c: " + remainder);

        int minAB = Math.min(a, b);
        System.out.println("���������� �������� �� a � b: " + minAB);

        int maxBC = Math.max(b, c);
        System.out.println("���������� �������� �� b � c: " + maxBC);

        scanner.close();

    }
}
