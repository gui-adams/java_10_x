package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja {

    //notação e ouso do poliformismo
    //aqui está sobrecresvedndo o habilidadeEspecial da classe mãe
    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome +" e esse é meu ataque Uchiha estilo fogo"
        );
    }
}
