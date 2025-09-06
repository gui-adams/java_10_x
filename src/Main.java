public class Main {

    public static void main (String[] args){
        //Dados primitivos:
        //Tipos primitivos não possuem metodos

        int idade = 17;
        double altura = 1.71;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 2013738647L;

        System.out.println(saldoBancario);
        //Dados não primitivos: String, Array, Class, enum (Atribuir metodos)
        //Em dados não primitivos é possivel usar metodos ex: toUpperCase
        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase(); //Colocar tudo em CapsLock
        System.out.println("Esse texto está em " + nomeEmCaixaAlta);

    }
}