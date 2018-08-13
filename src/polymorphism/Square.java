package polymorphism;

/**
 * Created by weixiao on 2018/8/13.
 * polymorphism/shape/Square.java
 */
public class Square extends  Shape {
    public void draw(){
        System.out.println("Square.draw()");
    }
    public void erase(){
        System.out.println("Square.erase()");
    }

}
