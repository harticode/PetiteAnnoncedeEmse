package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Note;

import java.util.List;

public interface NoteDaoCustom {
    List<Note> findNotesbyType(Integer type);

}
