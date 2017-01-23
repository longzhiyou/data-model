package com.lzy.demo.party.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * User: longzhiyou
 * Date: 2017/1/13
 * Time: 19:27
 */
public class BookPublisherPK implements Serializable {
    private Integer bookId;
    private Integer publisherId;

    @Column(name = "book_id")
    @Id
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Column(name = "publisher_id")
    @Id
    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookPublisherPK that = (BookPublisherPK) o;

        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (publisherId != null ? !publisherId.equals(that.publisherId) : that.publisherId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + (publisherId != null ? publisherId.hashCode() : 0);
        return result;
    }
}
