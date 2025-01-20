package com.endorodrigo.demo_thymeleaf.repository;

import com.endorodrigo.demo_thymeleaf.model.SeedStarter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeedStarterRepository extends JpaRepository<SeedStarter, Long> {
    void add(SeedStarter seedStarter);
}
