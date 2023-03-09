package com.IF700.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.IF700.entity.Usuario;
import com.IF700.service.UsuarioService;

@Controller
public class UsuarioController {
	
	private UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/usuarios")
	public String listStudents(Model model) {
		model.addAttribute("usuarios", usuarioService.getAllUsuarios());
		return "usuarios";
	}
	
	@GetMapping("/usuarios/new")
	public String createUsuarioForm(Model model) {
		
		// create student object to hold student form data
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "create_usuario";
		
	}
	
	@PostMapping("/usuarios")
	public String saveUsuario(@ModelAttribute("usuario") Usuario usuario) {
		usuarioService.saveUsuario(usuario);
		return "redirect:/usuarios";
	}
	
	@GetMapping("/usuarios/edit/{id}")
	public String editUsuarioForm(@PathVariable Integer id, Model model) {
		model.addAttribute("usuario", usuarioService.getUsuarioById(id));
		return "edit_usuario";
	}

	@PostMapping("/usuarios/{id}")
	public String updateUsuario(@PathVariable Integer id,
			@ModelAttribute("usuario") Usuario usuario,
			Model model) {
		
		
		// get student from database by id
		Usuario existingUsuario = usuarioService.getUsuarioById(id);
		existingUsuario.setId(id);
		existingUsuario.setNombre(usuario.getNombre());
		existingUsuario.setApellidos(usuario.getApellidos());
		
		
		// save updated student object
		usuarioService.updateUsuario(existingUsuario);
		return "redirect:/usuarios";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/usuarios/{id}")
	public String deleteusuario(@PathVariable Integer id) {
		usuarioService.deleteUsuariotById(id);
		return "redirect:/usuarios";
	}	
	

}
