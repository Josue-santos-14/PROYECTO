package com.proyectoprogamacion.proyecto.controllers;

import com.proyectoprogamacion.proyecto.dao.UsuarioDao;
import com.proyectoprogamacion.proyecto.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Fredy");
        usuario.setApellido("Silvestre");
        usuario.setEmail("josue34886121@gmail.com");
        usuario.setTelefono("34886121");
        return usuario;
    }


    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Fredy");
        usuario.setApellido("Silvestre");
        usuario.setEmail("josue34886121@gmail.com");
        usuario.setTelefono("34886121");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Fredy");
        usuario.setApellido("Silvestre");
        usuario.setEmail("josue34886121@gmail.com");
        usuario.setTelefono("34886121");
        return usuario;

    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Fredy");
        usuario.setApellido("Silvestre");
        usuario.setEmail("josue34886121@gmail.com");
        usuario.setTelefono("34886121");
        return usuario;

    }
}