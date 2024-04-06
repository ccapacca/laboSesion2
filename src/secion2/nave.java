/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secion2;

import secion2.abstracciones.personaje;

/**
 *
 * @author Estudiante
 */
public class nave extends personaje{
    
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
    public nave(int vidas, int tipo, int nivel) {
        super(nivel, vidas);
        this.tipo = tipo;
    }
    
     public nave(){ }
    
     private int tipo;
}
