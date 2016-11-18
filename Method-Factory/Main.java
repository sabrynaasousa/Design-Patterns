public class Main{

  public static void main(String[] args){
    FabricaCarro fabrica = new FabricaFiat();
    Carro carro = fabrica.criarCarro();
    carro.exibirInfo();
  }
}
