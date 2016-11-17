public class CarrinhoAdapter extends Carrinho {

  public CarrinhoAdapter(){}

  CarrinhoAdaptee carrinhoAdaptee  = new CarrinhoAdaptee();

  public void finalizarCompra(){
    carrinhoAdaptee.finalizarCompraRapido();
  }
  public void adicionarProduto(){
    carrinhoAdaptee.adicionarProdutoRapido();
  }
  public void retirarProduto(){
    carrinhoAdaptee.retirarProdutoRapido();
  }
}
