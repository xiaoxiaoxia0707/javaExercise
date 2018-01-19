package demo17;

public class EnumIndexMethodTest {//讲常量放置在枚举类型中
    enum Constants2{
        Constants_A("我是枚举成员A"),//定义带参数的枚举类型成员
        Constants_B("我是枚举成员B"),
        Constants_C("我是枚举成员C"),
        Constants_D(3);
        private String description;
        private int i=4;
        private Constants2(){

        }
        //定义参数为String型的构造方法
        private Constants2(String description){
            this.description=description;
        }
        private  Constants2(int i){
            this.i=this.i+i;//定义参数为int型 的构造方法
        }
        public String getDescription(){
            return description;//获取description的值
        }
        public int getI(){
            return i;//获取i的值
        }

    }

    public static void main(String[] args) {
        for(int i=0;i<Constants2.values().length;i++){
            System.out.println(Constants2.values()[i]+"调用getDescription()方法为:"+Constants2.values()[i].getDescription());
        }
        System.out.println(Constants2.valueOf("Constants_D")+"调用getI()方法为:"+Constants2.valueOf("Constants_D").getI());
    }
}
