import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class helloProj {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<User> userList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите имя пользователя: ");
            String name = scanner.nextLine();

            System.out.print("Введите возраст пользователя: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            User user = new User(name, age);
            userList.add(user);
        }

        // Сортировка списка пользователей по возрастанию возраста
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User user1, User user2) {
                return user1.getAge().compareTo(user2.getAge());
            }
        });

        // Вывод отсортированного списка пользователей
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}

class User {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", âîçðàñò " + age + " ëåò";
    }
}
