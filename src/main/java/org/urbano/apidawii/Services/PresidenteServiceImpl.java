package org.urbano.apidawii.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.urbano.apidawii.Models.Presidente;
import org.urbano.apidawii.Repositories.PresidenteRepository;

import java.util.List;

@Service
public class PresidenteServiceImpl implements PresidenteService{

    @Autowired
    private PresidenteRepository repository;

    @Override
    public List<Presidente> getAll() {
        return repository.findAll();
    }
}
