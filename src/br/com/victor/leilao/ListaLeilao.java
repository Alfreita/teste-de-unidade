package br.com.victor.leilao;

import java.util.ArrayList;

public class ListaLeilao {

  private ArrayList<ItemLeilao> listaLeilao=new ArrayList<ItemLeilao>();

  public void retornaLeilaoExistentes(){
      for(int i=0;i<this.listaLeilao.size();i++){
        System.out.println("leilão: "+i+" "+this.listaLeilao.get(i));
      }
  }
  public void adicionaLeilao(ItemLeilao item){
    this.listaLeilao.add(item);
  }


}
