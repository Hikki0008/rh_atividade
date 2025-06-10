
package com.example.rh_atividade.Repository;
import com.example.rh_atividade.Model.funcionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;



public interface funcionarioRepository extends JpaRepository<funcionarioModel, Long> {

}
