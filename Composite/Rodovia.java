public class Rodovia implements Caminho {

  private String name;

  public Rodovia(String name){
    this.name = name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void printaCaminho(){
    System.out.println("A rodovia escolhida foi: " + getName());
  }
}
