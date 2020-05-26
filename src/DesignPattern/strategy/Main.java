package DesignPattern.strategy;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author :weixiao
 * @description :
 * @date :2020/5/26 13:54
 */
public class Main {

    public static void main(String[] args) {
       /* int[] a = {9,2,3,5,7,1,4};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));*/

      // Cat[] c = {new Cat(3,3),new Cat(1,1),new Cat(5,5)};
       /*Dog[] c = {new Dog(3),new Dog(5),new Dog(1)};
       Sorter sorter = new Sorter();
       sorter.catSort(c);
       System.out.println(Arrays.toString(c));*/

      /* Dog[] c = {new Dog(3),new Dog(5),new Dog(1)};
       Sorter<Dog> sorter = new Sorter<>();
       sorter.sort(c,new DogComparator());
       System.out.println(Arrays.toString(c));*/

        Cat[] c = {new Cat(3,3),new Cat(1,1),new Cat(5,5)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(c,new CatComparator());
        System.out.println(Arrays.toString(c));
    }
}
