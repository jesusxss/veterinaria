package com.vettrack.vettrack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vettrack.vettrack.model.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {

}
