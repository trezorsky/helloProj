import java.util.*;

public class helloProj {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Integer, List<User>> userMap = new HashMap<>();

        for (int i = 0; i < 5; i++) {

            System.out.print("¬ведите им€ пользовател€: ");
            String name = scanner.nextLine();

            System.out.print("¬ведите возраст пользовател€: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            User user = new User(name, age);

            // ѕровер€ем, есть ли уже список дл€ данного возраста
            List<User> userList = userMap.get(age);

            if (userList == null) {
                // ≈сли список не существует, создаем новый
                userList = new ArrayList<>();
                userMap.put(age, userList);
            }

            // ƒобавл€ем пользовател€ в список дл€ данного возраста
            userList.add(user);
        }

        System.out.print("¬ведите возраст дл€ поиска пользователей: ");
        int searchAge = scanner.nextInt();
        scanner.nextLine();

        List<User> usersWithSearchAge = userMap.get(searchAge);

        if (usersWithSearchAge != null) {
            // —ортируем пользователей по имени
            Collections.sort(usersWithSearchAge, new Comparator<User>() {
                @Override
                public int compare(User user1, User user2) {
                    return user1.getName().compareTo(user2.getName());
                }
            });

            // ¬ыводим отсортированный список пользователей
            System.out.println("ѕользователи с возрастом " + searchAge + " лет:");
            for (User user : usersWithSearchAge) {
                System.out.println(user.toString());
            }
        } else {
            System.out.println("ѕользователей с возрастом " + searchAge + " лет не найдено.");
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
        return name + ", возраст " + age + " лет";
    }
}
