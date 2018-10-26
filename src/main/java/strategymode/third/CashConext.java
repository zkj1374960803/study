package strategymode.third;


import strategymode.first.CashEnum;

/**
 * @author zhangkangjian
 * @date 2018-10-25 15:54:54
 */
public class CashConext {

    private CashSuper cashSuper = null;

    CashConext(CashEnum cashEnum){
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
    }

    void getResult(double money){
        cashSuper.acceptCash(money);
    }

}
