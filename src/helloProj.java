import java.util.Random;

public class helloProj {

    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();
        // �� 1 �� 15
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15) + 1;
        }

        System.out.println("���������� �������: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\n��������, ������������� ������ ������ ����:");
        for (int i = 1; i <= 15; i++) {
            int count = 0; // ������� ������������� �����
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("����� '" + i + "' ����������� " + count + " ����");
            }
        }
    }
}
