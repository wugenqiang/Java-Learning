
/**
 * @version v1.0
 * @ProjectName: Java-Basic
 * @ClassName: ScannerTest
 * @Description: 测试 Scanner 功能
 * @Author: wugenqiang
 * @Date: 2020/4/5 15:47
 */
public class ScannerTest {
    public static void main(String[] args){
        /*Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的年龄：");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重：");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("你是否相中我了哈哈？(true or false)：");
        boolean a = scan.nextBoolean();
        System.out.println(a);

        //对于char型的获取，Scanner没有提供相关的方法，只能获取字符串
        System.out.println("请输入你的性别(男 or 女)：");
        String gender = scan.next();
        System.out.println(gender);

        char genderChar = gender.charAt(0);//找到指定索引位上的字符，从0开始
        System.out.println(genderChar);*/

        double value = Math.random() * 90 + 10;//[0.0, 1.0) --> [0.0, 90) --> [0.0, 100)
        int value2 = (int)(Math.random() * 90 + 10);//强制转换  [0.0, 100) --> [0, 99]
        //公式：[a, b] : (int)(Math.random() * (b - a + 1) + a)
        System.out.println(value);
        System.out.println(value2);

    }
}
