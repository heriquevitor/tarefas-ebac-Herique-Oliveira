
import java.util.Scanner;

public class Notas {
    public static void main(String args [] ) {
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        String name;
        Scanner read = new Scanner(System.in);
        System.out.println("****PROGRAMA DE APROVA��O PARA LISTA DE PRESENTES DE NATAL PC GAMER EBAC 2023***");
        System.out.println("Por favor digite seu nome:\n");
        name = read.nextLine();
        System.out.println("Seja muito bem vindo, \n" + name + ". \nPara aprova��o � necess�rio ter atingido no m�nimo 70% na m�dia total das notas." + "\n Boa sorte!");
        System.out.println("\n**** As notas poder�o ser digitadas abaixo, com valora��o de 0 a 10 ****\n");
        System.out.println("Digite a Primeira nota entre 0 a 10: \n");
        nota1 = read.nextFloat();
        System.out.println("Digite a Segunda nota entre 0 a 10: \n");
        nota2 = read.nextFloat();
        System.out.println("Digite a Terceira nota entre 0 a 10: \n");
        nota3 = read.nextFloat();
        System.out.println("Digite a Quarta nota entre 0 a 10: \n");
        nota4 = read.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("    A m�dia total das suas nota foram de:\n" + media + "\n");
        if (media >= 7){
            System.out.println("\nParab�ns voc� foi APROVADO!\n");
        } else {
            System.out.println("\nSintimos muito pelo resultado, mas voc� foi REPROVADO!\n");
        }

    }
}
