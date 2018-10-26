package es6;

import java.util.List;

/**
 * @author zhangkangjian
 * @date 2018-10-23 14:24:40
 */
public interface IDocumentDao {
    /**
     * 插入
     *
     * @param doc
     * @return
     */
    boolean insert(Document doc);

    /**
     * 替换
     *
     * @param doc
     * @return
     */
    boolean replace(Document doc);

    /**
     * 更新
     *
     * @param doc
     * @return
     */
    boolean update(Document doc);


    /**
     * 删除
     *
     * @param id
     * @return
     */
    boolean delete(long id);

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    Document searchById(long id);

    /**
     * 条件查询
     *
     * @param criterias
     * @return
     */
    List<Document> search(List<Criteria> criterias);

    /**
     * 条件删除
     *
     * @param criterias
     * @return 删除的document数量
     */
    int deleteByQuery(List<Criteria> criterias);
}
