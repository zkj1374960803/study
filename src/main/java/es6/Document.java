package es6;

import io.searchbox.annotations.JestId;

import java.util.Arrays;
import java.util.Date;

/**
 * @author zhangkangjian
 * @date 2018-10-23 14:22:43
 */
public class Document {
    @JestId
    private long id;
    private String title;
    private String author;
    private String[] tags;
    private Date publishTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
    @Override
    public String toString() {
        return "Document{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", tags=" + Arrays.toString(tags) +
            ", publishTime=" + publishTime +
            '}';
    }
}
