package demo17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class AnyClass {
    public static void main(String[] args) {
        //定义ArrayList容器，设置容器内的值类型为Integer
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(1);//为容器添加新值
        for(int i=0;i<a.size();i++){
            //根据容器的长度循环显示容器内的值
            System.out.println("获取ArrayList容器的值："+a.get(i));
        }
        //定义HashMap容器，设置容器内的值类型为Integer与String型
        Map<Integer,String> m=new HashMap<Integer,String>();
        for(int i=0;i<5;i++){
            //为容器填充键名和键值
           m.put(i,"成员"+i);
        }
        for(int i=0;i<m.size();i++){
            //根据键名获取键值
            System.out.println("获取Map容器的值："+m.get(i));
        }
        //定义Vector容器，设置容器内的值类型为String
        Vector<String> v=new Vector<String>();
        for(int i=0;i<5;i++){
            //为容器添加内容
            v.addElement("成员"+i);
        }
        for(int i=0;i<v.size();i++){
            //显示容器的内容
            System.out.println("获取Vector容器的值："+v.get(i));
        }
    }
}
