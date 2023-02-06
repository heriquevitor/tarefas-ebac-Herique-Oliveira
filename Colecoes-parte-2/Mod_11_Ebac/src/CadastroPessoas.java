import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entradaNomes;
        String[] names = new String[6];
        String[] masculino = new String[6];
        String[] feminino = new String[6];

        System.out.println("*******************************Tarefa de Separação de Pessoas por Genero********************************");
        System.out.println("************Favor digitar o nome seguido do genero, como no exemplo Ana feminino, Marcos Masculino *****");
        System.out.println("********************************************************************************************************");
        System.out.println("AGORA É SUA VEZ!!!\n Digite aqui nome e gênero, de até seis pessoas, como no exemplo acima, separando as pessoas por virgula \n");
        entradaNomes = scan.nextLine();
        names = entradaNomes.split(",");

        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("masculino")){
                masculino[i] = names[i];
            } else {
                feminino[i] = names[i];
            }
        }

        System.out.println("\nLista de Pessoas do sexo Masculino:");
        for (int i = 0; i < masculino.length; i++){
            if (masculino[i] != null)
                System.out.println(masculino[i]);
        }

        System.out.println("\nLista de Pessoas do sexo Feminino:");
        for (int i = 0; i < masculino.length; i++){
            if (feminino[i] != null) {
                System.out.println(feminino[i]);
            }
        }
    }
}