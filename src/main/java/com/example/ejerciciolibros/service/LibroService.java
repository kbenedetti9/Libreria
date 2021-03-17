package com.example.ejerciciolibros.service;

import java.util.List;

import com.example.ejerciciolibros.model.Libro;
import com.example.ejerciciolibros.repo.ILibroDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class LibroService {

    @Autowired
    private ILibroDao libroDao;

    public List<Libro> listar_libros() {
        return libroDao.findAll();
    }

    public void agregar_libro(@RequestBody Libro libroNuevo) {
        libroDao.save(libroNuevo);
    }

    public Libro modificar_libro(@RequestBody Libro libroModificado) {
        return libroDao.save(libroModificado);
    }

    public void eliminar_libro(@RequestParam Integer id) {
        libroDao.deleteById(id);
    }

    public List<Libro> listar_libros_tema(@RequestParam String tema) {
        return libroDao.findByTema(tema);
    }

    public List<Libro> listar_libros_autor(@RequestParam String autor) {
        return libroDao.findByAutor(autor);
    }
}