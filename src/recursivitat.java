public class recursivitat {
    public static void main(String[] args) {
        contar(5, 0);

    }
    public static void contar(int num, int inici){
        if (inici<=num){
            if(inici<num){
                System.out.print(inici+"-");
            }else{
                System.out.print(inici);
            }
            contar(num,++inici);
        }
    }
}
