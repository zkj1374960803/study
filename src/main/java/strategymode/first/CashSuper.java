package strategymode.first;

/**
 * @author zhangkangjian
 * @date 2018-10-22 17:48:32
 */
public abstract class CashSuper {
    /**
     * 计算结果
     * @param money 收费金额
     * @return double 实际收费金额
     * @author zhangkangjian
     * @date 2018-10-22 17:54:12
     */
    public abstract double acceptCash(double money);
}
