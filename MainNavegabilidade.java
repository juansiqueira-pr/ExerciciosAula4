package Navegabilidade;

public class MainNavegabilidade {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("João");
        Bancaria conta = new Bancaria(777, cliente);

        conta.visualizarDados();
    }
}