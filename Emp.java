package semana1.practicaPOO;
/*
* Aquí se anda utilizando herencia multi - nivel, porque se está haciendo la clase Emp, Programador y Web
* Si fuera herencia simple solo contaría con la clase Emp (padre) y la clase Programador (hereda Emp)
* Y la herencia jerárquica es porque se tiene la clase Emp, clase Programador y clase Web
* PARA MÁS ENTENDIMIENTO
* HERENCIA SIMPLE: EMP -> PROGRAMADOR
* HERENCIA MULTI - NIVEL: EMP -> PROGRAMADOR -> WEB
* HERENCIA JERÁRQUICA: EMP -> PROGRAMADOR o EMP -> WEB
* */
public class Emp {
    double salario = 40000;
}
class Programador  extends  Emp{
    int bono = 5000;

    public void main(){
        Programador Julio = new Programador();
        System.out.println("El salario del programador es: " + Julio.salario);
        System.out.println("El bono del programador es: " + Julio.bono);
    }
    void mensaje(){
        System.out.println("Soy programador");
        main();
    }
}
class Web extends Programador{
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }
}
