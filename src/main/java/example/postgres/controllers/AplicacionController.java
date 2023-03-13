package example.postgres.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import example.postgres.models.AplicacionModelo;
import example.postgres.services.AplicacionService;

@RestController
@RequestMapping("/aplicacion")
public class AplicacionController {
    @Autowired
    AplicacionService aplicacionService;

    @GetMapping()
    public ArrayList<AplicacionModelo> obtenerAplicaciones(){
        return aplicacionService.obtenerAplicaciones();
    }

    @PostMapping()
    public AplicacionModelo guardarAplicacion(@RequestBody AplicacionModelo aplicacion){
        return this.aplicacionService.guardarAplicacion(aplicacion);
    }

    @DeleteMapping( path = "/{eliminar_id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.aplicacionService.eliminarAplicacion(id);
        if (ok){
            return "Se eliminó el aplicacion con id " + id;
        }else{
            return "No pudo eliminar el aplicacion con id" + id;
        }
    }
}
