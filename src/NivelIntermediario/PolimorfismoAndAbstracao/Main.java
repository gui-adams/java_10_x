package NivelIntermediario.PolimorfismoAndAbstracao;

public class Main {
    public static void main(String[] args) {
        //obj naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        //obj Uchica
        Uchica sasuke = new Uchica();
        sasuke.nome = "Sasuke Uchica";
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();
    }
}
