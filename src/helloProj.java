import java.util.Random;

public class helloProj {

    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();
        // от 1 до 15
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15) + 1;
        }

        System.out.println("Содержимое массива: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗначения, встречающиеся больше одного раза:");
        for (int i = 1; i <= 15; i++) {
            int count = 0; // Счетчик встречаемости числа
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("число '" + i + "' встречается " + count + " раза");
            }
        }
    }
}
