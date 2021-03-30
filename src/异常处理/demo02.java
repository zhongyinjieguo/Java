package 异常处理;
//使用throw抛出异常
public class demo02 {
    public static void main(String[] args) {
        //int[] arr = null;如果取消注释则产生空指针异常
        int[] arr = new int[3];
        int e = getElement(arr,3);
        System.out.println(e);
    }
    public static int getElement(int[] arr,int index){
        /*
        对传递过来的参数数组,进行合法性校验
            如果数组arr的值是null
            那么我们就抛出空指针异常,告知方法的调用者"传递的数组的值是null"
         */
        if(arr == null){
            throw new NullPointerException("传递的数组的值是null");
        }

        /*
            我们可以对传递过来的参数index进行合法性校验
            如果index的范围不在数组的索引范围内
            那么我们就抛出数组索引越界异常,告知方法的调用者"传递的索引超出了数组的使用范围"
         */
        if(index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }

        int ele = arr[index];
        return ele;
    }
}
