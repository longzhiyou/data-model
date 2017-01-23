package com.lzy.demo.party.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * User: longzhiyou
 * Date: 2017/1/13
 * Time: 19:27
 */
@Entity
@Table(name = "book_publisher", schema = "data-model", catalog = "")
@IdClass(BookPublisherPK.class)
public class BookPublisher {
    private Integer bookId;
    private Integer publisherId;
    private Date publishedDate;

    @Id
    @Column(name = "book_id")
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Id
    @Column(name = "publisher_id")
    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    @Basic
    @Column(name = "published_date")
    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookPublisher that = (BookPublisher) o;

        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (publisherId != null ? !publisherId.equals(that.publisherId) : that.publisherId != null) return false;
        if (publishedDate != null ? !publishedDate.equals(that.publishedDate) : that.publishedDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + (publisherId != null ? publisherId.hashCode() : 0);
        result = 31 * result + (publishedDate != null ? publishedDate.hashCode() : 0);
        return result;
    }
}
