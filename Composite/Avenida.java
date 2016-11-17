public class Avenida implements Caminho {

  private String name;

  public Avenida(String name){
    this.name = name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void printaCaminho(){
    System.out.println("A avenida escolhida foi: " + getName());
  }
}
