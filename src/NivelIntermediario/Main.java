package NivelIntermediario;

public class Main {
     public static void main(String[] args) {
        //Criar o objeto usando o molde feito na classe
         //Objeto ninja 1 Naruto Uzumaki
         // Uzumaki() construtor é um metodo sem tipo de retorno, com o mesmo nome da classe, que serve para inicializar o objeto no momento da criação.
         Uzumaki Ninja_1 = new Uzumaki();
         Ninja_1.nome = "Naruto Uzumaki";
         Ninja_1.aldeia = "Vila da Folha";
         Ninja_1.idade = 17;
         Ninja_1.anosParaSeTornarHokage(30);
         int quantoTempoFalta = Ninja_1.anosParaSeTornarHokage(40);
         System.out.println("Você tem: " + Ninja_1.idade +
                 " então falta no mínimo: " + quantoTempoFalta +
                 " anos para se tornar um Hokage");
         //herança
         Ninja_1.Vitalidade();


         //Objeto ninja 2 Sasuke Uchica
         // Uchica() construtor é um metodo sem tipo de retorno, com o mesmo nome da classe, que serve para inicializar o objeto no momento da criação.
         Uchica Ninja_2 = new Uchica();
         Ninja_2.nome = "Sasuke Uchica";
         Ninja_2.idade = 18;
         Ninja_2.aldeia = "Vila da Folha";
         Ninja_2.missao = "Investigar Kauguia";
         Ninja_2.statusMissao = "Em andamento";
         Ninja_2.nivelDificuldade = "S";
         Ninja_2.habilidadeEspecialUchica = "Sharigan";
         Ninja_2.mostrarInformcoes();

         //Objeto ninja 3 Sakura Haruno
         // Haruno() construtor é um metodo sem tipo de retorno, com o mesmo nome da classe, que serve para inicializar o objeto no momento da criação.
         Haruno Ninja_3 = new Haruno();
         Ninja_3.nome = "Sakura Haruno";
         Ninja_3.aldeia = "Vila da Folha";
         Ninja_3.idade = 19;
         //metodo
         String chamandoMetodo = Ninja_3.EuSouUmNinja();
         System.out.println(chamandoMetodo);
         //Herança
         Ninja_3.Cura();

         //Objeto 4
         Hyuga Ninja_4 = new Hyuga();
         Ninja_4.nome = "Hinata";
         Ninja_4.aldeia = "Vila da Folha";
         Ninja_4.idade = 19;
         Ninja_4.Byakugan();

         //Objeto 5
         Boruto Ninja_5 = new Boruto();
         Ninja_5.nome = "Boruto";
         Ninja_5.aldeia = "Vila da Folha";
         Ninja_5.idade = 9;
         //Interface
         Ninja_5.modoBesta();
         Ninja_5.ativarJougan();
         Ninja_5.Vitalidade();

     }
}
