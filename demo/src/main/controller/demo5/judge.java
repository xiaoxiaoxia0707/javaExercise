package demo5;

public class judge {
    public static void main(String[] args) {
        String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String str1="aaa@";
        String str2="aaa";
        String str3="111@111ffyu.com";
        if(str1.matches(regex)){
            System.out.println(str1);
        }
        if(str2.matches(regex)){
            System.out.println(str2);
        }
        if(str3.matches(regex)){
            System.out.println(str3);
        }
    }
}
