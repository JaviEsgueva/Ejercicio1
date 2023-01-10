/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1_tema4;

/**
 *
 * @author esgsanja
 */
public class votacion {
    private String nombre;
    private Integer votos;

    public votacion() {
        
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "votacion{" + "nombre=" + nombre + ", votos=" + votos + '}';
    }
    
    
}
