package interfaces;

import java.util.Random;

/**
 * Created by weixiao on 2018/9/12.
 * Initializing interface fields with non-constant initializers.
 */
public interface RandVals {
    Random RAND = new Random(47);
    int RANDOM_INT = RAND.nextInt();
    long RANDOM_LONG = RAND.nextLong()*10;
    float RANDOM_FLOAT = RAND.nextFloat()*10;
    double RANDOM_DOUBLE = RAND.nextDouble()*10;
}
