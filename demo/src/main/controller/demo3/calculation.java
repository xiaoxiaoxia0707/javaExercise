package demo3;

public class calculation {
    public static void main(String[] args){
        int a=2;
        int b=3;
        boolean result=((a>b)&&(a!=b));
        boolean result3=((a>b)||(a!=b));
        System.out.println(result);
        System.out.println(result3);
    }
}
