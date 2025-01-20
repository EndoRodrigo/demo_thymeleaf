package com.endorodrigo.demo_thymeleaf.repository;

import com.endorodrigo.demo_thymeleaf.model.Variety;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VarietyRepository extends JpaRepository<Variety,Long> {
}
