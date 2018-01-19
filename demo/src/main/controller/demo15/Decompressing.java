package demo15;

import jdk.management.resource.internal.inst.RandomAccessFileRMHooks;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class Decompressing {
    public static void main(String[] args) {
        File file=new File("G:/text2.zip");//当前压缩文件
        ZipInputStream zin;//创建ZipInputStream对象
        try{ //try语句捕获可能发生的异常
            ZipFile zipFile=new ZipFile(file);//创建压缩文件对象
            zin=new ZipInputStream(new FileInputStream(file));//实例化对象，指明要进行解压的文件
            ZipEntry entry=zin.getNextEntry();//跳过根目录，获取下一个ZipEntry
            while(((entry=zin.getNextEntry())!=null)&&!entry.isDirectory()){
                File tmp=new File("G:\\"+entry.getName());//解压出的文件路径
                if(!tmp.exists()){//如果该文件不存在
                    tmp.getParentFile().mkdirs();//创建文件父类文件路径
                    OutputStream os=new FileOutputStream(tmp) ;
                    InputStream in=zipFile.getInputStream(entry);
                    int count=0;
                    while ((count =in.read())!= -1) {
                        os.write(count);
                    }
                    os.close();//关闭输出流
                    os.close();//关闭输入流
                }
                zin.closeEntry();//关闭当前entry
                System.out.println(entry.getName()+"解压成功");
            }
            zin.close();//关闭流
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
