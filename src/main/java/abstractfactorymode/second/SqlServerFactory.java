package abstractfactorymode.second;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:38:34
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }
}
