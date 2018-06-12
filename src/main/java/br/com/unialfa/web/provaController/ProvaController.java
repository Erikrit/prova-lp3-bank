package br.com.unialfa.web.provaController;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.unialfa.web.prova.ProvaEntity;
import br.com.unialfa.web.provaRepository.ProvaRepository;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ProvaController {
	
	ProvaRepository rep;
	@RequestMapping(value="/prova" , Method = RequestMethod.POST )
	public Mono<ProvaEntity> salvar(){
		return Mono.just(rep.save(entity));
		
		
		
		
		
	}
	
	
	
	@RequestMapping(value="/prova" , Method = RequestMethod.GET )
	public List<ProvaEntity> lista(){
		
		List<provaEntity> lista = (List<ProvaEntity>) rep.findAll();
		return lista;
	}
}
