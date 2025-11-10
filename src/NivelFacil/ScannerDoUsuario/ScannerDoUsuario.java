package NivelFacil.ScannerDoUsuario;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
    /*
    Scanner = é um jeito de trazer o usuário para dentro da aplicação.
    Objetivo= O usuário vai inserir os dados

    1º Declaro o Scanner
    2º Da o nome para o Scanner (Varviavel)
    3º Cria um novo Scanner (Abre o Scanner)
    4º Dar a permissão para o sistema de que pode entra dados
    5º Precisa fechar o scanner
*/
        Scanner caixaDeTexto = new Scanner(System.in);

        // nextLine = só strings
        System.out.println("Escreva aqui o nome do seu ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        System.out.println("Qual é a idade do ninja? ");
        //nextInt serve para números
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do seu ninja é: " + idadeDoNinja + " anos");
        caixaDeTexto.close();

        //Tratamento de dados
        if (idadeDoNinja >= 18){
            System.out.println("Esse ninja já é maior de idade! ");
        }else {
            System.out.println("Esse ninja é menor de idade e não pode sair da aldeia ");
        }


        //Nesse exexemplo acima foi preciso somente declar uma unica vez o scanner que foi dado o nome de caixa de texto
        // Foi reutilizado tanto em uma string como em int. Dessa forma não precisa ficar criando varias caixas de texto
    }
}
