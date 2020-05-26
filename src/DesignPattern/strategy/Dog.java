package DesignPattern.strategy;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/26 14:44
 */
public class Dog implements ComparableByWX<Dog> {

    int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }

    @Override
    public int compareTo(Dog d) {
        if(this.food < d.food){
            return -1;
        }else if(this.food > d.food){
            return 1;
        }else{
            return 0;
        }

    }
}
