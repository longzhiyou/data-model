package com.lzy.demo.party.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * User: longzhiyou
 * Date: 2017/1/13
 * Time: 19:27
 */
@Entity
public class Publisher {
    private Integer publisherId;
    private String name;
    private Set<Book> books;

    public Publisher() {
    }

    public Publisher(String name) {
        this.name = name;
    }

    public Publisher(String name, Set<Book> books) {
        this.name = name;
        this.books = books;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherId=" + publisherId +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Id
    @Column(name = "publisher_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        if (publisherId != null ? !publisherId.equals(publisher.publisherId) : publisher.publisherId != null)
            return false;
        if (name != null ? !name.equals(publisher.name) : publisher.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = publisherId != null ? publisherId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @ManyToMany(mappedBy = "publishers")
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
