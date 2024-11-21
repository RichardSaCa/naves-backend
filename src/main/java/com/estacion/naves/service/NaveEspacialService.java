package com.estacion.naves.service;

import com.estacion.naves.model.NaveEspacial;
import org.hibernate.dialect.function.NvlCoalesceEmulation;

import java.util.List;

/**
 * Esta interfaz muestra abstracciones para Nave espacial
 */
public interface NaveEspacialService {

    public List<NaveEspacial> obtenerTodasNaves();

    public List<NaveEspacial> buscarPorCualquierColumna(String valor);
}
