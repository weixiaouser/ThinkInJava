package interfaces;

import java.util.Arrays;

/**
 * Created by weixiao on 2018/9/6.
 */

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}

class Upcase extends Processor{
    String process(Object input){
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor{
    String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}
public class Apply {
    public static void process(Processor p,Object s){
        System.out.println("Using Processor "+p.name());
        System.out.println(p.process(s));
    }
    public static String s ="Disagreenment with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }

}/*output
Using Processor Upcase
DISAGREENMENT WITH BELIEFS IS BY DEFINITION INCORRECT
Using Processor Downcase
disagreenment with beliefs is by definition incorrect
Using Processor Splitter
[Disagreenment, with, beliefs, is, by, definition, incorrect]
*/
