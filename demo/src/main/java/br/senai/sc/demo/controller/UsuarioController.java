package br.senai.sc.demo.controller;

import br.senai.sc.demo.model.Usuario;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

//    @GetMapping
//    public String endpointGet() {
//        return "GET";
//    }
//
//    @GetMapping("/{id}")
//    public String endpointGet(@PathVariable int id) {
//        return "GET: " + id;
//    }

    @PostMapping
    public String cadastroUsuario(@RequestBody Usuario usuario) {
        return "POST - Olá, " + usuario.getNome() + ".\n " + usuario;
    }

//    @PutMapping("/{id}")
//    public String endpointPut(@PathVariable int id, @RequestBody String nome) {
//        return "PUT - ID: " + id + " - Olá, " + nome + ".";
//    }
//
//    @PatchMapping("/{id}")
//    public String endpointPatch(@PathVariable int id, @RequestBody String nome) {
//        return "PATCH - ID: " + id + " - Olá, " + nome + ".";
//    }
//
//    @DeleteMapping("/{id}")
//    public String endpointDelete(@PathVariable int id) {
//        return "DELETE - ID: " + id;
//    }

}
