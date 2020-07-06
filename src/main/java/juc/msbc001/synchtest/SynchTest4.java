package juc.msbc001.synchtest;

import java.util.concurrent.TimeUnit;

/**
 * @author :weixiao
 * @description :
 * @date :2020/6/5 14:12
 *
 */
public class SynchTest4 {

    synchronized void m(){
        System.out.println("m start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("m end");
    }

    public static void main(String[] args) {
        new SubSynchTest4().m();
    }


    static class SubSynchTest4 extends SynchTest4{

        @Override
        synchronized void m(){
            System.out.println("child m start");
            super.m();
            System.out.println("child m end ");
        }
    }
}
