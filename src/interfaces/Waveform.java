package interfaces;

/**
 * Created by weixiao on 2018/9/7.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Waveform "+id;
    }
}
