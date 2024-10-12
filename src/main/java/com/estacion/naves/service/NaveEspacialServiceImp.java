package com.estacion.naves.service;

import com.estacion.naves.model.NaveEspacial;
import com.estacion.naves.repository.NaveEspacialDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio que implementa la interfaz con abstracciones de NaveEspacial
 */
@Service
public class NaveEspacialServiceImp implements  NaveEspacialService{

    @Autowired
    public NaveEspacialDao naveEspacialDao;

    /**
     * Sobre escritura del método
     * @return
     */
    @Override
    public List<NaveEspacial> obtenerTodasNaves(){
        return naveEspacialDao.findAll();
    }
}
