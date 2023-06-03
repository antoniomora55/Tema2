package TDA;

import javax.swing.JOptionPane;

public class Tools {
         public static int seguirSino(){
       
return JOptionPane.showConfirmDialog(null,"¿Estas seguro?",
        "continuar",JOptionPane.YES_NO_OPTION);
    }
      public static float leerFloat(String msje)
    {
        return (Float.parseFloat(JOptionPane.showInputDialog(null,msje,JOptionPane.INFORMATION_MESSAGE)));
    }
      public static int leerEntero(String msje)
    {
        return (Integer.parseInt(JOptionPane.showInputDialog(null,msje,JOptionPane.INFORMATION_MESSAGE)));
    }
      
          public static void imprimepantalla(String msje)
    {
       JOptionPane.showMessageDialog(null,msje,"salida",JOptionPane.INFORMATION_MESSAGE);
    }
     public static String  leerString(String msje){
         
             return JOptionPane.showInputDialog(null, msje, JOptionPane.INFORMATION_MESSAGE);
         
     }
}
