package strategymode.first;

/**
 * 普通收费
 * @author zhangkangjian
 * @date 2018-10-22 17:55:55
 */
public class CashNormal  extends CashSuper {


    /**
     * 正常收费
     * @param money 收费金额
     * @return double 实际收费金额
     * @author zhangkangjian
     * @date 2018-10-22 17:54:12
     */
    public double acceptCash(double money) {
        System.out.println("此商品正常收费，金额为：" + money);
        return money;
    }
}
