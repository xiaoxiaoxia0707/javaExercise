package demo8;

public class GetBoolean {
    public static void main(String[] args) {
        Boolean b1=new Boolean(true);//创建boolean对象
        Boolean b2=new Boolean("ok");//创建boolean对象
        System.out.println("b1："+b1.booleanValue());
        System.out.println("b2："+b2.booleanValue());
    }
}
