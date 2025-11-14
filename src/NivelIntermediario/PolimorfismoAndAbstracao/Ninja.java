package NivelIntermediario.PolimorfismoAndAbstracao;

public abstract class Ninja implements Estrategia {
    String nome;
    String aldeia;
    int idade;

//metodo geral! todos os ninjas vão ter
public void habilidadeEspecial() {
    System.out.println("Meu nome é " + nome + " e esse é minha" +
            "habilidade especial");
}

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estrategia de batalha");

    }
}