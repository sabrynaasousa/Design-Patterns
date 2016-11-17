public class Main {

  public static void main (String[] args){
    Carrinho carrinho = new Carrinho();
    CarrinhoAdapter carrinhoAdaptado = new CarrinhoAdapter();
    carrinho.finalizarCompra();
    carrinho.adicionarProduto();
    carrinho.retirarProduto();
    carrinhoAdaptado.finalizarCompra();
    carrinhoAdaptado.adicionarProduto();
    carrinhoAdaptado.retirarProduto();
  }
}
