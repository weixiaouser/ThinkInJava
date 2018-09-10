package interfaces;

/**
 * Created by weixiao on 2018/9/7.
 */
public class BandPass extends Filter {
    double lowCutoff,highCutoff;
    public BandPass(double lowCut,double highCut){
        lowCutoff = lowCut;
        highCutoff = highCut;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
