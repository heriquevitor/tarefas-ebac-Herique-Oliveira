import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        MediaNotas();
    }

    private static void MediaNotas(){
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        String name;
        Scanner read = new Scanner(System.in);
        System.out.println("****PROGRAMA DE APROVAÇÃO PARA LISTA DE PRESENTES DE NATAL PC GAMER EBAC 2023***");
        System.out.println("Por favor digite seu nome:\n");
        name = read.nextLine();
        System.out.println("Seja muito bem vindo, \n" + name + ". \nPara aprovação é necessário ter atingido no mínimo 70% na média total das notas." + "\n Boa sorte!");
        System.out.println("\n**** As notas poderão ser digitadas abaixo, com valoração de 0 a 10 ****\n");
        System.out.println("Digite a Primeira nota entre 0 a 10: \n");
        nota1 = read.nextFloat();
        System.out.println("Digite a Segunda nota entre 0 a 10: \n");
        nota2 = read.nextFloat();
        System.out.println("Digite a Terceira nota entre 0 a 10: \n");
        nota3 = read.nextFloat();
        System.out.println("Digite a Quarta nota entre 0 a 10: \n");
        nota4 = read.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("    A média total das suas nota foram de:\n" + media + "\n");
        if (media >= 7){
            System.out.println("\nParabéns você foi APROVADO!\n");
        } else {
            System.out.println("\nSintimos muito pelo resultado, mas você foi REPROVADO!\n");
        }

    }
}
