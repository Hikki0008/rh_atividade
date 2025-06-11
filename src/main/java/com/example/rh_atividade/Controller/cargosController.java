package com.example.rh_atividade.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.rh_atividade.Model.cargosModel;
import com.example.rh_atividade.Service.cargosService;

@RestController
@RequestMapping("/api/cargos")
public class cargosController {

    @Autowired
    private cargosService service;

    @PostMapping
    public ResponseEntity<cargosModel> registrarCargos(@RequestBody cargosModel cargos){
        return ResponseEntity.ok(service.registrar(cargos));
    }

    @GetMapping
    public ResponseEntity<List<cargosModel>>listar(){
        return ResponseEntity.ok(service.listarCargos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<cargosModel>buscar(@PathVariable Long id){
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<cargosModel>atualizar(@PathVariable long id,@RequestBody cargosModel cargos){
        return ResponseEntity.ok(service.atualizar(id, cargos ));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deletarCargo(Long id){
        service.deletarCargo(id);
        return ResponseEntity.noContent().build(); 
    }
}
