package polymorphism;

/**
 * Created by weixiao on 2018/8/13.
 * polymorphism in java
 */
public class Shapes {
    private static RandomShapeGenerator gen =  new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for(int i = 0; i< s.length;i++){
            s[i] = gen.next();
        }
        for (Shape shp :s){
            shp.draw();
        }
    }
}/**Output:
 Square.draw()
 Circle.draw()
 Circle.draw()
 Square.draw()
 Circle.draw()
 Circle.draw()
 Triangle.draw()
 Square.draw()
 Circle.draw()
 */
