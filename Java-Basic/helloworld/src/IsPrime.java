/**
 * @version v1.0
 * @ProjectName: Java-Basic
 * @ClassName: IsPrime
 * @Description: 素数
 * @Author: wugenqiang
 * @Date: 2020/4/8 16:08
 */
public class IsPrime {

    public void isPrime(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isFlag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag == true) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        IsPrime IsPrime = new IsPrime();
        IsPrime.isPrime(100);
    }
}