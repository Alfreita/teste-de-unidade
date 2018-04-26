package filtro;

public class Main {
    public static void main (String[] args){
        Listafiltro lf=new Listafiltro();
        lf.setFiltro(15);
        lf.setFiltro(85);
        lf.setFiltro(35);
        lf.setFiltro(75);
        lf.setFiltro(55);


        System.out.println(lf.recebeInt(1000));

    }
}
