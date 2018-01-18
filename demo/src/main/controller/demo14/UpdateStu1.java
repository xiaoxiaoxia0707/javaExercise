package demo14;

import java.util.*;

public class UpdateStu1 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();//创建map实例
        map.put("01","李同学");//像 集合添加对象
        map.put("02","肖同学");
        Set<String> set=map.keySet();//构造map集合中所有key对象集合
        Iterator<String> it=set.iterator();//创建集合迭代器
        System.out.println("key集合中的元素：");
        while(it.hasNext()){//
            System.out.println(it.next());
        }
        Collection<String> coll=map.values();//构造map集合中所有values值的集合
        it=coll.iterator();
        System.out.println("values集合中的元素：");
        while (it.hasNext()){//遍历集合
            System.out.println(it.next());
        }
    }
}
