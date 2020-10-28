import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom;

        String[] llistanom = new String[5];

        llistanom[1]= "Pep";



        for(int i=0;i< llistanom.length;i++){
            System.out.println("introdueix un nom: ");
            llistanom[i] = sc.nextLine();

        }
        for(int i=0;i< llistanom.length;i++){
            System.out.println("Nom número "+(i+1)+": "+llistanom[i]);
        }

        System.out.println("He acabat");
    }
}
