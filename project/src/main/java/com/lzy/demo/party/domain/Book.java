package com.lzy.demo.party.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * User: longzhiyou
 * Date: 2017/1/13
 * Time: 19:26
 */
@Entity
@Data
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookId;
    @Basic
//    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_publisher", catalog = "", schema = "data-model", joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "book_id", nullable = false), inverseJoinColumns = @JoinColumn(name = "publisher_id", referencedColumnName = "publisher_id", nullable = false))
    private Set<Publisher> publishers;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, Set<Publisher> publishers) {
        this.name = name;
        this.publishers = publishers;
    }

    @Override
    public String toString() {
        String result = String.format(
                "Book [id=%d, name='%s']%n",
                bookId, name);
        if (publishers != null) {
            for(Publisher publisher : publishers) {
                result += String.format(
                        "Publisher[id=%d, name='%s']%n",
                        publisher.getPublisherId(), publisher.getName());
            }
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (bookId != null ? !bookId.equals(book.bookId) : book.bookId != null) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


}
