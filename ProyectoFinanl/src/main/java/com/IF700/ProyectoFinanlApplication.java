package com.IF700;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.IF700.entity.Usuario;
import com.IF700.repository.UsuarioRepository;

@SpringBootApplication
public class ProyectoFinanlApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinanlApplication.class, args);
	}

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("tony", "stark", "tony@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}
	
}
