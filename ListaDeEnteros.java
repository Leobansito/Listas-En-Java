import java.util.ArrayList;
public class ListaDeEnteros {
    public static void main(String[] args) {
        ArrayList <Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(2);
        listaNumeros.add(4);
        listaNumeros.add(7);
        listaNumeros.add(9);
        listaNumeros.add(2132121412);
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.println(listaNumeros.get(i));
        }
    }
}
