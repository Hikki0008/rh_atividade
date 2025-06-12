package com.example.rh_atividade.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rh_atividade.Model.funcionarioPorCargoModel;
import com.example.rh_atividade.Repository.funcionarioPorCargoRepository;

@Service
public class funcionarioPorCargoService {

    @Autowired
    private funcionarioPorCargoRepository repository;


    public funcionarioPorCargoModel registrar( funcionarioPorCargoModel funcionarioporcargo){
        return repository.save(funcionarioporcargo);
    }

    public List<funcionarioPorCargoModel>listar(){
        return  repository.findAll();

    }

    public Optional<funcionarioPorCargoModel>buscarPorId(Long id){
        return repository.findById(id);
    }

    public void deletarfuncar (Long id){
        repository.deleteById(id);
    }

    public funcionarioPorCargoModel atualizarfuncar(Long id, funcionarioPorCargoModel funcionariporcargo){
        funcionariporcargo.setId(id);
        return repository.save(funcionariporcargo);
    }
}
