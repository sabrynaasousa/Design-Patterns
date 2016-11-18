public class Mario{

  protected MarioSate estado;

  public Mario(){
    estado = new MarioPequeno();
  }

  public void pegarCogumelo(){
    estado = estado.pegarCogumelo();
  }

  public void pegarFlor(){
    estado = estado.pegarFlor();
  }
}
