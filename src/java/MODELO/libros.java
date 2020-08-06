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
public class libros {
    private int idlibro;
    private String nombre;
    private int año;
    private int paginas;
    private int costo;
    private String tipo;
    private String estado;
    public libros(){
        
    }

    public libros(int idlibro, String nombre, int año, int paginas, int costo, String tipo, String estado) {
        this.idlibro = idlibro;
        this.nombre = nombre;
        this.año = año;
        this.paginas = paginas;
        this.costo = costo;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getCosto() {
        return costo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}