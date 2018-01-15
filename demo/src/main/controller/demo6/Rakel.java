package demo6;

import java.util.Arrays;

public class Rakel {
    public static void main(String[] args) {
        String str[]=new String[]{"ab","cd","ef","yz"};
        Arrays.sort(str);
//        在指定的范围内搜索元素"cd"的索引位置
        int index=Arrays.binarySearch(str,0,2,"cd");
        System.out.println("cd的索引的位置是："+index);
    }
}
