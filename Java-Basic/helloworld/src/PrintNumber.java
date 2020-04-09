/**
 * @version v1.0
 * @ProjectName: Java-Basic
 * @ClassName: PrintNumber
 * @Description: TODO(一句话描述该类的功能)
 * @Author: wugenqiang
 * @Date: 2020/4/4 16:12
 */
public class PrintNumber {

    public void printNumber(int num){
        int res;
        int tmp = num;
        while(tmp > 0){
            System.out.print(tmp % 10);
            tmp /= 10;
        }
    }

    public static void main(String[] args){

        PrintNumber print = new PrintNumber();
        print.printNumber(123);


    }
}
