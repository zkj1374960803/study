package abstractfactorymode.frist;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:25:26
 */
public class SqlserverUser {

    public void insert(User user){
        System.out.println("在sql server 中给user表增加一条记录");
    }

    public User getUser(Long id){
        System.out.println("在sql server 中根据id查询user表一条记录");
        return null;
    }
}
