package filtro;

import java.util.ArrayList;

public class Listafiltro {

    private  ArrayList<Integer> filtro =new ArrayList<Integer>();

    public void setFiltro(int a) {
      this.filtro.add(a);
    }

    public ArrayList<Integer> getFiltro() {
      return filtro;
    }
    public int getTamanho(){
      return this.filtro.size();
    }
    public int recebeInt(int a){
      for (int i=0;i<filtro.size();i++){
        if(a==filtro.get(i)){
          return a;
        }
      }
      return -1;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((filtro == null) ? 0 : filtro.hashCode());
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
      Listafiltro other = (Listafiltro) obj;
      if (filtro == null) {
        if (other.filtro != null)
          return false;
      } else if (!filtro.equals(other.filtro))
        return false;
      return true;
    }

    @Override
    public String toString() {
      return "Listafiltro [filtro=" + filtro + "]";
    }



}
