package br.senai.sc.demo.service;

import br.senai.sc.demo.model.Usuario;
import br.senai.sc.demo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

// Controller: conexão inicial com a interface externa, transformando dados para entrada/saída
// Service: meio-termo entre banco de dados e as models e suas regras de negócio, executando/acionando regras de negócio
// próprias ou de outras classes e salvando os dados/objetos quando necessário

// @Service
//
// Anotação para definir que a classe é uma service para o Spring

// @AllArgsConstructor
//
// Cria um construtor com todos os parâmetros da classe

// @RequiredArgsConstructor
//
// Cria um construtor personalizável, onde parâmatros com a anotação @NonNull(Lombok) são obrigatórios e os que não tem
// são agregação, não requeridos

@Service
@AllArgsConstructor
//@RequiredArgsConstructor
public class UsuarioService {

//    @NonNull
    private final UsuarioRepository usuarioRepository;

    public Usuario cadastroUsuario(Usuario usuario) {
//        usuario.validarIdade();
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuario(Integer id) {
        Optional<Usuario> optional = usuarioRepository.findById(id);

        if (optional.isEmpty())
            throw new RuntimeException("Usuário não existe");

        return optional.get();
    }
}
