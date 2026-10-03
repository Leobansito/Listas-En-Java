import java.util.ArrayList;
public class Listas {
    public static void main(String[] args) throws Exception{
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Leo");
        System.out.println("Primer nombre: " + nombres.get(0));
        nombres.set(1, "Carlos");
        for (String nombre : nombres){
            System.out.println(nombre);
        }
        System.out.println("Total: " +nombres.size());
    }
}
