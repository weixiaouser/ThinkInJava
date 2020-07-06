package holding2;

import java.util.ArrayList;

/**
 * Created by weixiao on 2019/5/10 9:23
 */
//Simple container example

class Apple{
   private static long counter;
   private final long id = counter++;
   public long id(){
       return id;
   }
}
class Orange{}

public class ApplesAndOrangesWithoutGenerics {

    public static void main(String[] args){
        ArrayList apples = new ArrayList();
        for(int i=0;i<3;i++){
            apples.add(new Apple());

        }
        apples.add(new Orange());
        for(int i = 0;i<apples.size();i++){
            ((Apple)apples.get(i)).id();
        }
    }
}
