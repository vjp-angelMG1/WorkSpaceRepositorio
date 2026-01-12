/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author alumno
 */
public class Mamifero  {
    
    //ATRIBUTOS
    private String nombre;
    private String sexo;
    private String color;
    private int edad ;
    //CONSTRUCTORES
    //por defecto
    public Mamifero(){
    
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad = 0;
   
    }
   //parametrizado
   public Mamifero(String nombre, String sexo, String color, int edad){
        this.nombre ="";
        this.sexo = "";
        this.color = "";
        this.edad = 0;
   
   }
   //Getters/Setters
   public String GetNombre(){
       return nombre;
   }
   
   public void SetNombre(String nombre){
       this.nombre = nombre;
   }
   
   public String GetSexo() {
       return sexo;
   }
   
   public void SetSexo(String sexo) {
       this.sexo = sexo;
   }
   
   public String GetColor() {
       return color;
   }
   public void SetColor(String color) {
       this.color = color;
   }
   public int Getedad(){
       return edad;
   }   
   
   public void Setedad(){
       this.edad = edad;
   }
   //Mostrar cadena de principales caracteristicas
   @Override
   public String toString(){
       return this.nombre + "es" + this.sexo + "color"+ this.color + "edad" + this.edad; 
   }
   
 }
    
    
    
    
    

