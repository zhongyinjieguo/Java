package IO流;
//追加写，续写
import java.io.FileOutputStream;
import java.io.IOException;
public class demo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\86159\\IdeaProjects\\learn\\src\\IO流\\c.txt",true);//true为追加续写开关
        for (int i = 1; i <=2 ; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
