package algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * @author :weixiao
 * @description :对数器
 * @date :2020/8/3 16:34
 */
public class DataChecker {

    static int[] generateRandomArray(){
        Random r = new Random();
        int arr[] = new int[10000];
        for (int i = 0;i<arr.length; i++){
            arr[i]= r.nextInt(10000);
        }
        return arr;
    }

    static void check(){
        int arr[] = generateRandomArray();
        int arr2[] = new int[arr.length];
        System.arraycopy(arr,0,arr2,0,arr.length);
        Arrays.sort(arr);

        SelectionSort.sort(arr2);

        boolean same = true;
        for (int i = 0; i < arr2.length; i++) {
            if(arr[i] != arr2[i]){
                same = false;
            }
        }
        System.out.println(same == true ? "right" : "wrong");
    }


    public static void main(String[] args) {
        check();
    }
}
