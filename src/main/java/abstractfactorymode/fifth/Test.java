package abstractfactorymode.fifth;

import java.lang.reflect.InvocationTargetException;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:28:02
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String packagePath = "abstractfactorymode.fifth";

        Department department1 = new Department();
        IDepartment iDepartment = DataContext.createDepartment(packagePath + "." + "AccessDepartment");
        iDepartment.getDepartment(1L);
        iDepartment.insert(department1);

    }
}
