package Unaria;

public class MainUnaria {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Vinícios");
        Pessoa p2 = new Pessoa("Gabriel");

        p1.addAmigo(p2);

        p1.mostAmigo();
    }
}