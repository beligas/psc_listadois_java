// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um programa para calcular a regra de três.

import java.util.Scanner;

public class QUESTAO4 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double a, b, c;
    double resultado;
    
    System.out.println("Informe o valor de a");
    a = scanner.nextDouble();

    System.out.println("Informe o valor de b");
    b = scanner.nextDouble();

    System.out.println("Informe o valor de c");
    c = scanner.nextDouble();

    resultado = (a * c) / b;

    System.out.println("O resultado é " + resultado);
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}