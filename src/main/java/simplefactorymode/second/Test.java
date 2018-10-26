package simplefactorymode.second;

/**
 * @author zhangkangjian
 * @date 2018-10-17 14:13:56
 */
public class Test {

    public static void main(String[] args) {
        Operating operating = OperateFactory.buildOperate(OperateEnum.ADD);
        operating.setNumberA(2);
        operating.setNumberB(3);
        Number resultAdd = operating.getResult();
        System.out.println("加法 计算结果为：" + resultAdd);

        Operating operatingMultiply = OperateFactory.buildOperate(OperateEnum.MULTIPLY);
        operatingMultiply.setNumberA(2);
        operatingMultiply.setNumberB(3);
        Number resultMultiply = operatingMultiply.getResult();
        System.out.println("乘法 计算结果为：" + resultMultiply);

        Operating operatingDivide = OperateFactory.buildOperate(OperateEnum.DIVIDE);
        operatingDivide.setNumberA(2);
        operatingDivide.setNumberB(3);
        Number resultDivide = operatingDivide.getResult();
        System.out.println("除法 计算结果为：" + resultDivide);
    }
}
