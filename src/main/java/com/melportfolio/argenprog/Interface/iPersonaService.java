
package com.melportfolio.argenprog.Interface;

import com.melportfolio.argenprog.Entity.Persona;
import java.util.List;


public interface iPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
}
