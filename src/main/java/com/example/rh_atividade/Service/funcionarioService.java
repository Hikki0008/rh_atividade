package com.example.rh_atividade.Service;
import com.example.rh_atividade.Model.funcionarioModel;
import com.example.rh_atividade.Repository.funcionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class funcionarioService {

    @Autowired
    private funcionarioRepository repository;

    public funcionarioModel registrar (funcionarioModel funcionario) {
        return repository.save(funcionario);
    }

    public List<funcionarioModel> listarFuncionarios() {
        return repository.findAll();
    }

    public Optional<funcionarioModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletarFuncionario(Long id) {
        repository.deleteById(id);
    }

    public funcionarioModel atualizar(Long id, funcionarioModel funcionario) {
        funcionario.setId(id);
        return repository.save(funcionario);
    }


}