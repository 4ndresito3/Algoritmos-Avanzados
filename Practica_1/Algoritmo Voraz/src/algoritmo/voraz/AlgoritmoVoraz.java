/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo.voraz;
/**
 *
 * @author Andrés Korotkov Vorobey y Jesus Perez Madera
 */
public class AlgoritmoVoraz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] tiempos = {6,2,3,4,5,1};
         int procesadores = 2;
         //System.out.println(tareas(tiempos, procesadores));
         tiempos = insertSort(tiempos);
         for(int i = 0; i < tiempos.length; i++){
             System.out.println(tiempos[i]);
         }
    }
    /*
    
    */
    public static int tareas(int[] ts, int n){
         int[] tsaux = new int[ts.length];
         tsaux = insertSort(tsaux);
         int[] tiempoProcesadores = new int[n];
         int tiempoTotal = 0;
         for(int i = 0; i<tsaux.length;i++){
             int procesador = i%n;
             tiempoProcesadores[procesador] +=tsaux[i];
             tiempoTotal += tiempoProcesadores[procesador];
         }
         return tiempoTotal;
    }
    public static int[] insertSort(int[] ts){
         int longitud = ts.length;
         for (int i=0; i < ts.length; i++){
             int tarea = ts[i];
             int j = i-1;
             while(j >= 0 && ts[j] > tarea){
                 ts[j+1] = ts[j];
                 j--;
             }
             ts[j+1] = tarea;
         }
         return ts;
    }
    
}
