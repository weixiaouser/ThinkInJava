package reusing;

/**
 * Created by weixiao on 2018/8/2.
 */
public class SpaceShip extends SpaceShipControls {
    private String name;
    public SpaceShip(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}
