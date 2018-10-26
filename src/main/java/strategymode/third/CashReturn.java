package strategymode.third;

/**
 * 返利收费
 * @author zhangkangjian
 * @date 2018-10-22 18:05:05
 */
public class CashReturn extends CashSuper {
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    /**
     * 计算结果
     * @param money 收费金额
     * @return double 实际收费金额
     * @author zhangkangjian
     * @date 2018-10-22 17:54:12
     */
    public double acceptCash(double money) {
        double realAcceptMoney = 0.0d;
        if(money >= moneyCondition){
            realAcceptMoney = money - moneyReturn;
        }else {
            realAcceptMoney = money;
        }

        System.out.println("此商品参与满" + moneyCondition + "减 " + moneyReturn + "，收费金额为：" + realAcceptMoney);
        return realAcceptMoney;
    }

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
}
