import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChallengeTwo {
    public static void main(String[] args){//declara una variable S, declara y se inicializa un arreglo
        int S = 66;
        int [] array ={10,1,9,2,7,4,6,3};
        Arrays.sort(array);
        int [] result = orderSquares(array, S);
        System.out.println(Arrays.toString(result));
    }
    public static int[] orderSquares(int[] array, int S){//arreglo de numeros 
        List<Integer> squareListasc = new ArrayList<>();
        for(int number: array){//Calcula el cuadrado y lo agrega a la lista
            int square = number * number;
            squareListasc.add(square);
        }
        squareListasc.sort(null);//lista en orden ascendente
        squareListasc.removeIf(square -> square < 0 || square > S);
        int [] result = new int [squareListasc.size()];//almacenar elementos en la lista
        for (int i=0; i < squareListasc.size(); i++){//Recorre la lista y guarda cada elemento en el arreglo
            result[i] = squareListasc.get(i);
        }
        return result;
    }
}
