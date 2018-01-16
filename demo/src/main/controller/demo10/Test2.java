package demo10;

public class Test2 extends Test{//继承父类
    public Test2(){//构造方法
        super();//调用父类构造方法
        super.doSomething();//调用父类成员方法
    }
    public void doSomethingnew(){//新增方法


    }
    public void doSomething(){//重写父类方法

    }

    @Override
    protected Test2 dolt() {//重写父类方法，方法返回值类型TEST2类型
        return new Test2();
    }
}
