public class Main{

  public static void main(String[] args){
    FabricaCarro fabricaCarro = new FabricaFiat();
    CarroSedan carro1 = fabricaCarro.criaCarroSedan();
    CarroPopular carro2 = fabricaCarro.criaCarroPopular();
    carro1.exibeInfo();
    carro2.exibeInfo();
  }
}
