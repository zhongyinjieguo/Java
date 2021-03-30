package grammar;
//方法的重载
public class demo06 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20)); // 两个参数的方法
        System.out.println(sum(10, 20, 30)); // 三个参数的方法
        System.out.println(sum(10, 20, 30, 40)); // 四个参数的方法
//      System.out.println(sum(10, 20, 30, 40, 50)); // 错误,无法匹配方法
    }
        public static int sum(int x, int y) {
            return x + y;
        }

        public static int sum(double a, double b) {
            return (int) (a + b);
        }

        public static int sum(int a, int b, int c) {
            System.out.println("有3个参数的方法执行！");
            return a + b + c;
        }

        public static int sum(int a, int b, int c, int d) {
            System.out.println("有4个参数的方法执行！");
            return a + b + c + d;
        }
}
