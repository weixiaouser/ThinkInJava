package stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author :weixiao
 * @description :
 * @date :2020/2/19 10:57
 */
public class StreamTest {

    public static void main(String[] args) {
        /*List<String> strings = Arrays.asList("abc","bc","efg","abcd","","jkl");
        List<String> filtered = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);*/

        //forEach 迭代流中的每个数据，limit 用户获取指定数量的流
        /*Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);*/

        //map 方法用于映射每个元素对应的结果
        /*List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);*/


        //filter方法用于通过设置的条件过滤元素。以下代码片段使用filter方法过滤空字符串
        /*List<String> strings = Arrays.asList("abc","bc","efg","abcd","","jkl");
        long count = strings.stream().filter(string->string.isEmpty()).count();
        System.out.println(count);*/

        //sorted 用于对流进行排序
        /*Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);*/

        //parallelStream是流并行处理程序的代替方法，以下示例我们使用parallelStream来输出空字符串数量
        /*List<String> strings = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        //获取空字符串的数量
        long count = strings.parallelStream().filter(string->string.isEmpty()).count();
        System.out.println(count);*/

        //Collectors 类实现了很多规约操作，例如将流转换成集合和聚合元素。Collectors可用于返回列表或字符串
        /*List<String> strings = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        List<String> filtered = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选列表："+filtered);
        
        String mergedString = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.joining(","));
        System.out.println("合并字符串："+mergedString);*/

        //统计 另外，一些产生统计结果的收集器也非常有用。它们主要用于int、double、long等基本类型上，它们可以用来产生类似如下的统计结果。
        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println("列表中最大的数："+stats.getMax());
        System.out.println("列表中最小的数："+stats.getMin());
        System.out.println("所有数之和："+stats.getSum());
        System.out.println("平均数："+stats.getAverage());
    }
}
