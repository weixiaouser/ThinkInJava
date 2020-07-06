package DesignPattern.responChain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :weixiao
 * @description :责任链模式
 * 例如：你在论坛上发表内容，到后台需要进行过滤，然后把内容存储到数据库中
 * @date :2020/5/28 10:02
 */
public class Main {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("世界你好:) <script> 程序员996，到此一游，哈哈哈,weixiao.com");
        /*List<Filter> filters = new ArrayList<>();
        filters.add(new HtmlFilter());
        filters.add(new KeyFilter());
        for (Filter f : filters){
            f.doFilter(msg);
        }*/

        FilterChain filterChain = new FilterChain();
        //链式编程
        filterChain.add(new HtmlFilter()).add(new KeyFilter());

        FilterChain fc2 = new FilterChain();
        fc2.add(new URLFilter()).add(new FaceFilter());
        //在链条上加链条
        filterChain.add(fc2);
        filterChain.doFilter(msg);
        System.out.println(msg.toString());

    }
}

class Msg {
    private String name;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

interface Filter{
    boolean doFilter(Msg m);//此处返回boolean类型是为了解决如果中间过滤器返回false则之间返回而不录入数据库
}

class HtmlFilter implements Filter{

    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace("<","[");
        r = r.replace(">","]");
        m.setMsg(r);
        return true;
    }
}

class KeyFilter implements Filter{

    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace("996","955");
        m.setMsg(r);
        return false;
    }
}

class URLFilter implements Filter{

    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace("weixiao.com","http://www.weixiao.com");
        m.setMsg(r);
        return false;
    }
}
class FaceFilter implements Filter{

    @Override
    public boolean doFilter(Msg m) {
        String r = m.getMsg();
        r = r.replace(":)","^V^");
        m.setMsg(r);
        return false;
    }
}

class FilterChain implements Filter{
    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter f){
        filters.add(f);
        return this;
    }

    @Override
    public boolean doFilter(Msg msg){
        for (Filter f : filters){
            if(!f.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}
