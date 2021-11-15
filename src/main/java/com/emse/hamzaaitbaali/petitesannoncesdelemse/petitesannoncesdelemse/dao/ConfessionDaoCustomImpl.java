package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Confession;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Note;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

public class ConfessionDaoCustomImpl implements ConfessionDaoCustom{
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Confession> findAllOrderByDateofPost() {
        List<Confession> listordered = new ArrayList<Confession>();
        String jpqlSelectRoom = "select n from Confession n order by n.dateofPost DESC";
        List<Confession> ln = em.createQuery(jpqlSelectRoom, Confession.class)
                .getResultList();
        listordered.addAll(ln);
        return listordered;
    }
}
