package simplefactorymode.second;

/**
 * 计算工厂
 * @author zhangkangjian
 * @date 2018-10-17 14:15:12
 */
class OperateFactory {

    static Operating buildOperate(OperateEnum operate){
        Operating operating = null;
        switch (operate) {
            case ADD:
                operating = new AddOperating();
                break;
            case SUB:
                operating = new SubOperating();
                break;
            case DIVIDE:
                operating = new DivisionOperating();
                break;
            case MULTIPLY:
                operating = new MultiplicationOperating();
                break;
        }
        return operating;
    }
}
