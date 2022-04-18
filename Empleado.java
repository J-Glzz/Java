package semana1.practicaPOO;
/*
* AquÍ se está utilizando el redefinir o mejor dicho OVERRIDE
*/
class Persona{
    int edad;
    String nombre;
    int id;
    Persona(int edad, String nombre, int id){
        this.edad = edad;
        this.nombre = nombre;
        this.id = id;
    }
}

public class Empleado extends Persona{
    double salario;
    String empresa;
    Empleado(int edad, String nombre, int id, double salario, String empresa){
        super(edad, nombre, id);
        this.empresa = empresa;
        this.salario = salario;
    }
    void showEmpleado(){
        System.out.println(id + " " + " " + nombre + " " + edad + " " + empresa + " " + salario);
    }
}

class testPersonaEmpleado{
    public static void main(String[] args) {
        Empleado e = new Empleado(25, "Julio", 1997, 3000, "Sybil");
        e.showEmpleado();
    }
}
