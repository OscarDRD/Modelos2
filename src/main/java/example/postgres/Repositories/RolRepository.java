package example.postgres.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import example.postgres.models.RolModelo;

@Repository
public interface RolRepository extends CrudRepository<RolModelo, Long> {
    
}
