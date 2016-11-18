public class Main{

  public static void main(String[] args){
    PontoDeControle controle = new PontoDeControle();
    NovoPontoDeControle novoControle = new NovoPontoDeControle();
    controle.entradaFuncionario();
    controle.saidaFuncionario();
    novoControle.entradaFuncionario();
    novoControle.saidaFuncionario();
  }
}
