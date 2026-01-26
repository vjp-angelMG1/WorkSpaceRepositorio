/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author Angel
 */
public class Ejercicio19 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];//Crear un vector de 100 posiciones
        
        rellenarVector(vector);
        mayorValor(vector);
        menorValor(vector);
        masRepetidos(vector);
        media(vector);
    }
    
    //Metodo que rellena el vector con números aleatorios entre 10 y 80
    public static void rellenarVector(int [] vector){
        for(int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 71) + 10;
        }
    }
    
    //Metodo que busca y muestra el mayor valor del vector
    public static void mayorValor(int [] vector){
        int mayor = vector[0];
        for(int i = 0; i < vector.length; i++){
            if(vector[i] > mayor){
                mayor = vector[i];
            }
        }
        System.out.println("El mayor de todos es: " + mayor);
    }
    
    //Metodo que busca y muestra el menor valor del vector
    public static void menorValor(int [] vector){
        int menor = vector[0];
        for(int i = 0; i < vector.length; i++){
            if(vector[i] < menor){
                menor = vector[i];
            }
        }
        System.out.println("El menor de todos es: " + menor);
    }
    
    //Metodo que determina que valor aparece más veces en el vector
    public static void masRepetidos(int [] vector){
        int rep = vector[0];
        int maxRep = 0;
        
        for(int i = 0; i < vector.length; i++){
            int contador = 0;
            
            for(int j = 0; j < vector.length; j++){
                if(vector[i] == vector[j]){
                    contador++;
                }
            }
            
            //Actualizar si encontramos un valor con más repeticiones
            if(contador > maxRep){
                maxRep = contador;
                rep = vector[i];
            }
        }
        System.out.println("Valor mas repetido: " + rep);
    }
    
    //Metodo que calcula y muestra la media de todos los valores del vector
    public static void media(int [] vector){
        int suma = 0;
        for(int i = 0; i < vector.length; i++){
            suma += vector[i];
        }
        double media = (double)suma / vector.length;
        System.out.println("La media total es: " + media);
    }
}


