package IO流;
//使用字符流读取中文文件
import java.io.FileReader;
import java.io.IOException;
public class demo05 {
    public static void main(String[] args) throws IOException {
        //1.创建FileReader对象,构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("C:\\Users\\86159\\IdeaProjects\\learn\\src\\IO流\\e.txt");
        //2.使用FileReader对象中的方法read读取文件
        int len = 0;
        while ((len = fr.read()) != -1) {
            System.out.print((char) len);
        }
        char[] cs = new char[1024];//存储读取到的多个字符
        int len1 = 0;//记录的是每次读取的有效字符个数
        while ((len1 = fr.read(cs)) != -1) {
            System.out.println(new String(cs, 0, len));
        }
        fr.close();
    }
}
