
package com.melportfolio.argenprog.Service;

import com.melportfolio.argenprog.Entity.Experiencia;
import com.melportfolio.argenprog.Respository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
    RExperiencia Rexperiencia;
    
    public List<Experiencia> list(){
        return Rexperiencia.findAll();
    }
    
    public Optional<Experiencia> getOne(int id){
        return Rexperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE){
        return Rexperiencia.findByNombreE(nombreE);
    }
    
    public void save(Experiencia exp){
        Rexperiencia.save(exp);
    }
    
    public void delete(int id){
        Rexperiencia.deleteById(id);
    }
    
    public boolean existsById(int id){
        return Rexperiencia.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return Rexperiencia.existsByNombreE(nombreE);
    }
}
