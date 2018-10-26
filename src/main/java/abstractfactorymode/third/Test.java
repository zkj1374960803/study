package abstractfactorymode.third;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:28:02
 */
public class Test {
    public static void main(String[] args) {

        // 此时已与具体的数据库访问接触了依赖
        // sql server
        Department department = new Department();
        IFactory iFactory = new SqlServerFactory();
        IDepartment iDepartment = iFactory.createPartment();
        iDepartment.insert(department);
        iDepartment.getDepartment(1L);
        User user = new User();
        IUser iUser = iFactory.createUser();
        iUser.insert(user);
        iUser.getUser(1L);


        // access
        IFactory accessFactory = new SqlServerFactory();
        IDepartment partment = accessFactory.createPartment();
        IUser accessUser = accessFactory.createUser();
        partment.insert(department);
        partment.getDepartment(1L);
        accessUser.insert(user);
        accessUser.getUser(1L);


    }
}
