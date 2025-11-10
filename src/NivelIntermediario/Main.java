package NivelIntermediario;

public class Main {
     public static void main(String[] args) {
        //Criar o objeto usando o molde feito na classe
         //Objeto ninja Naruto
         Ninja Naruto = new Ninja();
         Naruto.nome = "Naruto Uzumaki";
         Naruto.aldeia = "Vila da Folha";
         Naruto.idade = 17;

         //Ninja Sasuke
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
         System.out.println("Você tem: " + Sasuke.idade + " então falta no minimo: " + quantoTempoFalta + " para se tornar um hokage");

         //Ninja Sakura
         Ninja Sakura = new Ninja();
         Sakura.nome = "Sasuke";
         Sakura.aldeia = "Vila da Folha";
         Sakura.idade = 19;
     }
}
