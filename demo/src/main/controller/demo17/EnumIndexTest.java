package demo17;

public class EnumIndexTest {
    enum Constants2{//将常量放置在枚举类型中
        Constants_A,Constants_B,Constants_C,Constants_D
    }

    public static void main(String[] args) {
        for(int i=0;i<Constants2.values().length;i++){
            //循环中获取枚举成员的索引位置
            System.out.println(Constants2.values()[i]+"在枚举类型位置索引值是："+Constants2.values()[i].ordinal());
        }
    }
}
