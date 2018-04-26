package listaPower;

import java.util.ArrayList;

public class Lista {


  ArrayList <Pessoa> listapessoa=new ArrayList<Pessoa>();


  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((listapessoa == null) ? 0 : listapessoa.hashCode());
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
    Lista other = (Lista) obj;
    if (listapessoa == null) {
      if (other.listapessoa != null)
        return false;
    } else if (!listapessoa.equals(other.listapessoa))
      return false;
    return true;
  }

public void foor(){
  for (Pessoa pessoa : listapessoa){
      System.out.println(pessoa.getNome()+ " "+ pessoa.getIdade());
  }
}

  @Override
  public String toString() {
    return "Lista [listapessoa=" + listapessoa + "]";
  }


  public void adiciona(Pessoa p){

    listapessoa.add(p);
  }

}
