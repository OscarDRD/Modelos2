package example.postgres.Repositories;

import org.springframework.stereotype.Repository;

import example.postgres.models.AplicacionModelo;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface AplicacionRepository extends CrudRepository<AplicacionModelo, Long>{
    
}
