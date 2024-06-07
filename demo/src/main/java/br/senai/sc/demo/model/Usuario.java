package br.senai.sc.demo.model;

import jakarta.persistence.*;

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

// @GeneratedValue
//
// Define uma estratégia de geração de valor

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(precision = 11, updatable = false, unique = true)
    private Long cpf;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true)
    private String email;
    @Column(name = "password")
    private String senha;
    @Column(length = 25)
    private String nomePet;
}
