package br.com.unialfa.web.provaService;

import java.util.List;

import javax.persistence.Entity;

import br.com.unialfa.web.prova.ProvaEntity;

public interface ProvaService {
	
	
	void salvar(ProvaEntity entity);
	Void deletar(Long id);
	List<Entity> listarTodos();

}
