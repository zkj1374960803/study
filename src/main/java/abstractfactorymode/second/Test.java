package abstractfactorymode.second;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:28:02
 */
public class Test {
    public static void main(String[] args) {

        User user = new User();
        IFactory iFactory = new SqlServerFactory();
        IUser accessUser = iFactory.createUser();
        accessUser.insert(user);
        accessUser.getUser(1L);
    }
}
