package br.senai.sc.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
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

    @ToString.Exclude
    @Column(name = "password")
    @JsonIgnore
    private String senha;

    @Column(length = 50)
    private String nomePet;
}
