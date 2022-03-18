package br.com.gabrielasantos.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.gabrielasantos.entities.Destino;
import br.com.gabrielasantos.repositories.DestinoRepository;

@Service
public class DestinoService {

	@Autowired
	private DestinoRepository repository;

	@Transactional(readOnly = true)
	public List<Destino> findAll() {
		List<Destino> resultado = repository.findAll();
		return resultado;
	}

	@Transactional(readOnly = true)
	public Destino findById(Long id) {
		Optional<Destino> destino = repository.findById(id);
		return destino.get();
	}

	@Transactional(readOnly = true)
	public void save(Destino destino) {
		repository.save(destino);
	}

	public void delete(Long id) {
		Optional<Destino> destino = repository.findById(id);
		if (destino.isPresent()) {
			repository.delete(destino.get());
		} else {
			System.out.println("Esse Destino não existe");
		}
	}

	public Destino update(Destino destino) {
		return repository.save(destino);
	}

}
