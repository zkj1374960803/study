package es6;

/**
 * @author zhangkangjian
 * @date 2018-10-23 14:25:15
 */
public class Criteria {
    private String fieldName;
    private Object fieldValue;

    public Criteria(String fieldName, Object fieldValue) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}
