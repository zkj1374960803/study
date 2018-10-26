package abstractfactorymode.fourth;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:28:02
 */
public class Test {
    public static void main(String[] args) {

        User user = new User();
        IUser user1 = DataContext.createUser(DataSourceEnum.ACCESS);
        user1.getUser(1L);
        user1.insert(user);

        Department department1 = new Department();
        IDepartment department = DataContext.createDepartment(DataSourceEnum.SQLSERVER);
        department.getDepartment(1L);
        department.insert(department1);
    }
}
