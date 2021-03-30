package 面向对象;
//利用构造方法创建对象
public class demo05 {
    public static void main(String[] args) {
        Student2 stu1 = new Student2(); // 无参构造
        System.out.println("============");

        Student2 stu2 = new Student2("谢松强", 21); // 全参构造
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
        // 如果需要改变对象当中的成员变量数据内容，仍然还需要使用setXxx方法
        stu2.setAge(100); // 改变年龄
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());

    }

}
