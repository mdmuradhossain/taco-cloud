package io.murad.tacos.service;

import io.murad.tacos.model.Taco;
import io.murad.tacos.repository.TacoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TacoService {

    @Autowired
    private TacoRepository tacoRepository;

    public void save(Taco design) {
        tacoRepository.save(design);
    }
}
