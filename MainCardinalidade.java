package Cardinalidade;

public class MainCardinalidade {

    public static void main(String[] args) {

        Empresa emp = new Empresa("");

        emp.addFuncionario(new Funcionario("Maria"));
        emp.addFuncionario(new Funcionario("Gabriela"));

        emp.listFuncionarios();
    }
}