//Dada a entrada de 10 inteiros em sequência, realize a impressão da entrada inicial de forma inversa.

package questions2;

import java.util.Arrays;

public class d2 {
    public static void reverse(int[] numbers) {

        int[] list = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            list[numbers.length - 1 - i] = numbers[i];
        }
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = list[i];
            
        }
        
    }
    public static void main(String[] args) {
        int[] numbers = {1,  2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
    

}
    

