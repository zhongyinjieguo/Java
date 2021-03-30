package 面向对象;
//新建学生类
public class Student1 {
    private String name; // 姓名
    private int age; // 年龄
    private boolean male; // 性别

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }//对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
}
