package jdkProxy;

import jdkProxy.impl.TpyXueHuaXiuFactory;
import jdkProxy.proxy.XueHuaXiuProxyCompany;

/**
 * @author :weixiao
 * @description :
 * @date :2020/4/16 16:23
 */
public class Your {

    public static void main(String[] args) {
        //普通方式调用 自己去购买
        XueHuaXiuFactory xuehuaxiu = new TpyXueHuaXiuFactory();
        xuehuaxiu.createXueHuaXiu();

        System.out.println("==============================");
        //=========================================
        //通过代理去实现

        XueHuaXiuProxyCompany company = new XueHuaXiuProxyCompany();
        company.setTarget(xuehuaxiu);
        XueHuaXiuFactory proxy = (XueHuaXiuFactory)company.getProxy();
        proxy.createXueHuaXiu();
    }
}
