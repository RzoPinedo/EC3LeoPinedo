package pe.edu.idat.ec3.leo.pinedo.service;

import java.util.List;

import pe.edu.idat.ec3.leo.pinedo.model.Hospital;

public interface HospitalService {

	void guardar(Hospital hospital);
	void actualizar(Hospital hospital);
	void eliminar(Integer id);
	List<Hospital> listar();
	Hospital obtener(Integer id);
}
