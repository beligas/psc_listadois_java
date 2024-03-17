// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e informe a quantidade recomendada de água em litros.

import java.util.Scanner;

public class QUESTAO10 {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    double agua = 0.035;
    double peso;
    double ideal;

    System.out.println("Informe seu peso em quilogramas");
    peso  = enterScanner.nextDouble();

    ideal = peso * agua;

    System.out.println("A quantidade ideal de água que você deve ingerir é de " + ideal + " litros");

    enterScanner.close();
  }
  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}