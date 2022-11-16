package pe.edu.idat.ec3.leo.pinedo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHospital;
	private String nombre;
	private String direccion;
	
	@ManyToMany
	@JoinTable(name="cliente_hospital",
	joinColumns = @JoinColumn(name = "id_hospital", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Kei (id_hospital) references hospital (id_hospital)")),
			inverseJoinColumns = @JoinColumn(name="id_cliente", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign Kei (id_cliente) references cliente (id_cliente)"))
	)
	private List<Cliente> clientes = new ArrayList<>();
	
	public Integer getIdHospital() {
		return idHospital;
	}
	public void setIdHospital(Integer idHospital) {
		this.idHospital = idHospital;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
