// Nossa classe veiculo com encapsulamento (private)
public class Veiculo{
  private String placa;
  private int ano;

  // construtor 
  public Veiculo(String placa, int ano){
    this.placa = placa;
    this.ano = ano;
 }
 
 // metodos get e set
 public String getPlaca(){
   return placa;
 }
 public void setPlaca(){
   this.placa = placa;
 }
 public int getAno(){
   return ano;
 }
 public void setAno(){
   this.ano = ano;
 }
 
 // Metodo para exibir dados no terminal
 public void exibirDados(){
   System.out.println("veiculo");
   System.out.println("Placa :"+placa +" | Ano : "+ano);
 }
 
}