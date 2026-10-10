// classe filha Onibus que herda os atributos da classe pai (veiculo)

public class Onibus extends Veiculo{
  private int assentos;
  
  // Construtor
  public Onibus(String placa, int ano, int assentos){
    super(placa,ano);
    this.assentos = assentos;
  }
  
  // metodo get e set
  public int getAssentos(){
    return assentos;
  }
  public void setAssentos(int assentos){
    this.assentos = assentos;
  }
  // exibir dados (Sobrescrevendo) o metodo (polimorfismo)
  @Override
  public void exibirDados(){
    System.out.println("Omibus");
    super.exibirDados();
    System.out.println("Quantidade de assentos "+assentos);
  }
  
}