package polymorphism;

/**
 * Created by weixiao on 2018/8/13.
 */
public class Circle extends Shape {
    public void draw(){
        System.out.println("Circle.draw()");
    }
    public void erase(){
        System.out.println("Circle.erase()");
    }
}
