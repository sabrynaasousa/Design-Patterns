public abstract class ProcessarDados{

  public final void templateMethod(){
    consultarDados();
    processarDados();
    exibirResultado();
  }
  public abstract void consultarDados();
  public abstract void processarDados();
  public abstract void exibirResultado();

}
