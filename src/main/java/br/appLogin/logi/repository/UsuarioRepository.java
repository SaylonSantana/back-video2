package br.appLogin.logi.repository;

import org.springframework.data.repository.CrudRepository;

import br.appLogin.logi.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

	Usuario findByEmail(String email);

}
