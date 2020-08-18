package effective.createObject_2;

/**
 * @author :weixiao
 * @description :  讨论使用静态工厂方法代替构造方法
 * @date :2020/8/18 11:16
 */
public class Child {

    private int age;

    private int weight;

    public Child(){}

    public Child (int age,int weight){
        this.age = age;
        this.weight = weight;
    }
    //使用构造方法以下此种方式不适用
    /*public Child(int weight){}
    public  Child(int age){}*/

    public static Child newChild(int age,int weight){
        Child child = new Child();
        child.age = age;
        child.weight = weight;
        return child;
    }
    public static Child newChildWithWeight(int weight){
        Child child = new Child();
        child.weight = weight;
        return child;
    }

    public static Child newChildWithAge(int age){
        Child child  = new Child();
        child.age = age;
        return child;
    }

    public static void main(String[] args) {
        System.out.println(Child.newChild(2,30));
        System.out.println(new Child(2,30));
    }
}
