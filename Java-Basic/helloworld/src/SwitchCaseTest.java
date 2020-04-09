/**
 * @version v1.0
 * @ProjectName: Java-Basic
 * @ClassName: SwitchCaseTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: wugenqiang
 * @Date: 2020/4/5 17:40
 */
public class SwitchCaseTest {
    public static void main(String[] args){
        int number = 2;
        switch(number){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("other");
        }
    }
}
