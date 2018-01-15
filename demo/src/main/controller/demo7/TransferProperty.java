package demo7;

public class TransferProperty {
    int i=47;
    public void call(){
        System.out.println("调用call()方法");
        for(i=0;i<3;i++){
            System.out.println(i+"");
            if(i==2){
              System.out.println("\n");
            }
        }
    }
    public TransferProperty(){//定义构造方法

    }

    public static void main(String[] args) {
        TransferProperty t1=new TransferProperty();//创建一个对象
        TransferProperty t2=new TransferProperty();//创建又一个对象
        t2.i=60;//将类成员变量赋值为60
        //使用第一对象调用类成员变量
        System.out.println("第一个实例对象调用变量i的结果"+t1.i++);
        t1.call();
        System.out.println("第二个实例对象调用变量i的结果"+t2.i++);
        t2.call();
    }
}
