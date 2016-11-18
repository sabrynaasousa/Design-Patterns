public class NovoPontoDeControle extends PontoDeControle{

  public NovoPontoDeControle(){}

  PontoDeControleAdaptado adaptado = new PontoDeControleAdaptado();

  public void entradaFuncionario(){
    adaptado.entradaEficienteFuncionario();
  }

  public void saidaFuncionario(){
    adaptado.saidaEficienteFuncionario();
  }

}
