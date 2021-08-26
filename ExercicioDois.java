package TesteGFT;

import java.util.Random;
import java.util.Scanner;

public class ExercicioDois {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numeroDaSorte[] = new int[4];
        int sorteio[] = new int[4];
        int cont = 0;
        
        for(int i = 0; i < numeroDaSorte.length; i++){
            System.out.println("Digite o seu " + (i+1) + "º número:");
            numeroDaSorte[i] = sc.nextInt();
        }
    
        for(int i = 0; i < 4; i++){
            sorteio[i] = rand.nextInt(20);
        }
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; i < 4; i++){
                if(numeroDaSorte[i] == sorteio[j]){
                    cont++;
                }
            }
        }
        if(cont == 4){
            System.out.println("Parabéns! Você foi premiado!");
        }else{
            System.out.println("Infelizmente você não foi sorteado.");
            System.out.print("Números sorteados: ");
            for(int i = 0; i < 4; i++){
                System.out.print(" " + sorteio[i] + " ");
            }
        }
    }
    
}
