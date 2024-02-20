import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChallengeOne {
    public static void main(String[] args){//Declara una variable S, inicializa una lista 
        int S = 6 ;
        List<Integer> numbers = List.of(60, 6, 5, 4, 3, 2, 7, 7, 29, 1);
        List<Integer> result = modifyList(numbers, S);
        Collections.reverse(result);//Invertir la lista modificada
        System.out.println(result);
    }
    public static List<Integer> modifyList (List<Integer> numbers, int S){
        List<Integer> modifiedList= new ArrayList<>();
        for (int num : numbers){//recorre cada número en la lista numbers y realiza algunas operaciones con ellos.
            String numStr = Integer.toString(num);//convierte cada número en una cadena de caracteres
            StringBuilder modifyNumberStr = new StringBuilder();
            for(char digit : numStr.toCharArray()){//verifica si digit<S y los agrega a la cadena 
                if (digit - '0' < S){
                    modifyNumberStr.append(digit);
                }
            }
            if(modifyNumberStr.length() > 0){//convierte esa cadena de dígitos en un número entero
                modifiedList.add(Integer.parseInt(modifyNumberStr.toString()));
            }
        }
        return modifiedList;
    }
}