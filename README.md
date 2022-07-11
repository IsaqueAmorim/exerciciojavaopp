#  **♨️ Exercício introdução Orientação a Objetos com Java**

Esse é um exercício em Java para treinar alguns dos conceitos basicos de *Orientação a Objetos*.

Com esse Exercício abordei os pontos Construtores, **Sobrecarga**, **Encapsulamento** e também um pouco de **Modificadores de Acesso**.

### Enunciando e contexto do Exercício

>

## __📂 Arquivo Class__

### __1️⃣ Definindo variáveis__


  Primeiramente vamos definir as variáveis que iremos utilizar. Vamos definir essa variáveis como privadas, para que só possam ser acessadas dentro da classe em que foram definidas, impedindo assim que elas seja definidas ou alteradas diretamente.

~~~java

private String name;
private int accountNumber;
private double balance;

~~~~

Essas serão as variáveis principais, durante o desenvolvimento usaremos outras variáveis mas não terão a mesma importância.

Agora com as variáveis definidas, podemos continuar nosso desenvovimento. Agora criaremos o contrutor para receber e instanciar as variáveis que criamos. Como as variáveis que criamos foram do tipo **private**  precisaremos definir um método (Construtor) para as variáveis.

###  __2️⃣ Definindo o Contrutor__

~~~Java
public Class(Sring name, int accountNumber, double balance){
  this.name = name;
  this.accountNumber = accountNumber;
  this.balance = balance;
}
~~~

Nosso contrutor recebeu o nome genérico de Class, nele vamos passar os seguintes parametros: __*name*__, __*accountNumber*__ e __*balance*__. Esse construtor diferente das variáveis que criamos anteriormente, recebe **public** como modificador de acesso, então nesse caso vamos conseguir acessa-lo em outras classes e outros arquivos.
Note que usamos __*this*__ no construtor, esse *this* faz referência ao objeto, então **this.name** faz referência a variavel criada anteriormente, e o **name** é o parametro do contrutor. Então de umas forma simples a *variavel name* está recebendo o *parametro name*.

Com o construtor definido vamos agora criar os getters e setter do nosso app, pois como descrito no enunciado algumas informações podem ser alteradas(setters) e também vamos precisar acessar as variáveis privadas então vamos usar o método get para retornar o resultado.

~~~java

// Alterando o nome
public void setName(newName){
  this.name = newName;
}
//Retornado o nome
public String getName(){
  return name;
}

// retornado o número da conta
public int getAccountNumber(){
  return accountNumber;
}

// retornando o Saldo da conta
public double getBalance{
  return balance;
}
~~~

Repare que apenas o nome tem um Setter, isso porque no enunciado diz que apenas o nome pode ser alterado, já a o número da conta nunca pode ser alterado e o saldo só pode ser alterado mediante saque ou depósito.
