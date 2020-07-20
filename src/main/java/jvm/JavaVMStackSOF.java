package jvm;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/16 10:35
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+ oom.stackLength);
            throw e;
        }
    }
}
