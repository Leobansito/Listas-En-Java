import java.util.ArrayList;
import java.util.Scanner;
public class AgendaListas {
    public static void main(String[] args) {
        int totalDePersonas;
        int sioNo;
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> numero = new ArrayList<>();
        ArrayList<Boolean> sonFamilia = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas personas quieres agregar a tu agenda?");
        totalDePersonas = Integer.parseInt(sc.nextLine());      
          for (int i = 0; i < totalDePersonas; i++) {
            System.out.print("Ingrese el nombre del contacto numero " + (i+1) + ": ");
            nombres.add(sc.nextLine());
            System.out.print("Ingrese el numero solo lo que va despues del 55: ");
            numero.add(Integer.parseInt(sc.nextLine()));
            System.out.print("Es familiar suyo? 1.Si 2.No");
            sioNo = Integer.parseInt(sc.nextLine());
            switch (sioNo) {
                case 1:
                    sonFamilia.add(true);
                    break;
                case 2:
                    sonFamilia.add(false);
                        
                    break;
                
                default:
                    break;
            }
          }
          System.out.println("Quieres checar como quedo tu agenda?: 1.Si 2.No");
          sioNo = sc.nextInt();
          switch (sioNo) {
            case 1:
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println("El contacto numero: "+ (i+1)+"es:\n"+"Nombre: "+ nombres.get(i) + "\nTelefono: " + numero.get(i) + "Es parte de su familia? :" + sonFamilia.get(i));
                }
                break;
            case 2:
                System.out.println("Bueno we, adios");
                break;
          
            default:
                break;
          }
    }
}