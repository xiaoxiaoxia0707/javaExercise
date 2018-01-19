package demo17;

import demo10.Test2;

public class objectUpTest {
    private  Object b;//定义object类型成员的变量
    public Object getB(){//设置相应的getXXX（）方法
        return b;

    }
    public void setB(Object b){
        this.b=b;//设置相应的SETXXX()方法
    }

    public static void main(String[] args) {
        objectUpTest t=new objectUpTest();
        t.setB(new Boolean(true));//向上转型操作
        System.out.println(t.getB());
        t.setB(new Float(12.3));
        Float f=(Float)(t.getB());//向下转型操作
        System.out.println(f);
    }
}
