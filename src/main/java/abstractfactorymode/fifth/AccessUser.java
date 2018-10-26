package abstractfactorymode.fifth;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:41:08
 */
public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在 Access 中给 user 表增加一条记录");
    }

    @Override
    public User getUser(Long id) {
        System.out.println("在 Access 中根据id查询 user 表一条记录");
        return null;
    }
}
