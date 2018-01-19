package demo15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Ftest extends JFrame {//创建类，继承JErame;
    private static final long serivalVersionUID=1L;
    private JPanel jContentPane=null;//创建面板对象
    private JTextArea jTextArea=null;//创建文本域对象
    private JPanel controlPanel=null;//创建面板对象
    private JButton openButton=null;//创建按钮对象
    private JButton closeButton=null;//创建按钮对象

    private JButton getOpenButton(){
        if(openButton==null){
            openButton=new JButton();
            openButton.setText("写入文件");//修改按钮的提示信息
            openButton.addActionListener(new ActionListener() {
                @Override//按钮的单击事情
                public void actionPerformed(ActionEvent e) {
                    //创建文件对象
                    File file=new File("g:/words.txt");
                    try{
                        //创建fileWRITE对象
                        FileWriter out=new FileWriter(file);
                        //获取文本域中文本
                        String s=jTextArea.getText();
                        out.write(s);//将信息写入磁盘文件
                        out.close();//将流关闭
                    }catch(Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;
    }
    private JButton getCloseButton(){
        if(closeButton==null){
            closeButton=new JButton();
            closeButton.setText("读取文件");//修改按钮的提示信息
            closeButton.addActionListener(new ActionListener() {
                @Override//按钮的单击事情
                public void actionPerformed(ActionEvent e) {
                    //创建文件对象
                    File file=new File("g:/words.txt");
                    try{
                        //创建fileWRITE对象
                      FileReader in=new FileReader(file);
                        char byt[]=new char[1024];//创建char型数组
                        int len =in.read(byt);//将字节读入数组
                        //设置文本域的显示信息
                        jTextArea.setText(new String(byt,0,len));
                        in.close();//关闭流
                    }catch(Exception e1){
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;
    }
    public Ftest(){
        super();
        initialize();
    }
    private  void initialize(){
        this.setSize(300,200);
//        this.setContentPane(getJContentPane());
        this.setTitle("JFrame");
    }
//    private  JPanel getJContentPane(){
//        if(jContentPane==null){
//            jContentPane=new JPanel();
//            jContentPane.setLayout(new BorderLayout());
//            jContentPane.add(getJTextArea(),BorderLayout.CENTER);
//            jContentPane.add(getControlPanel(),BorderLayout.SOUTH);
//        }return jContentPane;
//    }

    public static void main(String[] args) {
        Ftest thisClass=new Ftest();//创建本类对象
        thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        thisClass.setVisible(true);//创建该窗体为显示状态
    }

//    public JPanel getControlPanel() {
//        return controlPanel;
//    }
//
//
//    public JTextArea getJTextArea() {
//        return jTextArea;
//    }
}
