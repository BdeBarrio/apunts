import java.util.Scanner;

public class Notes {
    /* Bucles notes
     */
    public static void main(String[] args) {
        String[] llistaAssignatures = new String[5];
        float[] llistaNotes = new float[llistaAssignatures.length];
        Scanner sc = new Scanner(System.in);
        int comptadorMps=0;


        for (int i=0;i<llistaAssignatures.length;i++){
            System.out.println("Introdueix una assignatura (exit per finalitzar); ");
            String entradaTeclat = sc.nextLine();
            if (entradaTeclat.equalsIgnoreCase("exit")){
                break;
            }else {
                llistaAssignatures[i] = entradaTeclat;
                comptadorMps++;
            }
        }

        for (int i=0;i< comptadorMps;i++){
            System.out.println("Introdueix la nota de "+llistaAssignatures[i]+" : ");
            llistaNotes[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i=0;i< comptadorMps;i++){
            System.out.print(llistaAssignatures[i]);
            System.out.print(" ---> ");
            System.out.println(llistaNotes[i]);
        }

    }
}
