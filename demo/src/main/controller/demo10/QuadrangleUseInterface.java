package demo10;

interface drawTest{//定义接口
    public void draw();//定义方法
}

class ParallelogramgleUseInterface extends QuadrangleUseInterface implements drawTest{
            public void draw(){
            System.out.println("平行四边形。draw()");

    }
    void doAnyThing(){

    }
}
class SquareUseInterface extends QuadrangleUseInterface implements drawTest{
        public void draw(){
            System.out.println("正方形。draw()");
        }
        void doAnyThing(){

        }
}
class AnyThingUseInterface extends QuadrangleUseInterface{
    public void draw(){
        System.out.println("正方形。draw()");
    }
    void doAnyThing(){

    }
}
public class QuadrangleUseInterface {
public void doAnyTthing(){

}
    public static void main(String[] args) {
        drawTest[] d={
                new SquareUseInterface(),new ParallelogramgleUseInterface()
        };
        for(int i=0;i<d.length;i++){
            d[i].draw();
        }
    }
}
