package demo10;

public class Quadrangle1 {
    private Quadrangle1[] qtest=new Quadrangle1[6];
    private int nextIndex=1;
    public  void draw(Quadrangle1 q){
        if(nextIndex<qtest.length){
            qtest[nextIndex]=q;
            System.out.println(nextIndex);
            nextIndex++;
        }
    }

    public static void main(String[] args) {
        Quadrangle1 q=new Quadrangle1();
        q.draw(new Square1());
        q.draw(new Parallelogramgle());
    }
}
class Square1 extends Quadrangle1{
    public  Square1(){
        System.out.println("正方形");
    }
}
class Parallelogramgle extends Quadrangle1{
    public  Parallelogramgle(){
        System.out.println("平行四边形");
    }
}