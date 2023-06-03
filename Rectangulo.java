
package TDA;

public class Rectangulo {
    float largo;
    float ancho;

    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public Rectangulo() {
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    //Metodos
    public float calcularAreaRectangulo(){
        
        return (largo*ancho);
        
    }
    
    public float calcularPerimetroRectangulo(){
        
        return (largo*2+ancho*2);
        
    }
        
       
        
}
