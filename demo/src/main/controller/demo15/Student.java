package demo15;

import java.io.*;

public class Student {
    public static void main(String[] args) {
//        定义字符串数组
        String content[]={"好久不见","最近好吗","常联系"};
        File file=new File("g:/text.txt");//创建文件对象
        try {
            FileWriter fw=new FileWriter(file);//创建FileWriter类对象
            //创建BufferedWrite类对象
            BufferedWriter bufw=new BufferedWriter(fw);
            for(int k=0;k<content.length;k++){//循环遍历数组
                bufw.write(content[k]);//将字符串数组中的元素写入到磁盘文件中
                bufw.newLine(); //将数组中的单个元素将以单行的形式写入文件
            }
            bufw.close();//将BufferedWriter流关闭
            fw.close();//将FileWriter流关闭
        }catch(Exception e){
            e.printStackTrace();
        }
        try {
            FileReader fr=new FileReader(file);//创建FileWriter类对象
            //创建BufferedWrite类对象
            BufferedReader bufr=new BufferedReader(fr);
            String s=null;//创建字符串对象
            int i=0;//声明int变量
            //如果文件的文本行数不为null，则进入循环
            while ((s=bufr.readLine())!=null){
                i++;//将变量做自增运算
                System.out.println("第"+i+"行"+s);
            }
            bufr.close();//将FileReader流关闭
            fr.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
