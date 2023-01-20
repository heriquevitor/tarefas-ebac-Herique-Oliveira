import java.util.InputMismatchException;
import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      try {
          int numero;
          System.out.println("Digite um número de 0 a 10, para ser convertido em sua respectiva classe wrappers: \n");
          numero = scanner.nextInt();
          Integer convert = numero;
          System.out.println("O número convertido do tipo primitivo para wrapper é o:\n" + convert);
  
          
      } catch (InputMismatchException e) {
          System.out.print("O valor informado não é um número!");
        
      }
      
    }
  }
  
  

