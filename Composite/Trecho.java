import java.util.*;

public class Trecho implements Caminho {
  ArrayList<Caminho> rota = new ArrayList<Caminho>();

  public void addCaminho(Caminho caminho){
    rota.add(caminho);
  }
  public void removeCaminho(Caminho caminho){
    rota.remove(caminho);
  }
  public void printaCaminho(){
    for (Caminho caminho : rota ){
      caminho.printaCaminho();
    }
  }
}
