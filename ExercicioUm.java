package testegft;

import java.util.Scanner;

public class ExericioUm {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int op;
        double num1, num2;

        
        do{
            do{
            System.out.println("Digite a operação desejada:\n[1] - Soma\n[2] - Subtração\n[3] - Multiplicação\n[4] - Divisão\n[9] - SAIR");
            op = sc.nextInt();
            }while(op != 1 && op!= 2 && op!= 3 && op!= 4 && op!=9);
           do{                
                System.out.print("Digite o 1º número:");
                num1 = sc.nextDouble();
           }while(num1 < 0);
           
           do{
            System.out.print("Digite o 2º número:");
            num2 = sc.nextDouble();
           }while(num2 < 0);
           
            switch(op){
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                    break;
                case 3:
                    System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
                    break;
                case 4:
                    System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                    break;
                default:
                    System.out.println("Saindo...");
            }
        }while(op != 1 && op != 2 && op !=3 && op != 4 && op != 9);

        
        
    }
    
}
