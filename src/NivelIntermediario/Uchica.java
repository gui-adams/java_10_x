package NivelIntermediario;
//aqui essa classe está extendo o classe ninja(No caso a Classe ninja teve um filho chamado Uchica formando a herença)
public class Uchica extends Ninja{
    // Abaixo é um MeTODO, que é como uma "ação" que o ninja pode fazer.
    // Exemplo: atacar, correr, ativar o Sharingan, etc.
    // 'public' significa que esse metodo pode ser usado de qualquer lugar.
    // 'void' significa que o metodo NÃO devolve nenhum resultado — só executa algo.

    String habilidadeEspecialUchica;
    public void habilidadeEspecial() {
        System.out.println("Habilidade Especial " + habilidadeEspecialUchica);
    }

    public void mostrarInformcoes(){
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("idade: " + idade);
        System.out.println("A Missão: " + missao);
        System.out.println("O Status da missão é: " + statusMissao);
        System.out.println("O nível da dificuldade é: " + nivelDificuldade);
        System.out.println("Habilidade Especial " + habilidadeEspecialUchica);


    }
}
