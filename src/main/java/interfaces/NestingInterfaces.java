package interfaces;

/**
 * Created by weixiao on 2018/9/12.
 */
public class NestingInterfaces {
    public class BImp implements A.B{
        public void f() {
        }
    }
    class CImp implements A.C{
        public void f(){}
    }

    class EImp implements E {
        public void g(){}
    }
    class EGImp implements E.G {
        public void f(){
        }
    }
    class EImp2 implements E {
        public void g(){}
        class EG implements E.G {
            public void f(){}
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}
