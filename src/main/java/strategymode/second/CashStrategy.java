package strategymode.second;

/**
 * @author zhangkangjian
 * @date 2018-10-25 15:42:48
 */
public class CashStrategy {
    private CashSuper cashSuper;

    public CashStrategy(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
