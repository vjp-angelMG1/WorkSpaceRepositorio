/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 * * *• Ejercicio 25.- Realiza un programa en JAVA que constará de las siguientes clases:
Ordenador, Servidor (hereda de Ordenador), Portátil (hereda de Ordenador) y Test
contiene el metodo main y otros métodos estáticos.
• La superclase Ordenador contiene los siguientes atributos: cantidad de memoria
RAM, capacidad del disco duro, modelo de procesador, modelo de tarjeta gráfica y
precio. A la hora de que el usuario cree un objeto, en la clase Test, deberemos
controlar que la capacidad del disco duro sea múltiplo de 5, el modelo de
procesador lo permitirá elegir entre una lista, y el precio siempre sea mayor que 0.
• La subclase Servidor contiene los siguientes atributos: tamaño del monitor,
modelo de teclado y modelo de ratón. A la hora de que el usuario cree un objeto,
en la clase Test, deberemos controlar que el tamaño del monitor sea mayor que 14.
(en caso de que el usuario no lo cumpla deberemos volvérselo a pedir, tantas veces
como sea necesario.)
* • La subclase Portátil contiene los siguientes atributos: marca, tamaño de
pantalla y peso.
• La clase Test contendrá los métodos estáticos necesarios para controlar
que el usuario introduzca los datos correctos. Además, contiene el
método main donde se crearán 2 objetos de la clase Servidor y 2 de la
clase Portátil mediante un constructor que reciba los parámetros.
También se crearán 1 objetos de la clase Servidor y 1 de la clase Portátil
mediante el constructor por defecto, por lo que necesitarás llamar
posteriormente a los métodos “establecer…” para asignar los valores que
te indique el usuario a los atributos del objeto.
• Por último, muestra los datos de los 6 objetos creados.
 * @author Angel
 */
public class Portatil extends Ordenador{
    
    //ATRIBUTOS
    private String marca;
    private int tamanioDeLaPantalla;
    private int peso;
    
    //CONSTRUCTORES
    //por defecto
    public Portatil(){
        super();
        this.marca = "";
        this.tamanioDeLaPantalla = 0;
        this.peso = 0;
    }
    //parametrizado
    public Portatil(int cantidadDeMemoria,String ram,String capacidadDeDiscoDuro,String modeloDeProcesador,String modeloDeTarjetaGrafica,Double precio,String marca,int tamanioDeLaPantalla,int peso){
        
        super(cantidadDeMemoria, ram, capacidadDeDiscoDuro,modeloDeProcesador, modeloDeTarjetaGrafica, precio);
        this.marca = marca;
        this.tamanioDeLaPantalla = tamanioDeLaPantalla;
        this.peso = peso;         
    }
    //Getters y Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanioDeLaPantalla() {
        return tamanioDeLaPantalla;
    }

    public void setTamanioDeLaPantalla(int tamanioDeLaPantalla) {
        this.tamanioDeLaPantalla = tamanioDeLaPantalla;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    //metodo mostrar
    public void mostrarPortatil(){
        mostrarOrdenador();
        System.out.println("Marca :"+this.marca);
        System.out.println("Tamaño de la pantalla :"+this.tamanioDeLaPantalla);
        System.out.println("Peso :"+this.peso);    
    }
    //metodo ToString
    @Override
    public String toString() {
        return super.toString()+". Portatil{" + "marca=" + marca + ", tamanioDeLaPantalla=" + tamanioDeLaPantalla + ", peso=" + peso + '}';
    }
    
}
