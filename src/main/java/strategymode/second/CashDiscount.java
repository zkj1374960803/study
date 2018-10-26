package strategymode.second;


/**
 * 打折收费
 * @author zhangkangjian
 * @date 2018-10-22 18:01:43
 */
public class CashDiscount extends CashSuper {

    private double discountRatio = 0.0;
    /**
     * 打折收费
     * @param money 收费金额
     * @return double 实际收费金额
     * @author zhangkangjian
     * @date 2018-10-22 17:54:12
     */
    public double acceptCash(double money) {
        double realAcceptMoney = money * discountRatio;
        System.out.println("此商品打" + discountRatio + "折，收费金额为：" + realAcceptMoney);
        return realAcceptMoney;
    }

    public CashDiscount(double discountRatio) {
        this.discountRatio = discountRatio;
    }
}
