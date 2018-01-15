package demo6;

/**
 * 反转排序算法的实例
 * @author  XIAOXIAO
 */
public class ReverseSort {
    public static void main(String[] args) {
//            创建一个数组
        int[]array={10,20,30,40,50,60};
//        创建反转排序类的对象
        ReverseSort sorter=new ReverseSort();
//        调用排序对象的方法将数组反转
        sorter.sort(array);

    }
    /**
     * 反转排序
     *
     */
    private void sort(int[] array) {
        System.out.println("数组原有的内容：");
        showArray(array);
        int temp;
        int len=array.length;
        for(int i=0;i<len/2;i++){
            temp=array[i];
            array[i]=array[len-1-i];
            array[len-1-i]=temp;

        }
        System.out.println("数组反转后的内容：");
        showArray(array);
    }
    public void showArray(int[] array){
        for(int i:array){
            System.out.println("\t"+i);

        }
        System.out.println();
    }

}
