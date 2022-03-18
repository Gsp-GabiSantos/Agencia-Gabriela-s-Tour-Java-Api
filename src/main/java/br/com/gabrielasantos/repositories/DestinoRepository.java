package br.com.gabrielasantos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gabrielasantos.entities.Destino;

@Repository
public interface DestinoRepository extends JpaRepository<Destino, Long> {

}
