package Cardinalidade;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listFuncionarios() {

        System.out.println("Os funcionários são: " + nome );

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome());
        }
    }
}