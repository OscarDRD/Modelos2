package example.postgres.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.postgres.Repositories.PermisoRepository;
import example.postgres.models.PermisoModelo;

@Service
public class PermisoService {
    @Autowired
    PermisoRepository permisoRepository;
    
    public ArrayList<PermisoModelo> obtenerPermisos(){
        return (ArrayList<PermisoModelo>) permisoRepository.findAll();
    }

    public PermisoModelo guardarPermiso(PermisoModelo Permiso){
        return permisoRepository.save(Permiso);
    }

    public Optional<PermisoModelo> obtenerPorId(Long id){
        return permisoRepository.findById(id);
    }

    public boolean eliminarPermiso(Long id) {
        try{
            permisoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
