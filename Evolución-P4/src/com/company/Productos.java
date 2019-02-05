package com.company;

public class Productos {
    private String nombre;
    private int codigo;
    private Double precio;

    public Productos(String f,int c, Double p)
    {
        this.nombre=f;
        this.codigo =c;
        this.precio=p;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public Double getPrecio() {
        return this.precio;
    }
}


