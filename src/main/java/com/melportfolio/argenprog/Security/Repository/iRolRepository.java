
package com.melportfolio.argenprog.Security.Repository;

import com.melportfolio.argenprog.Security.Entity.Rol;
import com.melportfolio.argenprog.Security.Enum.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
