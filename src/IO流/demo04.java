package IO流;
//字节输入流的使用和读取多个字节

import java.io.FileInputStream;
import java.io.IOException;

public class demo04 {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\86159\\IdeaProjects\\learn\\src\\IO流\\d.txt");
        int len = fis.read();
        System.out.println(len);//读取单个字节
        while ((len = fis.read()) != -1) {
            System.out.print(len);
        }//循环读取字节
        byte[] bytes = new byte[1024];//存储读取到的多个字节
        int len1 = 0; //记录每次读取的有效字节个数
        while ((len1 = fis.read(bytes)) != -1) {
            //String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串 offset:数组的开始索引 length:转换的字节个数
            System.out.println(new String(bytes, 0, len1));
        }
    }
}