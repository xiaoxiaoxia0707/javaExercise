package demo5;

public class division {
    public static void main(String[] args) {
        //创建字符串
        String str="165.888.ejgb";
        //按照“.”进行分割，使用转义符“\\”;
        String[]firstArray=str.split("\\.");
        //按照“.”进行两次分割，使用转义符“\\”;
        String[]secondArray=str.split("\\.",1);
        //输出str原值
        System.out.println("["+str+"]");
        //输出全部分割的结果
        System.out.println("全部分割的结果：");
        for(String a:firstArray){
            System.out.println("["+a+"]");
        }
//        System.out.println();//换行
        //输出全部分割的结果
        for(String a:secondArray){
            System.out.println("["+a+"]");
        }
//        System.out.println();//换行

    }
}
