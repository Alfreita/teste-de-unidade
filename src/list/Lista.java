package list;

import java.util.ArrayList;

public class Lista {

  ArrayList lisa = new ArrayList();

  public static ArrayList lista(ArrayList l) {
    l.add("victor");
    l.add("teste");
    l.add("eita");

    return l;
  }

  public int getLisa() {
    return lisa.size();
  }

  public void setLisa(int a) {
    lisa.add(a);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((lisa == null) ? 0 : lisa.hashCode());
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
    if (lisa == null) {
      if (other.lisa != null)
        return false;
    } else if (!lisa.equals(other.lisa))
      return false;
    return true;
  }

  public int maior() {

    int maior = 0;
    int a = 1;
    for (int i = 0; i < lisa.size(); i++) {
      a = (Integer) lisa.get(i);
      if (maior < a) {
        maior = a;
      }

    }
    return maior;

  }
  public int menor() {

    int menor = (Integer) lisa.get(0);
    int a = 1;
    for (int i = 0; i < lisa.size(); i++) {
      a = (Integer) lisa.get(i);
      if (menor > a) {
        menor  = a;
      }

    }
    return menor;

  }
}
