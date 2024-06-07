package br.senai.sc.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// @Entity
//
// Anotação para que possa ser associada uma tabela e suas colunas à essa model e seus atributos
// Nomes de tabelas e atributos devem seguir o padrão snake_case, tudo minúsculo e com _ para separações;

// Também é possível definir exatamente qual a tabela/coluna relacionada à model/atributo com:
// @Table(name = "tb_usuario")
// @Column(name = "cpf_usuario")
//
// No @Column é possível definir outros atributos do db
// @Column(name = "cpf_usuario", length = 50, unique = true, nullable = true)

// @Id
//
// Define qual será o atributo referente à chave primária da tabela no db

@Entity
public class Usuario {
    @Id
    private Integer id;
    private Long cpf;
    private String nome;
    private String email;
    private String senha;
    private String nomePet;
}
