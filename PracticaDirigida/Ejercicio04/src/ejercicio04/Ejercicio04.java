package ejercicio04;

import javax.swing.JOptionPane;

/**
 *
 * @author alein
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos una array para los nombres y notas de las tres materias
        int i=0;
        Object[] name ={"","","","","","","","","",""};
        int[] nota1 = new int[10],nota2 = new int[10],nota3=new int[10];
        double[]promedio = new double[10];
        String message="";
        while (i<10) {
            name[i] = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
            nota1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nota 01"));
            nota2[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nota 02"));
            nota3[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nota 03"));
            promedio[i]= (double) (nota1[i] + nota2[i] + nota3[i]) /3;
            message="\nEl promedio de "+name[i]+" es "+promedio[i];
            i++;
        }
        JOptionPane.showInputDialog(null,message);
    }
    
}
