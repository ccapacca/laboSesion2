/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secion2.abstracciones;

/**
 *
 * @author Estudiante
 */
public class personaje  extends elemento{
    private int vida;
    
    public personaje(){}
    
    public personaje(int vida,int nivel){
        super(nivel);
        this.vida = vida;
    }
    
 

    public int getVida() {
        return vida;
    }

    public void setVIda(int vida) {
        this.vida = vida;
    }

}
