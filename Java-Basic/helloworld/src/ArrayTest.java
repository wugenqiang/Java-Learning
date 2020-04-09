/**
 * @version v1.0
 * @ProjectName: Java-Basic
 * @ClassName: ArrayTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: wugenqiang
 * @Date: 2020/4/8 18:56
 */
public class ArrayTest {

    public static void main(String[] args) {
        //1.一维数组的声明和初始化
        int num;//声明
        num = 10;//初始化
        int id = 1001;//声明 + 初始化

        int[] ids;//声明
        //静态初始化：数组的初始化和数组元素的赋值操作同时进行
        ids = new int[]{1001,1002,1003,1004};
        //动态初始化：数组的初始化和数组元素的赋值操作分开进行
        String[] names = new String[5];

        //2.如何调用数组的指定位置的元素：通过角标的方式调用
        //数组的角标（或索引）从0开始的，到数组的长度-1结束
        names[0] = "吴跟强";
        names[1] = "吴奇隆";
        names[2] = "吴尊";
        names[3] = "胡歌";
        names[4] = "孙杨";

        //3.如何获取数组的长度
        //属性：length
        System.out.println(names.length);//5
        System.out.println(ids.length);//4

        //4.如何遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //5.数组元素的默认初始化值
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//0
        }

        short arr1[] = new short[4];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);//0
        }

        //6.数组的内存解析

    }
}
