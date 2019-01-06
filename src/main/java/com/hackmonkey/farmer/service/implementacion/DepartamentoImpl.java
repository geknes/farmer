package com.hackmonkey.farmer.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackmonkey.farmer.entity.Departamento;
import com.hackmonkey.farmer.repository.interfaces.DepartamentoDAO;
import com.hackmonkey.farmer.service.interfaces.DepartamentoService;

@Service
public class DepartamentoImpl implements DepartamentoService{
	
	@Autowired
	private DepartamentoDAO departamentoDao;

	@Override
	public Departamento guardar(Departamento entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Departamento> listar() {
		// TODO Auto-generated method stub
		return  (List<Departamento>) departamentoDao.findAll();
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Departamento buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
