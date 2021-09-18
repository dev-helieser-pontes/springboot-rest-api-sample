package br.com.springboot.curso_dev_treinamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.springboot.curso_dev_treinamento.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	@Query(value = "SELECT u FROM Usuario u where upper(trim(u.nome)) like %?1%") /* %?1%" 1 porque so tem um parametro para passar*/
	List<Usuario> buscarPorNome(String name);
}
