package polymorphism;

/**
 * Created by weixiao on 2018/8/12.
 * polymorphism/music Instrument.java
 */

class Instrument{
    public void play(Note n){
        System.out.println("Instrument.play()");
    }
}
public class Wind extends Instrument {
    public void play(Note n){
        System.out.println("Wind.play()"+n);
    }
}
