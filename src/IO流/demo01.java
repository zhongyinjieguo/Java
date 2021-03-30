package IO流;
//字节输出流的使用
import java.io.FileOutputStream;
import java.io.IOException;
public class demo01 {
    public static void main(String[] args) throws IOException {
        //1.创建一个FileOutputStream对象,构造方法中传递写入数据的目的地
            FileOutputStream fos = new FileOutputStream("C:\\Users\\86159\\IdeaProjects\\learn\\src\\IO流\\a.txt");
        //2.调用FileOutputStream对象中的方法write,把数据写入到文件中
        //public abstract void write(int b) ：将指定的字节输出流。
        fos.write(55);
        //3.释放资源(流使用会占用一定的内存,使用完毕要把内存清空,提供程序的效率)
        fos.close();
    }
}
