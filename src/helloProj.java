import java.util.Scanner;

public class helloProj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ������: ");
        String inputString = scanner.nextLine();

        // �������� ����� "����" � "����" �� "�������� ��������"
        String censoredString = inputString.replaceAll("(.*)����(.*)|(.*)����(.*)", "�������� ��������");

        System.out.println("��������� ������:");
        System.out.println(censoredString);

        scanner.close();
    }
}
