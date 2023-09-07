package pt02;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author alein
 */
public class PT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Leer 4 puntos en un plano cartesiano y determinar cuál punto de los 3 restantes es más cercano al
        primero.*/
        int i = 2;
        double x, y, xi, yi;
        double distancia, dMayor = 0, dMenor=10000000;
        String mensaje = "" , P1, Pi, pMayor = "", pMenor="", dAlmacenado = "";
        DecimalFormat f2d = new DecimalFormat("0.00");
        //Entrada de datos
        x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de X del punto 1",
                "Entrada de Datos", JOptionPane.QUESTION_MESSAGE));
        y=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de Y del punto 1 ",
                "Entrada de Datos", JOptionPane.QUESTION_MESSAGE));
        P1="P1 = ("+ x +" , " +y+ ")";
        //Proceso
        while (i<=4)
        {
            xi=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de X del punto " +i,
                    "Entrada de Datos", JOptionPane.QUESTION_MESSAGE));
            yi=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de Y del punto " +i,
                    "Entrada de Datos", JOptionPane.QUESTION_MESSAGE));
            Pi= "P"+i+ " = (" +xi+ " , " +yi+ ")";
            distancia=Math.sqrt(Math.pow(xi-x,2) + Math.pow(yi-y,2));
            dAlmacenado += "\nLa Distancia entre P1 y P"+i +" es: " +f2d.format(distancia);
            if (distancia > dMayor)
            {
                dMayor = distancia;
                pMayor= "P"+i;
            }
            if (distancia < dMenor) {
                dMenor = distancia;
                pMenor = "P" + i;
            }
            mensaje += Pi + "\n";
            i++;
        }
        //Salida

        JOptionPane.showMessageDialog(null, "Los puntos ingresados son: \n\n" +P1 + "\n" +mensaje +dAlmacenado + "\n\nEl punto más lejano con respecto a P1 es: \n" +pMayor+
                ", con una distancia de: " +f2d.format(dMayor) + "\n\nEl punto más cercano con respecto a P1 es: \n"  +pMenor+
                ", con una distancia de: " +f2d.format(dMenor),"Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
