import java.util.Scanner;
public class ControleFluxo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("C�culo de M�dia de Notas do Semestre\n" + "Digite sua primeira nota entre 0 e 10\n");
        float nota1 = sc.nextFloat();
        System.out.println("C�culo de M�dia de Notas do Semestre\n" + "Digite sua segunda nota entre 0 e 10\n");
        float nota2 = sc.nextFloat();
        System.out.println("C�culo de M�dia de Notas do Semestre\n" + "Digite sua terceira nota entre 0 e 10\n");
        float nota3 = sc.nextFloat();
        System.out.println("C�culo de M�dia de Notas do Semestre\n" + "Digite sua quarta nota entre 0 e 10\n");
        float nota4 = sc.nextFloat();
        float media = (nota1 + nota2 + nota3 + nota4) /4;
        if ( media >= 7){
            System.out.println("Parab�ns, voc� foi aprovado, com"+" " +media+ " .");
        } else if( media >= 5){
            System.out.println("Infelizmente voc� n�o foi aprovado, mas pode se recuperar, te vejo na RECUPERA��O, sua m�dia de nota foi"+" " +media+ " .");
        } else {
            System.out.println("Infezlimente voc� foi reprovado, e sua m�dia de nota foi"+" " +media+ " .");
        }
    }
}

