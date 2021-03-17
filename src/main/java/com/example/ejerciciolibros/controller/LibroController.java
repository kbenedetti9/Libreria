package com.example.ejerciciolibros.controller;

import java.util.List;
import com.example.ejerciciolibros.model.Libro;
import com.example.ejerciciolibros.service.LibroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping(value = "/agregar-libro")
    public void agregar_libro(@RequestBody Libro libroNuevo) {
        libroService.agregar_libro(libroNuevo);
    }

    @GetMapping(value = "/listar-libros")
    public List<Libro> listar_libros() {
        return libroService.listar_libros();
    }

    @PutMapping(value = "/modificar-libro")
    public Libro modificar_libro(@RequestBody Libro libroModificado) {
        return libroService.modificar_libro(libroModificado);
    }

    @DeleteMapping(value = "/eliminar-libro")
    public void eliminar_libro(@RequestParam Integer id) {
        libroService.eliminar_libro(id);
    }

    @GetMapping(value = "/listar-libros-tema")
    public List<Libro> listar_libros_tema(@RequestParam String tema) {
        return libroService.listar_libros_tema(tema);
    }

    @GetMapping(value = "/listar-libros-autor")
    public List<Libro> listar_libros_autor(@RequestParam String autor) {
        return libroService.listar_libros_autor(autor);
    }

}
