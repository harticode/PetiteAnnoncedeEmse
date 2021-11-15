package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Confession;

import java.util.List;

public interface ConfessionDaoCustom {
    List<Confession> findAllOrderByDateofPost();
}
