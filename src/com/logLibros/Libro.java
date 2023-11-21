/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.logLibros;

/**
 *
 * @author wilgrey-MD
 */
public class Libro extends ObjetoInventario {
    
    public Libro(String nombre, String descripcion, String genero, String autor, String fechaDeLanzamiento) {
        super(nombre, descripcion, genero, autor, fechaDeLanzamiento);
        Almacen.add(this);
    }
    
    
}
