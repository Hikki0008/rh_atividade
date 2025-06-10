package com.example.rh_atividade.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rh_atividade.Model.cargosModel;
import com.example.rh_atividade.Repository.cargosRepository;

@Service
public class cargosService {

    @Autowired
    private cargosRepository repository;

    public cargosModel registrar (cargosModel cargos){
        return repository.save(cargos);
    }

    public List<cargosModel> listarCargos(){
        return repository.findAll();
    }

    public Optional<cargosModel> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletarCargo(Long id){
        repository.deleteById(id);;
    }

    public cargosModel atualizar (Long id, cargosModel cargos){
        cargos.setId(id);
        return repository.save(cargos);

    }
}