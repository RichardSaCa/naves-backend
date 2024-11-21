package com.estacion.naves.service;

import com.estacion.naves.model.NaveEspacial;
import com.estacion.naves.repository.NaveEspacialDao;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
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

    @Override
    public List<NaveEspacial> buscarPorCualquierColumna(String valor) {
//        String jsonString = valor;
//        JSONObject jsonObject = new JSONObject(jsonString);
//        // Extraer el valor del campo "valor"
//        String valor1 = jsonObject.getString("valor");
        if(valor.equals("all")){
            return naveEspacialDao.findAll();
        }
        return naveEspacialDao.buscarPorCualquierColumna(valor);
    }
}
