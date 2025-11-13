package NivelIntermediario.Construtores;

public class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;


    /*
     Em Java, o construtor é um metodo especial usado para criar objetos.
     Ele é executado automaticamente sempre que usamos "new" para invocar a classe.

     Analogia com Naruto:

     Imagine que você é o Orochimaru tentando invocar um Hokage (Edo Tensei).
     Existem duas formas de fazer isso:

     1. NoArgs = Invocar o Hokage sem consciência — um corpo vazio, sem memória.
        Isso é o construtor vazio (NoArgs Constructor), como o Naruto Clássico:

     2. Construtor passando com argumento (String nome) Edo tensei incompleto com o Kabuto
     controlando uma outra habilidade. Ou seja aqui é passado 1 argumento por vez.

    3. AllArgs =  Invocar o Hokage com alma, chakra e consciência completa.
        Isso é o construtor com argumentos (Constructor com todos os parâmetros),
        Orochimaru invoca os hokages na grande guerra ninja tal eles com poderes completo
    */

    // Construtor vazio — cria um Hokage “sem alma”, com dados indefinidos.
    public Hokage() {
        // Este construtor é chamado automaticamente quando usamos "new Hokage()".
        // Exemplo:
        // Hokage hashirama = new Hokage();
        //
        // Depois, você pode configurar os dados manualmente:
        // hashirama.nome = "Hashirama Senju";
    }

    // Construtor com argumento (String nome)
    // Cria um Hokage já com o nome definido no momento da invocação.
    // É como invocar o Hokage só com habilidade de jogar kunai
    public Hokage(String nome) {
        this.nome = nome;
        // O "this" serve para diferenciar o atributo da classe (this.nome)
        // do parâmetro recebido (nome).
        //
        // Analogia:
        // O "this" é como o chakra que conecta o Naruto aos seus clones na Guerra Ninja.
        // Cada clone (objeto) é criado a partir do mesmo “molde” (classe),
        // mas tem sua própria energia e identidade.
    }
    // Construtor com argumento (String nome)

    public Hokage (int idade){
        this.idade = idade;
    }

    //All (geralmente o mais usado) Construtor com todos argumentos
    public Hokage (String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao =vivoOuNao;
    }

    // Ao apertar Ctrl + N ou alt + insert é possivel criar o construtor completo para não ter que precisar digitar tudo
    // alt + insert
    //All (geralmente o mais usado) Construtor com todos argumentos
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
