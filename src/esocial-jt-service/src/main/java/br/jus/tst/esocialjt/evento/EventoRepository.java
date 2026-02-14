package br.jus.tst.esocialjt.evento;

import br.jus.tst.esocialjt.dominio.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
    boolean existsByNrRecibo(String nrRecibo);
}
