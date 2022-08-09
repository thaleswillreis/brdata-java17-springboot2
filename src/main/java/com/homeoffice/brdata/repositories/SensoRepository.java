package com.homeoffice.brdata.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeoffice.brdata.entities.Senso;

//não utilizei a anotação @Repository por que a interface já está herdando essa caracteristica de JpaRepository
public interface SensoRepository extends JpaRepository<Senso, Long> {
}
