package com.IF700.service;

import java.util.List;

import com.IF700.entity.Usuario;

public interface UsuarioService {
	
	List<Usuario> getAllUsuarios();
		
	Usuario saveUsuario(Usuario usuario);
		
	Usuario getUsuarioById(Integer id);
		
	Usuario updateUsuario(Usuario usuario);
	
	void deleteUsuariotById(Integer id);

}
