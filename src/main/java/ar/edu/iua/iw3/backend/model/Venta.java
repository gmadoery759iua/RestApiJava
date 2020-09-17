package ar.edu.iua.iw3.backend.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.util.List;

// 1 - Punto de partida, definimos el modelo , creamos esta entidad con el nombre de la tabla y sus anotadores correspondientes

@Entity
@Table(name = "ventas")
public class Venta implements Serializable {

	private static final long serialVersionUID = 4122893409072057489L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String fecha;
    @Column(length = 250)

    
    //En esta relacion de muchos a muchos se crea una tabla intermedia cuya clave principal esta formada por las claves principales de las tablas que 
    // une.
    @ManyToMany(mappedBy = "ventaList")
    @JsonBackReference
    private List<Producto> productoList;
   

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return fecha;
    }

    public void setNombre(String nombre) {
        this.fecha = nombre;
    }
}
