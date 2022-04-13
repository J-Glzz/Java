package semana1.practicaPOO;

public class Carro {
    // Características - Campos
    public int puertas;
    public int numeroRuedas;
    public int numeroPasajeros;
    public double velocidad;
    public String modoManejo;
    public String color;
    public String marca;

    // Métodos Getters
    public int getPuertas(){
        return puertas;
    }
    public int getNumeroPasajeros(){
        return numeroPasajeros;
    }
    public int getNumeroRuedas(){
        return numeroRuedas;
    }
    public double getVelocidad(){
        return velocidad;
    }
    public String getModoManejo(){
        return modoManejo;
    }
    public String getColor(){
        return color;
    }
    public String getMarca(){
        return marca;
    }

    // Métodos Setters
    public boolean setPuertas(int puertas){
        if(puertas > 0){
            this.puertas = puertas;
            return true;
        }else
            return false;
    }
    public boolean setNumeroPasajeros(int numeroPasajeros){
        if (numeroPasajeros > 0){
            this.numeroPasajeros = numeroPasajeros;
            return true;
        }else
            return false;
    }
    public boolean setNumeroRuedas(int numeroRuedas){
        if(numeroRuedas > 0){
            this.numeroRuedas = numeroRuedas;
            return true;
        }else
            return false;
    }
    public boolean setVelocidad(double velocidad){
        if (velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        }else
            return false;
    }
    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }else
            return false;
    }
    public boolean setModoManejo(String modoManejo){
        if(!modoManejo.isEmpty()){
            this.modoManejo = modoManejo;
            return true;
        }else
            return false;
    }
    public boolean setMarca(String marca){
        if(!marca.isEmpty()){
            this.marca = marca;
            return true;
        }else
            return false;
    }
}
