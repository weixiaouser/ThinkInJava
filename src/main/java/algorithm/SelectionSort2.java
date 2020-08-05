package algorithm;

/**
 * @author :weixiao
 * @description :选择排序  从第0位开始查找，找到最小值放到第0位置，找到最大值放到最后一位
 * @date :2020/8/3 14:44
 */
public class SelectionSort2 {

    public static void main(String[] args) {
        int arr[]={5,3,8,4,9,2,1,8,7,6};

        for(int j=0 ; j<arr.length ; j++){

        int minPos = j;
        int maxPos = j;
        for (int i = j+1 ;i<arr.length;i++){
            minPos = arr[i] < arr[minPos] ? i : minPos;
            maxPos =arr[i] > arr[maxPos] ? i : maxPos;
        }

        System.out.println("最小位置："+minPos);
        System.out.println("最大位置："+maxPos);
        //交换
        SelectionSort.swap(arr,j,minPos);
        SelectionSort.swap(arr,arr.length-1,maxPos);

        SelectionSort.print(arr);
        }
    }
}
