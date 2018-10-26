package strategymode.first;

/**
 * @author zhangkangjian
 * @date 2018-10-25 15:56:00
 */
public enum CashEnum {
    NORMAL("正常收费"), OVER_300_MINUS_100("满300减100"), CALL_TWENTY_PERCENT_OFF("打折八折");
    private String label;

    CashEnum(String label) {
        this.label = label;
    }
}
