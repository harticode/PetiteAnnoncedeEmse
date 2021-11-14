package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface NoteDao extends JpaRepository<Note, Long>, NoteDaoCustom {
    Note findNotesById(Long id);
    void removeNoteById(Long id);
}
