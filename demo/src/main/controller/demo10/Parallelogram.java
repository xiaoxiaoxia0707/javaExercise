package demo10;
class Quadrangle{
    public static void main(String[] args) {

    }
}
class Square extends Quadrangle1 {

}
class Ayting{

}
public class Parallelogram extends Quadrangle1 {
    public static void main(String[] args) {
        Quadrangle1 q=new Quadrangle1();//实例化父类对象
//        判断父类对象是否为Parallelogram子类的一个实例
        if(q instanceof Parallelogram){
            Parallelogram p=(Parallelogram)q;//向下转型操作
        }
        if(q instanceof Square){
            Square s=(Square)q;//进行向下转型操作

        }
    }
}
