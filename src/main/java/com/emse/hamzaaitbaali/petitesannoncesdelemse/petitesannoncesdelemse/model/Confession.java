package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model;

import javax.persistence.*;

@Entity
@Table(name = "RCONFESSION")
public class Confession {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long dateofPost;

    @Column(nullable = false, length = 1000)
    private String contentOfTheConfession;

    public Confession(Long dateofPost, String contentOfTheConfession) {
        this.dateofPost = dateofPost;
        this.contentOfTheConfession = contentOfTheConfession;
    }

    public Confession() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDateofPost() {
        return dateofPost;
    }

    public void setDateofPost(Long dateofPost) {
        this.dateofPost = dateofPost;
    }

    public String getContentOfTheConfession() {
        return contentOfTheConfession;
    }

    public void setContentOfTheConfession(String contentOfTheConfession) {
        this.contentOfTheConfession = contentOfTheConfession;
    }
}
