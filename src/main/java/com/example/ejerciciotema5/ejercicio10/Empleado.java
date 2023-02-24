package com.example.ejerciciotema5.ejercicio10;

public class Empleado {

//Crear objeto empleado con nombre,número de empleado y número de la seguridad social
    private String nombre;
    private int numEmpleado;
    private int numSeguridadSocial;

    public Empleado(String nombre, int numEmpleado, int numSeguridadSocial) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.numSeguridadSocial = numSeguridadSocial;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public int getNumSeguridadSocial() {
        return numSeguridadSocial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public void setNumSeguridadSocial(int numSeguridadSocial) {
        this.numSeguridadSocial = numSeguridadSocial;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", numEmpleado=" + numEmpleado +
                ", numSeguridadSocial=" + numSeguridadSocial +
                '}';
    }
}
