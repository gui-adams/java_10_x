package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {
        //Exemplo aqui é um NoArgs conscrutor Hokage hokageOne = new Hokage();
        Hokage hokageOne = new Hokage();
        hokageOne.nome = "Hashirima";
        hokageOne.idade = 32;
        hokageOne.vivoOuNao = false;

        Hokage hokageTwo = new Hokage("Tobirama Senju");
        System.out.println(hokageTwo.nome);

        Hokage hokagethree = new Hokage(hokageOne.idade);



    //All (geralmente o mais usado) Construtor com todos argumentos
        Hokage hokagefour = new Hokage("Namikaze", 32, true);
        System.out.println(hokagefour.nome + hokagefour.vivoOuNao);


}
}
//Constrctor é um Edo Tensei
//
/*
NoArgs Constructor = um construtor que vem vazio não necessariamente recebe argumento nenhum.
AllArgs Constructor = um construtor que é preenchido com todos os atributos da classe.

 */
