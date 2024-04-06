/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secion2.entidades;
import secion2.abstracciones.personaje;
/**
 *
 * @author Estudiante
 */
public class enemigo extends personaje{

    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
    public enemigo(int vidas, int tipo, int nivel) {
        super(nivel, vidas);
        this.tipo = tipo;
    }
    
     public enemigo(){ }
    
     private int tipo;
}