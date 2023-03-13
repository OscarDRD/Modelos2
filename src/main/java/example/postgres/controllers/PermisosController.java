package example.postgres.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.postgres.models.PermisoModelo;
import example.postgres.services.PermisoService;

@RestController
@RequestMapping("/permisos")
public class PermisosController {
    @Autowired
    PermisoService permisoService;

    @GetMapping()
    public ArrayList<PermisoModelo> obtenerPermisos(){
        return permisoService.obtenerPermisos();
    }

    @PostMapping()
    public PermisoModelo guardarPermiso(@RequestBody PermisoModelo permiso){
        return this.permisoService.guardarPermiso(permiso);
    }

    @GetMapping( path = "/{id}")
    public Optional<PermisoModelo> obtenerPermisoPorId(@PathVariable("id") Long id) {
        return this.permisoService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{elminar_id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.permisoService.eliminarPermiso(id);
        if (ok){
            return "Se eliminó el permiso con id " + id;
        }else{
            return "No pudo eliminar el permiso con id" + id;
        }
    }
}
