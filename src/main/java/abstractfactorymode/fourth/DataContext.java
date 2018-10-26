package abstractfactorymode.fourth;

/**
 * @author zhangkangjian
 * @date 2018-10-26 13:50:53
 */
public class DataContext {

    public static IUser createUser(DataSourceEnum dataSourceEnum){
        switch (dataSourceEnum){
            case ACCESS:
                return new AccessUser();
            case SQLSERVER:
                return new SqlserverUser();
        }
        return null;
    }

    public static IDepartment createDepartment(DataSourceEnum dataSourceEnum){
        switch (dataSourceEnum){
            case SQLSERVER:
                return new SqlserverDepartment();
            case ACCESS:
                return new AccessDepartment();
        }
        return null;
    }

}
