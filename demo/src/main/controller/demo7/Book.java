package demo7;

public class Book {

    public  String name;//定义一个string型的成员变量
        public String getName(){
            int id=0;//局部变量
            setName("jsba");//调用类中其他的方法
            return id+this.name;//设置方法的返回值

        }
        private void setName(String name){//定义一个setName()方法
            this.name=name;//将参数值赋予类中的成员变量

        }
    private Book getBook(){
            return this;
    }
}
