package br.senai.sc.demo.repository;

import br.senai.sc.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// @Repository
//
// Anotação para definir que a classe é um repository para o Spring

// JpaRepository<classe a ser manipulada, tipo da primary key>

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {



}
