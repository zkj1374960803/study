package simplefactorymode.second;

import java.math.BigDecimal;

/**
 * @author zhangkangjian
 * @date 2018-10-17 14:01:07
 */
public class SubOperating extends Operating {
    /**
     * 减法计算
     * numberA - numberB
     * @return Number
     * @author zhangkangjian
     * @date 2018-10-17 13:51:00
     */
    protected Number getResult() {
        BigDecimal bigDecimalA  = new BigDecimal(getNumberA().doubleValue());
        BigDecimal bigDecimalB = new BigDecimal(getNumberB().doubleValue());
        return bigDecimalA.subtract(bigDecimalB);
    }

}
