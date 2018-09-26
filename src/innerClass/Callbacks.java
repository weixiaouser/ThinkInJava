package innerClass;

/**
 * Created by weixiao on 2018/9/19.
 * Using inner classes for callbacks
 */

interface Incrementable {
    void increment();
}
class Calleel implements Incrementable {
    private int i = 0;
    //Very simple to just implement the interface;
    public void increment(){
        i++;
        System.out.println(i);
    }
}
class MyIncrement {
    public void increment(){
        System.out.println("Other operation");
    }
    static void f(MyIncrement mi){
        mi.increment();
    }
}

//If your class must implement increment() in
// some other way. you must use an inner class;
class Callee2 extends MyIncrement {
    private int i = 0;
    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable {
        public void increment(){
            //Specify outer-class method,otherwise
            //you'd get an infinite recursion;
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;
    Caller(Incrementable cbh){callbackReference = cbh;}
    void go(){
        callbackReference.increment();
    }
}

public class Callbacks {
    public static void main(String[] args) {
        Calleel c1 = new Calleel();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}/*output:
Other operation
1
1
2
Other operation
2
Other operation
3
*/
