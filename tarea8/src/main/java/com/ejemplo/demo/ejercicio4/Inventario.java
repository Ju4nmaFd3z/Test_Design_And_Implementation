package com.ejemplo.demo.ejercicio4;

public class Inventario {
    private RepositorioInventario repositorio;
    
    public Inventario(RepositorioInventario repositorio) {
        this.repositorio = repositorio;
    }
    
    public boolean eliminarProducto(String idProducto) {
        if (repositorio.existeProducto(idProducto)) {
            repositorio.eliminarProducto(idProducto);
            return true;
        }
        return false;
    }
    
    public boolean contineProducto(String idProducto) {
        return repositorio.existeProducto(idProducto);
    }
}