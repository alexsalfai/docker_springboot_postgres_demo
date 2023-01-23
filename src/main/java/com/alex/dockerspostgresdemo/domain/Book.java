package com.alex.dockerspostgresdemo.domain;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "author", nullable = false)
    private String author;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer yearEstablished) {
        this.year = yearEstablished;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String designer) {
        this.author = designer;
    }
}
