import java.util.Scanner;

public class helloProj {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("��� ���� �����?");
        String name = scanner.nextLine();
        System.out.println("������, " + name + "!");
        scanner.close();

    }
}
