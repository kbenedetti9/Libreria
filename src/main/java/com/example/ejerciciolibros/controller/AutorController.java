package com.example.ejerciciolibros.controller;

import java.util.List;

import com.example.ejerciciolibros.model.Autor;
import com.example.ejerciciolibros.service.AutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/autor")
public class AutorController {
    
    @Autowired
    private AutorService autorService;

    @PostMapping(value = "/agregar-autor")
    public void agregar_autor(@RequestBody Autor autorNuevo) {
        autorService.agregar_autor(autorNuevo);
    }

    @GetMapping(value = "/listar-autores")
    public List<Autor> listar_autores() {
        return autorService.listar_autores();
    }

    @DeleteMapping(value = "/eliminar-autor")
    public void eliminar_autor(@RequestParam Integer id) {
        autorService.eliminar_autor(id);
    }

    @GetMapping(value = "/listar-autor-experiencia")
    public List<Autor> listar_autores_experiencia(@RequestParam Integer experiencia) {
        return autorService.listar_autores_experiencia(experiencia);
    }

    @PutMapping(value = "/modificar-autor")
    public Autor modificar_autor(@RequestBody Autor autorModificado) {
        return autorService.modificar_autor(autorModificado);
    }
}
