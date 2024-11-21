package com.estacion.naves.service;

import com.estacion.naves.model.NaveNoTripulada;
import com.estacion.naves.repository.NaveNoTripuladaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaveNoTripuladaServiceImp implements NaveNoTripuladaService {

    @Autowired
    private NaveNoTripuladaDao naveNoTripuladaDao;

    @Override
    public NaveNoTripulada crearNaveNoTripulada(NaveNoTripulada nave) {
        NaveNoTripulada naveNoTripulada = new NaveNoTripulada();
        naveNoTripulada = nave;
        return naveNoTripuladaDao.save(naveNoTripulada);
    }
}
