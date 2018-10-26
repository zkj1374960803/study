package abstractfactorymode.fourth;

/**
 * @author zhangkangjian
 * @date 2018-10-26 11:17:00
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在 Access 中给 department 表增加一条记录");
    }

    @Override
    public Department getDepartment(Long id) {
        System.out.println("在 Access 中根据id查询 department 表一条记录");
        return null;
    }
}
