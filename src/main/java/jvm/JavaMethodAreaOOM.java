package jvm;

import com.sun.deploy.security.EnhancedJarVerifier;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author :weixiao
 * @description :CGLib使得方法区出现内存溢出
 * @date :2020/4/8 14:08
 */
public class JavaMethodAreaOOM {

    public static void main(String[] args) {
        while (true){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    System.out.println("before");
                    Object res = methodProxy.invokeSuper(o,args);
                    System.out.println("after");
                    return res;
                }
            });
           OOMObject oom = (OOMObject) enhancer.create();
           oom.print();
        }
    }
    static class OOMObject{

        void print(){
            System.out.println("hhhhhasd");
        }

    }
}


