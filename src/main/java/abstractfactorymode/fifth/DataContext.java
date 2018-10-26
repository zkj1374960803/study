package abstractfactorymode.fifth;

import abstractfactorymode.fourth.DataSourceEnum;

import java.lang.reflect.InvocationTargetException;

/**
 * @author zhangkangjian
 * @date 2018-10-26 13:50:53
 */
public class DataContext {

    public static IUser createUser(String classname) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz2 = Class.forName(classname);
        return (IUser)clazz2.getDeclaredConstructor().newInstance();
    }

    public static IDepartment createDepartment(String classname) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz2 = Class.forName(classname);
        return (IDepartment)clazz2.getDeclaredConstructor().newInstance();
    }

}
