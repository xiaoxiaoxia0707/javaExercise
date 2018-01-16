package demo8;

public class Summation {//创建类
    public static void main(String[] args) {//主方法
        String str[]={"8","2"};//定义String数组
        int sum=0;//定义int型变量sum
        for(int i=0;i<str.length;i++){//将数组遍历
            int myint=Integer.parseInt(str[i]);//数组中的每个元素都转换为int型
            sum=sum+myint;
        }
        System.out.println("数组中的元素之和是："+sum);
    }
}
