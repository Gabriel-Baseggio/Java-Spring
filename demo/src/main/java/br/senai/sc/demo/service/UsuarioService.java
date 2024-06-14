package br.senai.sc.demo.service;

import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
//@RequiredArgsConstructor
public class UsuarioService {

//    @NonNull
    private final UsuarioRepository usuarioRepository;

    public List<Usuario> buscarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarUsuario(Integer id) throws Exception {
        Optional<Usuario> optional = usuarioRepository.findById(id);

        if (optional.isEmpty())
            throw new Exception("Usuário não encontrado");

        return optional.get();
    }

    public Usuario salvarUsuario(Usuario usuario) {
//        usuario.validarIdade();
        return usuarioRepository.save(usuario);
    }

    public Usuario editarUsuario(Usuario usuarioEditado) {
        validarUsuario(usuarioEditado.getId());
        return salvarUsuario(usuarioEditado);
    }

    public Usuario editarSenha(Integer id, String novaSenha) {
        Usuario usuario = buscarUsuario(id);

        if (novaSenha != null)
            usuario.setSenha(novaSenha);

        return salvarUsuario(usuario);
    }

    public String removerUsuario(int id) {

        if (buscarUsuario(id) != null);

        usuarioRepository.deleteById(id);

        if (usuarioRepository.existsById(id))
            throw new RuntimeException("Não foi possível deletar o usuário de id: " + id);

        return "Usuário de id " + id + " deletado";
    }


    public List<Usuario> buscarUsuariosPorNome(String nome) {
        return usuarioRepository.findByNomeContainingIgnoreCase(nome);
    }

    private void validarUsuario(Integer id) {
        if (!(usuarioRepository.existsById(id)))
            throw new RuntimeException("Usuário não encontrado!");
    }

}
