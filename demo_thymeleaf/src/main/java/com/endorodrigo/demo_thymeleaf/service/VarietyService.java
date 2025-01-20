package com.endorodrigo.demo_thymeleaf.service;

import com.endorodrigo.demo_thymeleaf.model.Variety;
import com.endorodrigo.demo_thymeleaf.repository.VarietyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class VarietyService {

    @Autowired
    private VarietyRepository varietyRepository;

    public List<Variety> findAll() {
        return this.varietyRepository.findAll();
    }

    public Optional<Variety> findById(Long id) {
        return this.varietyRepository.findById(id);
    }

}
