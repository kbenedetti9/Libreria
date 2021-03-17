package com.example.ejerciciolibros.repo;

import java.util.List;

import com.example.ejerciciolibros.model.Libro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroDao extends JpaRepository<Libro, Integer> {

    public List<Libro> findByAutor(String autor);

    public List<Libro> findByTema(String tema);

}
