package demo6;

public class BubbleSort {
    public static void main(String[] args) {
//        创建一个数组，这个数组元素是乱序的
        int[]array={63,4,24,1,3,15};
//        创建冒泡排序类的对象
        BubbleSort sorter=new BubbleSort();
//        调用排序方法将数组排序
        sorter.sort(array);

    }
/*
要排序的数组
 */
    private void sort(int[] array) {
        for(int i=1;i<array.length;i++){
//            比较相邻两个元素，较大的数往后冒泡
            for(int j=0;j<array.length-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];//把第一元素值保存到临时变量中
                    array[j]=array[j+1];//把第二元素值保存到第一元素单元中
                    array[j+1]=temp;//把临时变量（也就是第一元素原值）保存到第二个元素中
                }
            }
        }
        showArray(array);
    }
    /*
    显示数组中的所有的元素
     */
    public void showArray(int[] array){
        for(int i:array){
            System.out.print(">"+i);

        }
        System.out.println();
    }
}
