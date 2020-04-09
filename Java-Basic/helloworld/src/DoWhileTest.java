/**
 * @version v1.0
 * @ProjectName: Java-Basic
 * @ClassName: DoWhileTest
 * @Description: 测试 while 循环
 * @Author: wugenqiang
 * @Date: 2020/4/1 15:48
 */
public class DoWhileTest {
    public static void main(String[] args){
        //遍历100以内的所有偶数
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}