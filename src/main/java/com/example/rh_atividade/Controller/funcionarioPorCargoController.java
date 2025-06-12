package com.example.rh_atividade.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rh_atividade.Model.funcionarioPorCargoModel;
import com.example.rh_atividade.Service.funcionarioPorCargoService;
import org.springframework.web.bind.annotation.PutMapping;


@RequestMapping("/api/alocar")
@RestController
@CrossOrigin(
        origins = "*"
)
public class funcionarioPorCargoController {

    @Autowired
    private funcionarioPorCargoService service;

    @PostMapping
    public ResponseEntity<funcionarioPorCargoModel>registrar(@RequestBody funcionarioPorCargoModel funcionariocargo){
        return ResponseEntity.ok(service.registrar(funcionariocargo));
    }

    @GetMapping
    public ResponseEntity <List<funcionarioPorCargoModel>>listar(){
        return ResponseEntity.ok(service.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<funcionarioPorCargoModel>buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<funcionarioPorCargoModel>atualizar(@PathVariable Long id,@RequestBody funcionarioPorCargoModel funcionarioporcargo){

        return ResponseEntity.ok(service.atualizarfuncar(id, funcionarioporcargo));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deletar(@PathVariable Long id){
        service.deletarfuncar(id);
        return ResponseEntity.noContent().build();
    }
}
