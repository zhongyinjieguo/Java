package 面向对象;
//对student1类的创建对象并调用
public class demo04 {
    public static void main(String[] args) {
        Student1 stu = new Student1();

        stu.setName("谢松强");
        stu.setAge(21);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("是不是爷们儿：" + stu.isMale());
    }
}

