package NivelIntermediario.ClassesAbstradasXInterfaces;

/*
As Classes Abstratas e as Interfaces têm uma semelhança importante:
– Nenhuma delas pode ser instanciada diretamente (não dá para criar objetos a partir delas).

Para criar objetos, sempre usamos CLASSES COMUNS (concretas),
que serão obrigadas a seguir as regras definidas pela Classe Abstrata ou pela Interface.

Quando usamos Classe Abstrata:
------------------------------------------------------------
- Pode ter métodos com corpo (comportamentos prontos).
- Pode ter métodos abstratos (que obrigam subclasses a implementar).
- Pode ter atributos normais (variáveis internas).
- Pode ter construtores.
- Serve como um "modelo base" que oferece parte da implementação.
- Subclasses herdam comportamento + são obrigadas a completar o que faltar.

Quando usamos Interface:
------------------------------------------------------------
- É um contrato: define APENAS o que deve existir.
- Todos os métodos da interface são obrigatoriamente abstratos
  (exceto default/static, mas isso é mais avançado).
- NÃO pode ter construtor.
- NÃO pode ter atributos normais (apenas constantes).
- A classe que implementar a interface precisa implementar TODOS os métodos.
- Usada para padronizar comportamentos entre classes que não precisam ser parentes.

Resumo final:
------------------------------------------------------------
CLASSE ABSTRATA → molde base com parte da lógica pronta.
INTERFACE → contrato obrigatório que define o que a classe deve fazer,
             sem dizer como ela deve fazer.
*/

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.poderEspecial();
        naruto.tacarKunai();

        Uchica sasuke = new Uchica();
        sasuke.nome = "Sasuke Uchica";
        sasuke.poderEspecial();
        sasuke.tacarKunai();

        Hyuga hinata = new Hyuga();
        hinata.tacarUmaShurken();
    }
}
