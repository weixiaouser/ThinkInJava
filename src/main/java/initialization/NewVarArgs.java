package initialization;

/**
 * Created by weixiao on 2018/7/22.
 */
public class NewVarArgs {
    static void printArray(Object... args){
        for(Object obj:args){
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer(47),new Float(3.14),
                new Double(11.11));
        printArray(47,3.14F,11.11);
        printArray("one","two","three");
        printArray(new A(),new A(),new A());
        printArray((Object[])new Integer[]{1,2,3,4});
        printArray();
    }
}/*Output:
47 3.14 11.11
47 3.14 11.11
one two three
initialization.A@45ee12a7 initialization.A@330bedb4 initialization.A@2503dbd3
1 2 3 4 */
