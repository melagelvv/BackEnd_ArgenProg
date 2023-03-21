
package com.melportfolio.argenprog.Respository;

import com.melportfolio.argenprog.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iPersonaRepository extends JpaRepository<Persona, Long>{
    
}
