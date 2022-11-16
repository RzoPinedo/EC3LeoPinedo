package pe.edu.idat.ec3.leo.pinedo.service;

import java.util.List;

import pe.edu.idat.ec3.leo.pinedo.model.UsuarioCliente;

public interface UsuarioClienteService {
	
	void guardar(UsuarioCliente usuariocliente);
	void actualizar(UsuarioCliente usuariocliente);
	void eliminar(Integer id);
	List<UsuarioCliente> listar();
	UsuarioCliente obtener(Integer id);

}
