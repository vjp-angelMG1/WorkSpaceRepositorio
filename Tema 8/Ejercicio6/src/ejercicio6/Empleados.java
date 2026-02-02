/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author USUARIO
 */
public class Empleados {
     //Constante para facilitar la gestión de las horas bases.
    private final static int HORASBASE=40;
    //Atributos
    private String nombre;
    private int horas;
    private int tarifa;
    //Cosntructor predeterminado
    public Empleados() {
        nombre="";
        horas=0;
        tarifa=0;
    }
    //COnstructor parametrizado
    public Empleados (String nombre, int horas, int tarifa ){
        this.nombre=nombre;
        this.horas=horas;
        this.tarifa=tarifa;
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
    
    //Mostrar
    public void mostrar(){
        System.out.println("Mostrando el empleado: ");
        System.out.println(nombre+ "\n"+
                "Horas trabajadas: "+ horas+ "\n"+
                "Tarifa: " +tarifa);
    }
    
    //Método de la clase para calcular el suelo bruto.
    public void calcularSueldoBruto(){
        
        int horasExtra=0;
        double tarifaExtendida= tarifa*1.5;
        
        double total=0;
        
        if(horas<HORASBASE){
            total=horas*tarifa;
        }
        if(horas>HORASBASE){
            total=HORASBASE*tarifa;
            horasExtra=horas-HORASBASE;
            total+=(horasExtra*tarifaExtendida);
        }
        
        System.out.println("El sueldo Bruto es: " + total);
    }
    
    
    
}

