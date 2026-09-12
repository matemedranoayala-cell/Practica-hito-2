package com.unifranz.programaciontres.infrastructure.Persistence;

import com.unifranz.programaciontres.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    List<Persona> findByNombreIgnoreCase(String nombre);
    List<Persona> findByEmailIgnoreCase(String email);
}
