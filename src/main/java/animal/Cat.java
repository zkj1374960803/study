package animal;

/**
 * @author zhangkangjian
 * @date 2018-10-17 10:57:23
 */
public class Cat extends Animal implements ChangeImpl {
    /**
     * 动物的叫声
     *
     * @return
     * @throws
     * @author zhangkangjian
     * @date 2018-10-17 10:56:03
     */
    protected String getShoutSound() {
        return "我会：喵！喵！喵！";
    }

    public String changeThings() {
        return "竹蜻蜓";
    }
}
