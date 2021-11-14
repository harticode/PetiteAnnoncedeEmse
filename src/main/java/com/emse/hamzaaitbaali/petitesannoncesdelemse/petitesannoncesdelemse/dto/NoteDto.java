package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dto;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Note;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.User;

import java.util.Date;

public class NoteDto {
    private Long id;
    private Long dateofPost;
    private String contentOfTheNote;
    private Integer type; //CentreVille or Request
    //private String user_email;
    private User user;

    public NoteDto() {
    }

    public NoteDto(Note note) {
        this.id = note.getId();
        this.dateofPost = note.getDateofPost();
        this.contentOfTheNote = note.getContentOfTheNote();
        this.type = note.getType();
        //this.user_email = note.getUser().getEmail();
        this.user = note.getUser();
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

    /*public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }*/

    public User getUser() {
        return user;
    }
}
