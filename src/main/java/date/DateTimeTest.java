package date;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author :weixiao
 * @description :SimpleDateFormat 线程不安全
 * DateTimeFormatter 线程安全
 * @date :2020/5/15 10:12
 */
public class DateTimeTest {

    public static void main(String[] args) {
        //线程不安全
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        System.out.println(sdf.format(date));
        //线程安全
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm:ss");
        System.out.println(now.format(dtf));

    }
}
