package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "RUSER")
public class User {
    @Id
    //@GeneratedValue
    //private Long id;
    @Column(nullable = false, length = 255)
    private String email;

    @Column(nullable = false, length = 255)
    private String username;

    @Column(nullable = false, length = 255)
    private String photoUrl;

    @OneToMany(mappedBy = "user")
    private List<Note> Notelist;

    public User(String email, String username, String photoUrl) {
        this.email = email;
        this.username = username;
        this.photoUrl = photoUrl;
    }

    public User() {

    }

    //public List<Note> getNotelist() {
        //return Notelist;
    //}

    //public void setNotelist(List<Note> notelist) {
        //Notelist = notelist;
    //}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}
