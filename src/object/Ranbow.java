package object;

/**
 * Created by weixiao on 2018/5/29.
 */
//Turn the AllColorsOfTheRainbow into a program that compiles and runs
public class Ranbow {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
        System.out.println("act.anIntegerRepresentingColors="+atc.anIntegerRepresentingColors);
        atc.changeColor(7);
        atc.changeTheHueOfTheColor(77);
        System.out.println("After color change,atc.anIntegerRepresentingColorss="+atc.anIntegerRepresentingColors);
        System.out.println("atc.hue = "+atc.hue);
    }
}

class AllTheColorsOfTheRainbow{
    int anIntegerRepresentingColors = 0;
    int hue = 0;
    void changeTheHueOfTheColor(int newHue){
        hue = newHue;
    }
    int changeColor(int newColor){
        return anIntegerRepresentingColors = newColor;
    }
}
