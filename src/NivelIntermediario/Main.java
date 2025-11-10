package NivelIntermediario;

public class Main {
     public static void main(String[] args) {
        //Criar o objeto usando o molde feito na classe
         //Objeto ninja Naruto
         Ninja Naruto = new Ninja();
         Naruto.nome = "Naruto Uzumaki";
         Naruto.aldeia = "Vila da Folha";
         Naruto.idade = 17;

         //Objeto ninja Sasuke
         // Ninja() construtor é um metodo sem tipo de retorno, com o mesmo nome da classe, que serve para inicializar o objeto no momento da criação.
         Ninja Sasuke = new Ninja();
         Sasuke.nome = "Sasuke";
         Sasuke.aldeia = "Vila da Folha";
         Sasuke.idade = 18;
         //metodos
         Sasuke.SharinganAtivado();
         String chamandoMetodo = Sasuke.EuSouUmNinja();
         System.out.println(chamandoMetodo);
         Sasuke.anosParaSeTornarHokage(50);
         int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(50);
         System.out.println("Você tem: " + Sasuke.idade +
                 " então falta no mínimo: " + quantoTempoFalta +
                 " anos para se tornar um Hokage");

         //Objeto ninja Sakura
         Ninja Sakura = new Ninja();
         Sakura.nome = "Sakura Haruno";
         Sakura.aldeia = "Vila da Folha";
         Sakura.idade = 19;
     }
}
