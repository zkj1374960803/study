package simplefactorymode.second;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * @author zhangkangjian
 * @date 2018-10-17 14:08:01
 */
public class DivisionOperating extends Operating {
    /**
     * 除法计算
     * numberA / numberB
     * @return
     * @throws
     * @author zhangkangjian
     * @date 2018-10-17 13:51:00
     */
    protected Number getResult() {
        if(getNumberB().doubleValue() == 0){
            throw new IllegalArgumentException("除数不能为0");
        }
        BigDecimal bigDecimalA  = new BigDecimal(getNumberA().doubleValue());
        BigDecimal bigDecimalB = new BigDecimal(getNumberB().doubleValue());
        return bigDecimalA.divide(bigDecimalB, new MathContext(3));
    }

}
