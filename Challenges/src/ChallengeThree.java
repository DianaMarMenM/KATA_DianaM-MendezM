import java.util.Arrays;

public class ChallengeThree {
    public static void main(String[] arg){//Declaramos variable, creamos la funcion y se imprime
        int[] conis={1, 2, 4, 7};
        int result = minimchangeconin(conis);
        System.out.println(result);
    }
    public static int minimchangeconin(int[] conis){
        Arrays.sort(conis);
        int minimchange =1;
        for (int coin : conis){//recorre una lista de monedas y va acumulando el valor, hasta que se encuentra una cuyo valor sea mayor que el valor de minimchange
            if(coin > minimchange){
                break;
            }
            minimchange += coin;//Suma el valor de las monedas actuales
        }
        return minimchange;
    }
}
