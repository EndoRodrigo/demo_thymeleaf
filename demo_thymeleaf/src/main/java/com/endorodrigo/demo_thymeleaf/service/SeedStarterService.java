package com.endorodrigo.demo_thymeleaf.service;

import com.endorodrigo.demo_thymeleaf.model.SeedStarter;
import com.endorodrigo.demo_thymeleaf.repository.SeedStarterRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SeedStarterService {
    @Autowired
    private SeedStarterRepository seedstarterRepository;

    public List<SeedStarter> findAll() {
        return this.seedstarterRepository.findAll();
    }

    public void add(final SeedStarter seedStarter) {
        this.seedstarterRepository.add(seedStarter);
    }
}
