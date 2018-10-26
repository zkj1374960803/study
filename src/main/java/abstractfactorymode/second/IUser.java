package abstractfactorymode.second;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:34:14
 */
public interface IUser {
    void insert(User user);
    User getUser(Long id);
}
