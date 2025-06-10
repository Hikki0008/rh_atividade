package com.example.rh_atividade.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rh_atividade.Model.cargosModel;
@Repository
public interface cargosRepository extends JpaRepository<cargosModel, Long> {

}
