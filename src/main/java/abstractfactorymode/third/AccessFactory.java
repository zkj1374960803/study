package abstractfactorymode.third;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:40:09
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createPartment() {
        return new AccessDepartment();
    }
}
