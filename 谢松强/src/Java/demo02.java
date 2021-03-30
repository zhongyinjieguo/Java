package grammar;
//强制类型转换
public class demo02 {
    public static void main(String[] args) {
        int num=(int)777L;//范围大的数据类型long强制转换成范围小的数据类型int。
        int num2=(int)6.66;//范围大的数据类型double强制转换成范围小的数据类型int。
        System.out.println(num2);//输出6，在第二次转换中发生了精度损失
        byte num3=1;
        byte num4=2;
        int num5=num3+num4;//// byte + byte --> int + int --> int;
    }
}