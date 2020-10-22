import java.util.Scanner;

public class notesv2 {
    /* Mostrar primer els aprobats i despres el suspesos.
     */
    public static void main(String[] args) {
        String[] llistaAssignatures = new String[5];
        float[] llistaNotes = new float[llistaAssignatures.length];
        Scanner sc = new Scanner(System.in);
        int comptadorMps=0;
        int mpsAprobats=0;
        float sumaTotal=0;


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
            float notaEntrada=0;
            do{
                System.out.println("Introdueix la nota de "+llistaAssignatures[i]+" : ");
                llistaNotes[i] = sc.nextFloat();
            }while(notaEntrada<0 || notaEntrada>=10);
            llistaNotes[i] = sc.nextFloat();
            sumaTotal+=llistaNotes[i];
            sc.nextLine();
        }

        for (int i=0;i< comptadorMps;i++){
            System.out.print(llistaAssignatures[i]);
            System.out.print(" ---> ");
            System.out.println(llistaNotes[i]);
        }

        if(mpsAprobats!=0){
            System.out.println("Moduls aprovats: ");
            for (int i=0;i< comptadorMps;i++){
                if(llistaNotes[i]>=5){
                    System.out.print(llistaAssignatures[i]);
                    System.out.print(" ---> ");
                    System.out.println(llistaNotes[i]);
                }
            }
        }


        if(comptadorMps!=mpsAprobats){
            System.out.println("Moduls suspesos:");
            for (int i=0;i< comptadorMps;i++){
                if(llistaNotes[i]<5){
                    System.out.print(llistaAssignatures[i]);
                    System.out.print(" ---> ");
                    System.out.println(llistaNotes[i]);
                }
            }
        }


        if(comptadorMps==mpsAprobats){
            System.out.println("Tot aprobat");
            float notaFinal = sumaTotal/comptadorMps;
            System.out.println("La teva nota final és: "+notaFinal);
        }else {
            System.out.println("Has suspés alguna.");
        }


    }
}