/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author CXO Dell
 */
public class Circulo {
    float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public float calcularAreaCirculo(){
        
        return (float) (Math.PI * Math.pow(radio, radio));
        
    }
    public float calcularPerimetroCirculo(){
        
        return (2*radio*(float)Math.PI);
        
    }
}
