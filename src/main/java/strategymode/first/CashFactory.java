package strategymode.first;

/**
 * @author zhangkangjian
 * @date 2018-10-25 15:54:54
 */
public class CashFactory {

    public static CashSuper createCashSuper(CashEnum cashEnum){
        CashSuper cashSuper = null;
        switch (cashEnum) {
            case NORMAL:
                cashSuper = new CashNormal();
                break;
            case OVER_300_MINUS_100:
                cashSuper = new CashReturn(300, 100);
                break;
            case CALL_TWENTY_PERCENT_OFF:
                cashSuper = new CashDiscount(0.8);
                break;
        }
        return cashSuper;
    }
}
