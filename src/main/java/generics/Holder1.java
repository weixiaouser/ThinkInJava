package generics;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/1 13:47
 */
public class Holder1 {

    private Automobile a;

    public Holder1(Automobile a){
        this.a = a;
    }
    Automobile get(){
        return a;
    }
}

class Automobile{}
