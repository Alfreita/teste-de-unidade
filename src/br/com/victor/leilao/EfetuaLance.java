package br.com.victor.leilao;

public class EfetuaLance {

  String nome;
  String item;
  int valor;

  public EfetuaLance(String nome, String item, int valor) {
    super();
    this.nome = nome;
    this.item = item;
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public String getItem() {
    return item;
  }

  public int getValor() {
    return valor;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setItem(String item) {
    this.item = item;
  }

  public void setValor(int valor) {
    this.valor = valor;
  }

}
