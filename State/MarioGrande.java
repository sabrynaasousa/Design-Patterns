public class MarioGrande implements MarioSate{

  public MarioSate pegarCogumelo(){
    System.out.println("Mário ganhou 100 pontos");
    return this;
  }

  public MarioSate pegarFlor(){
    System.out.println("Mário fogo");
    return new MarioFogo();
  }
}
