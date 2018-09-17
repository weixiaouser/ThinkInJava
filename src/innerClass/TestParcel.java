package innerClass;

/**
 * Created by weixiao on 2018/9/17.
 */
public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmaina");

    }
}
