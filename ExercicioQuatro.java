
package testegft;

import java.util.Scanner; 

public class ExercicioQuatro{
    
    public static void main(String[] args) {
    
        Funcionario funcionario = new Funcionario();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionário: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Digite o RG do funcionário: ");
        funcionario.rg = sc.nextLine();
        System.out.println("Digite o salário do ano 2021 do funcionário: ");
        funcionario.setSalario_inicial(sc.nextDouble());
        System.out.println("Nome: " + funcionario.nome
        + "\nRG: " + funcionario.rg
        + "\nSalário do ano de 2021: R$ " + (funcionario.salario_inicial+(funcionario.salario_inicial*0.045)));
    }
}
