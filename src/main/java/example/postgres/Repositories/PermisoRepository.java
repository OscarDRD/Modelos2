package example.postgres.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import example.postgres.models.PermisoModelo;

@Repository
public interface PermisoRepository  extends CrudRepository<PermisoModelo, Long>{
    
}
