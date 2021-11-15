package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dto;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Confession;

public class ConfessionDto {
    private Long id;
    private Long dateofPost;
    private String contentOfTheConfession;

    public ConfessionDto(){
    }

    public ConfessionDto(Confession confession) {
        this.id = confession.getId();
        this.dateofPost = confession.getDateofPost();
        this.contentOfTheConfession = confession.getContentOfTheConfession();
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
