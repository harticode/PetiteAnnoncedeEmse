package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Note;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

public class NoteDaoCustomImpl implements NoteDaoCustom{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Note> findNotesbyType(Integer type) {
        List<Note> listbyType = new ArrayList<Note>();
        String jpqlSelectRoom = "select n from Note n where n.type = : type order by n.dateofPost DESC";
        List<Note> ln = em.createQuery(jpqlSelectRoom, Note.class)
                .setParameter("type", type)
                .getResultList();
        listbyType.addAll(ln);

        return listbyType;
    }
}
