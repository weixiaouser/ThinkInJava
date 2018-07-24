package Reusing;

/**
 * Created by weixiao on 2018/7/24.
 * Array creation methods that can be used without
 */
public class Range {
    public static int[] range(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
            return result;

    }
        public static int[] range(int start,int end){
            int sz = end -start;
            int[] result = new int[sz];
            for(int i =0;i<sz;i++) {
                result[i] = start + i;
            }
                return result;
    }

    public static int[] range(int start,int end,int step){
        int sz = (end-start)/step;
        int[] result = new int[sz];
        for(int i=0;i<sz;i++){
            result[i] = start+(i*step);
        }
        return result;
    }
}
