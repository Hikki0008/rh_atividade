package com.example.rh_atividade.Controller;
import com.example.rh_atividade.Model.funcionarioModel;
import com.example.rh_atividade.Service.funcionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")


public class funcionarioController {

    @Autowired
    private funcionarioService service;

    @PostMapping
    public ResponseEntity<funcionarioModel> registrar(@RequestBody funcionarioModel funcionario) {
        return ResponseEntity.ok(service.registrar(funcionario));
    }

    @GetMapping
    public ResponseEntity<List<funcionarioModel>> listar() {
        return ResponseEntity.ok(service.listarFuncionarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<funcionarioModel> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletarFuncionario(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<funcionarioModel> atualizar(@PathVariable Long id, @RequestBody funcionarioModel funcionario) {
        return ResponseEntity.ok(service.atualizar(id, funcionario));
    }
}