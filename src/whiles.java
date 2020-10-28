import java.util.Scanner;

public class whiles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean hoportobe = false;
        int hores = 0;
        int horesentrades;
        char comhoportes;

        String paraula = "hola";

        System.out.println(paraula.charAt(2));


        do{


        }while(hores<50);
          System.out.println("Quantes hores has dedicat avui?");
          horesentrades = sc.nextInt();
          sc.nextLine();

          hores += horesentrades;


        /*while (!hoportobe){
            System.out.println("Quantes hores has dedicat avui?");
            horesentrades = sc.nextInt();
            sc.nextLine();

            hores += horesentrades;

            if(hores>=50){
                hoportobe = true;

            }
        }*/
        System.out.println("Felicitats!! Ja estas al dia!!");
        System.out.println("Has invertit "+hores+" hores");
    }
}
/* les barres || volen dir, arpersant, que vol dir "o".
és a dir, una paraula que tingi menys de 6 caracters || més de 12 || contingi ()

do{
}while (paraula.length()<6 || paraula.length()>12 || !paraula.contains("@"));

VOL DIR QUE MENTRES CUMPLEIXI ALGUNA DE LES 3 CONDICIONS SEGUIRA EL BUCLE
 */
