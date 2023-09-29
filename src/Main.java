
public class Main {
    public static void main(String[] args) {

    Elevador elevador = new Elevador(6,11);
    elevador.entrar();
    elevador.subir();
    elevador.subir();
    elevador.subir();
    elevador.entrar();
    elevador.entrar();
    elevador.entrar();
    elevador.descer();
    elevador.sair();
    elevador.sair();
    elevador.subir();
    elevador.subir();
    elevador.subir();
    elevador.entrar();
    elevador.subir();
    elevador.entrar();
    elevador.descer();
    elevador.descer();
    elevador.sair();
    elevador.subir();

    System.out.println(elevador.toString());


    Elevador elevador2 = new Elevador(4,4);
        elevador2.entrar();
        elevador2.subir();
        elevador2.subir();
        elevador2.subir();
        elevador2.entrar();
        elevador2.entrar();
        elevador2.entrar();
        elevador2.descer();
        elevador2.sair();
        elevador2.sair();
        elevador2.subir();
        elevador2.subir();
        elevador2.subir();
        elevador2.entrar();
        elevador2.subir();
        elevador2.entrar();
        elevador2.descer();
        elevador2.descer();
        elevador2.sair();
        elevador2.subir();

        System.out.println(elevador2.toString());

    }
}
