public class Main{

  public static void main(String[] args){
    Personagem personagem = new Personagem();
    MonstroAgua monstroAgua = new MonstroAgua();
    MonstroFogo monstroFogo = new MonstroFogo();
    personagem.setMonstro(monstroAgua);
    personagem.dano();
    personagem.setMonstro(monstroFogo);
    personagem.dano();
  }
}
