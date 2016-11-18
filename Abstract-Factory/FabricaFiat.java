public class FabricaFiat implements FabricaCarro{

  public CarroPopular criaCarroPopular(){
    return new Uno();
  }
  public CarroSedan criaCarroSedan(){
    return new Siena();
  }
}
