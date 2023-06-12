package com.calculadora.estimacion.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.calculadora.estimacion.entity.UsuarioEntity;
import com.calculadora.estimacion.repository.IUsuarioRepository;
import com.calculadora.estimacion.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Override
	@Transactional(readOnly = false)
	public UsuarioEntity save(UsuarioEntity usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Integer id) {
		usuarioRepository.deleteById(id);	
	}

	@Override
	@Transactional(readOnly = true)
	public UsuarioEntity findById(Integer id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UsuarioEntity> findAll() {
		return (List<UsuarioEntity>) usuarioRepository.findAll();
	}

}
