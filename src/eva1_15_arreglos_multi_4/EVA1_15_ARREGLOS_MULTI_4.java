/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_arreglos_multi_4;

import java.util.Scanner;

/**
 *
 * @author Evelyn
 */
public class EVA1_15_ARREGLOS_MULTI_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//ARREGLO PARA CAPTURAR GRUPOS
        // TODO code application logic here
        int[][] aiEdades;//NO ESPECIFICAMOS EL TAMAÑO, SERA SEGUN LO QUE ESPECIFIQUE EL USUARIO
        int iNoGrp, iNoAlu;//CANTIDAD DE GRUPOS, CANTIDAD DE ALUMNOS 
        Scanner scCaptu = new Scanner(System.in);//CAPTURA DEL TECLADO
        System.out.println("Indtroduce el numero de grupos: ");
        iNoGrp = scCaptu.nextInt();//EL NUMERO DE GRUPOS SON LAS FILAS DEL ARREGLO 
                                   //(MATRIZ)
        aiEdades = new int[iNoGrp][];//ASIGNACION DE FILAS
        //FOR PARA PREGUNTAR CADA GRUPO LA CANTIDAD DE ALUMNOS
        //for (int i = 0; i < iNoGrip; i++) {//AMBOS FOR SON VALIDOS 
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("Cuantos alumnos tiene el grupo " + (i) + ":");
            iNoAlu = scCaptu.nextInt();
            aiEdades[i]= new int[iNoAlu];//PARA CADA FILA, DEFINIMOS EL NUMERO DE COLUMNAS 
        }
        //CAPTURAR LAS EDADES:RECORREER EL ARREGLO
        for (int i = 0; i < aiEdades.length; i++) {//FILAS (GRUPOS)
            for (int j = 0; j < aiEdades[i].length; j++) {//ALUMNOS PARA EL PRUPO ACTUAL
                System.out.println("Cual es la edad Grupo " + i + " - Alumno " + j + "?");
                aiEdades[i][j] = scCaptu.nextInt();
            }
        }
        //IMPRIMIR LAS EDADES CAPTURADAS 
        for (int i = 0; i < aiEdades.length; i++) {//FILAS (GRUPOS)
            for (int j = 0; j < aiEdades[i].length; j++) {//ALUMNOS PARA EL PRUPO ACTUAL
                System.out.println("la edad de Grupo " + i + " - Alumno " + j + " es " + aiEdades[i][j]);
            }
        }
        //CACLULAR EL PROMEDIO DE EDADES
        int iAcum, iAcumTodos =0, iAcumNoAlum = 0;
         for (int i = 0; i < aiEdades.length; i++) {//FILAS (GRUPOS)
             iAcum=0;
             iAcumNoAlum = iAcumNoAlum + aiEdades[i].length;//CANTIDAD DE ALUMNOS
            for (int j = 0; j < aiEdades[i].length; j++) {//ALUMNOS PARA EL GRUPO ACTUAL
                iAcum = iAcum + aiEdades[i][j];
                iAcumTodos = iAcumTodos + aiEdades[i][j];
            }
            //SUMATORIA ENTRE EL NUMERO DE ALUMNOS EN EL GRUPO ACTUAL 
             System.out.println("El promedio para el grupo " + i + " = " + (iAcum / aiEdades[i].length));
        }
         System.out.println("El promedio de todos los grupos es: " + (iAcumTodos / iAcumNoAlum));
    }
    
}
