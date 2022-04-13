package semana1.practicaPOO;

public class Pruebas{
    public static void main(String[] args)
    {

        defC();
        defM();
    }
    public static void defC(){
        Carro nissanSentra = new Carro();
        nissanSentra.setMarca("Nissan");
        nissanSentra.setPuertas(5);
        nissanSentra.setNumeroRuedas(4);
        nissanSentra.setNumeroPasajeros(5);
        nissanSentra.setColor("Blanco");
        nissanSentra.setModoManejo("Estándar");
        nissanSentra.setVelocidad(210.99);

        String msj = "Tu carro es de la marca: " + nissanSentra.getMarca();
        msj += "\nNúmero de llantas: " + nissanSentra.getNumeroRuedas();
        msj += "\nColor: " + nissanSentra.getColor();
        msj += "\nNumero de puertas: " + nissanSentra.getPuertas();
        msj += "\nCaja: " + nissanSentra.getModoManejo();
        msj += "\nNúmero máximo de pasajeros: " + nissanSentra.getNumeroPasajeros();
        msj += "\nVelocidad máxima: " + nissanSentra.getVelocidad() + "\n";

        System.out.print(msj);
    }
    public static void defM(){
        Moto newMoto = new Moto(2, 150, "Yamaha", "Blanco", "Deportiva");
        System.out.println(newMoto.getMarca());
        System.out.println(newMoto.getCilindraje());
        System.out.println(newMoto.getNumeroRuedas());
        System.out.println(newMoto.getTipoDeMoto());
        System.out.println(newMoto.getColor());
    }
}
