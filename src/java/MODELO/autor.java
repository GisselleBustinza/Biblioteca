/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author gisselle
 */
public class autor {
    private int idautor;
    private String nombre;
    private int DNI;
    private int ventas;
    private String fechadenacimiento;
    private String nacionalidad;
    private String estado;
    public autor(){
        
    }

    public autor(int idautor, String nombre, int DNI, int ventas, String fechadenacimiento, String nacionalidad, String estado) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.DNI = DNI;
        this.ventas = ventas;
        this.fechadenacimiento = fechadenacimiento;
        this.nacionalidad = nacionalidad;
        this.estado = estado;
    }

    public int getIdautor() {
        return idautor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public int getVentas() {
        return ventas;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}