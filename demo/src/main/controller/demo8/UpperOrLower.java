package demo8;

public class UpperOrLower {
    public static void main(String[] args) {
        Character mychar1=new Character('A');
        Character mychar2=new Character('a');//声明对象
        System.out.println(mychar1+"是大写字母吗？"+Character.isUpperCase(mychar1));
        System.out.println(mychar2+"是小写字母吗？"+Character.isLowerCase(mychar2));
    }
}
