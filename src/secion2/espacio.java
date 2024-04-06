/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secion2;

import secion2.abstracciones.elemento;

/**
 *
 * @author Estudiante
 */
public class espacio extends elemento{

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public espacio(int nivel, int tiempo) {
        super(nivel);
        this.tiempo = tiempo;
    }
    private int tiempo;
    private int ambiente ;
}
