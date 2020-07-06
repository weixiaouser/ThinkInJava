package DesignPattern.strategy;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/26 13:58
 */
public class Sorter<T> {

   /* public static void sort(int[] arr){
        for(int i = 0; i< arr.length-1;i++){
            int minPos = i;

            for(int j = i+1; j<arr.length; j++){
                minPos = arr[j] < arr[minPos] ? j :minPos;
            }
            swap(arr,i,minPos);
        }
    }
    static void swap(int[] arr,int i,int j ){
        int  temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/


    /**
     * Comparable 可以使用java.lang包下的 或者使用自己定义的
     * @param arr
     */
   /* public static void catSort(ComparableByWX[] arr){
        for(int i = 0; i< arr.length-1;i++){
            int minPos = i;

            for(int j = i+1; j<arr.length; j++){
                minPos = arr[j].compareTo(arr[minPos]) ==-1 ? j :minPos;
            }
            catswap(arr,i,minPos);
        }
    }

    static void catswap(ComparableByWX[] arr,int i,int j ){
        ComparableByWX temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/


    public  void sort(T[] arr,Comparator<T> comparator){
        for(int i = 0; i< arr.length-1;i++){
            int minPos = i;

            for(int j = i+1; j<arr.length; j++){
                minPos = comparator.compare(arr[j],arr[minPos]) ==-1 ? j :minPos;
            }
            swap(arr,i,minPos);
        }
    }

     void swap(T[] arr,int i,int j ){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
