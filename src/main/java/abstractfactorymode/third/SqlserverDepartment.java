package abstractfactorymode.third;

/**
 * @author zhangkangjian
 * @date 2018-10-26 11:15:19
 */
public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在sql server 中给 department 表增加一条记录");
    }

    @Override
    public Department getDepartment(Long id) {
        System.out.println("在sql server 中根据id查询 department 表一条记录");
        return null;
    }
}
