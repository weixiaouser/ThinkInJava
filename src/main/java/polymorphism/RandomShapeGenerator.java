package polymorphism;

import java.util.Random;

/**
 * Created by weixiao on 2018/8/13.
 * polymorphism/shape/RandomShapeGenerator.java
 */
public class RandomShapeGenerator {
    private Random rand = new Random();
    public Shape next(){
        switch (rand.nextInt(3)) {
        default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}
