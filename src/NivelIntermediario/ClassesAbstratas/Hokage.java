package NivelIntermediario.ClassesAbstratas;

// Ela define os atributos e as regras gerais, mas não pode ser usada diretamente.

// Em termos de Naruto, pense na "vontade do fogo" —
// uma filosofia herdada, mas que precisa ser manifestada

// Ou seja: "Hokage" é a ideia, não a pessoa.
// Cada novo Hokage (classe filha) herda essa base e a expressa à sua maneira.

public abstract class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    // mas cada um decide como cumpri-la.

    // Pense nisso como o "jutsu supremo" que cada Hokage manifesta de forma diferente.
    // Hashirama usa Mokuton, Minato usa o Hiraishin, Naruto usa o Rasengan shiriken.
    // Esse metodo é obrigatório para as subclasses, mas o corpo (a forma de agir)
    // será definido por cada Hokage.
    public abstract void sabedoriaHokage();

    // Construtor vazio — pode ser usado por subclasses que vão preencher depois.
    public Hokage() {
    }

    // Construtor completo (AllArgs)
    // Serve para criar o Hokage já com todos os atributos definidos.
    public Hokage(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
