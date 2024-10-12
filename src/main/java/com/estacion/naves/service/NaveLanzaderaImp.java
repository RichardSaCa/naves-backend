package com.estacion.naves.service;

import com.estacion.naves.model.NaveEspacial;
import com.estacion.naves.model.NaveLanzadera;
import com.estacion.naves.repository.NaveLanzaderaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NaveLanzaderaImp implements NaveLanzaderaService{
    @Autowired
    private NaveLanzaderaDao naveLanzaderaDao;

    @Override
    public List<NaveLanzadera> listarLanzaderas() {
        return naveLanzaderaDao.findAll();
    }

    @Override
    @Transactional
    public NaveLanzadera crearNaveLanzadera(NaveLanzadera nave) {
        /**
         * Aplicando polimorfismo, separar espacio en memoria, para crear nueva nave tipo lanzadera
         */
        NaveLanzadera naveLanzadera = new NaveLanzadera();
        naveLanzadera = nave;

        return naveLanzaderaDao.save(naveLanzadera);
    }
}
