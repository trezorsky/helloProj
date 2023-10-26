package module4_q9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.IntStream;

public class Student implements Learner {

    @Override
    public void learn() {

        Date date = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Текущее системное время: " + formatDate.format(date));

        System.out.println("Я учусь. .zZ");
        IntStream.range(0, 1000000).forEach(i -> Math.log(i));
        System.out.println("Я закончил учиться");

    }
}
