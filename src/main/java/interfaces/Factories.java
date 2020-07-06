package interfaces;

/**
 * Created by weixiao on 2018/9/13.
 */

interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class implementation1 implements Service {
    implementation1(){}
    public void method1(){
        System.out.println("Implementation1 method1");
    }
    public void method2(){
        System.out.println("Implementation1 method2");
    }
}

class implementation1Factory implements ServiceFactory {
    public Service getService(){
        return new implementation1();
    }
}

class implementation2 implements Service {
    implementation2(){}
    public void method1(){
        System.out.println("Implementation2 method1");
    }
    public void method2(){
        System.out.println("Implementation2 method2");
    }
}

class implementation2Factory implements ServiceFactory{
    public Service getService(){
        return new implementation2();
    }
}

public class Factories {

    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();;
    }

    public static void main(String[] args) {
        serviceConsumer(new implementation1Factory());
        serviceConsumer(new implementation2Factory());
    }

}/*output:
Implementation1 method1
Implementation1 method2
Implementation2 method1
Implementation2 method2
*/
