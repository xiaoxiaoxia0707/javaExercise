package demo11;
import static java.lang.System.out;
import java.util.Random;
public class FinalStaticData {
    private static Random rand =new Random();//实例化一个random类的对象
//    随机产生0-10之间的随机数赋予定义为final的a1
    private final int a1=rand.nextInt(10);
//    随机产生0-10之间的随机数赋予定义为static final的a2
   private static final int a2=rand.nextInt(10);
//调用定义为final的a1
    public static void main(String[] args) {
        FinalStaticData fdata=new FinalStaticData();
        out.println(fdata.a1);
        out.println(fdata.a2);
        FinalStaticData fdata2=new FinalStaticData();
        out.println(fdata2.a1);
        out.println(fdata2.a2);
    }
}
