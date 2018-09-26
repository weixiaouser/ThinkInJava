package holding;

import java.util.*;

/**
 * Created by weixiao on 2018/9/26.
 */
public class AddingGroups {
    public static void main(String[] args){
        Collection <Integer> collection = new ArrayList<Integer>(Arrays
                .asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
        //Runs significantly faster,but you can't
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1,99);//OK --modify an element
       // list.add(21);//Runtime error because the
                        //underlying array cannot be resized
    }
}
