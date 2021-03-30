package IO流;
//一次写入多个字节
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
public class demo02 {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象,构造方法中绑定要写入数据的目的地
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\86159\\IdeaProjects\\learn\\src\\IO流\\b.txt"));
        //调用FileOutputStream对象中的方法write,把数据写入到文件中
        //在文件中显示100,写个字节
        fos.write(49);
        fos.write(48);
        fos.write(48);
        byte[] bytes = {65, 66, 67, 68, 69};//ABCDE
        fos.write(bytes);
        fos.write(bytes, 1, 2);//BC
        fos.close();

    }
}
