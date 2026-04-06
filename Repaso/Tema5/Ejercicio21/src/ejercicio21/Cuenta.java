/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21;

/**
 * *• Ejercicio 21.- Añade al ejercicio anterior una nueva clase llamada
CuentaClave. Esta clase será una subclase de Cuenta y tendrá las
siguientes características:
• Incluirá un nuevo dato miembro llamado clave.
• Sobrescribirá el método extraer(), de modo que sólo permita la extracción si
hay saldo suficiente, sino no hará nada.
• En cuanto al funcionamiento del programa será igual que en el caso
anterior, sólo que al elegir las opciones 1 y 2 para la creación de la
cuenta, se pedirá también al usuario la clave que se le quiere asociar.
• No se enviará ningún tipo de aviso al usuario si se intenta sacar más
dinero del que se dispone.
* 
 * @author Angel
 */
public class Cuenta {
    
        //ATRIBUTOS
        private float saldo;
        //CONSTRUCTORES
        //por defecto

        public Cuenta() {
            this.saldo = 0;
        }
        //parametrizado

        public Cuenta(float saldo) {
            this.saldo = saldo;
        }
        //Getters y Setters

        public float getSaldo() {
            return saldo;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }
        //metodos 

        public void ingresar(float dinero) {
            this.saldo += dinero;
        }

        public void extraer(float dinero) {
            this.saldo -= dinero;
        }

        public void mostrar() {
            System.out.println("dinero" + this.saldo);
        }

        @Override
        public String toString() {
            return "Cuenta{" + "saldo=" + saldo + '}';
        }

    }

