package com.estacion.naves.service;

import com.estacion.naves.model.NaveTripulada;
import com.estacion.naves.repository.NaveTripuladaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaveTripuladaServiceImp implements NaveTripuladaService {

    @Autowired
    private NaveTripuladaDao naveTripuladaDao;

    /**
     * Este método permite guardar una nave tripulada
     * @param nave, este es el objeto para guardar la nave.
     * @return, permite retornar el objeto que se ha creado.
     */
    @Override
    public NaveTripulada crearNaveTripulada(NaveTripulada nave) {
        return naveTripuladaDao.save(nave);
    }
}
