package com.IF700.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.IF700.entity.Usuario;
import com.IF700.repository.UsuarioRepository;
import com.IF700.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private UsuarioRepository usuarioRepository;
	
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario getUsuarioById(Integer id) {
		return usuarioRepository.findById(id).get();
	}

	@Override
	public Usuario updateUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public void deleteUsuariotById(Integer id) {
		usuarioRepository.deleteById(id);	
	}
	

}
