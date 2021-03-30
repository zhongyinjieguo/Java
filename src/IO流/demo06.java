package IO流;
//字符输入流的使用
import java.io.FileWriter;
import java.io.IOException;
public class demo06 {
    public static void main(String[] args) throws IOException {
        //创建FileWriter对象,构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("C:\\Users\\86159\\IdeaProjects\\learn\\src\\IO流\\f.txt");
        //使用FileWriter中的方法write,把数据写入到内存缓冲区中(字符转换为字节的过程)
        fw.write(97);
        //使用FileWriter中的方法flush,把内存缓冲区中的数据,刷新到文件中
        fw.flush();
        //释放资源(会先把内存缓冲区中的数据刷新到文件中)
        fw.close();
    }
}
