package jvm;

import com.sun.deploy.security.EnhancedJarVerifier;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author :weixiao
 * @description :
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
                    return methodProxy.invokeSuper(o,args);
                }
            });
            enhancer.create();
        }
    }
    static class OOMObject{

    }
}


