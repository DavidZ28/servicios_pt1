package com.co.davila.user.user.service;

import java.util.Optional;
import com.co.davila.user.user.entity.Alumno;

public interface AlumnoService {

    public Iterable<Alumno> findAll();
    public Optional<Alumno> findById(Long id);
    public Alumno save(Alumno alumno);
    public void deleteById(Long id);

}