package abstractfactorymode.fifth;

/**
 * @author zhangkangjian
 * @date 2018-10-26 11:11:59
 */
public interface IDepartment {
    void insert(Department department);
    Department getDepartment(Long id);
}
