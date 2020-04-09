/**
 * @version v1.0
 * @ProjectName: Java-Basic
 * @ClassName: ArrayTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: wugenqiang
 * @Date: 2020/4/8 18:56
 */
public class Array2Test {

    public static void main(String[] args) {
        //1.二维数组的声明和初始化
        //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
        //动态初始化1
        String[][] arr2 = new String[3][2];
        //动态初始化2
        String[][] arr3 = new String[3][];
        //也是正确的写法
        int[] arr4[] = new int[][]{{1,2,3},{4,5,6,10},{4,6}};


        //2.如何调用数组的指定位置的元素：通过角标的方式调用
        //数组的角标（或索引）从0开始的，到数组的长度-1结束
        System.out.println(arr1[0][1]);
        arr3[1] = new String[4];
        System.out.println(arr3[1][0]);

        //3.如何获取数组的长度
        //属性：length
        System.out.println(arr3.length);//3
        System.out.println(arr3[1].length);//4

        //4.如何遍历二维数组
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }

        //5.数组元素的默认初始化值
        System.out.println(arr4[0]);//[I@7530d0a 地址值
        System.out.println(arr4[0][0]);//1
        System.out.println(arr4);//[[I@27bc2616

        //6.数组的内存解析

    }
}
