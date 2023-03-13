package example.postgres.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import example.postgres.models.UsuarioModelo;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModelo, Long> {
    public abstract ArrayList<UsuarioModelo> findByEmail(String email);
}
