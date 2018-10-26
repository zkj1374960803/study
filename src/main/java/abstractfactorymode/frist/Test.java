package abstractfactorymode.frist;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:28:02
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        SqlserverUser su = new SqlserverUser();
        su.insert(user);
        su.getUser(1L);
    }
}
