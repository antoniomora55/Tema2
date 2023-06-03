/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author CXO Dell
 */
public class Triangulo {
    float cateto1;
    float cateto2;

    public Triangulo(float cateto1, float cateto2) {
        this.cateto1=cateto1;
        this.cateto2=cateto2;
    }

    public Triangulo() {
    }

    public float getCateto1() {
        return cateto1;
    }

    public void setCateto1(float cateto1) {
        this.cateto1 = cateto1;
    }

    public float getCateto2() {
        return cateto2;
    }

    public void setCateto2(float cateto2) {
        this.cateto2 = cateto2;
    }

 
    
  public float calcularHipotenusa(){
      
        return (float) Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
      
  } 
}
