/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05;

/**
 *
 * @author alumno
 */
public class Bicicleta {

    // 1. ATRIBUTOS
    // 1.1. MODIFICADORES DE ACCESO
    int ruedas; //friendly -> MAL
    protected String manillar; //MAL
    public String pedales; //MAL
    private String frenos; //BIEN
    private boolean estaPedaleando;
    // 1.2. ATRIBUTO STATIC (ESTÁTICO) QUE PERTENECE A LA CLASE
    private static int numBicicletas = 0;
    
    // 1.3. ATRIBUTO DE OTRA CLASE (Composición de clases)
    private Ciclista ciclista;
    
    // 2. CONSTRUCTORES
    // 2.1. Por defecto
    public Bicicleta() {
        this.ruedas = 0;
        this.pedales = "";
        this.manillar = "";
        this.frenos = "";
        this.estaPedaleando = false;
        
        // 1.2. Incrementamos el valor del atributo estatico
        incrementarNumBicicletas();
        
        // 1.3. ¡IMPORTANTE! Inicializamos un ciclista por defecto (con el constructor por defecto)
        this.ciclista = new Ciclista();
    }  
    
    // 2.2. Parametrizado
    public Bicicleta(int ruedas, String manillar, String pedales, String frenos, boolean estaPedaleando, Ciclista ciclista) {
        this.ruedas = ruedas;
        this.manillar = manillar;
        this.pedales = pedales;
        this.frenos = frenos;
        this.estaPedaleando = estaPedaleando;
    
        // 1.2 . Incrementamos el valor del atributo estático
        incrementarNumBicicletas();
        
        // 1.3. Inicializamos un ciclista con los valores pasados por parámetro
        this.ciclista = ciclista;
    }
    
    // 3. GETTERS Y SETTERS
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setManillar(String manillar) {
        this.manillar = manillar;
    }

    public String getManillar() {
        return this.manillar;
    }

    public void setPedales(String pedales) {
        this.pedales = pedales;
    }
    public String getPedales() {
        return this.pedales;
    }
    
    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }
    public String getFrenos(){
        return this.frenos;
    }
    
    public void setEstaPedaleando(boolean estaPedaleando) {
        this.estaPedaleando = estaPedaleando;
    }
    
    public boolean getEstaPedaleando() {
       return this.estaPedaleando; 
    } 
    
    // 1.3. Áñadimos el get y set de Ciclista
    public Ciclista getCiclista() {
        return this.ciclista;
    }
    
    public void setCiclista(Ciclista ciclista) {
        this.ciclista = ciclista;
    }
    
    
    /**
        * Método estático que devuelve
        * el número de bicicletas instanciadas (creadas).
        * 
        * Es un método estático porque numBicicletas
        * es estático.
        * 
        * @return el número de bicicletas creadas.
        */
    public static int getNumBicicletas(){
        return numBicicletas;
        
        //return this.numBicicletas; // MAL porque this hace referencia al objeto,
                                     // pero numBicicletas pertenece a la clase
    }
    
    
    //5. MÉTODOS
    /**
     * Método estático que incrementa en 1 
     * el número de numBicicletas.
     * 
     * Es un método estático porque pertenece a la clase,
     * no al objeto.
     * 
     * Como pertenece a la clase y no al objeto, 
     * no usamos this, ya que this hace referencia al objeto.
     */
    private static void incrementarNumBicicletas(){
        numBicicletas++;
    }
    
    // 4. TO STRING
    
    @Override
    public String toString() {
        return "Esta bicleta tiene " + this.ruedas + " ruedas" 
                + ", un manillar " + this.manillar 
                + ", unos pedales " + this.pedales
                + ", unos frenos " + this.frenos
                + " y ahora ¿se está pedaleando? " + this.estaPedaleando +
                
                // 1.3. Imprimimos la información del ciclista
                // (coge el mensaje de ciclista.toString()
                this.ciclista.toString();
    }
}
