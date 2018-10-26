package simplefactorymode.second;

import java.math.BigDecimal;

/**
 * @author zhangkangjian
 * @date 2018-10-17 11:59:20
 */
public abstract class Operating {
    private Number numberA = 0;
    private Number numberB = 0;
    /**
     * 计算
     * @param
     * @exception
     * @return
     * @author zhangkangjian
     * @date 2018-10-17 13:51:00
     */
    protected abstract Number getResult();

    Number getNumberA() {
        return numberA;
    }

    void setNumberA(Number numberA) {
        this.numberA = numberA;
    }

    Number getNumberB() {
        return numberB;
    }

    void setNumberB(Number numberB) {
        this.numberB = numberB;
    }
}
