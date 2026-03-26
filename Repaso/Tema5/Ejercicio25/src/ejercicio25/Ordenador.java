/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio25;

/**
 * *• Ejercicio 25.- Realiza un programa en JAVA que constará de las siguientes clases:
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
* 
 * @author Angel
 */
public class Ordenador {
    //ATRIBUTOS
    private int cantidadDeMemoria;
    private String ram;
    private String capacidadDeDiscoDuro;
    private String modeloDeProcesador;
    private String modeloDeTarjetaGrafica;
    private Double precio;
    //CONSTRUCTORES 
    //por defecto
    public Ordenador(){
        this.cantidadDeMemoria = 0;
        this.ram = "";
        this.capacidadDeDiscoDuro = "";
        this.modeloDeProcesador = "";
        this.modeloDeTarjetaGrafica = "";
        this.precio = 0.0;
    }
    //parametrizado
    public Ordenador(int cantidadDeMemoria,String ram,String capacidadDeDiscoDuro,String modeloDeProcesador,String modeloDeTarjetaGrafica,Double precio){
        this.cantidadDeMemoria = cantidadDeMemoria;
        this.ram = ram;
        this.capacidadDeDiscoDuro = capacidadDeDiscoDuro;
        this.modeloDeProcesador = modeloDeProcesador;
        this.modeloDeTarjetaGrafica = modeloDeTarjetaGrafica;
        this.precio = precio;
    }
    //Getters y Setters
    public int getCantidadDeMemoria() {
        return cantidadDeMemoria;
    }

    public void setCantidadDeMemoria(int cantidadDeMemoria) {
        this.cantidadDeMemoria = cantidadDeMemoria;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCapacidadDeDiscoDuro() {
        return capacidadDeDiscoDuro;
    }

    public void setCapacidadDeDiscoDuro(String capacidadDeDiscoDuro) {
        this.capacidadDeDiscoDuro = capacidadDeDiscoDuro;
    }

    public String getModeloDeProcesador() {
        return modeloDeProcesador;
    }

    public void setModeloDeProcesador(String modeloDeProcesador) {
        this.modeloDeProcesador = modeloDeProcesador;
    }

    public String getModeloDeTarjetaGrafica() {
        return modeloDeTarjetaGrafica;
    }

    public void setModeloDeTarjetaGrafica(String modeloDeTarjetaGrafica) {
        this.modeloDeTarjetaGrafica = modeloDeTarjetaGrafica;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    //Metodo mostrar
    public void mostrarOrdenador(){
        System.out.println("Cantidad de memoria :"+this.cantidadDeMemoria);
        System.out.println("Ram :"+this.ram);
        System.out.println("Capacidad de Disco Duro :"+this.capacidadDeDiscoDuro);
        System.out.println("Modelo de procesador :"+this.modeloDeProcesador);
        System.out.println("Modelo de tarjeta gráfica :"+this.modeloDeTarjetaGrafica);
        System.out.println("Precio :"+this.precio);
    }

    //metodo ToString
    @Override
    public String toString() {
        return "Ordenador{" + "cantidadDeMemoria=" + cantidadDeMemoria + ", ram=" + ram + ", capacidadDeDiscoDuro=" + capacidadDeDiscoDuro + ", modeloDeProcesador=" + modeloDeProcesador + ", modeloDeTarjetaGrafica=" + modeloDeTarjetaGrafica + ", precio=" + precio + '}';
    }
}
