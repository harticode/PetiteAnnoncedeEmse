package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Note;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

public class UserDaoCustomImpl implements UserDaoCustom{

    @PersistenceContext
    private EntityManager em;

    @Override
    public User findUserByEmail(String email) {
        List<User> listbyEmail = new ArrayList<User>();
        String jpqlSelectRoom = "select u from User u where u.email = : email";
        List<User> ln = em.createQuery(jpqlSelectRoom, User.class)
                .setParameter("email", email)
                .getResultList();
        listbyEmail.addAll(ln);
        return listbyEmail.get(0);
    }
}
