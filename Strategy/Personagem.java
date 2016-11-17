public class Personagem{

  Monstro tipoMonstro;

  public Personagem(){}

  public void setMonstro(Monstro monstro){
    this.tipoMonstro = monstro;
  }

  public void dano(){
    this.tipoMonstro.dano();
  }
}
