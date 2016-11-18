public class FabricaFiat implements FabricaCarro{

  public Carro criarCarro(){
    return new Palio();
  }
}
