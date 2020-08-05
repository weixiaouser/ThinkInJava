package algorithm;

/**
 * @author :weixiao
 * @description :选择排序
 * 1.先把数组打印出来看一下
 * 2.取下标为0的这个数字，和其他的进行比较，找到最小的那个，和第一个交换位置
 * @date :2020/8/3 10:25
 */
public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={5,3,4,2,1,8,7,6,9};

        for(int i=0 ;i<arr.length-1; i++){
            //定义最小位置
            int minPos = i;
            for(int j = i+1;j<arr.length;j++){
                //判断如果循环的数据比minPos小，把循环数据赋值给minPos
               /* if(arr[j]<arr[minPos]){
                    minPos = j;
                }*/
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            System.out.println("minPos:"+minPos);
            //找到最小数据的位置和当前数据进行交换
            swap(arr,i,minPos);
            System.out.println("经过第 "+i+" 次循环之后，数组的内容：");
            print(arr);
        }

        //1.先把数组打印出来看一下
        System.out.println();
        System.out.println("数组最后结果：");
        print(arr);

    }
    public static void sort (int arr[]) {
       // int arr[]={5,3,4,2,1,8,7,6,9};

        for(int i=0 ;i<arr.length-1; i++){
            //定义最小位置
            int minPos = i;
            for(int j = i+1;j<arr.length;j++){
                //判断如果循环的数据比minPos小，把循环数据赋值给minPos
               /* if(arr[j]<arr[minPos]){
                    minPos = j;
                }*/
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }
            System.out.println("minPos:"+minPos);
            //找到最小数据的位置和当前数据进行交换
            swap(arr,i,minPos);
            System.out.println("经过第 "+i+" 次循环之后，数组的内容：");
            print(arr);
        }

        //1.先把数组打印出来看一下
        System.out.println();
        System.out.println("数组最后结果：");
        print(arr);

    }

    /**
     * 数据交换
     * @param arr
     * @param i
     * @param j
     */
    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 打印
     * @param arr
     */
    static void print(int arr[]){
        for (int i = 0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
