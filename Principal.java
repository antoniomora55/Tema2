/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;
import EntradaSalida.Tools;import java.io.BufferedWriter;
import java.io.FileWriter;import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author ITO
 */
public class Principal {
    public static void main(String[] args) {
       
        Principal.CapturaObjetos();
Libros libro1=new Libros("poo", 0, 0, "jose");
    

    }
    public static void CapturaObjetos(){
        Libros libro2=new Libros();
        String listado="";
        char opcion = 's';
       do{
           Autor libro = new Autor();
       libro.setNombre(Tools.leerString(listado));
       libro.setApellido(Tools.leerString2(listado));
       
       listado+="\n"+"Datos capturasdos:\n"+libro.toString();
       }while(opcion=='s');
       Tools.imprimepantalla("autor"+listado+"");
    }
}
