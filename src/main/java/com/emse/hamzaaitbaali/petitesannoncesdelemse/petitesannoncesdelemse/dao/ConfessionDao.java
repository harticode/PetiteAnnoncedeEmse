package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Confession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConfessionDao extends JpaRepository<Confession, Long>, ConfessionDaoCustom {

}
