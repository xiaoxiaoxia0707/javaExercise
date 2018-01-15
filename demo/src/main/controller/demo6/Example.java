package demo6;

import java.util.Arrays;

public class Example {
    public static void main(String[] args){
        int a[]=new int[]{1,8,9,4,5};
        Arrays.sort(a);
        int index=Arrays.binarySearch(a,9);
        System.out.println("4的索引的位置是："+index);
    }
}
