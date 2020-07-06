package polymorphism;

import polymorphism2.Wind;

/**
 * Created by weixiao on 2018/8/12.
 * Inheritance & upcasting
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        //tune(flute);
    }
}/*output:
Wind.play()MIDDLE_C

*/
