package initialization;

/**
 * Created by weixiao on 2018/6/21.
 */
// initialization/Overloading.java
//Demonstration of both constructor

class Tree{
    int height;
    Tree(){
        System.out.println("Planting a seedling");
        height = 0;
    }
    Tree(int initialHeight){
        height = initialHeight;
        System.out.println("Creating new Tree that is"+height +" feet tall");
    }
    void info(){
        System.out.println("Tree is "+height +" feet tall");
    }
    void info(String s){
        System.out.println(s+" : Tree is "+height +"feet tall");
    }
}
public class Overloading {
    public static void main(String[] args) {
        for(int i = 0 ; i< 5 ; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("Overloaded method");
        }
        new Tree();
    }
}/*Output:
Creating new Tree that is0 feet tall
Tree is 0 feet tall
Overloaded method : Tree is 0feet tall
Creating new Tree that is1 feet tall
Tree is 1 feet tall
Overloaded method : Tree is 1feet tall
Creating new Tree that is2 feet tall
Tree is 2 feet tall
Overloaded method : Tree is 2feet tall
Creating new Tree that is3 feet tall
Tree is 3 feet tall
Overloaded method : Tree is 3feet tall
Creating new Tree that is4 feet tall
Tree is 4 feet tall
Overloaded method : Tree is 4feet tall
Planting a seedling
*/
