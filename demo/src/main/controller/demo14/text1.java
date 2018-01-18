package demo14;

import java.util.*;

public class text1 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();//由HashMap实现的map对象
        Emp emp=new Emp("351","张三");//创建Emp对象
        Emp emp2=new Emp("512","李四");//创建Emp对象
        Emp emp3=new Emp("853","王一");//创建Emp对象
        Emp emp4=new Emp("125","赵六");//创建Emp对象
        Emp emp5=new Emp("341","黄七");//创建Emp对象
        map.put(emp.getE_id(),emp.getE_name());//将对象添加到集合中
        map.put(emp2.getE_id(),emp2.getE_name());//将对象添加到集合中
        map.put(emp3.getE_id(),emp3.getE_name());//将对象添加到集合中
        map.put(emp4.getE_id(),emp4.getE_name());//将对象添加到集合中
        map.put(emp5.getE_id(),emp5.getE_name());//将对象添加到集合中

        Set<String> set=map.keySet();//获取map集合中key对象集合
        Iterator<String> it=set.iterator();
        System.out.println("HashMap类实现的map集合，无序：");
        while(it.hasNext()){
            String str=(String)it.next();//遍历map集合
            String name=(String)map.get(str);//遍历map集合
            System.out.println(str+""+name);
        }
        TreeMap<String,String> treemap=new TreeMap<>();//创建TreeMap集合对象
        treemap.putAll(map);
        Iterator<String>iter=treemap.keySet().iterator();
        System.out.println("TreeMap类实现的map集合，键对象升序：");
        while(iter.hasNext()){//遍历TreeMap集合对象
            String str=(String)iter.next();//获取集合中的所有key对象
            String name=(String)treemap.get(str);//获取集合中的所有key对象
            System.out.println(str+""+name);
        }


    }
}
