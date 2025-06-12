package com.example.rh_atividade.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rh_atividade.Model.funcionarioPorCargoModel;


@Repository
public interface funcionarioPorCargoRepository extends JpaRepository<funcionarioPorCargoModel, Long>{

}
