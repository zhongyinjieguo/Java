package grammar;
//方法的使用
public class demo05 {
    public static void main(String[] args) {
        // 单独调用
        sum(10, 20);
        System.out.println("===========");

        // 打印调用
        System.out.println(sum(10, 20)); // 30
        System.out.println("===========");

        // 赋值调用
        int number = sum(15, 25);
        number += 100;
        System.out.println("变量的值：" + number); // 140
    }

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }
}
