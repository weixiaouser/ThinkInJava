package juc.Stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author :weixiao
 * @description :
 * @date :2020/3/19 19:24
 *
 * * 以下数据，进行操作筛选用户：要求：一行代码做出此题，时长1分钟！
 * * 1、全部满足偶数ID
 * * 2、年龄都大于24
 * * 3、用户名转为大写
 * * 4、用户名字母倒排序
 * * 5、只能输出一个名字
 */
public class StreamDemo {
    public static void main(String[] args) {
        User user1 = new User(11,"a",23);
        User user2 = new User(12,"b",24);
        User user3 = new User(13,"c",22);
        User user4 = new User(14,"d",28);
        User user5 = new User(16,"e",26);
        //集合管理数据
        List<User> list1 = Arrays.asList(user1,user2,user3,user4,user5);

        list1.stream()
                .filter(u -> {return u.getId() % 2 == 0;})
                .filter(u->{return u.getAge() >24;})
                .map(u->{return u.getName().toUpperCase();})
                .sorted((o1, o2)->{return o2.compareTo(o1);})
                .limit(1)
                .forEach(System.out::println);
    }
}
