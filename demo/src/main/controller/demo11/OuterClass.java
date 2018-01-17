package demo11;

public class OuterClass {
    innerClass in=new innerClass();//外部类实例化内部类对象引用
    public void ouf(){
        in.inf();//外部类方法调用内部类方法
    }
    class innerClass{
        innerClass(){//内部类构造方法

        }
        public void inf(){//内部类成员方法

        }
        int y=0;//定义内部类成员变量
    }
    public innerClass doit(){
        in.y=4;
        return  new innerClass();
    }

    public static void main(String[] args) {
        OuterClass out=new OuterClass();
        OuterClass.innerClass in=out.doit();
        OuterClass.innerClass in2=out.new innerClass();
    }


}
