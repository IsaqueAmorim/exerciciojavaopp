

public class Class{
    
    private String name;
    private int accountNumber;
    private double balance;
    
    public Class(String name, int accountNumber, double deposit){
        this.name = name;
        this.accountNumber = accountNumber;
        deposit(deposit);
        

    }

    // RETORNANDO O NOME
    public String getName(){
        return name;
    }
    // DEFININDO OU ALTERANDO O NOME
    public void setName(String name){
        this.name = name;
    }
    // RETORNANDO O NÚMERO DA CONTA
    public int getAccountNumber(){
        return accountNumber;
    }
    //RETORNANDO O SALDO
    public double getBalance(){
        return balance;
    }

    //METODO DE SAQUENT
    public void withdraw(double value){

        balance -= (value + 5);
    }
    
    //METODO DE DEPOSITO
    public void deposit(double value){

        balance += value;
    }
}
