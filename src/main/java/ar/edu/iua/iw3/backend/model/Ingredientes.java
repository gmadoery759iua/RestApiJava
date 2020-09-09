package ar.edu.iua.iw3.backend.model;

import javax.persistence.*;
import java.io.Serializable;

// 1 - Punto de partida, definimos el modelo , creamos esta entidad con el nombre de la tabla y sus anotadores correspondientes

@Entity
@Table(name = "ingredientes")
public class Ingredientes implements Serializable{

	private static final long serialVersionUID = -831074459975889141L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String nombre;

    
    //En esta relacion de muchos a muchos se crea una tabla intermedia cuya clave principal esta formada por las claves principales de las tablas que 
    // une.
    /*@ManyToMany(mappedBy = "ingredienteList")
    @JsonBackReference
    private List<Producto> productoList;

	public ProductoDetalle getProductoDetalle() {
		return productoDetalle;
	}

	public void setProductoDetalle(ProductoDetalle productoDetalle) {
		this.productoDetalle = productoDetalle;
	}
*/
	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
