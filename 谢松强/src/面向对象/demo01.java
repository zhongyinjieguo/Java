package 面向对象;

public class demo01 {
    public static void main(String[] args) {
        // 创建，格式：
        // 类名称 对象名 = new 类名称();
        // 根据Student类，创建了一个名为stu的对象
        Student stu = new Student();

        // 3. 使用其中的成员变量，格式：
        // 对象名.成员变量名
        System.out.println(stu.name); // null
        System.out.println(stu.age); // 0
        System.out.println("=============");
    }
    }

