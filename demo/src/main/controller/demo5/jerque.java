package demo5;

public class jerque {
    public static void main(String[] args) {//主方法
        String str="";//创建空字符串
        long starTime=System.currentTimeMillis();
        for(int i=0;i<10000;i++){//利用for循环执行1000次操作
            str=str + i;
        }
        long endTime=System.currentTimeMillis();
        long time=endTime-starTime;
        System.out.println(time);
        StringBuilder builder=new StringBuilder("");
        starTime=System.currentTimeMillis();
        for (int j=0;j<10000;j++){
            builder.append(j);
        }
        endTime=System.currentTimeMillis();
        time=endTime-starTime;
        System.out.println(time);
    }
}
