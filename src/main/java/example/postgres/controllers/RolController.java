package example.postgres.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import example.postgres.models.RolModelo;
import example.postgres.services.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    RolService rolService;

    @GetMapping()
    public ArrayList<RolModelo> obtenerRoles(){
        return rolService.obtenerRoles();
    }

    @PostMapping()
    public RolModelo guardarRol(@RequestBody RolModelo rol){
        return this.rolService.guardarRol(rol);
    }

    @GetMapping( path = "/{id}")
    public Optional<RolModelo> obtenerRolPorId(@PathVariable("id") Long id) {
        return this.rolService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{eliminar_id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.rolService.eliminarRol(id);
        if (ok){
            return "Se eliminó el rol con id " + id;
        }else{
            return "No pudo eliminar el rol con id" + id;
        }
    }
}
