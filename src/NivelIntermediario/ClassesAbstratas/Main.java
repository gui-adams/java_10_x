package NivelIntermediario.ClassesAbstratas;

// Em Naruto, não dá pra "invocar" o espírito do Hokage diretamente.
// Você precisa de uma herança — um novo Hokage que represente essa vontade.
// O mesmo acontece com classes abstratas: elas não podem ser instanciadas,
// apenas herdadas e concretizadas.

public class Main {
    public static void main(String[] args) {
        // Aqui criamos um Hokage da linhagem Senju — Hashirama.
        // Repare que criamos o objeto "Senju", e não "Hokage",
        // pois a classe Hokage é abstrata e não pode ser instanciada diretamente.
        Senju Hashirama = new Senju();
        Hashirama.nome = "Hashirama Senju";
        Hashirama.idade = 45;

        // Agora chamamos o metodo abstrato implementado dentro da subclasse.
        // O que antes era uma "ideia abstrata" (sabedoriaHokage),
        // agora se torna uma ação concreta (mensagem do Hashirama).
        Hashirama.sabedoriaHokage();

        // Moral: cada Hokage carrega a mesma base, mas manifesta seu poder de forma única.
        // A classe abstrata garante a padronização (todos têm sabedoria),
        // enquanto as subclasses trazem individualidade (como expressam essa sabedoria).
    }
}

