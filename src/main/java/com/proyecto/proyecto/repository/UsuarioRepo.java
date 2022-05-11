package com.proyecto.proyecto.repository;

import com.proyecto.proyecto.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario,Long> {
}
