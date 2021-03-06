package demo17;


interface Constants{//常量放置在接口中
    public static final int Constants_A=1;
    public static final int Constants_B=12;
}
public class ConstantsTest {//常量放置在枚举类型中
    enum Constants2 {
        Constants_A, Constants_B
    }
    //使用接口定义常量
    public static void doit(int c) {//定义一个方法，这里的参数为int型
        switch (c) {
            case Constants.Constants_A:
                System.out.println("doit() Constants_A");
                break;
            case Constants.Constants_B:
                System.out.println("doit() Constants_B");
                break;
        }
    }
    public static void doit2(Constants2 c){//定义一个参数对象的枚举类型的方法
        switch (c){  //h根据枚举类型对象做不同操作
            case Constants_A:
                System.out.println("doit2() Constants_A");
                break;
            case Constants_B:
                System.out.println("doit2() Constants_B");
                break;
        }

    }

    public static void main(String[] args) {
        ConstantsTest.doit(Constants.Constants_A);//使用接口中定义的常量
        ConstantsTest.doit2(Constants2.Constants_A);//使用枚举中定义的常量
        ConstantsTest.doit2(Constants2.Constants_B);//使用枚举中定义的常量
        ConstantsTest.doit(3);
    }

}