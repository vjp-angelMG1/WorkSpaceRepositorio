/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio22;

/**
 *• Ejercicio 22.- Desarrolle a un programa en JAVA en el que se creen 3
 * objetos. Cada objeto contiene como atributos el nombre de un producto de una
 * tienda de mascotas, su precio y su stock. • Utiliza un constructor para
 * establecer el nombre de cada producto, su precio y su stock. Establécelos tú
 * al crear el objeto, no hace falta que se los pidas al usuario. • Realiza un
 * método en el que le muestre al usuario un menú para que elija que producto
 * comprar y luego le pregunte cuantas unidades desea de él. Luego se le
 * preguntará si desea comprar otro producto o salir. Por último se le mostrará
 * el importe total de la compra. • Actualiza el valor del stock de un producto
 * cuando el usuario lo compre. En caso de que el usuario pida más unidades de
 * las que quedan se le avisará por pantalla del error, se le comunicarán las
 * unidades restantes y le volverá a mostrar el menú para que elija un producto.
 * Para ello, necesitarás un método para comprobar el stock, que devolverá true
 * o false en función de si hay o no hay stock suficiente.
 *
 * -- Bienvenido a mi Tienda de Mascotas – Pulse 1 para comprar Peces cuyo
 * precio es de 10 euros y el stock es de 40 unidades. Pulse 2 para comprar
 * Tortugas cuyo precio es de 4 euros y el stock es de 8 unidades. Pulse 3 para
 * comprar Canarios cuyo precio es de 15 euros y el stock es de 4 unidades. 1 Ha
 * elegido comprar Peces. ¿Cuántas unidades desea? 6 Venta Realizada con éxito.
 * ¿Desea comprar otro producto? si Pulse 1 para comprar Peces cuyo precio es de
 * 10 euros y el stock es de 34 unidades. Pulse 2 para comprar Tortugas cuyo
 * precio es de 4 euros y el stock es de 8 unidades. Pulse 3 para comprar
 * Canarios cuyo precio es de 15 euros y el stock es de 4 unidades. 2 Ha elegido
 * comprar Tortugas. ¿Cuántas unidades desea? 50 Lo sentimos, solo tenemos
 * disponibles 8 unidades. ¿Desea comprar otro producto? si Pulse 1 para comprar
 * Peces cuyo precio es de 10 euros y el stock es de 34 unidades. Pulse 2 para
 * comprar Tortugas cuyo precio es de 4 euros y el stock es de 8 unidades. Pulse
 * 3 para comprar Canarios cuyo precio es de 15 euros y el stock es de 4
 * unidades. 3 Ha elegido comprar Tortugas. ¿Cuántas unidades desea? 8 Venta
 * Realizada con éxito. ¿Desea comprar otro producto? no El total de su compra
 * asciende a 92 Euros. Muchas gracias. Vuelva cuando quiera
 * 
 * @author Angel
 */
public class Producto {
    //ATRIBUTOS
    private String fechaCaducidad;
    private int numeroLote;
    private String nombre;
    private float precio;
    private int stock;

    //CONSTRUCTORES
    //por defecto
    public Producto(){
        this.fechaCaducidad = "";
        this.numeroLote = 0;
        this.nombre = "";
        this.precio = 0;
        this.stock = 0;
    }
    //Parametrizado 
    public Producto(String fCaducidad, int numLote, String nombre, float precio, int stock) {
        this.fechaCaducidad = fCaducidad;
        this.numeroLote = numLote;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }        
    //constructores complementarios
        public Producto(String fCaducidad, int numLote) {
        this.fechaCaducidad = fCaducidad;
        this.numeroLote = numLote;
    }

    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //GETTERS Y SETTERS
    public String getfCaducidad() {
        return fechaCaducidad;
    }

    public void setfCaducidad(String fCaducidad) {
        this.fechaCaducidad = fCaducidad;
    }

    public int getNumLote() {
        return numeroLote;
    }

    public void setNumLote(int numLote) {
        this.numeroLote = numLote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    //metodo mostrar
    public void mostrar(){
        System.out.println("Fecha de Caducidad"+this.fechaCaducidad);
        System.out.println("Numero de lote"+this.numeroLote);
        System.out.println("Nombre"+this.nombre);
        System.out.println("Precio"+this.precio);
        System.out.println("Stock"+this.stock);
        
    }
    // metodo ToString
    @Override
    public String toString() {
        return "Producto{" + "fCaducidad=" + fechaCaducidad + ", numLote=" + numeroLote + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
}

