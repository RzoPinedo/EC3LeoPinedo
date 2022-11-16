package pe.edu.idat.ec3.leo.pinedo.service;

import java.util.List;

import pe.edu.idat.ec3.leo.pinedo.model.Cliente;

public interface ClienteService {
	
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);

}
