package br.senai.sc.demo.controller;

import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

//    @Autowired
    private final UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> buscarUsuarios() {
        return usuarioService.buscarUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuario(@PathVariable Integer id) {
        return usuarioService.buscarUsuario(id);
    }

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    @PutMapping
    public Usuario editarUsuario(@RequestBody Usuario usuarioEditado) {
        return usuarioService.editarUsuario(usuarioEditado);
    }

    @PatchMapping("/{id}")
    public Usuario editarSenhaUsuario(@PathVariable Integer id, @RequestBody String senha) {
        return usuarioService.editarSenha(id, senha);
    }

    @DeleteMapping
    public String removerUsuario(@RequestParam Integer id) {
        return usuarioService.removerUsuario(id);
    }

    @GetMapping("/busca")
    public List<Usuario> buscarUsuariosPorNome(@RequestParam String nome) {
        return usuarioService.buscarUsuariosPorNome(nome);
    }

}
