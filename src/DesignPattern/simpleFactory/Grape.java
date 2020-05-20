package DesignPattern.simpleFactory;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/19 10:33
 */
public class Grape implements Fruit {

    private boolean seedless;

    @Override
    public void grow() {
        System.out.println("Grape is growing..");
    }

    @Override
    public void harvest() {
        System.out.println("Grape has been harvested.");
    }

    @Override
    public void plant() {
        System.out.println("Grape has been planted.");

    }

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }
}
