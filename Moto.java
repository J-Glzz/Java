package semana1.practicaPOO;
/*
OVERLOAD = Sobrecarga
OVERRIDE = Redefine
OVERWRITE = Sobreescribe
El objetivo es que el programa sea modular, en pocas palabras
que el programa tengo un bajo nivel de acoplamiento y un alto nivel
de cohesión. Entonces para que quede más claro, debe relacionarse poco
(bajo acoplamiento) y hacer solo una cosa de manera correcta (alta cohesión).
*/
public class Moto {
    private int numeroRuedas;
    private String marca;
    private String color;
    private String tipoDeMoto;
    private int cilindraje;

    // Overload (sobrecarga constructor)
    public Moto(int i, int i1, String yamaha, String s){ }
    public Moto(int numeroRuedas){
        this.numeroRuedas = numeroRuedas;
    }
    public Moto(int numeroRuedas, int cilindraje){
        this.numeroRuedas = numeroRuedas;
        this.cilindraje = cilindraje;
    }
    public Moto(int numeroRuedas, int cilindraje, String marca){
        this.numeroRuedas = numeroRuedas;
        this.cilindraje = cilindraje;
        this.marca = marca;
    }
    public Moto(int numeroRuedas, int cilindraje, String marca, String color, String tipoDeMoto){
        this.numeroRuedas = numeroRuedas;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.color = color;
        this.tipoDeMoto = tipoDeMoto;
    }

    // Métodos Getters
    public int getNumeroRuedas(){
        return numeroRuedas;
    }
    public int getCilindraje(){
        return cilindraje;
    }
    public String getMarca(){
        return marca;
    }
    public String getColor(){
        return color;
    }
    public String getTipoDeMoto(){
        return tipoDeMoto;
    }
}
