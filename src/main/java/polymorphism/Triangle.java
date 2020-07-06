package polymorphism;

/**
 * Created by weixiao on 2018/8/13.
 */
public class Triangle extends Shape {
    public void draw(){
        System.out.println("Triangle.draw()");
    }
    public void erase(){
        System.out.println("Triangle.erase()");
    }
}
