public class Rua implements Caminho {

  private String name;

  public Rua(String name){
    this.name = name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void printaCaminho(){
    System.out.println("A rua escolhida foi: " + getName());
  }
}
