package demo11;

interface Outlnterface{
    public void f();//定义一个接口
}
public class InterfaceInner {
    public static void main(String[] args){
        OuterClass2 out=new OuterClass2();
//        调用doit()方法，返回一个Outlnterface接口
        Outlnterface outinter=out.doit();
        outinter.f();
    }
}
class  OuterClass2 {
    private class InnerClass implements Outlnterface{
        InnerClass(String s){
            System.out.println(s);
        }
        public void f(){
            System.out.println("fanwen ");
        }
    }
    public Outlnterface doit(){
        return new InnerClass("访问内部构造类方法");
    }
}