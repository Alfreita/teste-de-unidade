package listaPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String args[]) throws IOException {

    Lista l = new Lista();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Pessoa p;
    for (int i = 0; i < 3; i++) {
      System.out.println("Digite:\n");
      String nome = br.readLine();
      int idade = Integer.parseInt(br.readLine());
      p = new Pessoa(nome, idade);

      l.listapessoa.add(p);

    }
    System.out.println(l.toString());
  }

}
