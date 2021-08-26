
package testegft;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int inicio, fim;
        
        do{
            System.out.print("Número inicial: ");
            inicio = sc.nextInt();
        }while(inicio <= 0);
        
        do{
            System.out.print("Número final: ");
            fim = sc.nextInt();
        }while(fim < inicio);
        
        for(int i = inicio; i <= fim; i++){
            if(i % 2 == 0){
                System.out.print(" " + i + " ");
            }
        }
    }
    
}
