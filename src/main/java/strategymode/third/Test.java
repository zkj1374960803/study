package strategymode.third;

import strategymode.first.CashEnum;

/**
 * @author zhangkangjian
 * @date 2018-10-25 15:44:40
 */
public class Test {
    public static void main(String[] args) {
        CashConext cashConext = new CashConext(CashEnum.CALL_TWENTY_PERCENT_OFF);
        cashConext.getResult(400);

        CashConext cashConext1 = new CashConext(CashEnum.NORMAL);
        cashConext1.getResult(400);



    }
}
