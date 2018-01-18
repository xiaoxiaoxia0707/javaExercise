package demo14;
import java.util.Iterator;
import java.util.TreeSet;
public class UpdateStu implements Comparable<Object> {//创建类实现Comparable接口
    String name;
    long id;
    public UpdateStu(String name,long id){//创建方法
        this.id=id;
        this.name=name;

    }
    public int compareTo(Object o){
        UpdateStu upstu=(UpdateStu) o;
        int result=id > upstu.id?1:(id==upstu.id?0:-1);//参照代码说明
        return result;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public long getId(){
        return  id;
    }
    public void setId(long id){
        this.id=id;
    }

    public static void main(String[] args) {//创建UpdateStu对象
        UpdateStu stu1=new UpdateStu("李同学",01011);
        UpdateStu stu2=new UpdateStu("肖同学",01021);
        UpdateStu stu3=new UpdateStu("王同学",01031);
        UpdateStu stu4=new UpdateStu("柯同学",01041);
        TreeSet<UpdateStu>tree =new TreeSet<>();
        tree.add(stu1);          //向集合添加对象
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        Iterator<UpdateStu> it=tree.iterator(); //set集合中的所有对象的迭代器
        System.out.println("set集合中的所有的元素");
        while(it.hasNext()){
            UpdateStu stu=(UpdateStu)it.next();
            System.out.println(stu.getId()+""+stu.getName());
        }
        it=tree.headSet(stu2).iterator();//截取排在stu2对象之前的对象
        System.out.println("截取前面部分的集合：");
        while (it.hasNext()){
            UpdateStu stu=(UpdateStu)it.next();
            System.out.println(stu.getId()+""+stu.getName());
        }
        it=tree.subSet(stu2,stu3).iterator();//截取排在stu2与stu3之前的对象
        System.out.println("截取中间部分的集合：");
        while (it.hasNext()){//遍历集合
            UpdateStu stu=(UpdateStu)it.next();
            System.out.println(stu.getId()+""+stu.getName());
        }
        it=tree.tailSet(stu3).iterator();//截取排在stu3之后的对象
        System.out.println("截取最后部分的集合：");
        while (it.hasNext()){//遍历集合
            UpdateStu stu=(UpdateStu)it.next();
            System.out.println(stu.getId()+""+stu.getName());
        }

    }

}
