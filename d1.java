//Escreva um algoritmo em Java que solicite 5 notas e realize o cálculo da média aritmética ao término
//da execução.

package questions2;

import java.util.Scanner;

public class d1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    float posicao = 0f;
    int array [] = new int[5];
    int n = array.length;

    System.out.println("Digite o primeiro número: ");
    float digito1 = sc.nextInt();
    System.out.println("Digite o segundo número: ");
    float digito2 = sc.nextInt();
    System.out.println("Digite o terceiro número: ");
    float digito3 = sc.nextInt();
    System.out.println("Digite o quarto número: ");
    float digito4 = sc.nextInt();
    System.out.println("Digite o quinto número: ");
    float digito5 = sc.nextInt();

    
    
    for (int i=0; i<n; i++) {
        posicao = digito1 + digito2 + digito3 + digito4 + digito5;
        posicao = posicao + array[i];
        
    }

    System.out.println("A média aritmética dos números é: " + (float) (posicao / n));
    }
}

