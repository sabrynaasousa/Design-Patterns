public class Main{

  public static void main(String[] args){
    ProcessarDados processar = new BaseDeDados();
    ProcessarDados processarSistema = new SistemaDeArquivos();
    processar.templateMethod();
    processarSistema.templateMethod();
  }
}
