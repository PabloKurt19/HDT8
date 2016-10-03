/* 	Universidad del Valle de Guatemala
 *  Algoritmos y Estructura de Datos
 *  	Pedro Antonio Garcia Morales 15409
 *  	Pablo Alejandro Ortiz Barillas 15533
 *  	Hoja de Trabajo 8. 
 *  
*/

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.PriorityQueue;

public class main {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	// Ruta del documento a leer y objetos varios
        File pacientes = new File("C:\\Users\\usuario1\\Desktop\\Nueva carpeta\\HDT8\\src\\pacientes.txt");
        VectorHeap V_Heap = new VectorHeap();
        PriorityQueue<Paciente> P_Queue = new PriorityQueue();
        Paciente paciente;
        String [] atributos;
        
        /**
         * 
         * Try-catch para leer el documento 
         */
        try{
            BufferedReader br = new BufferedReader(new FileReader(pacientes));
            System.out.println("Lista original:");
            System.out.println("");
            
            /**
             * 
             * Try-catch para imprimir todos los pacientes del documento
             * Agregar los pacientes al vector de VectorHeap y a PriorityQueue
             */
            try {
                for(String line; (line = br.readLine()) != null;){
                    System.out.println("   "+line);
                    atributos = line.split(",");
                    paciente = new Paciente(atributos[0],atributos[1],atributos[2]);
                    V_Heap.add(paciente);
                    P_Queue.add(paciente);
                }
            }
            catch(IOException ex) {
            	System.out.println("No se encuentra el documento");
            }
            
            System.out.println("");
            System.out.println("Lista de pacientes (VectorHeap):");
            System.out.println("");
            
            /**
             * 
             * Obtiene el tamano del vector de VectorHeap, imprime los pacientes en orden de urgencia
             */
            int x = V_Heap.size();
            while(x !=0){
                System.out.println("   "+V_Heap.remove().toString());
		    x--;
            }
            
            System.out.println("");
            System.out.println("Lista de pacientes (PriorityQueue):");
            System.out.println("");
            
            /**
             * 
             * Obtiene el tamano PriorityQueue, imprime los pacientes en orden de urgencia
             */
            int y = P_Queue.size();
            while(y !=0){
                System.out.println("   "+P_Queue.remove().toString());
		    y--;
            }
        }
        catch(FileNotFoundException ex) {
        	System.out.println("No se encuentra el documento");
        }
    }
}