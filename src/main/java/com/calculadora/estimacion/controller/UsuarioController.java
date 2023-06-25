package com.calculadora.estimacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculadora.estimacion.entity.UsuarioEntity;
import com.calculadora.estimacion.serviceimpl.UsuarioServiceImpl;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private UsuarioServiceImpl usuarioService;
	
	@PostMapping("/usuario")
	public UsuarioEntity save(@RequestBody UsuarioEntity usuario) {
		return usuarioService.save(usuario);
	}
	
	@GetMapping("/usuario")
	public List<UsuarioEntity> usuarios(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public UsuarioEntity mostrar(@PathVariable Integer id) {
		 return usuarioService.findById(id);
	}
	
	@PutMapping("/usuario/{id}")
	public UsuarioEntity update(@RequestBody UsuarioEntity usuario, @PathVariable Integer id){
		
		UsuarioEntity usuarioActual = usuarioService.findById(id);
		usuarioActual.setNombre(usuario.getNombre());
		usuarioActual.setEmail(usuario.getEmail());
		usuarioActual.setEstado(usuario.getEstado());
		
		return  usuarioService.save(usuarioActual);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void delete(@PathVariable Integer id) {
		usuarioService.delete(id);
	}
}
