package NivelIntermediario;
// Esta classe representa o personagem Boruto.
// Ela está herdando (extends) tudo o que existe dentro da classe Uzumaki
// e, ao mesmo tempo, implementa (implements) uma interface chamada HyugaUzumaki.
public class Boruto extends Uzumaki implements HyugaUzumaki {

    // Este metodo representa uma "ação" exclusiva do Boruto (e dos HyugaUzumaki).
    // Ele foi definido dentro da interface HyugaUzumaki, então a classe Boruto é
    // obrigada a implementar (criar) esse metodo — por isso o comentário:
    // "É preciso pegar todos os métodos dentro da Interface."
    public void modoBesta() {
        System.out.println("Modo Besta de cauda ativado! Eu sou um Hyuga Uzumaki");
    }

    // Metodo 2: ativarJougan()
    // Interfaces funcionam como "contratos": toda classe que as implementa precisa cumprir o contrato
    public void ativarJougan() {
        System.out.println("Jougan ativado com sucesso! Eu sou um Hyuga Uzumaki");
    }
}
