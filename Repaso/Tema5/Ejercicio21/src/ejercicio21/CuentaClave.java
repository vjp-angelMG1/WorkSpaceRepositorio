/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio21;

/**
 * *• Ejercicio 21.- Añade al ejercicio anterior una nueva clase llamada
 * CuentaClave. Esta clase será una subclase de Cuenta y tendrá las siguientes
 * características: • Incluirá un nuevo dato miembro llamado clave. •
 * Sobrescribirá el método extraer(), de modo que sólo permita la extracción si
 * hay saldo suficiente, sino no hará nada. • En cuanto al funcionamiento del
 * programa será igual que en el caso anterior, sólo que al elegir las opciones
 * 1 y 2 para la creación de la cuenta, se pedirá también al usuario la clave
 * que se le quiere asociar. • No se enviará ningún tipo de aviso al usuario si
 * se intenta sacar más dinero del que se dispone.
 *
 * @author Ángel
 */
public class CuentaClave extends Cuenta { //creo cuentaClave siendo herencia de cuenta
        //atributos
        private int clave;
        //CONSTRUCTORES
        //por defecto
        public CuentaClave() {
            super();
            this.clave = 0;
        }
        //parametrizado
        public CuentaClave(float saldo, int clave) {
            super(saldo);
            this.clave = clave;
        }

        public CuentaClave(float saldo) {
            super(saldo);
            this.clave = 0;
        }
        //getters y setters
        public int getClave() {
            return clave;
        }

        public void setClave(int clave) {
            this.clave = clave;
        }
        //metodo mostrar
        public void mostrar() {
            mostrarCuenta();
            System.out.println("Clave: " + this.clave);
        }
        
        @Override
        public void extraer(float cantidad) {
            if (getSaldo() >= cantidad) {
                setSaldo(getSaldo() - cantidad);
            }
        }
    }
