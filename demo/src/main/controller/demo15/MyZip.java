package demo15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZip {
    private void zip(String zipFileName, File inputFile) throws Exception {
        ZipOutputStream out=new ZipOutputStream(new FileOutputStream(zipFileName));//创建ZipO对象
        zip(out,inputFile,"");//创建方法
        System.out.println("压缩中。。。");//输出信息
        out.close();//将流关闭
    }
    private void zip(ZipOutputStream out,File f,String base) throws Exception{
        if(f.isDirectory()){
            File[] fl=f.listFiles();
            if(base.length()!=0){
                out.putNextEntry(new ZipEntry(base+"/"));//写入次目录的entry
            }
            for(int i=0;i<fl.length;i++){
                zip(out,fl[i],base+fl[i]);
            }
        }else{
            out.putNextEntry(new ZipEntry(base));//创建新的进入点
            //创建FileInputStream对象
            FileInputStream in=new FileInputStream(f);
            int b;//定义int型变量
            System.out.println(base);
            while ((b = in.read()) != -1){

                out.write(b);//将字节写入当前ZIP条目
            }
            in.close();//关闭流
        }
    }

    public static void main(String[] temp) {
        MyZip book=new MyZip();//创建本例对象
        try{
            //调用方法，参数为压缩后的文件与要压缩文件
            book.zip("G:/text2.zip",new File("G:/text2.txt"));
            System.out.println("压缩完成");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
