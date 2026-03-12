package Multipla;

public class MainMultipla {

    public static void main(String[] args) {

        Professor p = new Professor("Daniel");
        Disciplina d = new Disciplina("da matéria de Matemática", p);
        Estudante e = new Estudante("Gabriel");

        e.estudar(d);
    }
}