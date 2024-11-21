package com.estacion.naves.controller;

import com.estacion.naves.model.NaveEspacial;
import com.estacion.naves.model.NaveLanzadera;
import com.estacion.naves.model.NaveNoTripulada;
import com.estacion.naves.model.NaveTripulada;
import com.estacion.naves.repository.NaveLanzaderaDao;
import com.estacion.naves.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador que permite gestionar peticiones desde el frontend. Este se encuentra
 * relacionado con el ciclo de vida de spring.
 *
 */

@RestController
@RequestMapping("/api/v1")
//@CrossOrigin(value = "http://18.216.7.85:8088/")
//@CrossOrigin(value = "http://localhost:4200/")
@CrossOrigin(value = "${sava.cors.origins}")
public class NaveEspacialController {

    @Autowired
    private NaveEspacialService naveEspacialService;

    @Autowired
    private NaveNoTripuladaService naveNoTripuladaService;

    @Autowired
    private NaveLanzaderaService naveLanzaderaService;

    @Autowired
    private NaveTripuladaService naveTripuladaService;

    /**
     * Método para verificar el estado de la api
     * @return mensaje que indica buen funcionamiento
     */
    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "Hello world 1 from backend";
    }

    /**
     * Método para obtener todas las listas
     * @return una lista con las naves.
     */
    @RequestMapping("/todasNaves")
    public List<NaveEspacial> obtenerTodo(){
        return naveEspacialService.obtenerTodasNaves();
    }

    /**
     * Método para obtener naves de tipo lanzadera
     * @return una lista con las naves
     */
    @GetMapping("/navesLanzaderas")
    public List<NaveLanzadera> obtenerNavesLanzadera(){
        return naveLanzaderaService.listarLanzaderas();
    }

    /**
     * Método para crear una nave lanzadera
     * @param naveLanzadera, objeto con los datos de la nave
     * @return la nave que se haya creado
     */
    @PostMapping("/CrearNaveLanzadera")
    public NaveLanzadera crearNaveLanzadera(@RequestBody NaveLanzadera naveLanzadera){
        return naveLanzaderaService.crearNaveLanzadera(naveLanzadera);
    }

    /**
     * Método para crear una nave no tripulada.
     * @param naveNoTripulada, se refiere al objeto para la nave no tripulada
     * @return la nave que se haya creado
     */
    @PostMapping("/CrearNaveNoTripulada")
    public NaveNoTripulada CrearNaveNoTripulada(@RequestBody NaveNoTripulada naveNoTripulada){
        return naveNoTripuladaService.crearNaveNoTripulada(naveNoTripulada);
    }

    /**
     * Permite realizar una búsqueda
     * @param valor, de tipo string con información para buscar.
     * @return las naves espaciales que hayan tenido el proceso de filtraje
     */
    @PostMapping("/search")
    public List<NaveEspacial> buscarPorCualquierColumna(@RequestBody String valor){
        return naveEspacialService.buscarPorCualquierColumna(valor);
    }

    @PostMapping("/CrearNaveTripulada")
    public NaveTripulada CrearNaveTripulada(@RequestBody NaveTripulada naveTripulada){
        return naveTripuladaService.crearNaveTripulada(naveTripulada);
    }
}
