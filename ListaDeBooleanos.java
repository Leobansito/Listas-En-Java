import java.util.ArrayList;

public class ListaDeBooleanos {
    public static void main(String[] args) {
        ArrayList <Boolean> listaBooleana = new ArrayList<>();
        listaBooleana.add((1<9));
        listaBooleana.add((10<9));
        listaBooleana.add((6<89));
        listaBooleana.add((1<0));
        listaBooleana.add(false);
        for (int i = 0; i < listaBooleana.size(); i++) {
            System.out.println(listaBooleana.get(i));
        }
    }
}
