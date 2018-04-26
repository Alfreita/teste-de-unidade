package br.com.victor.leilao;

public class ItemLeilao {

  String item;
  int valor;

  public ItemLeilao(String item,int valor){
    this.item=item;
    this.valor=valor;
  }


  public String getItem() {
    return item;
  }


  public int getValor() {
    return valor;
  }


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((item == null) ? 0 : item.hashCode());
    result = prime * result + valor;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ItemLeilao other = (ItemLeilao) obj;
    if (item == null) {
      if (other.item != null)
        return false;
    } else if (!item.equals(other.item))
      return false;
    if (valor != other.valor)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "ItemLeilao [item=" + item + ", valor=" + valor + "]";
  }


}
