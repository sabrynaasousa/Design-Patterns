public class MarioFogo implements MarioSate{

  public MarioSate pegarCogumelo(){
    System.out.println("Mário ganhou 200 pontos");
    return this;
  }

  public MarioSate pegarFlor(){
    System.out.println("Mário ganhou 300 pontos");
    return this;
  }
}
