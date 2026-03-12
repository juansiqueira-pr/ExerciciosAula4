package Multipla;

public class Estudante {

    private String nome;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public void estudar(Disciplina disciplina) {
        System.out.println(nome + " é aluno " +
                disciplina.getNome() +
                " do professor " +
                disciplina.getProfessor().getNome());
    }
}