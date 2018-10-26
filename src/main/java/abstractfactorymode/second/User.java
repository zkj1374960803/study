package abstractfactorymode.second;

/**
 * @author zhangkangjian
 * @date 2018-10-26 10:22:13
 */
public class User {
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
