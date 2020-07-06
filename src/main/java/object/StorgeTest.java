package object;

/**
 * Created by weixiao on 2018/5/28.
 */
//object /StorgeTest.java
    //TIJ4 Chapter Object exercise 6 page 90
    //Write a progame that includes and calls the storage() method defined as a
    // code fragment in this chapter
public class StorgeTest {
    public static void main(String[] args){
        class StoreStuff{
            int storage(String s){
                return  s.length()*2;
            }
        }
        StoreStuff x = new StoreStuff();
        System.out.println(x.storage("hi"));
    }
}
