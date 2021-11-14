package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "RNOTE")
public class Note {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Long dateofPost;

    @Column(nullable = false, length = 1000)
    private String contentOfTheNote;

    @Column(nullable = false, length = 255)
    private Integer type; //CentreVille or Request

    @ManyToOne
    //@JoinColumn(name = "user_email", nullable = false)
    private User user;

    public Note(Long dateofPost, String contentOfTheNote, Integer type) {
        this.dateofPost = dateofPost;
        this.contentOfTheNote = contentOfTheNote;
        this.type = type;
    }

    public Note(Long dateofPost, String contentOfTheNote, Integer type, User user) {
        this.dateofPost = dateofPost;
        this.contentOfTheNote = contentOfTheNote;
        this.type = type;
        this.user = user;
    }

    public Note() {

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

    public String getContentOfTheNote() {
        return contentOfTheNote;
    }

    public void setContentOfTheNote(String contentOfTheNote) {
        this.contentOfTheNote = contentOfTheNote;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
