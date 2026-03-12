package Navegabilidade;

public class Bancaria {

    private int numero;
    private Cliente cliente;

    public Bancaria(int numero, Cliente cliente) {
        this.cliente = cliente;
        this.numero = numero;

    }

    public void visualizarDados() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Conta: " + numero);

    }
}