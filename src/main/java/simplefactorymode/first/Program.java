package simplefactorymode.first;

import java.util.Scanner;

/**
 * 第一版代码
 * @author zhangkangjian
 * @date 2018-10-24 15:58:33
 */
public class Program {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入数字A：");
            String strNumberA = scanner.next();
            System.out.println("请选择运算符号(+、-、*、/)：");
            String strOperate = scanner.next();
            System.out.println("请输入数字B：");
            String strNumberB = scanner.next();
            String strResult;
            switch (strOperate) {
                case "+":
                    strResult = String.valueOf(Double.valueOf(strNumberA)
                        + Double.valueOf(strNumberB));
                    break;
                case "-":
                    strResult = String.valueOf(Double.valueOf(strNumberA)
                        - Double.valueOf(strNumberB));
                    break;
                case "*":
                    strResult = String.valueOf(Double.valueOf(strNumberA)
                        * Double.valueOf(strNumberB));
                    break;
                case "/":
                    if (!"0".equals(strNumberB))
                        strResult = String.valueOf(Double.valueOf(strNumberA)
                            / Double.valueOf(strNumberB));
                    else
                        strResult = "除数不能为0";
                    break;
                    default:
                        strResult = "运算符号输入错误！";
            }
            System.out.println("结果是：" + strResult);
        } catch (Exception ex) {
            System.out.println("您的输入有错：" + ex.getMessage());
        }
    }

}
