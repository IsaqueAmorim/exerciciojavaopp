

public class Data {
   
  private String name;
  private int conta;
  private double saldo;
  

  public Data(String name, int conta, double saldo){
    this.name = name;
    this.conta = conta;
    this.saldo=saldo;

  }

  public String getName(){

    return name;
  }
  public void setName(String name){
    this.name = name; 
  }
  public int getConta() {
      return conta;
  }
  public void setConta(int conta){
    this.conta = conta;
  }
  public double getSaldo(){
    return saldo;
  }
  
  public void saque(double valor){
    saldo = saldo -valor - 5.00;
  }
  public void deposito(double valor){
    saldo += valor;
  }

}