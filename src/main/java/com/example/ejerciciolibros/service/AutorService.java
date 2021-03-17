package com.example.ejerciciolibros.service;

import java.util.List;

import com.example.ejerciciolibros.model.Autor;
import com.example.ejerciciolibros.repo.IAutorDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class AutorService {

    @Autowired
    private IAutorDao autorDao;

    public void agregar_autor(@RequestBody Autor autorNuevo) {
        autorDao.save(autorNuevo);
    }

    public List<Autor> listar_autores() {
        return autorDao.findAll();
    }

    public void eliminar_autor(@RequestParam Integer id) {
        autorDao.deleteById(id);
    }

    public List<Autor> listar_autores_experiencia(@RequestParam Integer experiencia) {
        return autorDao.findByExperiencia(experiencia);
    }

    public Autor modificar_autor(@RequestBody Autor autorModificado) {
        return autorDao.save(autorModificado);
    }
}
