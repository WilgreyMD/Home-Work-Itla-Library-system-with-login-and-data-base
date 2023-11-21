
package com.logLibros;

import java.util.ArrayList;

public class ObjetoInventario {
    
    private String nombre;
    private String descripcion;
    private String genero;
    private String autor;
    private String fechaDeLanzamiento;
    public static ArrayList<ObjetoInventario> Almacen = new ArrayList();
    
    public ObjetoInventario(String nombre, String descripcion, String genero, String autor, String fechaDeLanzamiento) {
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.autor = autor;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        Almacen.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(String fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    
}
