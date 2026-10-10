// Nossa classe Caminhao que herda da classe veiculo (pai)
public class Caminhao extends Veiculo{
  private int eixos;
  
  // Construtor
  public Caminhao(String placa, int ano, int eixos){
    super(placa,ano);
    this.eixos = eixos;
  }
  
  // metodo get
  public int getEixos(){
    return eixos;
  }
  
  // exibindo dado no terminal
  // Polimorfismo
  @Override
  public void exibirDados(){
    System.out.println("----------");
    System.out.println("Caminhão");
    super.exibirDados();
    System.out.println("Quantidade de Eixos: " + eixos);
    System.out.println("----------");
  }
}