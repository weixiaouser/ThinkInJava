package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author :weixiao
 * @description :
 * @date :2020/4/27 21:18
 */
public class DynamicProxyTest {

    interface IHello{
        void sayHello();
    }

    static class Hello implements IHello{

        @Override
        public void sayHello() {
            System.out.println("Hello World!");
        }
    }

    static class DynamicProxy implements InvocationHandler{
        Object originalObj;

        Object bind(Object originalObj){
            this.originalObj = originalObj;
            return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(),originalObj.getClass().getInterfaces(),this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("welcome");
            method.invoke(originalObj,args);
            return null;
        }
    }

    public static void main(String[] args) {
        IHello hello = (IHello)new DynamicProxy().bind(new Hello());
        hello.sayHello();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
    }
}
