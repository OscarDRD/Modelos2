package example.postgres.models;

import javax.persistence.*;

@Entity
@Table(name = "Rol")
public class RolModelo {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int idRol;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String descripcion;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
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
