
package TDA;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
public class Cuadrado {
    //Mora Ramirez Jose Antonio
       private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }
  public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
//Metodos
public int calcularAreaCuadrado(){
return (int)(Math.pow(lado, 2));
}
public int calcularPerimetroCuadrado(){
return (int)(Math.pow(lado, 4));
}
}
