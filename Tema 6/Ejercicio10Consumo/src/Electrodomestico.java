/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Electrodomestico implements ConsumoEnergetico {
    //Atributos
    private float kwh;
    private float precioKwh;
    private String eficiencia;
    
    //Constructores
    public Electrodomestico(){
        kwh = 0;
        precioKwh = 0;
        eficiencia = ""; 
    }
    
    public Electrodomestico(float kwh, float precioKwh, String eficiencia){
        this.kwh = kwh;
        this.precioKwh = precioKwh;
        this.eficiencia = eficiencia;
    }
    
    //Getters/Setters
    public float getKwh() {
        return kwh;
    }
    
    public void setKwh(float kwh) {
        this.kwh = kwh;
    }
    
    public float getPrecioKwh() {
        return precioKwh;
    }
    
    public void setPrecioKwh(float precioKwh) {
        this.precioKwh = precioKwh;
    }
    
    public String getEficiencia(){
        return eficiencia;
    }
    
    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    //Mostrar
    public void mostrarDatos(float horasDeUso) {
        System.out.println("--ELECTRODOMESTICO--");
        System.out.println("Consumo por hora: " + kwh + "kWh");
        System.out.println("Precio por kWh: " + precioKwh + "euros");
        System.out.println("Eficiencia energetica: " + eficiencia);
        System.out.println("Horas de uso: " + horasDeUso);
        System.out.println("Consumo total: " + calcularConsumo(horasDeUso) + " kWh");
        System.out.println("Factura total: " + calcularFactura(horasDeUso) + "euros\n");
    }
    
    //Calcular el consumo total en kWh las horas de uso y el factor de eficiencia
    @Override
    public float calcularConsumo(float horasDeUso) {
        return horasDeUso * kwh * obtenerFactorEficiencia();
    }
    
    //Calcular el coste total de la factura en euros
    @Override
    public float calcularFactura(float horasDeUso){
        return calcularConsumo(horasDeUso) * precioKwh;
    }
    
    //Método auxiliar para obtener el factor de eficiencia
    private float obtenerFactorEficiencia(){
        switch (eficiencia) {
            case "A++" -> {
                return 0.5f;//Se devuelve si es A++
            }
            case "A+" -> {
                return 0.7f;//Se devuelve si es A+
            }
            case "A" -> {
                return 1.0f;//Se devuelve si es A
            }
            case "B" -> {
                return 1.2f;//Se devuelve si es B
            }
            default -> {
                return 1.0f; //Por defecto, eficiencia normal
            }
        }
    }
    @Override
    public String toString(){
        return "Kilovatios hora" + kwh + "precio Kwh" + precioKwh + "eficiencia" + eficiencia;
    }
}
