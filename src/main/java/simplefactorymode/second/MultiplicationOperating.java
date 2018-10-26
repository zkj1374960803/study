package simplefactorymode.second;

import java.math.BigDecimal;

/**
 * @author zhangkangjian
 * @date 2018-10-17 14:04:51
 */
public class MultiplicationOperating extends Operating{
    /**
     * 乘法计算
     * numberA * numberB
     * @return
     * @throws
     * @author zhangkangjian
     * @date 2018-10-17 13:51:00
     */
    protected Number getResult() {
        BigDecimal bigDecimalA  = new BigDecimal(getNumberA().doubleValue());
        BigDecimal bigDecimalB = new BigDecimal(getNumberB().doubleValue());
        return bigDecimalA.multiply(bigDecimalB);
    }

}
