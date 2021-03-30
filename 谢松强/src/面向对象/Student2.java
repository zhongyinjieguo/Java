package 面向对象;

public class Student2 {
    // 成员变量
    private String name;
    private int age;

    // 无参数的构造方法
    public Student2() {
        System.out.println("无参构造方法执行啦！");
    }

    // 全参数的构造方法
    public Student2(String name, int age) {
        System.out.println("全参构造方法执行啦！");
        this.name = name;
        this.age = age;
    }

    // Getter Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
