package com.proyectoprogamacion.proyecto.dao;

import com.proyectoprogamacion.proyecto.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

private EntityManager entityManager;

@Repository
@Transactional

public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM usuario";
        return entityManager .createQuery(query).getResultList();

    }
}

public void main() {
}
