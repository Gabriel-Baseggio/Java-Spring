package br.senai.sc.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

// @Getter
//
// A anotação na classe cria os getters padronizados para todos os atributos, se for apenas em um atributo, cria o
// getter padrão para apenas aquele atributo

// @ToString
//
// A anotação na classe cria o toString padrão com todos os atributos da classe. É possível excluir um atributo do
// toString usando a anotação @ToString.Exclude, ou adicionar apenas um usando @ToString.Include.

@ToString
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(precision = 11, updatable = false, unique = true)
    private Long cpf;

    @Column(nullable = false)
    @Getter
    private String nome;

    @Column(unique = true)
    private String email;

    @ToString.Exclude
    @Column(name = "password")
    private String senha;

    @Column(length = 25)
    private String nomePet;
}
