package algorithm;

/**
 * @author :weixiao
 * @description :冒泡排序，两两比较大的往后面拍
 * @date :2020/8/5 10:34
 */
public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {5,3,1,4,6,8,7,9,2};
        sort(a);
        SelectionSort.print(a);
    }

    public static void sort(int a[]){
        for(int i=a.length-1; i > 0;i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    SelectionSort.swap(a, j, j + 1);
                }
            }
        }
    }


}
