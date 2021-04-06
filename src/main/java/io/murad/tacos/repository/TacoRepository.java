package io.murad.tacos.repository;

import io.murad.tacos.model.Taco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacoRepository extends JpaRepository<Taco,Long> {
}
