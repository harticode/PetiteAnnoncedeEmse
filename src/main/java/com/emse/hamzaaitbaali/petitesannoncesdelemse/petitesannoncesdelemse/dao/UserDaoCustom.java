package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.User;

import java.util.List;

public interface UserDaoCustom {
    User findUserByEmail(String email);
}
