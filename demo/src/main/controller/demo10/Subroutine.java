package demo10;

public class Subroutine extends SubParent{
    Subroutine(){
        System.out.println("调用Subroutine()");
    }
    public static void main(String[] args) {
        Subroutine s=new Subroutine();//实例化子类对象
    }


}