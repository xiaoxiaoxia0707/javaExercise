package demo7;

public class Compare {
    public static void main(String[] args) {
        String c1=new String("abc");
        String c2=new String("abc");
        String c3=c1;//将c1对象赋值给赋予c3
//        使用“==”运算符比较c2与c3
        System.out.println("c2==c3的运算结果是："+(c2==c3));//不同对象，引用的地址是否相等
        System.out.println("c1==c3的运算结果是："+(c1==c3));//使用equals()方法比较c2与c3
        System.out.println("c2==c3的运算结果是："+(c2.equals(c3)));//两个对象引用所指的内容是否相等
    }
}
