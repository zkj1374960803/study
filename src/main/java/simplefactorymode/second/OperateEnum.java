package simplefactorymode.second;

/**
 * @author zhangkangjian
 * @date 2018-10-17 14:18:55
 */
public enum OperateEnum {
    ADD("+"),SUB("-"),DIVIDE("/"),MULTIPLY("*");
    String label;
    OperateEnum(String label) {
        this.label = label;
    }
}
