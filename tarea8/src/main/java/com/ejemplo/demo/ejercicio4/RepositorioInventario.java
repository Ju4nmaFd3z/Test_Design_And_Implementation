package com.ejemplo.demo.ejercicio4;

public interface RepositorioInventario {
    boolean existeProducto(String idProducto);
    void eliminarProducto(String idProducto);
}