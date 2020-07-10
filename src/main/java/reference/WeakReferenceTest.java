package reference;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.ref.WeakReference;

/**
 * @author :weixiao
 * @description :弱引用
 * @date :2020/7/10 11:33
 */
public class WeakReferenceTest {

    public static void main(String[] args) {
        WeakReference<M> m= new WeakReference<>(new M());
        System.out.println(m.get());
        System.gc();
        System.out.println(m.get());
        ThreadLocal<M> tl = new ThreadLocal<>();
        tl.set(new M());
        tl.remove();
    }
}
