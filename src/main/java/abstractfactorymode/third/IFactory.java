package abstractfactorymode.third;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:36:58
 */
public interface IFactory {
    IUser createUser();
    IDepartment createPartment();



}
