package DesignPattern.strategy;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/26 15:56
 */
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if(o1.food < o2.food) {
            return -1;
        }else if(o1.food > o2.food) {
            return 1;
        } else {
            return 0;
        }
    }
}
