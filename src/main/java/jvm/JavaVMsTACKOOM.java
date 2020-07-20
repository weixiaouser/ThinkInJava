package jvm;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/16 11:26
 */
public class JavaVMsTACKOOM {

    private void dontStop(){
        while(true){}
    }

    public void stackLeakByThread(){
        while(true){
            new Thread(()->{
                dontStop();
            }).start();
        }
    }

    public static void main(String[] args) {
        JavaVMsTACKOOM oom = new JavaVMsTACKOOM();
        oom.stackLeakByThread();
    }
}
