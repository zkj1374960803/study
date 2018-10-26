package es6;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.*;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import java.util.Date;
import java.util.List;

/**
 * @author zhangkangjian
 * @date 2018-10-23 14:25:49
 */
public class DocumentJestDaoImpl implements IDocumentDao {
    private JestClient client;

    private DocumentJestDaoImpl(JestClient client) {
        this.client = client;
    }



    public static void main(String[] args) {
        // 添加数据
//        test();
        // 更新数据 数据有问题
//        test1();
        // 删除数据
//        test2();
        // 查询一条数据数据 根据id查询
//        test3();
        // 条件查询
        test4();

    }

    private static void test(){
        JestClient client = EsJestClient.getClient();
        DocumentJestDaoImpl documentDao = new DocumentJestDaoImpl(client);
        Document document = new Document();
        document.setId(1);
        document.setTitle("望野");
        document.setAuthor("王绩");
        document.setPublishTime(new Date());
        document.setTags(new String[]{"树树皆秋色", "山山唯落辉"});
        //保存
        documentDao.insert(document);
    }
    private static void test1() {
        JestClient client = EsJestClient.getClient();
        DocumentJestDaoImpl documentDao = new DocumentJestDaoImpl(client);
        Document document = new Document();
        document.setId(1);
        document.setTitle("归园田居");
        document.setAuthor("【陶渊明】");
        document.setPublishTime(new Date());
        document.setTags(new String[]{"种豆南山下", "草盛豆苗稀", "晨兴理荒秽", "带月荷锄归"});
        documentDao.update(document);
    }
    private static void test2(){
        JestClient client = EsJestClient.getClient();
        DocumentJestDaoImpl documentDao = new DocumentJestDaoImpl(client);
        documentDao.delete(0L);
    }

    private static void test3(){
        JestClient client = EsJestClient.getClient();
        DocumentJestDaoImpl documentDao = new DocumentJestDaoImpl(client);
        Document document = documentDao.searchById(1L);
        System.out.println(document);
    }
    private static void test4(){
        JestClient client = EsJestClient.getClient();
        DocumentJestDaoImpl documentDao = new DocumentJestDaoImpl(client);
        Criteria criteria = new Criteria("author", "陶渊明");
//        Criteria criteria1 = new Criteria("author", "王绩");
        List<Document> search = documentDao.search(List.of(criteria));
        search.forEach(System.out::println);
    }




    /**
     * 插入
     *
     * @param doc 文档
     * @return 是佛插入成功
     */
    @Override
    public boolean insert(Document doc) {
        try {
            DocumentResult result = client.execute(new Index.Builder(doc)
                .index(DocumentDB.INDICES)
                .type(DocumentDB.TYPE)
                .refresh(true)
                .build());
            return result.isSucceeded();
        } catch (Exception e) {
            throw new RuntimeException("insert exception", e);
        }
    }

    /**
     * 替换
     *
     * @param doc 文档
     * @return 是否执行成功
     */
    @Override
    public boolean replace(Document doc) {
        return update(doc);
    }

    /**
     * 更新
     *
     * @param doc 文档
     * @return 是否更新成功
     */
    @Override
    public boolean update(Document doc) {
        try {
            DocumentResult result = client.execute(new Update.Builder(doc)
                .index(DocumentDB.INDICES)
                .type(DocumentDB.TYPE)
                .refresh(true)
                .build());
            return result.isSucceeded();
        } catch (Exception e) {
            throw new RuntimeException("update exception", e);
        }
    }

    /**
     * 删除
     *
     * @param id 文档id
     * @return 是否执行成功
     */
    @Override
    public boolean delete(long id) {
        try {
            DocumentResult result = client.execute(new Delete.Builder(String.valueOf(id))
                .index(DocumentDB.INDICES)
                .type(DocumentDB.TYPE)
                .build());
            return result.isSucceeded();
        } catch (Exception e) {
            throw new RuntimeException("delete exception", e);
        }
    }

    /**
     * 根据ID查询
     *
     * @param id id
     * @return 文档
     */
    @Override
    public Document searchById(long id) {
        try {
            DocumentResult result = client.execute(new Get.Builder(DocumentDB.INDICES, String.valueOf(id))
                .type(DocumentDB.TYPE)
                .build());
            return result.getSourceAsObject(Document.class);
        } catch (Exception e) {
            throw new RuntimeException("searchById exception", e);
        }
    }

    /**
     * 条件查询
     *
     * @param criterias 条件列表
     * @return 结果集
     */
    @Override
    public List<Document> search(List<Criteria> criterias) {
        try {
            SearchResult result = client.execute(new Search.Builder(buildSearch(criterias).toString())
                // multiple index or types can be added.
                .addIndex(DocumentDB.INDICES)
                .addType(DocumentDB.TYPE)
                .build());
            return result.getSourceAsObjectList(Document.class, false);

        } catch (Exception e) {
            throw new RuntimeException("search exception", e);
        }
    }

    private SearchSourceBuilder buildSearch(List<Criteria> criterias) {
        //指定查询的库表
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        if (criterias != null && !criterias.isEmpty()) {
            //构建查询条件必须嵌入filter中！
            BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
            for (Criteria c : criterias) {
                boolQueryBuilder.filter(QueryBuilders.termQuery(c.getFieldName(), c.getFieldValue()));
            }

            searchSourceBuilder.query(boolQueryBuilder);
        }
        return searchSourceBuilder;
    }
    /**
     * 条件删除 ，ElasticSearch V5.1 以上可用
     *
     * @param criterias 条件
     * @return 删除的document数量
     */
    @Override
    public int deleteByQuery(List<Criteria> criterias) {
        try {
            JestResult result = client.execute(new DeleteByQuery.Builder(buildSearch(criterias).toString())
                .addIndex(DocumentDB.INDICES)
                .addType(DocumentDB.TYPE)
                .build());

            return result.getJsonObject().get("deleted").getAsInt();
        } catch (Exception e) {
            throw new RuntimeException("deleteByQuery exception", e);
        }
    }
}
