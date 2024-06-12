package br.senai.sc.demo.controller;

import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

// @Autowired
//
// Após o UsuarioController ser criado ele adiciona um usuarioService.
// Duas formas: após a construção do objeto, setando a dependência posteriormente com Autowired (agregação)
// ou montando um construtor (composição)

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

//    @Autowired
    private final UsuarioService usuarioService;

//    @GetMapping
//    public String endpointGet() {
//        return "GET";
//    }
//
    @GetMapping("/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id) {
        return usuarioService.buscarUsuario(id);
    }

    @PostMapping
    public String cadastroUsuario(@RequestBody Usuario usuario) {
        usuarioService.cadastroUsuario(usuario);
        return "POST - Olá, " + usuario.getNome() + ".\n" + usuario;
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
