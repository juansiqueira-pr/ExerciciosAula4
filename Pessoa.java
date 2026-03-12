package Unaria;

public class Pessoa {

    private String nome;
    private Pessoa amigo;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void addAmigo(Pessoa amigo) {
        this.amigo = amigo;
    }

    public void mostAmigo() {
        if (amigo != null) {
            System.out.println(nome + " é amigo o de " + amigo.nome);
        } else {
            System.out.println(nome + " não tem amigo.");
        }
    }
}