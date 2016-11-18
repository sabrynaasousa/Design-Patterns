public class MarioPequeno implements MarioSate{

  public MarioSate pegarCogumelo(){
    System.out.println("Mário grande");
    return new MarioGrande();
  }

  public MarioSate pegarFlor(){
    System.out.println("Mário grande com fogo");
    return new MarioFogo();
  }
}
