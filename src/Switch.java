import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcio;

        System.out.println("Introdueix una opció: ");
        opcio = sc.nextInt();
        sc.nextLine();

        switch (opcio){
            case 1:
                System.out.println("has triat la opcio: "+opcio);
                break;

            case 2:
                System.out.println("has triat la opcio: "+opcio);
                break;

            case 3:
                System.out.println("has triat la opcio: "+opcio);
                break;

            default:
                System.out.println("Opció no valida");
                break;
        }
    }
}
