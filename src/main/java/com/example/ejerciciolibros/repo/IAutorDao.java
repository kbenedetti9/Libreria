package com.example.ejerciciolibros.repo;

import java.util.List;

import com.example.ejerciciolibros.model.Autor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutorDao extends JpaRepository<Autor, Integer> {

    public List<Autor> findByExperiencia(Integer experiencia);

}
