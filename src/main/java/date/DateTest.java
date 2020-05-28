package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author :weixiao
 * @description :
 * @date :2020/1/3 9:34
 */
public class DateTest {

    public static void main(String[] args) throws  Exception{
        /*Calendar calendar = Calendar.getInstance();
        calendar.set(2019,Calendar.MINUTE,31);
        Date strDate = calendar.getTime();
        DateFormat formatUpper = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("2019-12-31 to yyyy-MM-dd:" + formatUpper.format(strDate));

        formatUpper = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println("2019-12-31 to YYYY/MM/dd:"+formatUpper.format(strDate));*/

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date newDate = sdf.parse("2019-12-31 23:59:59");
        System.out.println(newDate);

        SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        Date newDate2 = sdf2.parse("2019-12-31 23:59:59");
        System.out.println(newDate2);

        SimpleDateFormat sdf3 = new SimpleDateFormat("YYYY-MM-dd");
        Date newDate3 = sdf3.parse("2020-01-01");
        System.out.println(newDate3);

        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd");
        Date newDate4 = sdf4.parse("2020-01-01");
        System.out.println(newDate4);

    }
}/*output
Tue Dec 31 23:59:59 CST 2019
Sun Dec 30 23:59:59 CST 2018
Sun Dec 29 00:00:00 CST 2019
Wed Jan 01 00:00:00 CST 2020
*/
