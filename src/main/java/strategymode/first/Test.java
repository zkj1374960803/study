package strategymode.first;

/**
 * @author zhangkangjian
 * @date 2018-10-25 16:11:52
 */
public class Test {

    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashSuper(CashEnum.CALL_TWENTY_PERCENT_OFF);
        System.out.println("收费500元");
        cashSuper.acceptCash(500D);

        CashSuper cashSuper2 = CashFactory.createCashSuper(CashEnum.NORMAL);
        System.out.println("收费1000元");
        cashSuper2.acceptCash(1000D);

        CashSuper cashSuper1 = CashFactory.createCashSuper(CashEnum.OVER_300_MINUS_100);
        System.out.println("收费300元");
        cashSuper1.acceptCash(300D);

    }
}
