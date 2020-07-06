package jdkProxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author :weixiao
 * @description : 雪花秀代理公司  实现invocationHandler  接口 invoke 方法
 * @date :2020/4/16 16:24
 */
public class XueHuaXiuProxyCompany implements InvocationHandler {

    //目标对象
    private Object target;
    public void setTarget(Object target){
        this.target = target;
    }

    /**
     * 获取生成的代理对象
     * @return
     */
    public Object getProxy(){
      return  Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //利用java 反射 执行目标对象的方法
        Object result = method.invoke(target, args);
        return result;
    }
}
