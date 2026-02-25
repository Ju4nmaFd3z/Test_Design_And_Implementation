package com.ejemplo.demo.ejercicio1;

public class ServicioLogin {
    private RepositorioUsuarios repositorio;
    
    public ServicioLogin(RepositorioUsuarios repositorio) {
        this.repositorio = repositorio;
    }
    
    public boolean login(String email) {
        return repositorio.existeUsuario(email);
    }
}