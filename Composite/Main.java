public class Main {

  public static void main (String[] args) {
    Trecho trecho = new Trecho();
    Caminho rodovia = new Rodovia("Bersan");
    Caminho rua = new Rua("Navarro");
    Caminho avenida = new Avenida("Sousa");
    System.out.println("Adicionando rotas:");
    trecho.addCaminho(rodovia);
    trecho.addCaminho(rua);
    trecho.addCaminho(avenida);
    System.out.println("Mostrando rotas:");
    trecho.printaCaminho();
    System.out.println("Removendo rotas:");
    trecho.removeCaminho(rodovia);
    System.out.println("Mostrando rotas:");
    trecho.printaCaminho();
  }
}
