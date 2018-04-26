package crazyboy;

public class Crazy {

  private int ret=10;

  public int soma(int a){

    ret=ret+a;
    return ret;
  }
  public int sub(int a){

    ret=ret-a;
    return ret;
  }
  public int div(int a){

    ret=ret/a;
    return ret;
  }
  public int mult(int a){

    ret=ret*a;
    return ret;
  }
  public Crazy(int ret) {
    super();
    this.ret = ret;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ret;
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
    Crazy other = (Crazy) obj;
    if (ret != other.ret)
      return false;
    return true;
  }
  @Override
  public String toString() {
    return "Crazy [ret=" + ret + "]";
  }


}
