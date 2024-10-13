package com.estacion.naves.controller;

import com.estacion.naves.model.NaveEspacial;
import com.estacion.naves.model.NaveLanzadera;
import com.estacion.naves.repository.NaveLanzaderaDao;
import com.estacion.naves.service.NaveEspacialService;
import com.estacion.naves.service.NaveEspacialServiceImp;
import com.estacion.naves.service.NaveLanzaderaImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://172.31.36.246:8088/")
public class NaveEspacialController {

    @Autowired
    private NaveEspacialServiceImp naveEspacialService;

    @Autowired
    private NaveLanzaderaImp naveLanzaderaImp;

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "Hello world 1 from backend";
    }

    @RequestMapping("/todasNaves")
    public List<NaveEspacial> obtenerTodo(){
        return naveEspacialService.obtenerTodasNaves();
    }

    @GetMapping("/navesLanzaderas")
    public List<NaveLanzadera> obtenerNavesLanzadera(){
        return naveLanzaderaImp.listarLanzaderas();
    }

    @PostMapping("/CrearNaveLanzadera")
    public NaveLanzadera crearNaveLanzadera(@RequestBody NaveLanzadera naveLanzadera){
        return naveLanzaderaImp.crearNaveLanzadera(naveLanzadera);
    }

}
