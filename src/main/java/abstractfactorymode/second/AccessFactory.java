package abstractfactorymode.second;

import jdk.nashorn.api.tree.IfTree;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:40:09
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
