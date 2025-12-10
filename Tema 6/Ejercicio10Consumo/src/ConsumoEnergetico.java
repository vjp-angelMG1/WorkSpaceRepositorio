/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public interface ConsumoEnergetico { //Interface consumo energetico
    public float calcularConsumo(float horasDeUso); //Método abstracto que calcula el consumo en funcion de las horas utilizadas
    public float calcularFactura(float horasDeUso); //Método abstracto que calcula el coste total de la factura en funcion de las horas 
}
