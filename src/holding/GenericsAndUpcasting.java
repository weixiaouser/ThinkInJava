package holding;

import java.util.ArrayList;

/**
 * Created by weixiao on 2018/9/26.
 */

class GrannySmith extends Apple {}
class Gala extends Apple {}
class Fuji extends Apple {}
class Braeburn extends Apple {}
public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for(Apple c : apples){
            System.out.println(c);
        }
    }
}/*output:
holding.GrannySmith@45ee12a7
holding.Gala@330bedb4
holding.Fuji@2503dbd3
holding.Braeburn@4b67cf4d
*/
