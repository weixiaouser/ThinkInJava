package DesignPattern.strategy;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/26 15:56
 */
public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.weight < o2.weight) {
            return -1;
        }else if(o1.weight > o2.weight) {
            return 1;
        } else {
            return 0;
        }
    }
}
