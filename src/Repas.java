import java.util.Scanner;

public class Repas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opció;

        String text = "Opció triada: ";
        System.out.println("Tria una opció: ");
        opció = sc.nextInt();
        sc.nextLine();
        System.out.println(text+opció);


    }
}
