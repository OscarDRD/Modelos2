package example.postgres.models;

import javax.persistence.*;

@Entity
@Table(name = "Permiso")
public class PermisoModelo {
    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int idPermiso;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    public int getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(int idPermiso) {
        this.idPermiso = idPermiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
