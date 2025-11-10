package NivelFacil.IfEElse;

public class IfEElse {
    public static void main(String[] args) {
        /*
        if e Else = Condições
        Objetivo: passar o ninja de nível de acordo com o numero de missoes
         */
        //Ninja Naruto
        String nome = "Naruto";
        int idade = 19;
        boolean hokage = false;
        short numeroDeMissoes = 11;
        boolean clan = true;

        /*
          if ( condicao) { resultado }
          else if ( condicao) { resultado }
          else { resultado caso nada seja verdadeiro }
          */


        // if verifica se a condição é verdadeira
        if(numeroDeMissoes >= 10 && idade <= 12){
        }
        if(hokage == false){
            System.out.println("Naruto é Chunnin");
        }
        else if(clan == true){
            System.out.println("Rank: Jounin");
        }
        // else não precisa colocar condição
        else {
            System.out.println("Naruto não está pronto ainda é Gennin! ");
        }
    }



}
