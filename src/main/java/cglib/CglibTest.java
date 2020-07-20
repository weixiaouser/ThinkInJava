package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/17 14:04
 */
public class CglibTest {

    public void test(){
        System.out.println("hello world!");
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibTest.class);
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("begin....");
            Object result = methodProxy.invokeSuper(o,objects);
            System.out.println("after....");
            return result;
        });
        CglibTest cglibTest =(CglibTest) enhancer.create();
        cglibTest.test();
    }

}


