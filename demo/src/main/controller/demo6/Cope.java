package demo6;

import java.util.Arrays;
public class Cope{
    public static void main(String[] args) {
        int arr[]=new int[]{23,42,12};
        int newarr[]=Arrays.copyOf(arr,1);
        for(int i=0;i<newarr.length;i++){
            System.out.println(newarr[i]);
        }

    }
}


