package strategymode.second;


import strategymode.first.CashEnum;

/**
 * @author zhangkangjian
 * @date 2018-10-25 15:44:40
 */
public class Test {
    public static void main(String[] args) {
        CashEnum cashEnum = CashEnum.NORMAL;
        CashStrategy cashStrategy = null;
        switch (cashEnum) {
            case NORMAL:
                cashStrategy = new CashStrategy(new CashNormal());
                break;
            case OVER_300_MINUS_100:
                cashStrategy = new CashStrategy(new CashReturn(300, 100));
                break;
            case CALL_TWENTY_PERCENT_OFF:
                cashStrategy = new CashStrategy(new CashDiscount(0.8));
                break;
        }
        double result = cashStrategy.getResult(500);

    }
}
