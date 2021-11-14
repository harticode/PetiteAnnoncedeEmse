package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dto;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Note;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.User;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

public class UserDto {
    private String email;
    private String username;
    private String photoUrl;
    private List<Note> Notelist;

    public UserDto() {
    }

    public UserDto(User user) {
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.photoUrl = user.getPhotoUrl();
    }

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

    public List<Note> getNotelist() {
        return Notelist;
    }

    public void setNotelist(List<Note> notelist) {
        Notelist = notelist;
    }
}
