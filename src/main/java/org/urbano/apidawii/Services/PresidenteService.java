package org.urbano.apidawii.Services;

import org.springframework.stereotype.Repository;
import org.urbano.apidawii.Models.Presidente;

import java.util.List;

public interface PresidenteService {
    List<Presidente> getAll();
}
