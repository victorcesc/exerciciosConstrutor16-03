package poo;

public class Principal {


    public static void main(String[] args) {

        Retangulo r = new Retangulo(3,2);
        Retangulo s = new Retangulo();
        System.out.println(r.desenharRetangulo("ASCII"));
        System.out.println(s.desenharRetangulo("ASCII"));
        System.out.println(r.desenharRetangulo("UTF8"));

    }
}
