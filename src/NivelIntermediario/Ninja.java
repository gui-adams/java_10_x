package NivelIntermediario;
// Uma classe é como um MOLDE que serve para criar objetos.
// Por exemplo: o molde da garrafa, o molde do vaso, ou o "Adão que cria Eva".
// A partir dessa classe, podemos criar vários ninjas (Naruto, Sasuke, Kakashi...).


public class Ninja {
    // Estes são os ATRIBUTOS (ou características) do ninja.
    // Pense neles como informações que cada ninja vai ter.
    String nome;
    String aldeia;
    int idade;
    String missao;
    String statusMissao;
    String nivelDificuldade;

    //️ Metodo, que usa retorno.
    // 'public String' significa que o metodo vai DEVOLVER um texto (String).
    // Esse texto pode ser guardado em uma variável ou mostrado na tela.
    public String EuSouUmNinja() {
        // 'return' é o comando que devolve algo para quem chamou o metodo.
        return "Olá, Eu sou um ninja!";
    }
    //Metodo Int vai ter que retornar um int
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}

//Só não precisa do return quando o metodo é void
