package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.InvocationHandler;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/17 14:23
 */
public class SimpleClassTest {

    @Test
    public void testFixedValue(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SimpleClass.class);
        enhancer.setCallback((FixedValue) () -> "hello CGLIB");

        SimpleClass proxy = (SimpleClass) enhancer.create();
        System.out.println(proxy.test(null));
        System.out.println(proxy.toString());
        System.out.println(proxy.getClass());
       // System.out.println(proxy.hashCode());
    }
    @Test
    public void testInvocationHandler()throws Exception{
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SimpleClass.class);
        enhancer.setCallback((InvocationHandler) (o, method, objects) -> {
            if(method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
                return "hello cglib";
            }else{
                throw new RuntimeException("Do not know what to do");
            }
        });

        SimpleClass proxy = (SimpleClass) enhancer.create();
        Assert.assertEquals("hello cglib",proxy.test(null));
        Assert.assertNotEquals("Hello cglib",proxy.toString());
    }


}
