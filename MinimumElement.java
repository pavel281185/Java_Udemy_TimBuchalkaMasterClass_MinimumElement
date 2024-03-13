import java.util.Scanner;
import java.util.Arrays;

public class MinimumElement {
    private static int readInteger(){
        Scanner sc1 = new Scanner(System.in);
        int number = sc1.nextInt();
        return number;
    }
    
    private static int[] readElements(int number){
        Scanner sc2 = new Scanner(System.in);
        int[] elements = new int[number];
        
        for(int i = 0; i < number; i++){
            elements[i] = sc2.nextInt();
        }
        
        return elements;
    }
    
    private static int findMin(int[] array){
        Arrays.sort(array);
        return array[0];
    }
}
