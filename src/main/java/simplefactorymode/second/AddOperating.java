package simplefactorymode.second;

import java.math.BigDecimal;

/**
 * @author zhangkangjian
 * @date 2018-10-17 11:56:06
 */
public class AddOperating extends Operating{
    /**
     * 加法计算
     * @return
     * @throws
     * @author zhangkangjian
     * @date 2018-10-17 13:51:00
     */
    protected Number getResult() {
        BigDecimal bigDecimalA  = new BigDecimal(getNumberA().doubleValue());
        BigDecimal bigDecimalB = new BigDecimal(getNumberB().doubleValue());
        return bigDecimalA.add(bigDecimalB);
    }

}
