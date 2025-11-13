package NivelIntermediario.ClassesAbstradasXInterfaces;

/*
CLASSE ABSTRATA = Modelo base do ninja.

Analogias de Naruto:
- Pense na classe abstrata como a *Academia Ninja de Konoha*.
- Todo ninja passa pela academia e aprende o básico (tacar kunai, shuriken…)
- A Academia define o que TODO ninja tem/é.
- MAS: cada ninja terá sua própria técnica especial → método abstrato.

Regras importantes:
- Classe abstrata PODE ter atributos normais.
- PODE ter métodos concretos (com corpo).
- PODE ter métodos abstratos (sem corpo).
- PODE ter construtor.
- NÃO pode ser instanciada diretamente.
*/

public abstract class Ninja {

    // Atributos comuns a todos os ninjas
    String nome;
    String aldeia;
    int idade;

    /*
     Metodo CONCRETO (com corpo)
     Todos os ninjas sabem jogar kunai.
     */
    public void tacarKunai() {
        System.out.println(nome + " lançou uma kunai!");
    }

    /*
     Metodo ABSTRATO (SEM corpo)
     CHAVE: cada ninja é obrigado a implementar esse método.
     Como cada ninja tem uma técnica especial diferente,
     deixamos essa responsabilidade para as subclasses.
     */
    public abstract void poderEspecial();
}
