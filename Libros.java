/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

/**
 *
 * @author ITO
 */
public class Libros {
    //atributos
    String titulo;
    int ISBN;
    int NumPaginas;
    private Autor autorLibro;

    public Libros(String titulo, int ISBN, int NumPaginas, String autorLibro) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.NumPaginas = NumPaginas;
        this.autorLibro=autorLibro;
    }

    public Libros() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int NumPaginas) {
        this.NumPaginas = NumPaginas;
    }

    public Autor getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(Autor autorLibro) {
        this.autorLibro = autorLibro;
    }


   
    
}
