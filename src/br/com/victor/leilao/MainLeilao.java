package br.com.victor.leilao;

public class MainLeilao {
  public static void main(String[] args){

    ItemLeilao iteml=new ItemLeilao("iphone",3900);
    ItemLeilao item2=new ItemLeilao("carro",29000);
    ItemLeilao item3=new ItemLeilao("tv",2450);
    ItemLeilao item4=new ItemLeilao("computador",2000);
    ItemLeilao item5=new ItemLeilao("roda",380);

    ListaLeilao listal=new ListaLeilao();

    listal.adicionaLeilao(iteml);
    listal.adicionaLeilao(item2);
    listal.adicionaLeilao(item3);
    listal.adicionaLeilao(item4);
    listal.adicionaLeilao(item5);


    listal.retornaLeilaoExistentes();


  }
}
