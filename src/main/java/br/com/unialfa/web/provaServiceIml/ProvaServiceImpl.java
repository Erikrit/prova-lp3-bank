package br.com.unialfa.web.provaServiceIml;

import java.util.List;

import javax.persistence.Entity;

import br.com.unialfa.web.prova.ProvaEntity;
import br.com.unialfa.web.provaRepository.ProvaRepository;
import br.com.unialfa.web.provaService.ProvaService;

public class ProvaServiceImpl implements ProvaService{
	
	ProvaRepository rep;
	
	
	@Override
	public void salvar(ProvaEntity entity) {
		if(entity != null)
			rep.save(entity);
		
	}

	@Override
	public Void deletar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entity> listarTodos() {
		
		return null; 
	}
	
	

}
